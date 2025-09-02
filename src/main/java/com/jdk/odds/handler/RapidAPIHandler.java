package com.jdk.odds.handler;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface RapidAPIHandler {
	
	ArrayList<LinkedHashMap<String, Object>>  getQuotes(String region);
	

}
