package com.jdk.odds.web;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.jdk.odds.domain.Trading;
import com.jdk.odds.dtos.QuoteResponseDTO;



public interface QuoteMapper {
	default List<QuoteResponseDTO> instantiateResource(ArrayList<LinkedHashMap<String,Object>> quotes, List<Trading> tradings) {
		Function<LinkedHashMap<String, Object>,QuoteResponseDTO> function = rapidRecord -> {
		Optional<Trading> trading = tradings.stream().filter(a-> a.getStock().getShortName().equals(rapidRecord.get("symbol"))).findFirst();
			return map(rapidRecord, trading.get());
		};
		return quotes.stream().map(function ).collect(Collectors.toList());
	}

	static QuoteResponseDTO map(LinkedHashMap<String,Object> rapidRecord,Trading trading) {
		QuoteResponseDTO dto = new QuoteResponseDTO();

		dto.setRegularMarketDayRange((String) rapidRecord.get("regularMarketDayRange"));
		dto.setAverageDailyVolume10Day((Integer) rapidRecord.get("averageDailyVolume10Day"));
		dto.setShortName((String) rapidRecord.get("shortName"));

		System.out.println(dto.getShortName());
		
		dto.setRegularMarketPreviousClose((Double) rapidRecord.get("regularMarketPreviousClose"));
		Double regularMarketPrice = (Double) rapidRecord.get("regularMarketPrice");
		dto.setRegularMarketPrice(regularMarketPrice);
		dto.setRegularMarketVolume((Integer) rapidRecord.get("regularMarketVolume"));
		BigDecimal supporto = trading.getSupporto();
		BigDecimal resistenza = trading.getResistenza();
		Double margin = ((regularMarketPrice - supporto.doubleValue()) / regularMarketPrice) * 100;
		BigDecimal bd = new BigDecimal(Double.toString(margin));
	    int places = 2;
		bd = bd.setScale(places, RoundingMode.HALF_UP);
	    double doubleValue = bd.doubleValue();
		dto.setMargin(doubleValue);
		dto.setSupporto(supporto.doubleValue());
		dto.setResistenza(resistenza.doubleValue());
		dto.setRegularMarketDayLow((Double) rapidRecord.get("regularMarketDayLow"));
		dto.setRegularMarketDayHigh((Double) rapidRecord.get("regularMarketDayHigh"));
		//dto.setStartegy(trading.get().getStrategy());
		return dto;
			

	}
}
