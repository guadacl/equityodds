package com.jdk.odds.handler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jdk.odds.hander.result.QuoteResponse;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;


public interface ResponseFunction {
	final static Logger logger = LoggerFactory.getLogger(ResponseFunction.class);

	default ArrayList<LinkedHashMap<String, Object>> buildResponse(OkHttpClient client, Request request) {
		try {
			Response response = client.newCall(request).execute();
			logger.debug(response.body().toString());
			String json = response.body().string();
			logger.debug(json);

			ObjectMapper objectMapper = new ObjectMapper();
			QuoteResponse quoteResponse = objectMapper.readValue(json, QuoteResponse.class);
			
			Map<String, Object> additionalProperties = quoteResponse.getAdditionalProperties();
			Object obj = additionalProperties.get("quoteResponse");

			logger.debug(objectMapper.toString());
			LinkedHashMap<String, ArrayList<LinkedHashMap<String,Object>>> ret = (LinkedHashMap<String, ArrayList<LinkedHashMap<String, Object>>>) obj;
			ArrayList<LinkedHashMap<String,Object>> resultList = ret.get("result");
			return resultList;
		} catch (IOException e) {
			throw new ResourceNotFoundException(e.getMessage(),e);
		}
	}
}