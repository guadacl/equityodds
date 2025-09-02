package com.jdk.odds.handler;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;


@Component
public class RapidAPIHandlerImpl implements RapidAPIHandler,ResponseFunction{
	@Value("${rapid.api.region}")
	private String region;
	@Value("${rapid.api.scheme}")
	private String scheme;
	@Value("${rapid.api.host}")
	private String host;
	@Value("${rapid.api.header.key}")
	private String headerKey;
	@Value("${rapid.api.header.host}")
	private String headerHost;
	
	@Override
	public ArrayList<LinkedHashMap<String,Object>> getQuotes(String symbols) {
		OkHttpClient client = new OkHttpClient();

		Function<String,HttpUrl> buildHttpUrl = s -> new HttpUrl.Builder().scheme(scheme).host(host)
						.addPathSegment("market").addPathSegment("v2").addPathSegment("get-quotes")
						.addQueryParameter("region", region).addQueryParameter("symbols", s)
						.build(); 
		
		Function<HttpUrl,Request> builRequest = url -> new Request.Builder().url(url)
				.get()
				.addHeader("x-rapidapi-key", headerKey)
				.addHeader("x-rapidapi-host", headerHost)
				.build();
		
		Request request = buildHttpUrl.andThen(builRequest).apply(symbols);
		return buildResponse(client, request);

	}

}