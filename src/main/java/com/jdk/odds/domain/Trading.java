package com.jdk.odds.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.Data;


/**
 * The persistent class for the trading database table.
 * 
 */
@Data
@Entity
@NamedQuery(name="Trading.findAll", query="SELECT t FROM Trading t")
public class Trading implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String note;

	private String period;

	private BigDecimal resistenza;

	private BigDecimal supporto;


	//bi-directional many-to-one association to Stock
	@ManyToOne
	@JoinColumn(name="short_name")
	private Stock stock;

	public Trading() {
	}



}