
package com.commercetools.api.models.review;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReviewBuilder {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    @Nullable
    private String key;

    @Nullable
    private String uniquenessValue;

    @Nullable
    private String locale;

    @Nullable
    private String authorName;

    @Nullable
    private String title;

    @Nullable
    private String text;

    @Nullable
    private java.lang.Object target;

    private Boolean includedInStatistics;

    @Nullable
    private Integer rating;

    @Nullable
    private com.commercetools.api.models.state.StateReference state;

    @Nullable
    private com.commercetools.api.models.customer.CustomerReference customer;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    public ReviewBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ReviewBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ReviewBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public ReviewBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public ReviewBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public ReviewBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public ReviewBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public ReviewBuilder uniquenessValue(@Nullable final String uniquenessValue) {
        this.uniquenessValue = uniquenessValue;
        return this;
    }

    public ReviewBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    public ReviewBuilder authorName(@Nullable final String authorName) {
        this.authorName = authorName;
        return this;
    }

    public ReviewBuilder title(@Nullable final String title) {
        this.title = title;
        return this;
    }

    public ReviewBuilder text(@Nullable final String text) {
        this.text = text;
        return this;
    }

    public ReviewBuilder target(@Nullable final java.lang.Object target) {
        this.target = target;
        return this;
    }

    public ReviewBuilder includedInStatistics(final Boolean includedInStatistics) {
        this.includedInStatistics = includedInStatistics;
        return this;
    }

    public ReviewBuilder rating(@Nullable final Integer rating) {
        this.rating = rating;
        return this;
    }

    public ReviewBuilder state(@Nullable final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    public ReviewBuilder customer(@Nullable final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }

    public ReviewBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    @Nullable
    public String getUniquenessValue() {
        return this.uniquenessValue;
    }

    @Nullable
    public String getLocale() {
        return this.locale;
    }

    @Nullable
    public String getAuthorName() {
        return this.authorName;
    }

    @Nullable
    public String getTitle() {
        return this.title;
    }

    @Nullable
    public String getText() {
        return this.text;
    }

    @Nullable
    public java.lang.Object getTarget() {
        return this.target;
    }

    public Boolean getIncludedInStatistics() {
        return this.includedInStatistics;
    }

    @Nullable
    public Integer getRating() {
        return this.rating;
    }

    @Nullable
    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    @Nullable
    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public Review build() {
        return new ReviewImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, uniquenessValue,
            locale, authorName, title, text, target, includedInStatistics, rating, state, customer, custom);
    }

    public static ReviewBuilder of() {
        return new ReviewBuilder();
    }

    public static ReviewBuilder of(final Review template) {
        ReviewBuilder builder = new ReviewBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.key = template.getKey();
        builder.uniquenessValue = template.getUniquenessValue();
        builder.locale = template.getLocale();
        builder.authorName = template.getAuthorName();
        builder.title = template.getTitle();
        builder.text = template.getText();
        builder.target = template.getTarget();
        builder.includedInStatistics = template.getIncludedInStatistics();
        builder.rating = template.getRating();
        builder.state = template.getState();
        builder.customer = template.getCustomer();
        builder.custom = template.getCustom();
        return builder;
    }

}
