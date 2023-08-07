
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * CartDiscountDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountDraftImpl implements CartDiscountDraft, ModelBase {

    private com.commercetools.api.models.common.LocalizedString name;

    private String key;

    private com.commercetools.api.models.common.LocalizedString description;

    private com.commercetools.api.models.cart_discount.CartDiscountValueDraft value;

    private String cartPredicate;

    private com.commercetools.api.models.cart_discount.CartDiscountTarget target;

    private String sortOrder;

    private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;

    private Boolean isActive;

    private java.time.ZonedDateTime validFrom;

    private java.time.ZonedDateTime validUntil;

    private Boolean requiresDiscountCode;

    private com.commercetools.api.models.cart_discount.StackingMode stackingMode;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartDiscountDraftImpl(@JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("key") final String key,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("value") final com.commercetools.api.models.cart_discount.CartDiscountValueDraft value,
            @JsonProperty("cartPredicate") final String cartPredicate,
            @JsonProperty("target") final com.commercetools.api.models.cart_discount.CartDiscountTarget target,
            @JsonProperty("sortOrder") final String sortOrder,
            @JsonProperty("stores") final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores,
            @JsonProperty("isActive") final Boolean isActive,
            @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom,
            @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil,
            @JsonProperty("requiresDiscountCode") final Boolean requiresDiscountCode,
            @JsonProperty("stackingMode") final com.commercetools.api.models.cart_discount.StackingMode stackingMode,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.name = name;
        this.key = key;
        this.description = description;
        this.value = value;
        this.cartPredicate = cartPredicate;
        this.target = target;
        this.sortOrder = sortOrder;
        this.stores = stores;
        this.isActive = isActive;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.requiresDiscountCode = requiresDiscountCode;
        this.stackingMode = stackingMode;
        this.custom = custom;
    }

    /**
     * create empty instance
     */
    public CartDiscountDraftImpl() {
    }

    /**
     *  <p>Name of the CartDiscount.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>User-defined unique identifier for the CartDiscount.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Description of the CartDiscount.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Effect of the CartDiscount on the <code>target</code>.</p>
     */

    public com.commercetools.api.models.cart_discount.CartDiscountValueDraft getValue() {
        return this.value;
    }

    /**
     *  <p>Valid Cart Predicate.</p>
     */

    public String getCartPredicate() {
        return this.cartPredicate;
    }

    /**
     *  <p>Segment of the Cart that will be discounted.</p>
     *  <p>Must not be set if the <code>value</code> is <code>giftLineItem</code>.</p>
     */

    public com.commercetools.api.models.cart_discount.CartDiscountTarget getTarget() {
        return this.target;
    }

    /**
     *  <p>Value between <code>0</code> and <code>1</code>. A Discount with a higher sortOrder is prioritized. The sort order must be unambiguous among all CartDiscounts.</p>
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     *  <ul>
     *   <li>If defined, the Cart Discount applies on Carts having a Store matching any Store defined for this field.</li>
     *   <li>If not defined, the Cart Discount applies on all Carts, irrespective of a Store.</li>
     *  </ul>
     *  <p>If the referenced Stores exceed the limit, a MaxStoreReferencesReached error is returned.</p>
     *  <p>If the referenced Stores exceed the limit for Cart Discounts that do not require a Discount Code, a StoreCartDiscountsLimitReached error is returned.</p>
     */

    public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores() {
        return this.stores;
    }

    /**
     *  <p>Only active Discounts can be applied to the Cart. If the limit for active Cart Discounts is reached, a MaxCartDiscountsReached error is returned.</p>
     */

    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     *  <p>Date and time (UTC) from which the Discount is effective.</p>
     */

    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Date and time (UTC) until which the Discount is effective.</p>
     */

    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     *  <p>States whether the Discount can only be used in a connection with a DiscountCode.</p>
     */

    public Boolean getRequiresDiscountCode() {
        return this.requiresDiscountCode;
    }

    /**
     *  <p>Specifies whether the application of this discount causes the following discounts to be ignored.</p>
     */

    public com.commercetools.api.models.cart_discount.StackingMode getStackingMode() {
        return this.stackingMode;
    }

    /**
     *  <p>Custom Fields of the CartDiscount.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
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

    public void setStores(final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
    }

    public void setStores(final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.stores = stores;
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

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
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
                .append(stores, that.stores)
                .append(isActive, that.isActive)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .append(requiresDiscountCode, that.requiresDiscountCode)
                .append(stackingMode, that.stackingMode)
                .append(custom, that.custom)
                .append(name, that.name)
                .append(key, that.key)
                .append(description, that.description)
                .append(value, that.value)
                .append(cartPredicate, that.cartPredicate)
                .append(target, that.target)
                .append(sortOrder, that.sortOrder)
                .append(stores, that.stores)
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
                .append(stores)
                .append(isActive)
                .append(validFrom)
                .append(validUntil)
                .append(requiresDiscountCode)
                .append(stackingMode)
                .append(custom)
                .toHashCode();
    }

}
