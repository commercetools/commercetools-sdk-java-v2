
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountDraftImpl implements CartDiscountDraft {

    private com.commercetools.api.models.common.LocalizedString name;

    private String key;

    private com.commercetools.api.models.common.LocalizedString description;

    private com.commercetools.api.models.cart_discount.CartDiscountValueDraft value;

    private String cartPredicate;

    private com.commercetools.api.models.cart_discount.CartDiscountTarget target;

    private String sortOrder;

    private Boolean isActive;

    private java.time.ZonedDateTime validFrom;

    private java.time.ZonedDateTime validUntil;

    private Boolean requiresDiscountCode;

    private com.commercetools.api.models.cart_discount.StackingMode stackingMode;

    private com.commercetools.api.models.type.CustomFields custom;

    @JsonCreator
    CartDiscountDraftImpl(@JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("key") final String key,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("value") final com.commercetools.api.models.cart_discount.CartDiscountValueDraft value,
            @JsonProperty("cartPredicate") final String cartPredicate,
            @JsonProperty("target") final com.commercetools.api.models.cart_discount.CartDiscountTarget target,
            @JsonProperty("sortOrder") final String sortOrder, @JsonProperty("isActive") final Boolean isActive,
            @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom,
            @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil,
            @JsonProperty("requiresDiscountCode") final Boolean requiresDiscountCode,
            @JsonProperty("stackingMode") final com.commercetools.api.models.cart_discount.StackingMode stackingMode,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom) {
        this.name = name;
        this.key = key;
        this.description = description;
        this.value = value;
        this.cartPredicate = cartPredicate;
        this.target = target;
        this.sortOrder = sortOrder;
        this.isActive = isActive;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.requiresDiscountCode = requiresDiscountCode;
        this.stackingMode = stackingMode;
        this.custom = custom;
    }

    public CartDiscountDraftImpl() {
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
    *  <p>User-specific unique identifier for a cart discount.
    *  Must be unique across a project.
    *  The field can be reset using the Set Key UpdateAction.</p>
    */
    public String getKey() {
        return this.key;
    }

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public com.commercetools.api.models.cart_discount.CartDiscountValueDraft getValue() {
        return this.value;
    }

    /**
    *  <p>A valid Cart predicate.</p>
    */
    public String getCartPredicate() {
        return this.cartPredicate;
    }

    /**
    *  <p>Must not be set when the <code>value</code> has type <code>giftLineItem</code>, otherwise a CartDiscountTarget must be set.</p>
    */
    public com.commercetools.api.models.cart_discount.CartDiscountTarget getTarget() {
        return this.target;
    }

    /**
    *  <p>The string must contain a number between 0 and 1.
    *  A discount with greater sort order is prioritized higher than a discount with lower sort order.
    *  The sort order must be unambiguous among all cart discounts.</p>
    */
    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
    *  <p>Only active discount can be applied to the cart.
    *  Defaults to <code>true</code>.</p>
    */
    public Boolean getIsActive() {
        return this.isActive;
    }

    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
    *  <p>States whether the discount can only be used in a connection with a DiscountCode.
    *  Defaults to <code>false</code>.</p>
    */
    public Boolean getRequiresDiscountCode() {
        return this.requiresDiscountCode;
    }

    /**
    *  <p>Specifies whether the application of this discount causes the following discounts to be ignored.
    *  Defaults to Stacking.</p>
    */
    public com.commercetools.api.models.cart_discount.StackingMode getStackingMode() {
        return this.stackingMode;
    }

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setValue(final com.commercetools.api.models.cart_discount.CartDiscountValueDraft value) {
        this.value = value;
    }

    public void setCartPredicate(final String cartPredicate) {
        this.cartPredicate = cartPredicate;
    }

    public void setTarget(final com.commercetools.api.models.cart_discount.CartDiscountTarget target) {
        this.target = target;
    }

    public void setSortOrder(final String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public void setIsActive(final Boolean isActive) {
        this.isActive = isActive;
    }

    public void setValidFrom(final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
    }

    public void setValidUntil(final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
    }

    public void setRequiresDiscountCode(final Boolean requiresDiscountCode) {
        this.requiresDiscountCode = requiresDiscountCode;
    }

    public void setStackingMode(final com.commercetools.api.models.cart_discount.StackingMode stackingMode) {
        this.stackingMode = stackingMode;
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

        CartDiscountDraftImpl that = (CartDiscountDraftImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(key, that.key)
                .append(description, that.description)
                .append(value, that.value)
                .append(cartPredicate, that.cartPredicate)
                .append(target, that.target)
                .append(sortOrder, that.sortOrder)
                .append(isActive, that.isActive)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .append(requiresDiscountCode, that.requiresDiscountCode)
                .append(stackingMode, that.stackingMode)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name)
                .append(key)
                .append(description)
                .append(value)
                .append(cartPredicate)
                .append(target)
                .append(sortOrder)
                .append(isActive)
                .append(validFrom)
                .append(validUntil)
                .append(requiresDiscountCode)
                .append(stackingMode)
                .append(custom)
                .toHashCode();
    }

}
