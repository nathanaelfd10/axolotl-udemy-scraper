
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
    "id",
    "title",
    "key",
    "options",
    "open",
    "all_title"
})
@Generated("jsonschema2pojo")
public class Aggregation {

    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("key")
    private String key;
    @JsonProperty("options")
    private List<Option> options = null;
    @JsonProperty("open")
    private Boolean open;
    @JsonProperty("all_title")
    private String allTitle;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Aggregation withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Aggregation withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    public Aggregation withKey(String key) {
        this.key = key;
        return this;
    }

    @JsonProperty("options")
    public List<Option> getOptions() {
        return options;
    }

    @JsonProperty("options")
    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public Aggregation withOptions(List<Option> options) {
        this.options = options;
        return this;
    }

    @JsonProperty("open")
    public Boolean getOpen() {
        return open;
    }

    @JsonProperty("open")
    public void setOpen(Boolean open) {
        this.open = open;
    }

    public Aggregation withOpen(Boolean open) {
        this.open = open;
        return this;
    }

    @JsonProperty("all_title")
    public String getAllTitle() {
        return allTitle;
    }

    @JsonProperty("all_title")
    public void setAllTitle(String allTitle) {
        this.allTitle = allTitle;
    }

    public Aggregation withAllTitle(String allTitle) {
        this.allTitle = allTitle;
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

    public Aggregation withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
