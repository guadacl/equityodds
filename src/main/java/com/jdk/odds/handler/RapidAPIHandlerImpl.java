package com.jdk.odds.handler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jdk.odds.hander.result.QuoteResponse;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;


@Component
public class RapidAPIHandlerImpl implements RapidAPIHandler{
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

		HttpUrl httpUrl = new HttpUrl.Builder().scheme(scheme).host(host)
				.addPathSegment("market").addPathSegment("v2").addPathSegment("get-quotes")
				.addQueryParameter("region", region).addQueryParameter("symbols", symbols)
				.build();
		
		System.out.println("http -> " + httpUrl);
		
		
		Request request = new Request.Builder()
				.url(httpUrl)
				.get()
				.addHeader("x-rapidapi-key", headerKey)
				.addHeader("x-rapidapi-host", headerHost)
				.build();
		
		

		/*
		Request request = new Request.Builder()
			.url("https://yh-finance.p.rapidapi.com/market/v2/get-quotes?region=US&symbols=NIO")
			.get()
			.addHeader("x-rapidapi-key", "3337ca4205mshcf9a466f1ab7ce5p1be098jsn316d8371e314")
			.addHeader("x-rapidapi-host", "yh-finance.p.rapidapi.com")
			.build();
			*/

		

		try {
			//Response response;
			//response = client.newCall(request).execute();
			Response response = client.newCall(request).execute();
			System.out.println(response.body());
			String json = response.body().string();
			System.out.println(json);
			System.out.println(json);

			ObjectMapper objectMapper = new ObjectMapper();
			QuoteResponse quoteResponse = objectMapper.readValue(json, QuoteResponse.class);
			
			Map<String, Object> additionalProperties = quoteResponse.getAdditionalProperties();
			Object obj = additionalProperties.get("quoteResponse");
			System.out.println(obj.toString());
			com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
			String jsonInput = obj.toString();
			
			LinkedHashMap<String, ArrayList<LinkedHashMap<String,Object>>> ret = (LinkedHashMap<String, ArrayList<LinkedHashMap<String, Object>>>) obj;
			
			ArrayList<LinkedHashMap<String,Object>> resultList = ret.get("result");
			
			
			return resultList;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}
