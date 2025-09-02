package com.jdk.odds.domain;

import java.math.BigDecimal;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2025-09-01T13:46:51.070+0200")
@StaticMetamodel(Trading.class)
public class Trading_ {
	public static volatile SingularAttribute<Trading, Integer> id;
	public static volatile SingularAttribute<Trading, String> period;
	public static volatile SingularAttribute<Trading, Stock> stock;
	public static volatile SingularAttribute<Trading, BigDecimal> supporto ;
	public static volatile SingularAttribute<Trading, BigDecimal> resistenza;
	public static volatile SingularAttribute<Trading, String> note;
}
