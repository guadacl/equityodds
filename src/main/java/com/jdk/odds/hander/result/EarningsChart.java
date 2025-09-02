
package com.jdk.odds.hander.result;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "quarterly",
    "currentQuarterEstimateDate",
    "currentQuarterEstimateYear",
    "earningsDate"
})
public class EarningsChart {

    @JsonProperty("quarterly")
    private List<Quarterly> quarterly = null;
    @JsonProperty("currentQuarterEstimateDate")
    private String currentQuarterEstimateDate;
    @JsonProperty("currentQuarterEstimateYear")
    private Integer currentQuarterEstimateYear;
    @JsonProperty("earningsDate")
    private List<Integer> earningsDate = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("quarterly")
    public List<Quarterly> getQuarterly() {
        return quarterly;
    }

    @JsonProperty("quarterly")
    public void setQuarterly(List<Quarterly> quarterly) {
        this.quarterly = quarterly;
    }

    @JsonProperty("currentQuarterEstimateDate")
    public String getCurrentQuarterEstimateDate() {
        return currentQuarterEstimateDate;
    }

    @JsonProperty("currentQuarterEstimateDate")
    public void setCurrentQuarterEstimateDate(String currentQuarterEstimateDate) {
        this.currentQuarterEstimateDate = currentQuarterEstimateDate;
    }

    @JsonProperty("currentQuarterEstimateYear")
    public Integer getCurrentQuarterEstimateYear() {
        return currentQuarterEstimateYear;
    }

    @JsonProperty("currentQuarterEstimateYear")
    public void setCurrentQuarterEstimateYear(Integer currentQuarterEstimateYear) {
        this.currentQuarterEstimateYear = currentQuarterEstimateYear;
    }

    @JsonProperty("earningsDate")
    public List<Integer> getEarningsDate() {
        return earningsDate;
    }

    @JsonProperty("earningsDate")
    public void setEarningsDate(List<Integer> earningsDate) {
        this.earningsDate = earningsDate;
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
