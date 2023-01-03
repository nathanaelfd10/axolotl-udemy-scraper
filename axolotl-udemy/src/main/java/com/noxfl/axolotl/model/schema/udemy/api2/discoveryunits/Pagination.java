
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
    "previous",
    "next",
    "current_page",
    "total_page",
    "total_item_count",
    "pages"
})
@Generated("jsonschema2pojo")
public class Pagination {

    @JsonProperty("previous")
    private Previous previous;
    @JsonProperty("next")
    private Next next;
    @JsonProperty("current_page")
    private Integer currentPage;
    @JsonProperty("total_page")
    private Integer totalPage;
    @JsonProperty("total_item_count")
    private Integer totalItemCount;
    @JsonProperty("pages")
    private List<Page> pages = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("previous")
    public Previous getPrevious() {
        return previous;
    }

    @JsonProperty("previous")
    public void setPrevious(Previous previous) {
        this.previous = previous;
    }

    public Pagination withPrevious(Previous previous) {
        this.previous = previous;
        return this;
    }

    @JsonProperty("next")
    public Next getNext() {
        return next;
    }

    @JsonProperty("next")
    public void setNext(Next next) {
        this.next = next;
    }

    public Pagination withNext(Next next) {
        this.next = next;
        return this;
    }

    @JsonProperty("current_page")
    public Integer getCurrentPage() {
        return currentPage;
    }

    @JsonProperty("current_page")
    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Pagination withCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }

    @JsonProperty("total_page")
    public Integer getTotalPage() {
        return totalPage;
    }

    @JsonProperty("total_page")
    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Pagination withTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    @JsonProperty("total_item_count")
    public Integer getTotalItemCount() {
        return totalItemCount;
    }

    @JsonProperty("total_item_count")
    public void setTotalItemCount(Integer totalItemCount) {
        this.totalItemCount = totalItemCount;
    }

    public Pagination withTotalItemCount(Integer totalItemCount) {
        this.totalItemCount = totalItemCount;
        return this;
    }

    @JsonProperty("pages")
    public List<Page> getPages() {
        return pages;
    }

    @JsonProperty("pages")
    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

    public Pagination withPages(List<Page> pages) {
        this.pages = pages;
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

    public Pagination withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
