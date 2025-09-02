package com.jdk.odds.web;

import org.springframework.web.bind.annotation.RestController;

import com.jdk.odds.PeriodEnum;
import com.jdk.odds.domain.Trading;
import com.jdk.odds.dtos.QuoteResponseDTO;
import com.jdk.odds.service.RapidAPIService;
import com.jdk.odds.service.TradingService;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api/quotes")
@Slf4j
public class QuoteController implements QuoteMapper{
	
	private @Autowired RapidAPIService   rapidAPIService;	
	private @Autowired TradingService tradingService;	

	private static Logger logger = LoggerFactory.getLogger(QuoteController.class);

	@RequestMapping(method = RequestMethod.GET)
	public List<QuoteResponseDTO> getSupport(PeriodEnum period) throws NotFoundException {
		logger.info(period.name());
		
		List<Trading> tradings = tradingService.findByPeriod(period);
		ArrayList<LinkedHashMap<String,Object>> quotes = rapidAPIService.findQuote(period,tradings);
		return instantiateResource(quotes, tradings);
	}
}
