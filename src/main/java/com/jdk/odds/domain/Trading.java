package com.jdk.odds.domain;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the trading database table.
 * 
 */
@Entity
@NamedQuery(name="Trading.findAll", query="SELECT t FROM Trading t")
public class Trading implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TradingPK id;

	private float resistenza;

	private float supporto;

	//bi-directional many-to-one association to Stock
	@ManyToOne
	@JoinColumn(name="short_name")
	private Stock stock;

	public Trading() {
	}

	public TradingPK getId() {
		return this.id;
	}

	public void setId(TradingPK id) {
		this.id = id;
	}

	public float getResistenza() {
		return this.resistenza;
	}

	public void setResistenza(float resistenza) {
		this.resistenza = resistenza;
	}

	public float getSupporto() {
		return this.supporto;
	}

	public void setSupporto(float supporto) {
		this.supporto = supporto;
	}

	public Stock getStock() {
		return this.stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

}