
package com.noxfl.axolotl.model.schema.udemy.api2.discoveryunits;

import java.util.HashMap;
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
    "title",
    "count",
    "key",
    "value",
    "is_feature",
    "selected"
})
@Generated("jsonschema2pojo")
public class Option {

    @JsonProperty("title")
    private String title;
    @JsonProperty("count")
    private Integer count;
    @JsonProperty("key")
    private String key;
    @JsonProperty("value")
    private String value;
    @JsonProperty("is_feature")
    private Boolean isFeature;
    @JsonProperty("selected")
    private Boolean selected;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Option withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    public Option withCount(Integer count) {
        this.count = count;
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

    public Option withKey(String key) {
        this.key = key;
        return this;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public Option withValue(String value) {
        this.value = value;
        return this;
    }

    @JsonProperty("is_feature")
    public Boolean getIsFeature() {
        return isFeature;
    }

    @JsonProperty("is_feature")
    public void setIsFeature(Boolean isFeature) {
        this.isFeature = isFeature;
    }

    public Option withIsFeature(Boolean isFeature) {
        this.isFeature = isFeature;
        return this;
    }

    @JsonProperty("selected")
    public Boolean getSelected() {
        return selected;
    }

    @JsonProperty("selected")
    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public Option withSelected(Boolean selected) {
        this.selected = selected;
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

    public Option withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
