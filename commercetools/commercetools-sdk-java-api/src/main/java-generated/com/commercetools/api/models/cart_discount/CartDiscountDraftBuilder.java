
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountDraft cartDiscountDraft = CartDiscountDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .value(valueBuilder -> valueBuilder)
 *             .cartPredicate("{cartPredicate}")
 *             .sortOrder("{sortOrder}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountDraftBuilder implements Builder<CartDiscountDraft> {

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
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p>Name of the CartDiscount.</p>
     * @return Builder
     */

    public CartDiscountDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the CartDiscount.</p>
     * @param name
     * @return Builder
     */

    public CartDiscountDraftBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the CartDiscount.</p>
     * @param key
     * @return Builder
     */

    public CartDiscountDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Description of the CartDiscount.</p>
     * @return Builder
     */

    public CartDiscountDraftBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the CartDiscount.</p>
     * @param description
     * @return Builder
     */

    public CartDiscountDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Effect of the CartDiscount. For a target, relative or absolute Discount values or a fixed item Price value can be specified. If no target is specified, a Gift Line Item can be added to the Cart.</p>
     * @param value
     * @return Builder
     */

    public CartDiscountDraftBuilder value(
            final com.commercetools.api.models.cart_discount.CartDiscountValueDraft value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Effect of the CartDiscount. For a target, relative or absolute Discount values or a fixed item Price value can be specified. If no target is specified, a Gift Line Item can be added to the Cart.</p>
     * @return Builder
     */

    public CartDiscountDraftBuilder value(
            Function<com.commercetools.api.models.cart_discount.CartDiscountValueDraftBuilder, Builder<? extends com.commercetools.api.models.cart_discount.CartDiscountValueDraft>> builder) {
        this.value = builder.apply(com.commercetools.api.models.cart_discount.CartDiscountValueDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Valid Cart Predicate.</p>
     * @param cartPredicate
     * @return Builder
     */

    public CartDiscountDraftBuilder cartPredicate(final String cartPredicate) {
        this.cartPredicate = cartPredicate;
        return this;
    }

    /**
     *  <p>Must not be set when the <code>value</code> has type <code>giftLineItem</code>, otherwise a CartDiscountTarget must be set.</p>
     * @param target
     * @return Builder
     */

    public CartDiscountDraftBuilder target(
            @Nullable final com.commercetools.api.models.cart_discount.CartDiscountTarget target) {
        this.target = target;
        return this;
    }

    /**
     *  <p>Must not be set when the <code>value</code> has type <code>giftLineItem</code>, otherwise a CartDiscountTarget must be set.</p>
     * @return Builder
     */

    public CartDiscountDraftBuilder target(
            Function<com.commercetools.api.models.cart_discount.CartDiscountTargetBuilder, Builder<? extends com.commercetools.api.models.cart_discount.CartDiscountTarget>> builder) {
        this.target = builder.apply(com.commercetools.api.models.cart_discount.CartDiscountTargetBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value between <code>0</code> and <code>1</code>. A Discount with a higher sortOrder is prioritized. The sort order must be unambiguous among all CartDiscounts.</p>
     * @param sortOrder
     * @return Builder
     */

    public CartDiscountDraftBuilder sortOrder(final String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     *  <p>Only active Discounts can be applied to the Cart.</p>
     * @param isActive
     * @return Builder
     */

    public CartDiscountDraftBuilder isActive(@Nullable final Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     *  <p>Date and time (UTC) from which the Discount is effective.</p>
     * @param validFrom
     * @return Builder
     */

    public CartDiscountDraftBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Date and time (UTC) until which the Discount is effective.</p>
     * @param validUntil
     * @return Builder
     */

    public CartDiscountDraftBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>States whether the Discount can only be used in a connection with a DiscountCode.</p>
     * @param requiresDiscountCode
     * @return Builder
     */

    public CartDiscountDraftBuilder requiresDiscountCode(@Nullable final Boolean requiresDiscountCode) {
        this.requiresDiscountCode = requiresDiscountCode;
        return this;
    }

    /**
     *  <p>Specifies whether the application of this discount causes the following discounts to be ignored.</p>
     * @param stackingMode
     * @return Builder
     */

    public CartDiscountDraftBuilder stackingMode(
            @Nullable final com.commercetools.api.models.cart_discount.StackingMode stackingMode) {
        this.stackingMode = stackingMode;
        return this;
    }

    /**
     *  <p>Custom Fields of the CartDiscount.</p>
     * @return Builder
     */

    public CartDiscountDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the CartDiscount.</p>
     * @param custom
     * @return Builder
     */

    public CartDiscountDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
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
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
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
