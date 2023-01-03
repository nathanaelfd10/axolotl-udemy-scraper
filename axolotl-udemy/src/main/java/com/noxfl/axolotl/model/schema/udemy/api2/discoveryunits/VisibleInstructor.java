
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
    "id",
    "title",
    "name",
    "display_name",
    "job_title",
    "image_50x50",
    "image_100x100",
    "initials",
    "url"
})
@Generated("jsonschema2pojo")
public class VisibleInstructor {

    @JsonProperty("_class")
    private String _class;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("name")
    private String name;
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("job_title")
    private String jobTitle;
    @JsonProperty("image_50x50")
    private String image50x50;
    @JsonProperty("image_100x100")
    private String image100x100;
    @JsonProperty("initials")
    private String initials;
    @JsonProperty("url")
    private String url;
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

    public VisibleInstructor withClass(String _class) {
        this._class = _class;
        return this;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public VisibleInstructor withId(Integer id) {
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

    public VisibleInstructor withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public VisibleInstructor withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public VisibleInstructor withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    @JsonProperty("job_title")
    public String getJobTitle() {
        return jobTitle;
    }

    @JsonProperty("job_title")
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public VisibleInstructor withJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    @JsonProperty("image_50x50")
    public String getImage50x50() {
        return image50x50;
    }

    @JsonProperty("image_50x50")
    public void setImage50x50(String image50x50) {
        this.image50x50 = image50x50;
    }

    public VisibleInstructor withImage50x50(String image50x50) {
        this.image50x50 = image50x50;
        return this;
    }

    @JsonProperty("image_100x100")
    public String getImage100x100() {
        return image100x100;
    }

    @JsonProperty("image_100x100")
    public void setImage100x100(String image100x100) {
        this.image100x100 = image100x100;
    }

    public VisibleInstructor withImage100x100(String image100x100) {
        this.image100x100 = image100x100;
        return this;
    }

    @JsonProperty("initials")
    public String getInitials() {
        return initials;
    }

    @JsonProperty("initials")
    public void setInitials(String initials) {
        this.initials = initials;
    }

    public VisibleInstructor withInitials(String initials) {
        this.initials = initials;
        return this;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public VisibleInstructor withUrl(String url) {
        this.url = url;
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

    public VisibleInstructor withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
