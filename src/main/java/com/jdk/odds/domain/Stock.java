package com.jdk.odds.domain;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the stock database table.
 * 
 */
@Entity
@NamedQuery(name="Stock.findAll", query="SELECT s FROM Stock s")
public class Stock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="short_name")
	private String shortName;

	private String name;

	//bi-directional many-to-one association to Trading
	@OneToMany(mappedBy="stock")
	private List<Trading> tradings;

	public Stock() {
	}

	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Trading> getTradings() {
		return this.tradings;
	}

	public void setTradings(List<Trading> tradings) {
		this.tradings = tradings;
	}

	public Trading addTrading(Trading trading) {
		getTradings().add(trading);
		trading.setStock(this);

		return trading;
	}

	public Trading removeTrading(Trading trading) {
		getTradings().remove(trading);
		trading.setStock(null);

		return trading;
	}

}