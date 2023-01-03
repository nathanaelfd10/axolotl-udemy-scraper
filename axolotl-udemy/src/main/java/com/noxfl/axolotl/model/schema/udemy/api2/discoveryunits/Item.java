
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
    "_class",
    "id",
    "title",
    "url",
    "is_paid",
    "visible_instructors",
    "image_125_H",
    "image_240x135",
    "is_practice_test_course",
    "image_480x270",
    "published_title",
    "tracking_id",
    "headline",
    "num_subscribers",
    "caption_locales",
    "avg_rating",
    "avg_rating_recent",
    "rating",
    "num_reviews",
    "is_wishlisted",
    "num_published_lectures",
    "num_published_practice_tests",
    "image_50x50",
    "image_100x100",
    "image_304x171",
    "image_750x422",
    "is_in_user_subscription",
    "locale",
    "has_closed_caption",
    "caption_languages",
    "created",
    "instructional_level",
    "instructional_level_simple",
    "content_length_practice_test_questions",
    "is_user_subscribed",
    "buyable_object_type",
    "published_time",
    "objectives_summary",
    "is_recently_published",
    "last_update_date",
    "preview_url",
    "learn_url",
    "is_in_personal_plan_collection",
    "is_in_premium",
    "has_508_closed_captions",
    "predictive_score",
    "relevancy_score",
    "input_features",
    "lecture_search_result",
    "curriculum_lectures",
    "order_in_results",
    "curriculum_items",
    "instructor_name",
    "content_info",
    "content_info_short",
    "bestseller_badge_content",
    "badges",
    "free_course_subscribe_url",
    "context_info"
})
@Generated("jsonschema2pojo")
public class Item {

    @JsonProperty("_class")
    private String _class;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("url")
    private String url;
    @JsonProperty("is_paid")
    private Boolean isPaid;
    @JsonProperty("visible_instructors")
    private List<VisibleInstructor> visibleInstructors = null;
    @JsonProperty("image_125_H")
    private String image125H;
    @JsonProperty("image_240x135")
    private String image240x135;
    @JsonProperty("is_practice_test_course")
    private Boolean isPracticeTestCourse;
    @JsonProperty("image_480x270")
    private String image480x270;
    @JsonProperty("published_title")
    private String publishedTitle;
    @JsonProperty("tracking_id")
    private String trackingId;
    @JsonProperty("headline")
    private String headline;
    @JsonProperty("num_subscribers")
    private Integer numSubscribers;
    @JsonProperty("caption_locales")
    private List<CaptionLocale> captionLocales = null;
    @JsonProperty("avg_rating")
    private Double avgRating;
    @JsonProperty("avg_rating_recent")
    private Double avgRatingRecent;
    @JsonProperty("rating")
    private Double rating;
    @JsonProperty("num_reviews")
    private Integer numReviews;
    @JsonProperty("is_wishlisted")
    private Boolean isWishlisted;
    @JsonProperty("num_published_lectures")
    private Integer numPublishedLectures;
    @JsonProperty("num_published_practice_tests")
    private Integer numPublishedPracticeTests;
    @JsonProperty("image_50x50")
    private String image50x50;
    @JsonProperty("image_100x100")
    private String image100x100;
    @JsonProperty("image_304x171")
    private String image304x171;
    @JsonProperty("image_750x422")
    private String image750x422;
    @JsonProperty("is_in_user_subscription")
    private Boolean isInUserSubscription;
    @JsonProperty("locale")
    private Locale locale;
    @JsonProperty("has_closed_caption")
    private Boolean hasClosedCaption;
    @JsonProperty("caption_languages")
    private List<String> captionLanguages = null;
    @JsonProperty("created")
    private String created;
    @JsonProperty("instructional_level")
    private String instructionalLevel;
    @JsonProperty("instructional_level_simple")
    private String instructionalLevelSimple;
    @JsonProperty("content_length_practice_test_questions")
    private Integer contentLengthPracticeTestQuestions;
    @JsonProperty("is_user_subscribed")
    private Boolean isUserSubscribed;
    @JsonProperty("buyable_object_type")
    private String buyableObjectType;
    @JsonProperty("published_time")
    private String publishedTime;
    @JsonProperty("objectives_summary")
    private List<String> objectivesSummary = null;
    @JsonProperty("is_recently_published")
    private Boolean isRecentlyPublished;
    @JsonProperty("last_update_date")
    private String lastUpdateDate;
    @JsonProperty("preview_url")
    private String previewUrl;
    @JsonProperty("learn_url")
    private String learnUrl;
    @JsonProperty("is_in_personal_plan_collection")
    private Boolean isInPersonalPlanCollection;
    @JsonProperty("is_in_premium")
    private Boolean isInPremium;
    @JsonProperty("has_508_closed_captions")
    private Boolean has508ClosedCaptions;
    @JsonProperty("predictive_score")
    private Object predictiveScore;
    @JsonProperty("relevancy_score")
    private Object relevancyScore;
    @JsonProperty("input_features")
    private Object inputFeatures;
    @JsonProperty("lecture_search_result")
    private Object lectureSearchResult;
    @JsonProperty("curriculum_lectures")
    private List<Object> curriculumLectures = null;
    @JsonProperty("order_in_results")
    private Object orderInResults;
    @JsonProperty("curriculum_items")
    private List<Object> curriculumItems = null;
    @JsonProperty("instructor_name")
    private Object instructorName;
    @JsonProperty("content_info")
    private String contentInfo;
    @JsonProperty("content_info_short")
    private String contentInfoShort;
    @JsonProperty("bestseller_badge_content")
    private Object bestsellerBadgeContent;
    @JsonProperty("badges")
    private List<Object> badges = null;
    @JsonProperty("free_course_subscribe_url")
    private Object freeCourseSubscribeUrl;
    @JsonProperty("context_info")
    private ContextInfo contextInfo;
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

    public Item withClass(String _class) {
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

    public Item withId(Integer id) {
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

    public Item withTitle(String title) {
        this.title = title;
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

    public Item withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("is_paid")
    public Boolean getIsPaid() {
        return isPaid;
    }

    @JsonProperty("is_paid")
    public void setIsPaid(Boolean isPaid) {
        this.isPaid = isPaid;
    }

    public Item withIsPaid(Boolean isPaid) {
        this.isPaid = isPaid;
        return this;
    }

    @JsonProperty("visible_instructors")
    public List<VisibleInstructor> getVisibleInstructors() {
        return visibleInstructors;
    }

    @JsonProperty("visible_instructors")
    public void setVisibleInstructors(List<VisibleInstructor> visibleInstructors) {
        this.visibleInstructors = visibleInstructors;
    }

    public Item withVisibleInstructors(List<VisibleInstructor> visibleInstructors) {
        this.visibleInstructors = visibleInstructors;
        return this;
    }

    @JsonProperty("image_125_H")
    public String getImage125H() {
        return image125H;
    }

    @JsonProperty("image_125_H")
    public void setImage125H(String image125H) {
        this.image125H = image125H;
    }

    public Item withImage125H(String image125H) {
        this.image125H = image125H;
        return this;
    }

    @JsonProperty("image_240x135")
    public String getImage240x135() {
        return image240x135;
    }

    @JsonProperty("image_240x135")
    public void setImage240x135(String image240x135) {
        this.image240x135 = image240x135;
    }

    public Item withImage240x135(String image240x135) {
        this.image240x135 = image240x135;
        return this;
    }

    @JsonProperty("is_practice_test_course")
    public Boolean getIsPracticeTestCourse() {
        return isPracticeTestCourse;
    }

    @JsonProperty("is_practice_test_course")
    public void setIsPracticeTestCourse(Boolean isPracticeTestCourse) {
        this.isPracticeTestCourse = isPracticeTestCourse;
    }

    public Item withIsPracticeTestCourse(Boolean isPracticeTestCourse) {
        this.isPracticeTestCourse = isPracticeTestCourse;
        return this;
    }

    @JsonProperty("image_480x270")
    public String getImage480x270() {
        return image480x270;
    }

    @JsonProperty("image_480x270")
    public void setImage480x270(String image480x270) {
        this.image480x270 = image480x270;
    }

    public Item withImage480x270(String image480x270) {
        this.image480x270 = image480x270;
        return this;
    }

    @JsonProperty("published_title")
    public String getPublishedTitle() {
        return publishedTitle;
    }

    @JsonProperty("published_title")
    public void setPublishedTitle(String publishedTitle) {
        this.publishedTitle = publishedTitle;
    }

    public Item withPublishedTitle(String publishedTitle) {
        this.publishedTitle = publishedTitle;
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

    public Item withTrackingId(String trackingId) {
        this.trackingId = trackingId;
        return this;
    }

    @JsonProperty("headline")
    public String getHeadline() {
        return headline;
    }

    @JsonProperty("headline")
    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public Item withHeadline(String headline) {
        this.headline = headline;
        return this;
    }

    @JsonProperty("num_subscribers")
    public Integer getNumSubscribers() {
        return numSubscribers;
    }

    @JsonProperty("num_subscribers")
    public void setNumSubscribers(Integer numSubscribers) {
        this.numSubscribers = numSubscribers;
    }

    public Item withNumSubscribers(Integer numSubscribers) {
        this.numSubscribers = numSubscribers;
        return this;
    }

    @JsonProperty("caption_locales")
    public List<CaptionLocale> getCaptionLocales() {
        return captionLocales;
    }

    @JsonProperty("caption_locales")
    public void setCaptionLocales(List<CaptionLocale> captionLocales) {
        this.captionLocales = captionLocales;
    }

    public Item withCaptionLocales(List<CaptionLocale> captionLocales) {
        this.captionLocales = captionLocales;
        return this;
    }

    @JsonProperty("avg_rating")
    public Double getAvgRating() {
        return avgRating;
    }

    @JsonProperty("avg_rating")
    public void setAvgRating(Double avgRating) {
        this.avgRating = avgRating;
    }

    public Item withAvgRating(Double avgRating) {
        this.avgRating = avgRating;
        return this;
    }

    @JsonProperty("avg_rating_recent")
    public Double getAvgRatingRecent() {
        return avgRatingRecent;
    }

    @JsonProperty("avg_rating_recent")
    public void setAvgRatingRecent(Double avgRatingRecent) {
        this.avgRatingRecent = avgRatingRecent;
    }

    public Item withAvgRatingRecent(Double avgRatingRecent) {
        this.avgRatingRecent = avgRatingRecent;
        return this;
    }

    @JsonProperty("rating")
    public Double getRating() {
        return rating;
    }

    @JsonProperty("rating")
    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Item withRating(Double rating) {
        this.rating = rating;
        return this;
    }

    @JsonProperty("num_reviews")
    public Integer getNumReviews() {
        return numReviews;
    }

    @JsonProperty("num_reviews")
    public void setNumReviews(Integer numReviews) {
        this.numReviews = numReviews;
    }

    public Item withNumReviews(Integer numReviews) {
        this.numReviews = numReviews;
        return this;
    }

    @JsonProperty("is_wishlisted")
    public Boolean getIsWishlisted() {
        return isWishlisted;
    }

    @JsonProperty("is_wishlisted")
    public void setIsWishlisted(Boolean isWishlisted) {
        this.isWishlisted = isWishlisted;
    }

    public Item withIsWishlisted(Boolean isWishlisted) {
        this.isWishlisted = isWishlisted;
        return this;
    }

    @JsonProperty("num_published_lectures")
    public Integer getNumPublishedLectures() {
        return numPublishedLectures;
    }

    @JsonProperty("num_published_lectures")
    public void setNumPublishedLectures(Integer numPublishedLectures) {
        this.numPublishedLectures = numPublishedLectures;
    }

    public Item withNumPublishedLectures(Integer numPublishedLectures) {
        this.numPublishedLectures = numPublishedLectures;
        return this;
    }

    @JsonProperty("num_published_practice_tests")
    public Integer getNumPublishedPracticeTests() {
        return numPublishedPracticeTests;
    }

    @JsonProperty("num_published_practice_tests")
    public void setNumPublishedPracticeTests(Integer numPublishedPracticeTests) {
        this.numPublishedPracticeTests = numPublishedPracticeTests;
    }

    public Item withNumPublishedPracticeTests(Integer numPublishedPracticeTests) {
        this.numPublishedPracticeTests = numPublishedPracticeTests;
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

    public Item withImage50x50(String image50x50) {
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

    public Item withImage100x100(String image100x100) {
        this.image100x100 = image100x100;
        return this;
    }

    @JsonProperty("image_304x171")
    public String getImage304x171() {
        return image304x171;
    }

    @JsonProperty("image_304x171")
    public void setImage304x171(String image304x171) {
        this.image304x171 = image304x171;
    }

    public Item withImage304x171(String image304x171) {
        this.image304x171 = image304x171;
        return this;
    }

    @JsonProperty("image_750x422")
    public String getImage750x422() {
        return image750x422;
    }

    @JsonProperty("image_750x422")
    public void setImage750x422(String image750x422) {
        this.image750x422 = image750x422;
    }

    public Item withImage750x422(String image750x422) {
        this.image750x422 = image750x422;
        return this;
    }

    @JsonProperty("is_in_user_subscription")
    public Boolean getIsInUserSubscription() {
        return isInUserSubscription;
    }

    @JsonProperty("is_in_user_subscription")
    public void setIsInUserSubscription(Boolean isInUserSubscription) {
        this.isInUserSubscription = isInUserSubscription;
    }

    public Item withIsInUserSubscription(Boolean isInUserSubscription) {
        this.isInUserSubscription = isInUserSubscription;
        return this;
    }

    @JsonProperty("locale")
    public Locale getLocale() {
        return locale;
    }

    @JsonProperty("locale")
    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public Item withLocale(Locale locale) {
        this.locale = locale;
        return this;
    }

    @JsonProperty("has_closed_caption")
    public Boolean getHasClosedCaption() {
        return hasClosedCaption;
    }

    @JsonProperty("has_closed_caption")
    public void setHasClosedCaption(Boolean hasClosedCaption) {
        this.hasClosedCaption = hasClosedCaption;
    }

    public Item withHasClosedCaption(Boolean hasClosedCaption) {
        this.hasClosedCaption = hasClosedCaption;
        return this;
    }

    @JsonProperty("caption_languages")
    public List<String> getCaptionLanguages() {
        return captionLanguages;
    }

    @JsonProperty("caption_languages")
    public void setCaptionLanguages(List<String> captionLanguages) {
        this.captionLanguages = captionLanguages;
    }

    public Item withCaptionLanguages(List<String> captionLanguages) {
        this.captionLanguages = captionLanguages;
        return this;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    public Item withCreated(String created) {
        this.created = created;
        return this;
    }

    @JsonProperty("instructional_level")
    public String getInstructionalLevel() {
        return instructionalLevel;
    }

    @JsonProperty("instructional_level")
    public void setInstructionalLevel(String instructionalLevel) {
        this.instructionalLevel = instructionalLevel;
    }

    public Item withInstructionalLevel(String instructionalLevel) {
        this.instructionalLevel = instructionalLevel;
        return this;
    }

    @JsonProperty("instructional_level_simple")
    public String getInstructionalLevelSimple() {
        return instructionalLevelSimple;
    }

    @JsonProperty("instructional_level_simple")
    public void setInstructionalLevelSimple(String instructionalLevelSimple) {
        this.instructionalLevelSimple = instructionalLevelSimple;
    }

    public Item withInstructionalLevelSimple(String instructionalLevelSimple) {
        this.instructionalLevelSimple = instructionalLevelSimple;
        return this;
    }

    @JsonProperty("content_length_practice_test_questions")
    public Integer getContentLengthPracticeTestQuestions() {
        return contentLengthPracticeTestQuestions;
    }

    @JsonProperty("content_length_practice_test_questions")
    public void setContentLengthPracticeTestQuestions(Integer contentLengthPracticeTestQuestions) {
        this.contentLengthPracticeTestQuestions = contentLengthPracticeTestQuestions;
    }

    public Item withContentLengthPracticeTestQuestions(Integer contentLengthPracticeTestQuestions) {
        this.contentLengthPracticeTestQuestions = contentLengthPracticeTestQuestions;
        return this;
    }

    @JsonProperty("is_user_subscribed")
    public Boolean getIsUserSubscribed() {
        return isUserSubscribed;
    }

    @JsonProperty("is_user_subscribed")
    public void setIsUserSubscribed(Boolean isUserSubscribed) {
        this.isUserSubscribed = isUserSubscribed;
    }

    public Item withIsUserSubscribed(Boolean isUserSubscribed) {
        this.isUserSubscribed = isUserSubscribed;
        return this;
    }

    @JsonProperty("buyable_object_type")
    public String getBuyableObjectType() {
        return buyableObjectType;
    }

    @JsonProperty("buyable_object_type")
    public void setBuyableObjectType(String buyableObjectType) {
        this.buyableObjectType = buyableObjectType;
    }

    public Item withBuyableObjectType(String buyableObjectType) {
        this.buyableObjectType = buyableObjectType;
        return this;
    }

    @JsonProperty("published_time")
    public String getPublishedTime() {
        return publishedTime;
    }

    @JsonProperty("published_time")
    public void setPublishedTime(String publishedTime) {
        this.publishedTime = publishedTime;
    }

    public Item withPublishedTime(String publishedTime) {
        this.publishedTime = publishedTime;
        return this;
    }

    @JsonProperty("objectives_summary")
    public List<String> getObjectivesSummary() {
        return objectivesSummary;
    }

    @JsonProperty("objectives_summary")
    public void setObjectivesSummary(List<String> objectivesSummary) {
        this.objectivesSummary = objectivesSummary;
    }

    public Item withObjectivesSummary(List<String> objectivesSummary) {
        this.objectivesSummary = objectivesSummary;
        return this;
    }

    @JsonProperty("is_recently_published")
    public Boolean getIsRecentlyPublished() {
        return isRecentlyPublished;
    }

    @JsonProperty("is_recently_published")
    public void setIsRecentlyPublished(Boolean isRecentlyPublished) {
        this.isRecentlyPublished = isRecentlyPublished;
    }

    public Item withIsRecentlyPublished(Boolean isRecentlyPublished) {
        this.isRecentlyPublished = isRecentlyPublished;
        return this;
    }

    @JsonProperty("last_update_date")
    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    @JsonProperty("last_update_date")
    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Item withLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
        return this;
    }

    @JsonProperty("preview_url")
    public String getPreviewUrl() {
        return previewUrl;
    }

    @JsonProperty("preview_url")
    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public Item withPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
        return this;
    }

    @JsonProperty("learn_url")
    public String getLearnUrl() {
        return learnUrl;
    }

    @JsonProperty("learn_url")
    public void setLearnUrl(String learnUrl) {
        this.learnUrl = learnUrl;
    }

    public Item withLearnUrl(String learnUrl) {
        this.learnUrl = learnUrl;
        return this;
    }

    @JsonProperty("is_in_personal_plan_collection")
    public Boolean getIsInPersonalPlanCollection() {
        return isInPersonalPlanCollection;
    }

    @JsonProperty("is_in_personal_plan_collection")
    public void setIsInPersonalPlanCollection(Boolean isInPersonalPlanCollection) {
        this.isInPersonalPlanCollection = isInPersonalPlanCollection;
    }

    public Item withIsInPersonalPlanCollection(Boolean isInPersonalPlanCollection) {
        this.isInPersonalPlanCollection = isInPersonalPlanCollection;
        return this;
    }

    @JsonProperty("is_in_premium")
    public Boolean getIsInPremium() {
        return isInPremium;
    }

    @JsonProperty("is_in_premium")
    public void setIsInPremium(Boolean isInPremium) {
        this.isInPremium = isInPremium;
    }

    public Item withIsInPremium(Boolean isInPremium) {
        this.isInPremium = isInPremium;
        return this;
    }

    @JsonProperty("has_508_closed_captions")
    public Boolean getHas508ClosedCaptions() {
        return has508ClosedCaptions;
    }

    @JsonProperty("has_508_closed_captions")
    public void setHas508ClosedCaptions(Boolean has508ClosedCaptions) {
        this.has508ClosedCaptions = has508ClosedCaptions;
    }

    public Item withHas508ClosedCaptions(Boolean has508ClosedCaptions) {
        this.has508ClosedCaptions = has508ClosedCaptions;
        return this;
    }

    @JsonProperty("predictive_score")
    public Object getPredictiveScore() {
        return predictiveScore;
    }

    @JsonProperty("predictive_score")
    public void setPredictiveScore(Object predictiveScore) {
        this.predictiveScore = predictiveScore;
    }

    public Item withPredictiveScore(Object predictiveScore) {
        this.predictiveScore = predictiveScore;
        return this;
    }

    @JsonProperty("relevancy_score")
    public Object getRelevancyScore() {
        return relevancyScore;
    }

    @JsonProperty("relevancy_score")
    public void setRelevancyScore(Object relevancyScore) {
        this.relevancyScore = relevancyScore;
    }

    public Item withRelevancyScore(Object relevancyScore) {
        this.relevancyScore = relevancyScore;
        return this;
    }

    @JsonProperty("input_features")
    public Object getInputFeatures() {
        return inputFeatures;
    }

    @JsonProperty("input_features")
    public void setInputFeatures(Object inputFeatures) {
        this.inputFeatures = inputFeatures;
    }

    public Item withInputFeatures(Object inputFeatures) {
        this.inputFeatures = inputFeatures;
        return this;
    }

    @JsonProperty("lecture_search_result")
    public Object getLectureSearchResult() {
        return lectureSearchResult;
    }

    @JsonProperty("lecture_search_result")
    public void setLectureSearchResult(Object lectureSearchResult) {
        this.lectureSearchResult = lectureSearchResult;
    }

    public Item withLectureSearchResult(Object lectureSearchResult) {
        this.lectureSearchResult = lectureSearchResult;
        return this;
    }

    @JsonProperty("curriculum_lectures")
    public List<Object> getCurriculumLectures() {
        return curriculumLectures;
    }

    @JsonProperty("curriculum_lectures")
    public void setCurriculumLectures(List<Object> curriculumLectures) {
        this.curriculumLectures = curriculumLectures;
    }

    public Item withCurriculumLectures(List<Object> curriculumLectures) {
        this.curriculumLectures = curriculumLectures;
        return this;
    }

    @JsonProperty("order_in_results")
    public Object getOrderInResults() {
        return orderInResults;
    }

    @JsonProperty("order_in_results")
    public void setOrderInResults(Object orderInResults) {
        this.orderInResults = orderInResults;
    }

    public Item withOrderInResults(Object orderInResults) {
        this.orderInResults = orderInResults;
        return this;
    }

    @JsonProperty("curriculum_items")
    public List<Object> getCurriculumItems() {
        return curriculumItems;
    }

    @JsonProperty("curriculum_items")
    public void setCurriculumItems(List<Object> curriculumItems) {
        this.curriculumItems = curriculumItems;
    }

    public Item withCurriculumItems(List<Object> curriculumItems) {
        this.curriculumItems = curriculumItems;
        return this;
    }

    @JsonProperty("instructor_name")
    public Object getInstructorName() {
        return instructorName;
    }

    @JsonProperty("instructor_name")
    public void setInstructorName(Object instructorName) {
        this.instructorName = instructorName;
    }

    public Item withInstructorName(Object instructorName) {
        this.instructorName = instructorName;
        return this;
    }

    @JsonProperty("content_info")
    public String getContentInfo() {
        return contentInfo;
    }

    @JsonProperty("content_info")
    public void setContentInfo(String contentInfo) {
        this.contentInfo = contentInfo;
    }

    public Item withContentInfo(String contentInfo) {
        this.contentInfo = contentInfo;
        return this;
    }

    @JsonProperty("content_info_short")
    public String getContentInfoShort() {
        return contentInfoShort;
    }

    @JsonProperty("content_info_short")
    public void setContentInfoShort(String contentInfoShort) {
        this.contentInfoShort = contentInfoShort;
    }

    public Item withContentInfoShort(String contentInfoShort) {
        this.contentInfoShort = contentInfoShort;
        return this;
    }

    @JsonProperty("bestseller_badge_content")
    public Object getBestsellerBadgeContent() {
        return bestsellerBadgeContent;
    }

    @JsonProperty("bestseller_badge_content")
    public void setBestsellerBadgeContent(Object bestsellerBadgeContent) {
        this.bestsellerBadgeContent = bestsellerBadgeContent;
    }

    public Item withBestsellerBadgeContent(Object bestsellerBadgeContent) {
        this.bestsellerBadgeContent = bestsellerBadgeContent;
        return this;
    }

    @JsonProperty("badges")
    public List<Object> getBadges() {
        return badges;
    }

    @JsonProperty("badges")
    public void setBadges(List<Object> badges) {
        this.badges = badges;
    }

    public Item withBadges(List<Object> badges) {
        this.badges = badges;
        return this;
    }

    @JsonProperty("free_course_subscribe_url")
    public Object getFreeCourseSubscribeUrl() {
        return freeCourseSubscribeUrl;
    }

    @JsonProperty("free_course_subscribe_url")
    public void setFreeCourseSubscribeUrl(Object freeCourseSubscribeUrl) {
        this.freeCourseSubscribeUrl = freeCourseSubscribeUrl;
    }

    public Item withFreeCourseSubscribeUrl(Object freeCourseSubscribeUrl) {
        this.freeCourseSubscribeUrl = freeCourseSubscribeUrl;
        return this;
    }

    @JsonProperty("context_info")
    public ContextInfo getContextInfo() {
        return contextInfo;
    }

    @JsonProperty("context_info")
    public void setContextInfo(ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
    }

    public Item withContextInfo(ContextInfo contextInfo) {
        this.contextInfo = contextInfo;
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

    public Item withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
