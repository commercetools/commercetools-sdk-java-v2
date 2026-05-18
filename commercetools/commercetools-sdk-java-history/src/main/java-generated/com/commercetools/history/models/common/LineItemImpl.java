
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
 *  <p>The representation of a <span>Line Item</span> in a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or in an <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LineItemImpl implements LineItem, ModelBase {

    private String id;

    private String key;

    private String productId;

    private String productKey;

    private com.commercetools.history.models.common.LocalizedString name;

    private com.commercetools.history.models.common.LocalizedString productSlug;

    private com.commercetools.history.models.common.ProductTypeReference productType;

    private com.commercetools.history.models.common.ProductVariant variant;

    private com.commercetools.history.models.common.Price price;

    private Long quantity;

    private com.commercetools.history.models.common.CentPrecisionMoney totalPrice;

    private java.util.List<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;

    private com.commercetools.history.models.common.TaxedItemPrice taxedPrice;

    private java.util.List<com.commercetools.history.models.common.MethodTaxedPrice> taxedPricePortions;

    private java.util.List<com.commercetools.history.models.common.ItemState> state;

    private com.commercetools.history.models.common.TaxRate taxRate;

    private java.util.List<com.commercetools.history.models.common.MethodTaxRate> perMethodTaxRate;

    private com.commercetools.history.models.common.ChannelReference supplyChannel;

    private com.commercetools.history.models.common.ChannelReference distributionChannel;

    private com.commercetools.history.models.common.LineItemPriceMode priceMode;

    private com.commercetools.history.models.common.LineItemMode lineItemMode;

    private com.commercetools.history.models.common.InventoryMode inventoryMode;

    private com.commercetools.history.models.common.ItemShippingDetails shippingDetails;

    private com.commercetools.history.models.common.CustomFields custom;

    private java.time.ZonedDateTime addedAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private com.commercetools.history.models.common.LineItemRecurrenceInfo recurrenceInfo;

    /**
     * create instance with all properties
     */
    @JsonCreator
    LineItemImpl(@JsonProperty("id") final String id, @JsonProperty("key") final String key,
            @JsonProperty("productId") final String productId, @JsonProperty("productKey") final String productKey,
            @JsonProperty("name") final com.commercetools.history.models.common.LocalizedString name,
            @JsonProperty("productSlug") final com.commercetools.history.models.common.LocalizedString productSlug,
            @JsonProperty("productType") final com.commercetools.history.models.common.ProductTypeReference productType,
            @JsonProperty("variant") final com.commercetools.history.models.common.ProductVariant variant,
            @JsonProperty("price") final com.commercetools.history.models.common.Price price,
            @JsonProperty("quantity") final Long quantity,
            @JsonProperty("totalPrice") final com.commercetools.history.models.common.CentPrecisionMoney totalPrice,
            @JsonProperty("discountedPricePerQuantity") final java.util.List<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity,
            @JsonProperty("taxedPrice") final com.commercetools.history.models.common.TaxedItemPrice taxedPrice,
            @JsonProperty("taxedPricePortions") final java.util.List<com.commercetools.history.models.common.MethodTaxedPrice> taxedPricePortions,
            @JsonProperty("state") final java.util.List<com.commercetools.history.models.common.ItemState> state,
            @JsonProperty("taxRate") final com.commercetools.history.models.common.TaxRate taxRate,
            @JsonProperty("perMethodTaxRate") final java.util.List<com.commercetools.history.models.common.MethodTaxRate> perMethodTaxRate,
            @JsonProperty("supplyChannel") final com.commercetools.history.models.common.ChannelReference supplyChannel,
            @JsonProperty("distributionChannel") final com.commercetools.history.models.common.ChannelReference distributionChannel,
            @JsonProperty("priceMode") final com.commercetools.history.models.common.LineItemPriceMode priceMode,
            @JsonProperty("lineItemMode") final com.commercetools.history.models.common.LineItemMode lineItemMode,
            @JsonProperty("inventoryMode") final com.commercetools.history.models.common.InventoryMode inventoryMode,
            @JsonProperty("shippingDetails") final com.commercetools.history.models.common.ItemShippingDetails shippingDetails,
            @JsonProperty("custom") final com.commercetools.history.models.common.CustomFields custom,
            @JsonProperty("addedAt") final java.time.ZonedDateTime addedAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("recurrenceInfo") final com.commercetools.history.models.common.LineItemRecurrenceInfo recurrenceInfo) {
        this.id = id;
        this.key = key;
        this.productId = productId;
        this.productKey = productKey;
        this.name = name;
        this.productSlug = productSlug;
        this.productType = productType;
        this.variant = variant;
        this.price = price;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.discountedPricePerQuantity = discountedPricePerQuantity;
        this.taxedPrice = taxedPrice;
        this.taxedPricePortions = taxedPricePortions;
        this.state = state;
        this.taxRate = taxRate;
        this.perMethodTaxRate = perMethodTaxRate;
        this.supplyChannel = supplyChannel;
        this.distributionChannel = distributionChannel;
        this.priceMode = priceMode;
        this.lineItemMode = lineItemMode;
        this.inventoryMode = inventoryMode;
        this.shippingDetails = shippingDetails;
        this.custom = custom;
        this.addedAt = addedAt;
        this.lastModifiedAt = lastModifiedAt;
        this.recurrenceInfo = recurrenceInfo;
    }

    /**
     * create empty instance
     */
    public LineItemImpl() {
    }

    /**
     *  <p>Unique identifier of the LineItem.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the LineItem.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Line Item is based on.</p>
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     *  <p>This field is only present on:</p>
     *  <ul>
     *   <li>Line Items in a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> when the <code>key</code> is available on that specific Product at the time the LineItem was created or updated on the Cart.</li>
     *   <li>Line Items in an <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> when the <code>key</code> is available on the specific Product at the time the Order was created from the Cart.</li>
     *  </ul>
     *  <p>Present on resources created or updated after 3 December 2021.</p>
     */

    public String getProductKey() {
        return this.productKey;
    }

    /**
     *  <p>Name of the Product.</p>
     */

    public com.commercetools.history.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p><code>slug</code> of the current version of the Product. Updated automatically if the <code>slug</code> changes. Empty if the Product has been deleted. The <code>productSlug</code> field of LineItem is not expanded when using <span>Reference Expansion</span>.</p>
     */

    public com.commercetools.history.models.common.LocalizedString getProductSlug() {
        return this.productSlug;
    }

    /**
     *  <p>Product Type of the Product.</p>
     */

    public com.commercetools.history.models.common.ProductTypeReference getProductType() {
        return this.productType;
    }

    /**
     *  <p>Holds the data of the Product Variant added to the Cart.</p>
     *  <p>The data is saved at the time the Product Variant is added to the Cart and is not updated automatically when Product Variant data changes. Must be updated using the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartRecalculateAction" rel="nofollow">Recalculate</a> update action.</p>
     */

    public com.commercetools.history.models.common.ProductVariant getVariant() {
        return this.variant;
    }

    /**
     *  <p>Price of a Line Item selected from the Product Variant according to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> <code>priceMode</code>. If the <code>priceMode</code> is <code>Embedded</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductPriceModeEnum" rel="nofollow">ProductPriceMode</a> and the <code>variant</code> field hasn't been updated, the price may not correspond to a price in <code>variant.prices</code>.</p>
     */

    public com.commercetools.history.models.common.Price getPrice() {
        return this.price;
    }

    /**
     *  <p>Number of Line Items of the given Product Variant present in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>Total price of this Line Item equalling <code>price</code> multiplied by <code>quantity</code>. If the Line Item is discounted, the total price is the <code>discountedPricePerQuantity</code> multiplied by <code>quantity</code>. Includes taxes if the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRate</a> <code>includedInPrice</code> is <code>true</code>.</p>
     *  <p>If <code>ExternalPrice</code> <span>LineItemPriceMode</span> is used with high-precision money, then the total price is rounded by using the <code>HalfEven</code> rounding mode.</p>
     */

    public com.commercetools.history.models.common.CentPrecisionMoney getTotalPrice() {
        return this.totalPrice;
    }

    /**
     *  <p>Discounted price of a single quantity of the Line Item.</p>
     */

    public java.util.List<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity() {
        return this.discountedPricePerQuantity;
    }

    /**
     *  <p>Automatically set after <code>taxRate</code> is set.</p>
     */

    public com.commercetools.history.models.common.TaxedItemPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
     *  <p>Total taxed prices based on the quantity of Line Item assigned to each <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">Shipping Method</a>. Only applicable for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     */

    public java.util.List<com.commercetools.history.models.common.MethodTaxedPrice> getTaxedPricePortions() {
        return this.taxedPricePortions;
    }

    /**
     *  <p>Tracks specific quantities of the Line Item within a given State. When a Line Item is added to a Cart, its full quantity is set to the built-in "Initial" state. State transitions for Line Items are managed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     */

    public java.util.List<com.commercetools.history.models.common.ItemState> getState() {
        return this.state;
    }

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the <code>taxRate</code> of Line Items is set automatically once a shipping address is set. The rate is based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a> that applies for the shipping address.</li>
     *   <li>For a Cart with <code>External</code> TaxMode, the <code>taxRate</code> of Line Items can be set using <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</li>
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
     *  <p>Identifies <span>Inventory entries</span> that are reserved. The referenced Channel has the <code>InventorySupply</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</p>
     */

    public com.commercetools.history.models.common.ChannelReference getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     *  <p>Used to <span>select</span> a Product Price. The referenced Channel has the <code>ProductDistribution</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</p>
     */

    public com.commercetools.history.models.common.ChannelReference getDistributionChannel() {
        return this.distributionChannel;
    }

    /**
     *  <p>Indicates how the Price for the Line Item is set.</p>
     */

    public com.commercetools.history.models.common.LineItemPriceMode getPriceMode() {
        return this.priceMode;
    }

    /**
     *  <p>Indicates how the Line Item is added to the Cart.</p>
     */

    public com.commercetools.history.models.common.LineItemMode getLineItemMode() {
        return this.lineItemMode;
    }

    /**
     *  <p>Inventory mode specific to this Line Item only, and valid for the entire <code>quantity</code> of the Line Item. Only present if the inventory mode is different from the <code>inventoryMode</code> specified on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>.</p>
     */

    public com.commercetools.history.models.common.InventoryMode getInventoryMode() {
        return this.inventoryMode;
    }

    /**
     *  <p>Container for Line Item-specific addresses.</p>
     */

    public com.commercetools.history.models.common.ItemShippingDetails getShippingDetails() {
        return this.shippingDetails;
    }

    /**
     *  <p>Custom Fields of the Line Item.</p>
     */

    public com.commercetools.history.models.common.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>Date and time (UTC) the Line Item was added to the Cart.</p>
     */

    public java.time.ZonedDateTime getAddedAt() {
        return this.addedAt;
    }

    /**
     *  <p>Date and time (UTC) the Line Item was last updated.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>Recurring Order and frequency data.</p>
     */

    public com.commercetools.history.models.common.LineItemRecurrenceInfo getRecurrenceInfo() {
        return this.recurrenceInfo;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setProductId(final String productId) {
        this.productId = productId;
    }

    public void setProductKey(final String productKey) {
        this.productKey = productKey;
    }

    public void setName(final com.commercetools.history.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setProductSlug(final com.commercetools.history.models.common.LocalizedString productSlug) {
        this.productSlug = productSlug;
    }

    public void setProductType(final com.commercetools.history.models.common.ProductTypeReference productType) {
        this.productType = productType;
    }

    public void setVariant(final com.commercetools.history.models.common.ProductVariant variant) {
        this.variant = variant;
    }

    public void setPrice(final com.commercetools.history.models.common.Price price) {
        this.price = price;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    public void setTotalPrice(final com.commercetools.history.models.common.CentPrecisionMoney totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setDiscountedPricePerQuantity(
            final com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity... discountedPricePerQuantity) {
        this.discountedPricePerQuantity = new ArrayList<>(Arrays.asList(discountedPricePerQuantity));
    }

    public void setDiscountedPricePerQuantity(
            final java.util.List<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
        this.discountedPricePerQuantity = discountedPricePerQuantity;
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

    public void setState(final com.commercetools.history.models.common.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
    }

    public void setState(final java.util.List<com.commercetools.history.models.common.ItemState> state) {
        this.state = state;
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

    public void setSupplyChannel(final com.commercetools.history.models.common.ChannelReference supplyChannel) {
        this.supplyChannel = supplyChannel;
    }

    public void setDistributionChannel(
            final com.commercetools.history.models.common.ChannelReference distributionChannel) {
        this.distributionChannel = distributionChannel;
    }

    public void setPriceMode(final com.commercetools.history.models.common.LineItemPriceMode priceMode) {
        this.priceMode = priceMode;
    }

    public void setLineItemMode(final com.commercetools.history.models.common.LineItemMode lineItemMode) {
        this.lineItemMode = lineItemMode;
    }

    public void setInventoryMode(final com.commercetools.history.models.common.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
    }

    public void setShippingDetails(final com.commercetools.history.models.common.ItemShippingDetails shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    public void setCustom(final com.commercetools.history.models.common.CustomFields custom) {
        this.custom = custom;
    }

    public void setAddedAt(final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setRecurrenceInfo(final com.commercetools.history.models.common.LineItemRecurrenceInfo recurrenceInfo) {
        this.recurrenceInfo = recurrenceInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        LineItemImpl that = (LineItemImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(key, that.key)
                .append(productId, that.productId)
                .append(productKey, that.productKey)
                .append(name, that.name)
                .append(productSlug, that.productSlug)
                .append(productType, that.productType)
                .append(variant, that.variant)
                .append(price, that.price)
                .append(quantity, that.quantity)
                .append(totalPrice, that.totalPrice)
                .append(discountedPricePerQuantity, that.discountedPricePerQuantity)
                .append(taxedPrice, that.taxedPrice)
                .append(taxedPricePortions, that.taxedPricePortions)
                .append(state, that.state)
                .append(taxRate, that.taxRate)
                .append(perMethodTaxRate, that.perMethodTaxRate)
                .append(supplyChannel, that.supplyChannel)
                .append(distributionChannel, that.distributionChannel)
                .append(priceMode, that.priceMode)
                .append(lineItemMode, that.lineItemMode)
                .append(inventoryMode, that.inventoryMode)
                .append(shippingDetails, that.shippingDetails)
                .append(custom, that.custom)
                .append(addedAt, that.addedAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(recurrenceInfo, that.recurrenceInfo)
                .append(id, that.id)
                .append(key, that.key)
                .append(productId, that.productId)
                .append(productKey, that.productKey)
                .append(name, that.name)
                .append(productSlug, that.productSlug)
                .append(productType, that.productType)
                .append(variant, that.variant)
                .append(price, that.price)
                .append(quantity, that.quantity)
                .append(totalPrice, that.totalPrice)
                .append(discountedPricePerQuantity, that.discountedPricePerQuantity)
                .append(taxedPrice, that.taxedPrice)
                .append(taxedPricePortions, that.taxedPricePortions)
                .append(state, that.state)
                .append(taxRate, that.taxRate)
                .append(perMethodTaxRate, that.perMethodTaxRate)
                .append(supplyChannel, that.supplyChannel)
                .append(distributionChannel, that.distributionChannel)
                .append(priceMode, that.priceMode)
                .append(lineItemMode, that.lineItemMode)
                .append(inventoryMode, that.inventoryMode)
                .append(shippingDetails, that.shippingDetails)
                .append(custom, that.custom)
                .append(addedAt, that.addedAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(recurrenceInfo, that.recurrenceInfo)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(key)
                .append(productId)
                .append(productKey)
                .append(name)
                .append(productSlug)
                .append(productType)
                .append(variant)
                .append(price)
                .append(quantity)
                .append(totalPrice)
                .append(discountedPricePerQuantity)
                .append(taxedPrice)
                .append(taxedPricePortions)
                .append(state)
                .append(taxRate)
                .append(perMethodTaxRate)
                .append(supplyChannel)
                .append(distributionChannel)
                .append(priceMode)
                .append(lineItemMode)
                .append(inventoryMode)
                .append(shippingDetails)
                .append(custom)
                .append(addedAt)
                .append(lastModifiedAt)
                .append(recurrenceInfo)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("key", key)
                .append("productId", productId)
                .append("productKey", productKey)
                .append("name", name)
                .append("productSlug", productSlug)
                .append("productType", productType)
                .append("variant", variant)
                .append("price", price)
                .append("quantity", quantity)
                .append("totalPrice", totalPrice)
                .append("discountedPricePerQuantity", discountedPricePerQuantity)
                .append("taxedPrice", taxedPrice)
                .append("taxedPricePortions", taxedPricePortions)
                .append("state", state)
                .append("taxRate", taxRate)
                .append("perMethodTaxRate", perMethodTaxRate)
                .append("supplyChannel", supplyChannel)
                .append("distributionChannel", distributionChannel)
                .append("priceMode", priceMode)
                .append("lineItemMode", lineItemMode)
                .append("inventoryMode", inventoryMode)
                .append("shippingDetails", shippingDetails)
                .append("custom", custom)
                .append("addedAt", addedAt)
                .append("lastModifiedAt", lastModifiedAt)
                .append("recurrenceInfo", recurrenceInfo)
                .build();
    }

    @Override
    public LineItem copyDeep() {
        return LineItem.deepCopy(this);
    }
}
