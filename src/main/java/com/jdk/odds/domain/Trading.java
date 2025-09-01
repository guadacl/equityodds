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

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String period;

	//bi-directional many-to-one association to Stock
	@ManyToOne
	@JoinColumn(name="short_name")
	private Stock stock;

	public Trading() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public Stock getStock() {
		return this.stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

}