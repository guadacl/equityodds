
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
    "yearly",
    "quarterly"
})
public class FinancialsChart {

    @JsonProperty("yearly")
    private List<Yearly> yearly = null;
    @JsonProperty("quarterly")
    private List<Quarterly_> quarterly = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("yearly")
    public List<Yearly> getYearly() {
        return yearly;
    }

    @JsonProperty("yearly")
    public void setYearly(List<Yearly> yearly) {
        this.yearly = yearly;
    }

    @JsonProperty("quarterly")
    public List<Quarterly_> getQuarterly() {
        return quarterly;
    }

    @JsonProperty("quarterly")
    public void setQuarterly(List<Quarterly_> quarterly) {
        this.quarterly = quarterly;
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
