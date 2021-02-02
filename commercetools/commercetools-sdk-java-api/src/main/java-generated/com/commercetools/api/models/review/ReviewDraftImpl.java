
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.product.ProductResourceIdentifier;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReviewDraftImpl implements ReviewDraft {

    private String key;

    private String uniquenessValue;

    private String locale;

    private String authorName;

    private String title;

    private String text;

    private java.lang.Object target;

    private com.commercetools.api.models.state.StateResourceIdentifier state;

    private Integer rating;

    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @JsonCreator
    ReviewDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("uniquenessValue") final String uniquenessValue, @JsonProperty("locale") final String locale,
            @JsonProperty("authorName") final String authorName, @JsonProperty("title") final String title,
            @JsonProperty("text") final String text, @JsonProperty("target") final java.lang.Object target,
            @JsonProperty("state") final com.commercetools.api.models.state.StateResourceIdentifier state,
            @JsonProperty("rating") final Integer rating,
            @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerResourceIdentifier customer,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.key = key;
        this.uniquenessValue = uniquenessValue;
        this.locale = locale;
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.target = target;
        this.state = state;
        this.rating = rating;
        this.customer = customer;
        this.custom = custom;
    }

    public ReviewDraftImpl() {
    }

    /**
    *  <p>User-specific unique identifier for the review.</p>
    */
    public String getKey() {
        return this.key;
    }

    /**
    *  <p>If set, this value must be unique among reviews.
    *  For example, if you want to have only one review per customer and per product, you can set the value to <code>customer's id</code> and <code>product's id</code>.</p>
    */
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

    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    /**
    *  <p>Number between -100 and 100 included.
    *  Rating of the targeted object, like a product.
    *  This rating can represent the number of stars, or a percentage, or a like (+1)/dislike (-1)
    *  A rating is used in the ratings statistics of the targeted object, unless the review is in a state that does not have the role <code>ReviewIncludedInStatistics</code>.</p>
    */
    public Integer getRating() {
        return this.rating;
    }

    /**
    *  <p>The customer who created the review.</p>
    */
    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer() {
        return this.customer;
    }

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
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
    public void setTarget(final ProductResourceIdentifier target) {
        this.target = target;
    }

    @JsonIgnore
    public void setTarget(final ChannelResourceIdentifier target) {
        this.target = target;
    }

    public void setTarget(final java.lang.Object target) {
        this.target = target;
    }

    public void setState(final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
    }

    public void setRating(final Integer rating) {
        this.rating = rating;
    }

    public void setCustomer(final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReviewDraftImpl that = (ReviewDraftImpl) o;

        return new EqualsBuilder().append(key, that.key).append(uniquenessValue, that.uniquenessValue).append(locale,
            that.locale).append(authorName, that.authorName).append(title, that.title).append(text, that.text).append(
                target, that.target).append(state, that.state).append(rating, that.rating).append(customer,
                    that.customer).append(custom, that.custom).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key).append(uniquenessValue).append(locale).append(authorName).append(
            title).append(text).append(target).append(state).append(rating).append(customer).append(
                custom).toHashCode();
    }

}
