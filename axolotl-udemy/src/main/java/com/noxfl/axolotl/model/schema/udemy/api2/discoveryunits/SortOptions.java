
package com.noxfl.axolotl.model.schema.udemy.api2.discoveryunits;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "current_sort_option",
    "options"
})
@Generated("jsonschema2pojo")
public class SortOptions {

    @JsonProperty("current_sort_option")
    private CurrentSortOption currentSortOption;
    @JsonProperty("options")
    private List<Option__1> options = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("current_sort_option")
    public CurrentSortOption getCurrentSortOption() {
        return currentSortOption;
    }

    @JsonProperty("current_sort_option")
    public void setCurrentSortOption(CurrentSortOption currentSortOption) {
        this.currentSortOption = currentSortOption;
    }

    public SortOptions withCurrentSortOption(CurrentSortOption currentSortOption) {
        this.currentSortOption = currentSortOption;
        return this;
    }

    @JsonProperty("options")
    public List<Option__1> getOptions() {
        return options;
    }

    @JsonProperty("options")
    public void setOptions(List<Option__1> options) {
        this.options = options;
    }

    public SortOptions withOptions(List<Option__1> options) {
        this.options = options;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public SortOptions withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
