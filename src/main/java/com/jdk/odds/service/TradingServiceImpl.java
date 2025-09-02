package com.jdk.odds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdk.odds.PeriodEnum;
import com.jdk.odds.dao.TradingRepository;
import com.jdk.odds.domain.Trading;

@Service
public class TradingServiceImpl implements TradingService{

	@Autowired
    private TradingRepository tradingRepository;

    TradingServiceImpl(TradingRepository tradingRepository) {
        this.tradingRepository = tradingRepository;
    }

	@Override
	public List<Trading> findByPeriod(PeriodEnum periodEnum) {
		return tradingRepository.findByPeriod(periodEnum.name());
	}

}
