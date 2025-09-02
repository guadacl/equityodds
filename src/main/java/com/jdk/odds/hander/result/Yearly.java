
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
    "date",
    "revenue",
    "earnings"
})
public class Yearly {

    @JsonProperty("date")
    private Integer date;
    @JsonProperty("revenue")
    private Integer revenue;
    @JsonProperty("earnings")
    private Integer earnings;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("date")
    public Integer getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(Integer date) {
        this.date = date;
    }

    @JsonProperty("revenue")
    public Integer getRevenue() {
        return revenue;
    }

    @JsonProperty("revenue")
    public void setRevenue(Integer revenue) {
        this.revenue = revenue;
    }

    @JsonProperty("earnings")
    public Integer getEarnings() {
        return earnings;
    }

    @JsonProperty("earnings")
    public void setEarnings(Integer earnings) {
        this.earnings = earnings;
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
