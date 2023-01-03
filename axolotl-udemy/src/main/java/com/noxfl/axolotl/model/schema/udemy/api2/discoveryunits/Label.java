
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
    "id",
    "display_name",
    "title",
    "topic_channel_url",
    "url",
    "tracking_object_type"
})
@Generated("jsonschema2pojo")
public class Label {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("title")
    private String title;
    @JsonProperty("topic_channel_url")
    private String topicChannelUrl;
    @JsonProperty("url")
    private String url;
    @JsonProperty("tracking_object_type")
    private String trackingObjectType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public Label withId(Integer id) {
        this.id = id;
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

    public Label withDisplayName(String displayName) {
        this.displayName = displayName;
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

    public Label withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("topic_channel_url")
    public String getTopicChannelUrl() {
        return topicChannelUrl;
    }

    @JsonProperty("topic_channel_url")
    public void setTopicChannelUrl(String topicChannelUrl) {
        this.topicChannelUrl = topicChannelUrl;
    }

    public Label withTopicChannelUrl(String topicChannelUrl) {
        this.topicChannelUrl = topicChannelUrl;
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

    public Label withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("tracking_object_type")
    public String getTrackingObjectType() {
        return trackingObjectType;
    }

    @JsonProperty("tracking_object_type")
    public void setTrackingObjectType(String trackingObjectType) {
        this.trackingObjectType = trackingObjectType;
    }

    public Label withTrackingObjectType(String trackingObjectType) {
        this.trackingObjectType = trackingObjectType;
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

    public Label withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
