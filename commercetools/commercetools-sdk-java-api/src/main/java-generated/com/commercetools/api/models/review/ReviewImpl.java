
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.product.ProductReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ReviewImpl implements Review, ModelBase {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.common.CreatedBy createdBy;

    private String key;

    private String uniquenessValue;

    private String locale;

    private String authorName;

    private String title;

    private String text;

    private java.lang.Object target;

    private Boolean includedInStatistics;

    private Integer rating;

    private com.commercetools.api.models.state.StateReference state;

    private com.commercetools.api.models.customer.CustomerReference customer;

    private com.commercetools.api.models.type.CustomFields custom;

    @JsonCreator
    ReviewImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy,
            @JsonProperty("key") final String key, @JsonProperty("uniquenessValue") final String uniquenessValue,
            @JsonProperty("locale") final String locale, @JsonProperty("authorName") final String authorName,
            @JsonProperty("title") final String title, @JsonProperty("text") final String text,
            @JsonProperty("target") final java.lang.Object target,
            @JsonProperty("includedInStatistics") final Boolean includedInStatistics,
            @JsonProperty("rating") final Integer rating,
            @JsonProperty("state") final com.commercetools.api.models.state.StateReference state,
            @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerReference customer,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.key = key;
        this.uniquenessValue = uniquenessValue;
        this.locale = locale;
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.target = target;
        this.includedInStatistics = includedInStatistics;
        this.rating = rating;
        this.state = state;
        this.customer = customer;
        this.custom = custom;
    }

    public ReviewImpl() {
    }

    /**
    *  <p>The unique ID of the review.</p>
    */
    public String getId() {
        return this.id;
    }

    /**
    *  <p>The current version of the review.</p>
    */
    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
    *  <p>User-specific unique identifier for the review.</p>
    */
    public String getKey() {
        return this.key;
    }

    public String getUniquenessValue() {
        return this.uniquenessValue;
    }

    public String getLocale() {
        return this.locale;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getTitle() {
        return this.title;
    }

    public String getText() {
        return this.text;
    }

    /**
    *  <p>Identifies the target of the review.
    *  Can be a Product or a Channel</p>
    */
    public java.lang.Object getTarget() {
        return this.target;
    }

    /**
    *  <p>Indicates if this review is taken into account in the ratings statistics of the target.
    *  A review is per default used in the statistics, unless the review is in a state that does not have the role <code>ReviewIncludedInStatistics</code>.
    *  If the role of a State is modified after the calculation of this field, the calculation is not updated.</p>
    */
    public Boolean getIncludedInStatistics() {
        return this.includedInStatistics;
    }

    /**
    *  <p>Number between -100 and 100 included.</p>
    */
    public Integer getRating() {
        return this.rating;
    }

    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    /**
    *  <p>The customer who created the review.</p>
    */
    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setUniquenessValue(final String uniquenessValue) {
        this.uniquenessValue = uniquenessValue;
    }

    public void setLocale(final String locale) {
        this.locale = locale;
    }

    public void setAuthorName(final String authorName) {
        this.authorName = authorName;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void setText(final String text) {
        this.text = text;
    }

    @JsonIgnore
    public void setTarget(final ProductReference target) {
        this.target = target;
    }

    @JsonIgnore
    public void setTarget(final ChannelReference target) {
        this.target = target;
    }

    public void setTarget(final java.lang.Object target) {
        this.target = target;
    }

    public void setIncludedInStatistics(final Boolean includedInStatistics) {
        this.includedInStatistics = includedInStatistics;
    }

    public void setRating(final Integer rating) {
        this.rating = rating;
    }

    public void setState(final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
    }

    public void setCustomer(final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReviewImpl that = (ReviewImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(key, that.key)
                .append(uniquenessValue, that.uniquenessValue)
                .append(locale, that.locale)
                .append(authorName, that.authorName)
                .append(title, that.title)
                .append(text, that.text)
                .append(target, that.target)
                .append(includedInStatistics, that.includedInStatistics)
                .append(rating, that.rating)
                .append(state, that.state)
                .append(customer, that.customer)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(version)
                .append(createdAt)
                .append(lastModifiedAt)
                .append(lastModifiedBy)
                .append(createdBy)
                .append(key)
                .append(uniquenessValue)
                .append(locale)
                .append(authorName)
                .append(title)
                .append(text)
                .append(target)
                .append(includedInStatistics)
                .append(rating)
                .append(state)
                .append(customer)
                .append(custom)
                .toHashCode();
    }

}
