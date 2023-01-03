
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
    "category",
    "subcategory",
    "label"
})
@Generated("jsonschema2pojo")
public class ContextInfo {

    @JsonProperty("category")
    private Category category;
    @JsonProperty("subcategory")
    private Object subcategory;
    @JsonProperty("label")
    private Label label;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("category")
    public Category getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(Category category) {
        this.category = category;
    }

    public ContextInfo withCategory(Category category) {
        this.category = category;
        return this;
    }

    @JsonProperty("subcategory")
    public Object getSubcategory() {
        return subcategory;
    }

    @JsonProperty("subcategory")
    public void setSubcategory(Object subcategory) {
        this.subcategory = subcategory;
    }

    public ContextInfo withSubcategory(Object subcategory) {
        this.subcategory = subcategory;
        return this;
    }

    @JsonProperty("label")
    public Label getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(Label label) {
        this.label = label;
    }

    public ContextInfo withLabel(Label label) {
        this.label = label;
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

    public ContextInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
