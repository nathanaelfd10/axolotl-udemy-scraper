
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
    "fl",
    "sos",
    "u",
    "fft",
    "is_content_rankable",
    "ref_tracking_id",
    "gl_tracking_id",
    "member_of",
    "source_object_count",
    "subcategory_id",
    "apply_filters"
})
@Generated("jsonschema2pojo")
public class RecommendationParams {

    @JsonProperty("fl")
    private String fl;
    @JsonProperty("sos")
    private String sos;
    @JsonProperty("u")
    private Object u;
    @JsonProperty("fft")
    private String fft;
    @JsonProperty("is_content_rankable")
    private Boolean isContentRankable;
    @JsonProperty("ref_tracking_id")
    private String refTrackingId;
    @JsonProperty("gl_tracking_id")
    private String glTrackingId;
    @JsonProperty("member_of")
    private Object memberOf;
    @JsonProperty("source_object_count")
    private Object sourceObjectCount;
    @JsonProperty("subcategory_id")
    private Integer subcategoryId;
    @JsonProperty("apply_filters")
    private Boolean applyFilters;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fl")
    public String getFl() {
        return fl;
    }

    @JsonProperty("fl")
    public void setFl(String fl) {
        this.fl = fl;
    }

    public RecommendationParams withFl(String fl) {
        this.fl = fl;
        return this;
    }

    @JsonProperty("sos")
    public String getSos() {
        return sos;
    }

    @JsonProperty("sos")
    public void setSos(String sos) {
        this.sos = sos;
    }

    public RecommendationParams withSos(String sos) {
        this.sos = sos;
        return this;
    }

    @JsonProperty("u")
    public Object getU() {
        return u;
    }

    @JsonProperty("u")
    public void setU(Object u) {
        this.u = u;
    }

    public RecommendationParams withU(Object u) {
        this.u = u;
        return this;
    }

    @JsonProperty("fft")
    public String getFft() {
        return fft;
    }

    @JsonProperty("fft")
    public void setFft(String fft) {
        this.fft = fft;
    }

    public RecommendationParams withFft(String fft) {
        this.fft = fft;
        return this;
    }

    @JsonProperty("is_content_rankable")
    public Boolean getIsContentRankable() {
        return isContentRankable;
    }

    @JsonProperty("is_content_rankable")
    public void setIsContentRankable(Boolean isContentRankable) {
        this.isContentRankable = isContentRankable;
    }

    public RecommendationParams withIsContentRankable(Boolean isContentRankable) {
        this.isContentRankable = isContentRankable;
        return this;
    }

    @JsonProperty("ref_tracking_id")
    public String getRefTrackingId() {
        return refTrackingId;
    }

    @JsonProperty("ref_tracking_id")
    public void setRefTrackingId(String refTrackingId) {
        this.refTrackingId = refTrackingId;
    }

    public RecommendationParams withRefTrackingId(String refTrackingId) {
        this.refTrackingId = refTrackingId;
        return this;
    }

    @JsonProperty("gl_tracking_id")
    public String getGlTrackingId() {
        return glTrackingId;
    }

    @JsonProperty("gl_tracking_id")
    public void setGlTrackingId(String glTrackingId) {
        this.glTrackingId = glTrackingId;
    }

    public RecommendationParams withGlTrackingId(String glTrackingId) {
        this.glTrackingId = glTrackingId;
        return this;
    }

    @JsonProperty("member_of")
    public Object getMemberOf() {
        return memberOf;
    }

    @JsonProperty("member_of")
    public void setMemberOf(Object memberOf) {
        this.memberOf = memberOf;
    }

    public RecommendationParams withMemberOf(Object memberOf) {
        this.memberOf = memberOf;
        return this;
    }

    @JsonProperty("source_object_count")
    public Object getSourceObjectCount() {
        return sourceObjectCount;
    }

    @JsonProperty("source_object_count")
    public void setSourceObjectCount(Object sourceObjectCount) {
        this.sourceObjectCount = sourceObjectCount;
    }

    public RecommendationParams withSourceObjectCount(Object sourceObjectCount) {
        this.sourceObjectCount = sourceObjectCount;
        return this;
    }

    @JsonProperty("subcategory_id")
    public Integer getSubcategoryId() {
        return subcategoryId;
    }

    @JsonProperty("subcategory_id")
    public void setSubcategoryId(Integer subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    public RecommendationParams withSubcategoryId(Integer subcategoryId) {
        this.subcategoryId = subcategoryId;
        return this;
    }

    @JsonProperty("apply_filters")
    public Boolean getApplyFilters() {
        return applyFilters;
    }

    @JsonProperty("apply_filters")
    public void setApplyFilters(Boolean applyFilters) {
        this.applyFilters = applyFilters;
    }

    public RecommendationParams withApplyFilters(Boolean applyFilters) {
        this.applyFilters = applyFilters;
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

    public RecommendationParams withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
