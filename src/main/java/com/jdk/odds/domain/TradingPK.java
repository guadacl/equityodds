package com.jdk.odds.domain;

import java.io.Serializable;
import jakarta.persistence.*;

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

	private String type;

	public TradingPK() {
	}
	public String getShortName() {
		return this.shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
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
			&& this.type.equals(castOther.type);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.shortName.hashCode();
		hash = hash * prime + this.type.hashCode();
		
		return hash;
	}
}