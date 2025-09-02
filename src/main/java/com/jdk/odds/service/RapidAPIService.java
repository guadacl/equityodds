package com.jdk.odds.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.jdk.odds.PeriodEnum;
import com.jdk.odds.domain.Trading;

public interface RapidAPIService {


	ArrayList<LinkedHashMap<String, Object>> findQuote(PeriodEnum period, List<Trading> tradings);


}
