
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
    "english_title"
})
@Generated("jsonschema2pojo")
public class CaptionLocale {

    @JsonProperty("_class")
    private String _class;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("title")
    private String title;
    @JsonProperty("english_title")
    private String englishTitle;
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

    public CaptionLocale withClass(String _class) {
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

    public CaptionLocale withLocale(String locale) {
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

    public CaptionLocale withTitle(String title) {
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

    public CaptionLocale withEnglishTitle(String englishTitle) {
        this.englishTitle = englishTitle;
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

    public CaptionLocale withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
