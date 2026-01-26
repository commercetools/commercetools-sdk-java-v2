
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

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

    private com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifier discountGroup;

    private com.commercetools.api.models.recurring_order.RecurringOrderScopeDraft recurringOrderScope;

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
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom,
            @JsonProperty("discountGroup") final com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifier discountGroup,
            @JsonProperty("recurringOrderScope") final com.commercetools.api.models.recurring_order.RecurringOrderScopeDraft recurringOrderScope) {
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
        this.discountGroup = discountGroup;
        this.recurringOrderScope = recurringOrderScope;
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
     *  <p>Valid <span>Cart Predicate</span>.</p>
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
     *  <p>Value between <code>0</code> and <code>1</code> that determines the order in which the CartDiscounts will be applied; a CartDiscount with a higher value will be prioritized.</p>
     *  <p>It must be unique among all CartDiscounts and DiscountGroups.</p>
     *  <p>If the CartDiscount is part of a DiscountGroup, it will use the sort order of the DiscountGroup.</p>
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     *  <ul>
     *   <li>If defined, the Cart Discount applies on <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a> having a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> matching any Store defined for this field.</li>
     *   <li>If not defined, the Cart Discount applies on all Carts, irrespective of a Store.</li>
     *  </ul>
     *  <p>If the referenced Stores exceed the <span>limit</span>, a <a href="https://docs.commercetools.com/apis/ctp:api:type:MaxStoreReferencesReachedError" rel="nofollow">MaxStoreReferencesReached</a> error is returned.</p>
     *  <p>If the referenced Stores exceed the <span>limit</span> for Cart Discounts that do not require a Discount Code, a <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCartDiscountsLimitReachedError" rel="nofollow">StoreCartDiscountsLimitReached</a> error is returned.</p>
     */

    public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores() {
        return this.stores;
    }

    /**
     *  <p>Only active Discounts can be applied to the Cart. If the <span>limit</span> for active Cart Discounts is reached, a <a href="https://docs.commercetools.com/apis/ctp:api:type:MaxCartDiscountsReachedError" rel="nofollow">MaxCartDiscountsReached</a> error is returned.</p>
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
     *  <p>States whether the Discount can only be used in a connection with a <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCode</a>.</p>
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

    /**
     *  <p>Reference to a DiscountGroup that the CartDiscount must belong to.</p>
     */

    public com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifier getDiscountGroup() {
        return this.discountGroup;
    }

    /**
     *  <p>Scope of the Cart Discount for Recurring Orders.</p>
     *  <p>If not set, the default is <a href="https://docs.commercetools.com/apis/ctp:api:type:NonRecurringOrdersOnlyDraft" rel="nofollow">NonRecurringOrdersOnlyDraft</a>.</p>
     */

    public com.commercetools.api.models.recurring_order.RecurringOrderScopeDraft getRecurringOrderScope() {
        return this.recurringOrderScope;
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

    public void setDiscountGroup(
            final com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifier discountGroup) {
        this.discountGroup = discountGroup;
    }

    public void setRecurringOrderScope(
            final com.commercetools.api.models.recurring_order.RecurringOrderScopeDraft recurringOrderScope) {
        this.recurringOrderScope = recurringOrderScope;
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
                .append(discountGroup, that.discountGroup)
                .append(recurringOrderScope, that.recurringOrderScope)
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
                .append(discountGroup, that.discountGroup)
                .append(recurringOrderScope, that.recurringOrderScope)
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
                .append(discountGroup)
                .append(recurringOrderScope)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("key", key)
                .append("description", description)
                .append("value", value)
                .append("cartPredicate", cartPredicate)
                .append("target", target)
                .append("sortOrder", sortOrder)
                .append("stores", stores)
                .append("isActive", isActive)
                .append("validFrom", validFrom)
                .append("validUntil", validUntil)
                .append("requiresDiscountCode", requiresDiscountCode)
                .append("stackingMode", stackingMode)
                .append("custom", custom)
                .append("discountGroup", discountGroup)
                .append("recurringOrderScope", recurringOrderScope)
                .build();
    }

    @Override
    public CartDiscountDraft copyDeep() {
        return CartDiscountDraft.deepCopy(this);
    }
}
