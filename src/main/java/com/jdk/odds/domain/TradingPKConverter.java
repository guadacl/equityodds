package com.jdk.odds.domain;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class TradingPKConverter implements AttributeConverter<TradingPK,String> {

	@Override
	public String convertToDatabaseColumn(TradingPK attribute) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TradingPK convertToEntityAttribute(String dbData) {
		// TODO Auto-generated method stub
		return null;
	}

}
