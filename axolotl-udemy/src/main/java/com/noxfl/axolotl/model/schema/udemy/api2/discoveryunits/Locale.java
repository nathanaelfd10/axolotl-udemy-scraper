
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
    "_class",
    "locale",
    "title",
    "english_title",
    "simple_english_title"
})
@Generated("jsonschema2pojo")
public class Locale {

    @JsonProperty("_class")
    private String _class;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("title")
    private String title;
    @JsonProperty("english_title")
    private String englishTitle;
    @JsonProperty("simple_english_title")
    private String simpleEnglishTitle;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_class")
    public String getClass_() {
        return _class;
    }

    @JsonProperty("_class")
    public void setClass_(String _class) {
        this._class = _class;
    }

    public Locale withClass(String _class) {
        this._class = _class;
        return this;
    }

    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Locale withLocale(String locale) {
        this.locale = locale;
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

    public Locale withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("english_title")
    public String getEnglishTitle() {
        return englishTitle;
    }

    @JsonProperty("english_title")
    public void setEnglishTitle(String englishTitle) {
        this.englishTitle = englishTitle;
    }

    public Locale withEnglishTitle(String englishTitle) {
        this.englishTitle = englishTitle;
        return this;
    }

    @JsonProperty("simple_english_title")
    public String getSimpleEnglishTitle() {
        return simpleEnglishTitle;
    }

    @JsonProperty("simple_english_title")
    public void setSimpleEnglishTitle(String simpleEnglishTitle) {
        this.simpleEnglishTitle = simpleEnglishTitle;
    }

    public Locale withSimpleEnglishTitle(String simpleEnglishTitle) {
        this.simpleEnglishTitle = simpleEnglishTitle;
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

    public Locale withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
