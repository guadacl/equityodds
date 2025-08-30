package com.jdk.odds.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2025-08-26T20:44:57.842+0200")
@StaticMetamodel(Stock.class)
public class Stock_ {
	public static volatile SingularAttribute<Stock, String> shortName;
	public static volatile SingularAttribute<Stock, String> name;
	public static volatile ListAttribute<Stock, Trading> tradings;
}
