package com.jdk.odds.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2025-08-26T20:44:57.846+0200")
@StaticMetamodel(Trading.class)
public class Trading_ {
	public static volatile SingularAttribute<Trading, TradingPK> id;
	public static volatile SingularAttribute<Trading, Float> resistenza;
	public static volatile SingularAttribute<Trading, Float> supporto;
	public static volatile SingularAttribute<Trading, Stock> stock;
}
