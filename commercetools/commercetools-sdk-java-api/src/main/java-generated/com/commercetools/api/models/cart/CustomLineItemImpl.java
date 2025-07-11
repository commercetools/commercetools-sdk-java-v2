
package com.commercetools.api.models.cart;

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

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.TypedMoney money;

    private com.commercetools.api.models.cart.TaxedItemPrice taxedPrice;

    private java.util.List<com.commercetools.api.models.cart.MethodTaxedPrice> taxedPricePortions;

    private com.commercetools.api.models.common.CentPrecisionMoney totalPrice;

    private String slug;

    private Long quantity;

    private java.util.List<com.commercetools.api.models.order.ItemState> state;

    private com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory;

    private com.commercetools.api.models.tax_category.TaxRate taxRate;

    private java.util.List<com.commercetools.api.models.cart.MethodTaxRate> perMethodTaxRate;

    private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;

    private com.commercetools.api.models.type.CustomFields custom;

    private com.commercetools.api.models.cart.ItemShippingDetails shippingDetails;

    private com.commercetools.api.models.cart.CustomLineItemPriceMode priceMode;

    private com.commercetools.api.models.recurring_order.CustomLineItemRecurrenceInfo recurrenceInfo;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomLineItemImpl(@JsonProperty("id") final String id, @JsonProperty("key") final String key,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("money") final com.commercetools.api.models.common.TypedMoney money,
            @JsonProperty("taxedPrice") final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice,
            @JsonProperty("taxedPricePortions") final java.util.List<com.commercetools.api.models.cart.MethodTaxedPrice> taxedPricePortions,
            @JsonProperty("totalPrice") final com.commercetools.api.models.common.CentPrecisionMoney totalPrice,
            @JsonProperty("slug") final String slug, @JsonProperty("quantity") final Long quantity,
            @JsonProperty("state") final java.util.List<com.commercetools.api.models.order.ItemState> state,
            @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory,
            @JsonProperty("taxRate") final com.commercetools.api.models.tax_category.TaxRate taxRate,
            @JsonProperty("perMethodTaxRate") final java.util.List<com.commercetools.api.models.cart.MethodTaxRate> perMethodTaxRate,
            @JsonProperty("discountedPricePerQuantity") final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom,
            @JsonProperty("shippingDetails") final com.commercetools.api.models.cart.ItemShippingDetails shippingDetails,
            @JsonProperty("priceMode") final com.commercetools.api.models.cart.CustomLineItemPriceMode priceMode,
            @JsonProperty("recurrenceInfo") final com.commercetools.api.models.recurring_order.CustomLineItemRecurrenceInfo recurrenceInfo) {
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

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Money value of the Custom Line Item.</p>
     */

    public com.commercetools.api.models.common.TypedMoney getMoney() {
        return this.money;
    }

    /**
     *  <p>Automatically set after the <code>taxRate</code> is set.</p>
     */

    public com.commercetools.api.models.cart.TaxedItemPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
     *  <p>Total taxed prices based on the quantity of the Custom Line Item assigned to each Shipping Method. Only applicable for Carts with <code>Multiple</code> ShippingMode. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     */

    public java.util.List<com.commercetools.api.models.cart.MethodTaxedPrice> getTaxedPricePortions() {
        return this.taxedPricePortions;
    }

    /**
     *  <p>Total price of the Custom Line Item (<code>money</code> multiplied by <code>quantity</code>). If the Custom Line Item is discounted, the total price is <code>discountedPricePerQuantity</code> multiplied by <code>quantity</code>.</p>
     *  <p>Includes taxes if the TaxRate <code>includedInPrice</code> is <code>true</code>.</p>
     */

    public com.commercetools.api.models.common.CentPrecisionMoney getTotalPrice() {
        return this.totalPrice;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Custom Line Item. It matches the pattern <code>[a-zA-Z0-9_-]{2,256}</code>.</p>
     */

    public String getSlug() {
        return this.slug;
    }

    /**
     *  <p>Number of Custom Line Items in the Cart or Order.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>Tracks specific quantities of the Custom Line Item within a given State. When a Custom Line Item is added to a Cart, its full quantity is set to the built-in "Initial" state. State transitions for Custom Line Items are managed on the Order.</p>
     */

    public java.util.List<com.commercetools.api.models.order.ItemState> getState() {
        return this.state;
    }

    /**
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> TaxMode.</p>
     */

    public com.commercetools.api.models.tax_category.TaxCategoryReference getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> TaxMode, the <code>taxRate</code> of Custom Line Items is set automatically once a shipping address is set. The rate is based on the TaxCategory that applies for the shipping address.</li>
     *   <li>For a Cart with <code>External</code> TaxMode, the <code>taxRate</code> of Custom Line Items can be set using ExternalTaxRateDraft.</li>
     *  </ul>
     */

    public com.commercetools.api.models.tax_category.TaxRate getTaxRate() {
        return this.taxRate;
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> ShippingMode. For a Cart with <code>Platform</code> TaxMode it is automatically set after the Shipping Method is added. For a Cart with <code>External</code> TaxMode, the Tax Rate must be set with ExternalTaxRateDraft.</p>
     */

    public java.util.List<com.commercetools.api.models.cart.MethodTaxRate> getPerMethodTaxRate() {
        return this.perMethodTaxRate;
    }

    /**
     *  <p>Discounted price of a single quantity of the Custom Line Item.</p>
     */

    public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity() {
        return this.discountedPricePerQuantity;
    }

    /**
     *  <p>Custom Fields of the Custom Line Item.</p>
     */

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>Container for Custom Line Item-specific addresses.</p>
     */

    public com.commercetools.api.models.cart.ItemShippingDetails getShippingDetails() {
        return this.shippingDetails;
    }

    /**
     *  <p>Indicates whether Cart Discounts with a matching CartDiscountCustomLineItemsTarget, MultiBuyCustomLineItemsTarget, or CartDiscountPatternTarget are applied to the Custom Line Item.</p>
     */

    public com.commercetools.api.models.cart.CustomLineItemPriceMode getPriceMode() {
        return this.priceMode;
    }

    /**
     *  <p>Recurring Order and frequency data.</p>
     */

    public com.commercetools.api.models.recurring_order.CustomLineItemRecurrenceInfo getRecurrenceInfo() {
        return this.recurrenceInfo;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setMoney(final com.commercetools.api.models.common.TypedMoney money) {
        this.money = money;
    }

    public void setTaxedPrice(final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
    }

    public void setTaxedPricePortions(final com.commercetools.api.models.cart.MethodTaxedPrice... taxedPricePortions) {
        this.taxedPricePortions = new ArrayList<>(Arrays.asList(taxedPricePortions));
    }

    public void setTaxedPricePortions(
            final java.util.List<com.commercetools.api.models.cart.MethodTaxedPrice> taxedPricePortions) {
        this.taxedPricePortions = taxedPricePortions;
    }

    public void setTotalPrice(final com.commercetools.api.models.common.CentPrecisionMoney totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setSlug(final String slug) {
        this.slug = slug;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    public void setState(final com.commercetools.api.models.order.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
    }

    public void setState(final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.state = state;
    }

    public void setTaxCategory(final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory) {
        this.taxCategory = taxCategory;
    }

    public void setTaxRate(final com.commercetools.api.models.tax_category.TaxRate taxRate) {
        this.taxRate = taxRate;
    }

    public void setPerMethodTaxRate(final com.commercetools.api.models.cart.MethodTaxRate... perMethodTaxRate) {
        this.perMethodTaxRate = new ArrayList<>(Arrays.asList(perMethodTaxRate));
    }

    public void setPerMethodTaxRate(
            final java.util.List<com.commercetools.api.models.cart.MethodTaxRate> perMethodTaxRate) {
        this.perMethodTaxRate = perMethodTaxRate;
    }

    public void setDiscountedPricePerQuantity(
            final com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity... discountedPricePerQuantity) {
        this.discountedPricePerQuantity = new ArrayList<>(Arrays.asList(discountedPricePerQuantity));
    }

    public void setDiscountedPricePerQuantity(
            final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
        this.discountedPricePerQuantity = discountedPricePerQuantity;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
    }

    public void setShippingDetails(final com.commercetools.api.models.cart.ItemShippingDetails shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    public void setPriceMode(final com.commercetools.api.models.cart.CustomLineItemPriceMode priceMode) {
        this.priceMode = priceMode;
    }

    public void setRecurrenceInfo(
            final com.commercetools.api.models.recurring_order.CustomLineItemRecurrenceInfo recurrenceInfo) {
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
