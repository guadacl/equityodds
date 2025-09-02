package com.jdk.odds.web;

import org.springframework.web.bind.annotation.RestController;

import com.jdk.odds.PeriodEnum;
import com.jdk.odds.domain.Trading;
import com.jdk.odds.dtos.QuoteResponseDTO;
import com.jdk.odds.service.RapidAPIService;
import com.jdk.odds.service.TradingService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api/quotes")
public class QuoteController implements QuoteMapper{
	
	private @Autowired RapidAPIService   rapidAPIService;	
	private @Autowired TradingService tradingService;	


	@RequestMapping(method = RequestMethod.GET)
	public List<QuoteResponseDTO> getSupport(PeriodEnum period) throws NotFoundException {
		
		List<Trading> tradings = tradingService.findByPeriod(period);
		ArrayList<LinkedHashMap<String,Object>> quotes = rapidAPIService.findQuote(period,tradings);
		
		System.out.println(quotes);
		return instantiateResource(quotes, tradings);
	}
}
