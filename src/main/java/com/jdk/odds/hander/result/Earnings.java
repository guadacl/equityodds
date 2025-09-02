
package com.jdk.odds.hander.result;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "maxAge",
    "earningsChart",
    "financialsChart",
    "financialCurrency"
})
public class Earnings {

    @JsonProperty("maxAge")
    private Integer maxAge;
    @JsonProperty("earningsChart")
    private EarningsChart earningsChart;
    @JsonProperty("financialsChart")
    private FinancialsChart financialsChart;
    @JsonProperty("financialCurrency")
    private String financialCurrency;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("maxAge")
    public Integer getMaxAge() {
        return maxAge;
    }

    @JsonProperty("maxAge")
    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

    @JsonProperty("earningsChart")
    public EarningsChart getEarningsChart() {
        return earningsChart;
    }

    @JsonProperty("earningsChart")
    public void setEarningsChart(EarningsChart earningsChart) {
        this.earningsChart = earningsChart;
    }

    @JsonProperty("financialsChart")
    public FinancialsChart getFinancialsChart() {
        return financialsChart;
    }

    @JsonProperty("financialsChart")
    public void setFinancialsChart(FinancialsChart financialsChart) {
        this.financialsChart = financialsChart;
    }

    @JsonProperty("financialCurrency")
    public String getFinancialCurrency() {
        return financialCurrency;
    }

    @JsonProperty("financialCurrency")
    public void setFinancialCurrency(String financialCurrency) {
        this.financialCurrency = financialCurrency;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
