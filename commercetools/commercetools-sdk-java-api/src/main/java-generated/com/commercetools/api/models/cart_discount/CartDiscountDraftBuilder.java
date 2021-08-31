
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountDraftBuilder implements Builder<CartDiscountDraft> {

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private String key;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    private com.commercetools.api.models.cart_discount.CartDiscountValueDraft value;

    private String cartPredicate;

    @Nullable
    private com.commercetools.api.models.cart_discount.CartDiscountTarget target;

    private String sortOrder;

    @Nullable
    private Boolean isActive;

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    @Nullable
    private Boolean requiresDiscountCode;

    @Nullable
    private com.commercetools.api.models.cart_discount.StackingMode stackingMode;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    public CartDiscountDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public CartDiscountDraftBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public CartDiscountDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public CartDiscountDraftBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public CartDiscountDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    public CartDiscountDraftBuilder value(
            final com.commercetools.api.models.cart_discount.CartDiscountValueDraft value) {
        this.value = value;
        return this;
    }

    public CartDiscountDraftBuilder cartPredicate(final String cartPredicate) {
        this.cartPredicate = cartPredicate;
        return this;
    }

    public CartDiscountDraftBuilder target(
            @Nullable final com.commercetools.api.models.cart_discount.CartDiscountTarget target) {
        this.target = target;
        return this;
    }

    public CartDiscountDraftBuilder sortOrder(final String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    public CartDiscountDraftBuilder isActive(@Nullable final Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    public CartDiscountDraftBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    public CartDiscountDraftBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    public CartDiscountDraftBuilder requiresDiscountCode(@Nullable final Boolean requiresDiscountCode) {
        this.requiresDiscountCode = requiresDiscountCode;
        return this;
    }

    public CartDiscountDraftBuilder stackingMode(
            @Nullable final com.commercetools.api.models.cart_discount.StackingMode stackingMode) {
        this.stackingMode = stackingMode;
        return this;
    }

    public CartDiscountDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    public CartDiscountDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public com.commercetools.api.models.cart_discount.CartDiscountValueDraft getValue() {
        return this.value;
    }

    public String getCartPredicate() {
        return this.cartPredicate;
    }

    @Nullable
    public com.commercetools.api.models.cart_discount.CartDiscountTarget getTarget() {
        return this.target;
    }

    public String getSortOrder() {
        return this.sortOrder;
    }

    @Nullable
    public Boolean getIsActive() {
        return this.isActive;
    }

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    @Nullable
    public Boolean getRequiresDiscountCode() {
        return this.requiresDiscountCode;
    }

    @Nullable
    public com.commercetools.api.models.cart_discount.StackingMode getStackingMode() {
        return this.stackingMode;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public CartDiscountDraft build() {
        Objects.requireNonNull(name, CartDiscountDraft.class + ": name is missing");
        Objects.requireNonNull(value, CartDiscountDraft.class + ": value is missing");
        Objects.requireNonNull(cartPredicate, CartDiscountDraft.class + ": cartPredicate is missing");
        Objects.requireNonNull(sortOrder, CartDiscountDraft.class + ": sortOrder is missing");
        return new CartDiscountDraftImpl(name, key, description, value, cartPredicate, target, sortOrder, isActive,
            validFrom, validUntil, requiresDiscountCode, stackingMode, custom);
    }

    /**
     * builds CartDiscountDraft without checking for non null required values
     */
    public CartDiscountDraft buildUnchecked() {
        return new CartDiscountDraftImpl(name, key, description, value, cartPredicate, target, sortOrder, isActive,
            validFrom, validUntil, requiresDiscountCode, stackingMode, custom);
    }

    public static CartDiscountDraftBuilder of() {
        return new CartDiscountDraftBuilder();
    }

    public static CartDiscountDraftBuilder of(final CartDiscountDraft template) {
        CartDiscountDraftBuilder builder = new CartDiscountDraftBuilder();
        builder.name = template.getName();
        builder.key = template.getKey();
        builder.description = template.getDescription();
        builder.value = template.getValue();
        builder.cartPredicate = template.getCartPredicate();
        builder.target = template.getTarget();
        builder.sortOrder = template.getSortOrder();
        builder.isActive = template.getIsActive();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        builder.requiresDiscountCode = template.getRequiresDiscountCode();
        builder.stackingMode = template.getStackingMode();
        builder.custom = template.getCustom();
        return builder;
    }

}
