
package com.commercetools.api.models.review;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ReviewDraftBuilder implements Builder<ReviewDraft> {

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

    @Nullable
    private com.commercetools.api.models.state.StateResourceIdentifier state;

    @Nullable
    private Integer rating;

    @Nullable
    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    public ReviewDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public ReviewDraftBuilder uniquenessValue(@Nullable final String uniquenessValue) {
        this.uniquenessValue = uniquenessValue;
        return this;
    }

    public ReviewDraftBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    public ReviewDraftBuilder authorName(@Nullable final String authorName) {
        this.authorName = authorName;
        return this;
    }

    public ReviewDraftBuilder title(@Nullable final String title) {
        this.title = title;
        return this;
    }

    public ReviewDraftBuilder text(@Nullable final String text) {
        this.text = text;
        return this;
    }

    public ReviewDraftBuilder target(@Nullable final java.lang.Object target) {
        this.target = target;
        return this;
    }

    public ReviewDraftBuilder state(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    public ReviewDraftBuilder state(@Nullable final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
        return this;
    }

    public ReviewDraftBuilder rating(@Nullable final Integer rating) {
        this.rating = rating;
        return this;
    }

    public ReviewDraftBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    public ReviewDraftBuilder customer(
            @Nullable final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
        return this;
    }

    public ReviewDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    public ReviewDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
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

    @Nullable
    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    @Nullable
    public Integer getRating() {
        return this.rating;
    }

    @Nullable
    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer() {
        return this.customer;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public ReviewDraft build() {
        return new ReviewDraftImpl(key, uniquenessValue, locale, authorName, title, text, target, state, rating,
            customer, custom);
    }

    /**
     * builds ReviewDraft without checking for non null required values
     */
    public ReviewDraft buildUnchecked() {
        return new ReviewDraftImpl(key, uniquenessValue, locale, authorName, title, text, target, state, rating,
            customer, custom);
    }

    public static ReviewDraftBuilder of() {
        return new ReviewDraftBuilder();
    }

    public static ReviewDraftBuilder of(final ReviewDraft template) {
        ReviewDraftBuilder builder = new ReviewDraftBuilder();
        builder.key = template.getKey();
        builder.uniquenessValue = template.getUniquenessValue();
        builder.locale = template.getLocale();
        builder.authorName = template.getAuthorName();
        builder.title = template.getTitle();
        builder.text = template.getText();
        builder.target = template.getTarget();
        builder.state = template.getState();
        builder.rating = template.getRating();
        builder.customer = template.getCustomer();
        builder.custom = template.getCustom();
        return builder;
    }

}
