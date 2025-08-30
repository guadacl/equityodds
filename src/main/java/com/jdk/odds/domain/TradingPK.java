package com.jdk.odds.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * The primary key class for the trading database table.
 * 
 */
@Embeddable
public class TradingPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="short_name", insertable=false, updatable=false)
	private String shortName;

	@Column(name="period")
	private String period;

	public TradingPK() {
	}
	public String getShortName() {
		return this.shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TradingPK)) {
			return false;
		}
		TradingPK castOther = (TradingPK)other;
		return 
			this.shortName.equals(castOther.shortName)
			&& this.period.equals(castOther.period);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.shortName.hashCode();
		hash = hash * prime + this.period.hashCode();
		
		return hash;
	}
}