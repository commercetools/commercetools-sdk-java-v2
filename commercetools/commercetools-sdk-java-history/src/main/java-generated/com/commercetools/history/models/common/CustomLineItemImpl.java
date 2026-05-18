
package com.commercetools.history.models.common;

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
 *  <p>A generic item that can be added to the Cart but is not bound to a Product that can be used for discounts (negative money), vouchers, complex cart rules, additional services, or fees. You control the lifecycle of this item.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomLineItemImpl implements CustomLineItem, ModelBase {

    private String id;

    private String key;

    private com.commercetools.history.models.common.LocalizedString name;

    private com.commercetools.history.models.common.TypedMoney money;

    private com.commercetools.history.models.common.TaxedItemPrice taxedPrice;

    private java.util.List<com.commercetools.history.models.common.MethodTaxedPrice> taxedPricePortions;

    private com.commercetools.history.models.common.CentPrecisionMoney totalPrice;

    private String slug;

    private Long quantity;

    private java.util.List<com.commercetools.history.models.common.ItemState> state;

    private com.commercetools.history.models.common.TaxCategoryReference taxCategory;

    private com.commercetools.history.models.common.TaxRate taxRate;

    private java.util.List<com.commercetools.history.models.common.MethodTaxRate> perMethodTaxRate;

    private java.util.List<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;

    private com.commercetools.history.models.common.CustomFields custom;

    private com.commercetools.history.models.common.ItemShippingDetails shippingDetails;

    private com.commercetools.history.models.common.CustomLineItemPriceMode priceMode;

    private com.commercetools.history.models.common.CustomLineItemRecurrenceInfo recurrenceInfo;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomLineItemImpl(@JsonProperty("id") final String id, @JsonProperty("key") final String key,
            @JsonProperty("name") final com.commercetools.history.models.common.LocalizedString name,
            @JsonProperty("money") final com.commercetools.history.models.common.TypedMoney money,
            @JsonProperty("taxedPrice") final com.commercetools.history.models.common.TaxedItemPrice taxedPrice,
            @JsonProperty("taxedPricePortions") final java.util.List<com.commercetools.history.models.common.MethodTaxedPrice> taxedPricePortions,
            @JsonProperty("totalPrice") final com.commercetools.history.models.common.CentPrecisionMoney totalPrice,
            @JsonProperty("slug") final String slug, @JsonProperty("quantity") final Long quantity,
            @JsonProperty("state") final java.util.List<com.commercetools.history.models.common.ItemState> state,
            @JsonProperty("taxCategory") final com.commercetools.history.models.common.TaxCategoryReference taxCategory,
            @JsonProperty("taxRate") final com.commercetools.history.models.common.TaxRate taxRate,
            @JsonProperty("perMethodTaxRate") final java.util.List<com.commercetools.history.models.common.MethodTaxRate> perMethodTaxRate,
            @JsonProperty("discountedPricePerQuantity") final java.util.List<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity,
            @JsonProperty("custom") final com.commercetools.history.models.common.CustomFields custom,
            @JsonProperty("shippingDetails") final com.commercetools.history.models.common.ItemShippingDetails shippingDetails,
            @JsonProperty("priceMode") final com.commercetools.history.models.common.CustomLineItemPriceMode priceMode,
            @JsonProperty("recurrenceInfo") final com.commercetools.history.models.common.CustomLineItemRecurrenceInfo recurrenceInfo) {
        this.id = id;
        this.key = key;
        this.name = name;
        this.money = money;
        this.taxedPrice = taxedPrice;
        this.taxedPricePortions = taxedPricePortions;
        this.totalPrice = totalPrice;
        this.slug = slug;
        this.quantity = quantity;
        this.state = state;
        this.taxCategory = taxCategory;
        this.taxRate = taxRate;
        this.perMethodTaxRate = perMethodTaxRate;
        this.discountedPricePerQuantity = discountedPricePerQuantity;
        this.custom = custom;
        this.shippingDetails = shippingDetails;
        this.priceMode = priceMode;
        this.recurrenceInfo = recurrenceInfo;
    }

    /**
     * create empty instance
     */
    public CustomLineItemImpl() {
    }

    /**
     *  <p>Unique identifier of the Custom Line Item.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the Custom Line Item.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Name of the Custom Line Item.</p>
     */

    public com.commercetools.history.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Money value of the Custom Line Item.</p>
     */

    public com.commercetools.history.models.common.TypedMoney getMoney() {
        return this.money;
    }

    /**
     *  <p>Automatically set after the <code>taxRate</code> is set.</p>
     */

    public com.commercetools.history.models.common.TaxedItemPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
     *  <p>Total taxed prices based on the quantity of the Custom Line Item assigned to each <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">Shipping Method</a>. Only applicable for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     */

    public java.util.List<com.commercetools.history.models.common.MethodTaxedPrice> getTaxedPricePortions() {
        return this.taxedPricePortions;
    }

    /**
     *  <p>Total price of the Custom Line Item (<code>money</code> multiplied by <code>quantity</code>). If the Custom Line Item is discounted, the total price is <code>discountedPricePerQuantity</code> multiplied by <code>quantity</code>.</p>
     *  <p>Includes taxes if the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRate</a> <code>includedInPrice</code> is <code>true</code>.</p>
     */

    public com.commercetools.history.models.common.CentPrecisionMoney getTotalPrice() {
        return this.totalPrice;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Custom Line Item. It matches the pattern <code>[a-zA-Z0-9_-]{2,256}</code>.</p>
     */

    public String getSlug() {
        return this.slug;
    }

    /**
     *  <p>Number of Custom Line Items in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>Tracks specific quantities of the Custom Line Item within a given State. When a Custom Line Item is added to a Cart, its full quantity is set to the built-in "Initial" state. State transitions for Custom Line Items are managed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     */

    public java.util.List<com.commercetools.history.models.common.ItemState> getState() {
        return this.state;
    }

    /**
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     */

    public com.commercetools.history.models.common.TaxCategoryReference getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the <code>taxRate</code> of Custom Line Items is set automatically once a shipping address is set. The rate is based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a> that applies for the shipping address.</li>
     *   <li>For a Cart with <code>External</code> TaxMode, the <code>taxRate</code> of Custom Line Items can be set using <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</li>
     *  </ul>
     */

    public com.commercetools.history.models.common.TaxRate getTaxRate() {
        return this.taxRate;
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a> it is automatically set after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>. For a Cart with <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the Tax Rate must be set with <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</p>
     */

    public java.util.List<com.commercetools.history.models.common.MethodTaxRate> getPerMethodTaxRate() {
        return this.perMethodTaxRate;
    }

    /**
     *  <p>Discounted price of a single quantity of the Custom Line Item.</p>
     */

    public java.util.List<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity() {
        return this.discountedPricePerQuantity;
    }

    /**
     *  <p>Custom Fields of the Custom Line Item.</p>
     */

    public com.commercetools.history.models.common.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>Container for Custom Line Item-specific addresses.</p>
     */

    public com.commercetools.history.models.common.ItemShippingDetails getShippingDetails() {
        return this.shippingDetails;
    }

    /**
     *  <p>Indicates whether Cart Discounts with a matching <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountCustomLineItemsTarget" rel="nofollow">CartDiscountCustomLineItemsTarget</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:MultiBuyCustomLineItemsTarget" rel="nofollow">MultiBuyCustomLineItemsTarget</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a> are applied to the Custom Line Item.</p>
     */

    public com.commercetools.history.models.common.CustomLineItemPriceMode getPriceMode() {
        return this.priceMode;
    }

    /**
     *  <p>Recurring Order and frequency data.</p>
     */

    public com.commercetools.history.models.common.CustomLineItemRecurrenceInfo getRecurrenceInfo() {
        return this.recurrenceInfo;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setName(final com.commercetools.history.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setMoney(final com.commercetools.history.models.common.TypedMoney money) {
        this.money = money;
    }

    public void setTaxedPrice(final com.commercetools.history.models.common.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
    }

    public void setTaxedPricePortions(
            final com.commercetools.history.models.common.MethodTaxedPrice... taxedPricePortions) {
        this.taxedPricePortions = new ArrayList<>(Arrays.asList(taxedPricePortions));
    }

    public void setTaxedPricePortions(
            final java.util.List<com.commercetools.history.models.common.MethodTaxedPrice> taxedPricePortions) {
        this.taxedPricePortions = taxedPricePortions;
    }

    public void setTotalPrice(final com.commercetools.history.models.common.CentPrecisionMoney totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setSlug(final String slug) {
        this.slug = slug;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    public void setState(final com.commercetools.history.models.common.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
    }

    public void setState(final java.util.List<com.commercetools.history.models.common.ItemState> state) {
        this.state = state;
    }

    public void setTaxCategory(final com.commercetools.history.models.common.TaxCategoryReference taxCategory) {
        this.taxCategory = taxCategory;
    }

    public void setTaxRate(final com.commercetools.history.models.common.TaxRate taxRate) {
        this.taxRate = taxRate;
    }

    public void setPerMethodTaxRate(final com.commercetools.history.models.common.MethodTaxRate... perMethodTaxRate) {
        this.perMethodTaxRate = new ArrayList<>(Arrays.asList(perMethodTaxRate));
    }

    public void setPerMethodTaxRate(
            final java.util.List<com.commercetools.history.models.common.MethodTaxRate> perMethodTaxRate) {
        this.perMethodTaxRate = perMethodTaxRate;
    }

    public void setDiscountedPricePerQuantity(
            final com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity... discountedPricePerQuantity) {
        this.discountedPricePerQuantity = new ArrayList<>(Arrays.asList(discountedPricePerQuantity));
    }

    public void setDiscountedPricePerQuantity(
            final java.util.List<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
        this.discountedPricePerQuantity = discountedPricePerQuantity;
    }

    public void setCustom(final com.commercetools.history.models.common.CustomFields custom) {
        this.custom = custom;
    }

    public void setShippingDetails(final com.commercetools.history.models.common.ItemShippingDetails shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    public void setPriceMode(final com.commercetools.history.models.common.CustomLineItemPriceMode priceMode) {
        this.priceMode = priceMode;
    }

    public void setRecurrenceInfo(
            final com.commercetools.history.models.common.CustomLineItemRecurrenceInfo recurrenceInfo) {
        this.recurrenceInfo = recurrenceInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomLineItemImpl that = (CustomLineItemImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(key, that.key)
                .append(name, that.name)
                .append(money, that.money)
                .append(taxedPrice, that.taxedPrice)
                .append(taxedPricePortions, that.taxedPricePortions)
                .append(totalPrice, that.totalPrice)
                .append(slug, that.slug)
                .append(quantity, that.quantity)
                .append(state, that.state)
                .append(taxCategory, that.taxCategory)
                .append(taxRate, that.taxRate)
                .append(perMethodTaxRate, that.perMethodTaxRate)
                .append(discountedPricePerQuantity, that.discountedPricePerQuantity)
                .append(custom, that.custom)
                .append(shippingDetails, that.shippingDetails)
                .append(priceMode, that.priceMode)
                .append(recurrenceInfo, that.recurrenceInfo)
                .append(id, that.id)
                .append(key, that.key)
                .append(name, that.name)
                .append(money, that.money)
                .append(taxedPrice, that.taxedPrice)
                .append(taxedPricePortions, that.taxedPricePortions)
                .append(totalPrice, that.totalPrice)
                .append(slug, that.slug)
                .append(quantity, that.quantity)
                .append(state, that.state)
                .append(taxCategory, that.taxCategory)
                .append(taxRate, that.taxRate)
                .append(perMethodTaxRate, that.perMethodTaxRate)
                .append(discountedPricePerQuantity, that.discountedPricePerQuantity)
                .append(custom, that.custom)
                .append(shippingDetails, that.shippingDetails)
                .append(priceMode, that.priceMode)
                .append(recurrenceInfo, that.recurrenceInfo)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(key)
                .append(name)
                .append(money)
                .append(taxedPrice)
                .append(taxedPricePortions)
                .append(totalPrice)
                .append(slug)
                .append(quantity)
                .append(state)
                .append(taxCategory)
                .append(taxRate)
                .append(perMethodTaxRate)
                .append(discountedPricePerQuantity)
                .append(custom)
                .append(shippingDetails)
                .append(priceMode)
                .append(recurrenceInfo)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("key", key)
                .append("name", name)
                .append("money", money)
                .append("taxedPrice", taxedPrice)
                .append("taxedPricePortions", taxedPricePortions)
                .append("totalPrice", totalPrice)
                .append("slug", slug)
                .append("quantity", quantity)
                .append("state", state)
                .append("taxCategory", taxCategory)
                .append("taxRate", taxRate)
                .append("perMethodTaxRate", perMethodTaxRate)
                .append("discountedPricePerQuantity", discountedPricePerQuantity)
                .append("custom", custom)
                .append("shippingDetails", shippingDetails)
                .append("priceMode", priceMode)
                .append("recurrenceInfo", recurrenceInfo)
                .build();
    }

    @Override
    public CustomLineItem copyDeep() {
        return CustomLineItem.deepCopy(this);
    }
}
