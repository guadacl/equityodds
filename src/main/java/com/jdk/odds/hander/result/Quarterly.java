
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
    "actual",
    "estimate"
})
public class Quarterly {

    @JsonProperty("date")
    private String date;
    @JsonProperty("actual")
    private Double actual;
    @JsonProperty("estimate")
    private Double estimate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("actual")
    public Double getActual() {
        return actual;
    }

    @JsonProperty("actual")
    public void setActual(Double actual) {
        this.actual = actual;
    }

    @JsonProperty("estimate")
    public Double getEstimate() {
        return estimate;
    }

    @JsonProperty("estimate")
    public void setEstimate(Double estimate) {
        this.estimate = estimate;
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
