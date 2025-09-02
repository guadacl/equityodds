package com.jdk.odds.dtos;

import lombok.Data;

@Data
public class QuoteResponseDTO {
	private String shortName;
	private Double regularMarketPrice;
	private Double regularMarketDayHigh;
	private Double regularMarketDayLow;
	private Double regularMarketPreviousClose;
	private String regularMarketDayRange;
	private Integer averageDailyVolume10Day;
	private Integer regularMarketVolume;
	private Double  margin;
	private Double supporto;
	private Double resistenza;

}
