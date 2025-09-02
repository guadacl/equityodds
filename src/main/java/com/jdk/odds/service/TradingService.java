package com.jdk.odds.service;

import java.util.List;

import com.jdk.odds.PeriodEnum;
import com.jdk.odds.domain.Trading;

public interface TradingService {

		List<Trading> findByPeriod(PeriodEnum periodEnum);
}
