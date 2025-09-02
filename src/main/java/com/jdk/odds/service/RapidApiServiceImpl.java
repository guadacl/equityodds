package com.jdk.odds.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jdk.odds.PeriodEnum;
import com.jdk.odds.domain.Stock;
import com.jdk.odds.domain.Trading;
import com.jdk.odds.handler.RapidAPIHandler;


@Service
@Transactional(readOnly = true)
public class RapidApiServiceImpl implements RapidAPIService
{
	private @Autowired RapidAPIHandler quoteHeader;

	@Override
	public ArrayList<LinkedHashMap<String, Object>> findQuote(PeriodEnum period, List<Trading> tradings) {
		String symbols = tradings.stream().map(Trading::getStock).map(Stock::getShortName).collect(Collectors.joining(","));
		ArrayList<LinkedHashMap<String,Object>> response = quoteHeader.getQuotes(symbols);
		return response;
	}

}