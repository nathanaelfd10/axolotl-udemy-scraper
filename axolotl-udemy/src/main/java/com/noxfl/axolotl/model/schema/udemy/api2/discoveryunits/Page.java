
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
    "url",
    "label",
    "selected"
})
@Generated("jsonschema2pojo")
public class Page {

    @JsonProperty("url")
    private String url;
    @JsonProperty("label")
    private Integer label;
    @JsonProperty("selected")
    private Boolean selected;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public Page withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("label")
    public Integer getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(Integer label) {
        this.label = label;
    }

    public Page withLabel(Integer label) {
        this.label = label;
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

    public Page withSelected(Boolean selected) {
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

    public Page withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
