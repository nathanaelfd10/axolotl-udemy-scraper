
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
    "title",
    "raw_title",
    "source_objects",
    "item_type",
    "items",
    "secondary_items",
    "remaining_item_count",
    "url",
    "type",
    "recommendation_params",
    "url_title",
    "score",
    "available_filters",
    "aggregations",
    "course_labels",
    "sort_options",
    "pagination",
    "view_type",
    "member_of",
    "tracking_id",
    "has_courses_in_ufb",
    "description",
    "subcategory_slug",
    "fbt_discount_savings_percent",
    "fbt_go_direct_to_cart"
})
@Generated("jsonschema2pojo")
public class Unit {

    @JsonProperty("title")
    private String title;
    @JsonProperty("raw_title")
    private String rawTitle;
    @JsonProperty("source_objects")
    private List<SourceObject> sourceObjects = null;
    @JsonProperty("item_type")
    private String itemType;
    @JsonProperty("items")
    private List<Item> items = null;
    @JsonProperty("secondary_items")
    private List<Object> secondaryItems = null;
    @JsonProperty("remaining_item_count")
    private Integer remainingItemCount;
    @JsonProperty("url")
    private String url;
    @JsonProperty("type")
    private String type;
    @JsonProperty("recommendation_params")
    private RecommendationParams recommendationParams;
    @JsonProperty("url_title")
    private Object urlTitle;
    @JsonProperty("score")
    private Integer score;
    @JsonProperty("available_filters")
    private AvailableFilters availableFilters;
    @JsonProperty("aggregations")
    private List<Aggregation> aggregations = null;
    @JsonProperty("course_labels")
    private List<CourseLabel> courseLabels = null;
    @JsonProperty("sort_options")
    private SortOptions sortOptions;
    @JsonProperty("pagination")
    private Pagination pagination;
    @JsonProperty("view_type")
    private String viewType;
    @JsonProperty("member_of")
    private Object memberOf;
    @JsonProperty("tracking_id")
    private String trackingId;
    @JsonProperty("has_courses_in_ufb")
    private Boolean hasCoursesInUfb;
    @JsonProperty("description")
    private String description;
    @JsonProperty("subcategory_slug")
    private String subcategorySlug;
    @JsonProperty("fbt_discount_savings_percent")
    private Object fbtDiscountSavingsPercent;
    @JsonProperty("fbt_go_direct_to_cart")
    private Boolean fbtGoDirectToCart;
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

    public Unit withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("raw_title")
    public String getRawTitle() {
        return rawTitle;
    }

    @JsonProperty("raw_title")
    public void setRawTitle(String rawTitle) {
        this.rawTitle = rawTitle;
    }

    public Unit withRawTitle(String rawTitle) {
        this.rawTitle = rawTitle;
        return this;
    }

    @JsonProperty("source_objects")
    public List<SourceObject> getSourceObjects() {
        return sourceObjects;
    }

    @JsonProperty("source_objects")
    public void setSourceObjects(List<SourceObject> sourceObjects) {
        this.sourceObjects = sourceObjects;
    }

    public Unit withSourceObjects(List<SourceObject> sourceObjects) {
        this.sourceObjects = sourceObjects;
        return this;
    }

    @JsonProperty("item_type")
    public String getItemType() {
        return itemType;
    }

    @JsonProperty("item_type")
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public Unit withItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }

    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Unit withItems(List<Item> items) {
        this.items = items;
        return this;
    }

    @JsonProperty("secondary_items")
    public List<Object> getSecondaryItems() {
        return secondaryItems;
    }

    @JsonProperty("secondary_items")
    public void setSecondaryItems(List<Object> secondaryItems) {
        this.secondaryItems = secondaryItems;
    }

    public Unit withSecondaryItems(List<Object> secondaryItems) {
        this.secondaryItems = secondaryItems;
        return this;
    }

    @JsonProperty("remaining_item_count")
    public Integer getRemainingItemCount() {
        return remainingItemCount;
    }

    @JsonProperty("remaining_item_count")
    public void setRemainingItemCount(Integer remainingItemCount) {
        this.remainingItemCount = remainingItemCount;
    }

    public Unit withRemainingItemCount(Integer remainingItemCount) {
        this.remainingItemCount = remainingItemCount;
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

    public Unit withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Unit withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("recommendation_params")
    public RecommendationParams getRecommendationParams() {
        return recommendationParams;
    }

    @JsonProperty("recommendation_params")
    public void setRecommendationParams(RecommendationParams recommendationParams) {
        this.recommendationParams = recommendationParams;
    }

    public Unit withRecommendationParams(RecommendationParams recommendationParams) {
        this.recommendationParams = recommendationParams;
        return this;
    }

    @JsonProperty("url_title")
    public Object getUrlTitle() {
        return urlTitle;
    }

    @JsonProperty("url_title")
    public void setUrlTitle(Object urlTitle) {
        this.urlTitle = urlTitle;
    }

    public Unit withUrlTitle(Object urlTitle) {
        this.urlTitle = urlTitle;
        return this;
    }

    @JsonProperty("score")
    public Integer getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Integer score) {
        this.score = score;
    }

    public Unit withScore(Integer score) {
        this.score = score;
        return this;
    }

    @JsonProperty("available_filters")
    public AvailableFilters getAvailableFilters() {
        return availableFilters;
    }

    @JsonProperty("available_filters")
    public void setAvailableFilters(AvailableFilters availableFilters) {
        this.availableFilters = availableFilters;
    }

    public Unit withAvailableFilters(AvailableFilters availableFilters) {
        this.availableFilters = availableFilters;
        return this;
    }

    @JsonProperty("aggregations")
    public List<Aggregation> getAggregations() {
        return aggregations;
    }

    @JsonProperty("aggregations")
    public void setAggregations(List<Aggregation> aggregations) {
        this.aggregations = aggregations;
    }

    public Unit withAggregations(List<Aggregation> aggregations) {
        this.aggregations = aggregations;
        return this;
    }

    @JsonProperty("course_labels")
    public List<CourseLabel> getCourseLabels() {
        return courseLabels;
    }

    @JsonProperty("course_labels")
    public void setCourseLabels(List<CourseLabel> courseLabels) {
        this.courseLabels = courseLabels;
    }

    public Unit withCourseLabels(List<CourseLabel> courseLabels) {
        this.courseLabels = courseLabels;
        return this;
    }

    @JsonProperty("sort_options")
    public SortOptions getSortOptions() {
        return sortOptions;
    }

    @JsonProperty("sort_options")
    public void setSortOptions(SortOptions sortOptions) {
        this.sortOptions = sortOptions;
    }

    public Unit withSortOptions(SortOptions sortOptions) {
        this.sortOptions = sortOptions;
        return this;
    }

    @JsonProperty("pagination")
    public Pagination getPagination() {
        return pagination;
    }

    @JsonProperty("pagination")
    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public Unit withPagination(Pagination pagination) {
        this.pagination = pagination;
        return this;
    }

    @JsonProperty("view_type")
    public String getViewType() {
        return viewType;
    }

    @JsonProperty("view_type")
    public void setViewType(String viewType) {
        this.viewType = viewType;
    }

    public Unit withViewType(String viewType) {
        this.viewType = viewType;
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

    public Unit withMemberOf(Object memberOf) {
        this.memberOf = memberOf;
        return this;
    }

    @JsonProperty("tracking_id")
    public String getTrackingId() {
        return trackingId;
    }

    @JsonProperty("tracking_id")
    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public Unit withTrackingId(String trackingId) {
        this.trackingId = trackingId;
        return this;
    }

    @JsonProperty("has_courses_in_ufb")
    public Boolean getHasCoursesInUfb() {
        return hasCoursesInUfb;
    }

    @JsonProperty("has_courses_in_ufb")
    public void setHasCoursesInUfb(Boolean hasCoursesInUfb) {
        this.hasCoursesInUfb = hasCoursesInUfb;
    }

    public Unit withHasCoursesInUfb(Boolean hasCoursesInUfb) {
        this.hasCoursesInUfb = hasCoursesInUfb;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Unit withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("subcategory_slug")
    public String getSubcategorySlug() {
        return subcategorySlug;
    }

    @JsonProperty("subcategory_slug")
    public void setSubcategorySlug(String subcategorySlug) {
        this.subcategorySlug = subcategorySlug;
    }

    public Unit withSubcategorySlug(String subcategorySlug) {
        this.subcategorySlug = subcategorySlug;
        return this;
    }

    @JsonProperty("fbt_discount_savings_percent")
    public Object getFbtDiscountSavingsPercent() {
        return fbtDiscountSavingsPercent;
    }

    @JsonProperty("fbt_discount_savings_percent")
    public void setFbtDiscountSavingsPercent(Object fbtDiscountSavingsPercent) {
        this.fbtDiscountSavingsPercent = fbtDiscountSavingsPercent;
    }

    public Unit withFbtDiscountSavingsPercent(Object fbtDiscountSavingsPercent) {
        this.fbtDiscountSavingsPercent = fbtDiscountSavingsPercent;
        return this;
    }

    @JsonProperty("fbt_go_direct_to_cart")
    public Boolean getFbtGoDirectToCart() {
        return fbtGoDirectToCart;
    }

    @JsonProperty("fbt_go_direct_to_cart")
    public void setFbtGoDirectToCart(Boolean fbtGoDirectToCart) {
        this.fbtGoDirectToCart = fbtGoDirectToCart;
    }

    public Unit withFbtGoDirectToCart(Boolean fbtGoDirectToCart) {
        this.fbtGoDirectToCart = fbtGoDirectToCart;
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

    public Unit withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
