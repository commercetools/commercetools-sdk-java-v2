
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

/**
 *  <p>The representation of a Line Item in a Cart or in an Order.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LineItemImpl implements LineItem, ModelBase {

    private String id;

    private String key;

    private String productId;

    private String productKey;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString productSlug;

    private com.commercetools.api.models.product_type.ProductTypeReference productType;

    private com.commercetools.api.models.product.ProductVariant variant;

    private com.commercetools.api.models.common.Price price;

    private Long quantity;

    private com.commercetools.api.models.common.CentPrecisionMoney totalPrice;

    private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;

    private com.commercetools.api.models.cart.TaxedItemPrice taxedPrice;

    private java.util.List<com.commercetools.api.models.cart.MethodTaxedPrice> taxedPricePortions;

    private java.util.List<com.commercetools.api.models.order.ItemState> state;

    private com.commercetools.api.models.tax_category.TaxRate taxRate;

    private java.util.List<com.commercetools.api.models.cart.MethodTaxRate> perMethodTaxRate;

    private com.commercetools.api.models.channel.ChannelReference supplyChannel;

    private com.commercetools.api.models.channel.ChannelReference distributionChannel;

    private com.commercetools.api.models.cart.LineItemPriceMode priceMode;

    private com.commercetools.api.models.cart.LineItemMode lineItemMode;

    private com.commercetools.api.models.cart.InventoryMode inventoryMode;

    private com.commercetools.api.models.cart.ItemShippingDetails shippingDetails;

    private com.commercetools.api.models.type.CustomFields custom;

    private java.time.ZonedDateTime addedAt;

    private java.time.ZonedDateTime lastModifiedAt;

    /**
     * create instance with all properties
     */
    @JsonCreator
    LineItemImpl(@JsonProperty("id") final String id, @JsonProperty("key") final String key,
            @JsonProperty("productId") final String productId, @JsonProperty("productKey") final String productKey,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("productSlug") final com.commercetools.api.models.common.LocalizedString productSlug,
            @JsonProperty("productType") final com.commercetools.api.models.product_type.ProductTypeReference productType,
            @JsonProperty("variant") final com.commercetools.api.models.product.ProductVariant variant,
            @JsonProperty("price") final com.commercetools.api.models.common.Price price,
            @JsonProperty("quantity") final Long quantity,
            @JsonProperty("totalPrice") final com.commercetools.api.models.common.CentPrecisionMoney totalPrice,
            @JsonProperty("discountedPricePerQuantity") final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity,
            @JsonProperty("taxedPrice") final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice,
            @JsonProperty("taxedPricePortions") final java.util.List<com.commercetools.api.models.cart.MethodTaxedPrice> taxedPricePortions,
            @JsonProperty("state") final java.util.List<com.commercetools.api.models.order.ItemState> state,
            @JsonProperty("taxRate") final com.commercetools.api.models.tax_category.TaxRate taxRate,
            @JsonProperty("perMethodTaxRate") final java.util.List<com.commercetools.api.models.cart.MethodTaxRate> perMethodTaxRate,
            @JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelReference supplyChannel,
            @JsonProperty("distributionChannel") final com.commercetools.api.models.channel.ChannelReference distributionChannel,
            @JsonProperty("priceMode") final com.commercetools.api.models.cart.LineItemPriceMode priceMode,
            @JsonProperty("lineItemMode") final com.commercetools.api.models.cart.LineItemMode lineItemMode,
            @JsonProperty("inventoryMode") final com.commercetools.api.models.cart.InventoryMode inventoryMode,
            @JsonProperty("shippingDetails") final com.commercetools.api.models.cart.ItemShippingDetails shippingDetails,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom,
            @JsonProperty("addedAt") final java.time.ZonedDateTime addedAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt) {
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
     *  <p><code>id</code> of the Product the Line Item is based on.</p>
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     *  <p><code>key</code> of the Product.</p>
     *  <p>This field is only present on:</p>
     *  <ul>
     *   <li>Line Items in a Cart when the <code>key</code> is available on that specific Product at the time the LineItem was created or updated on the Cart.</li>
     *   <li>Line Items in an Order when the <code>key</code> is available on the specific Product at the time the Order was created from the Cart.</li>
     *  </ul>
     *  <p>Present on resources created or updated after 3 December 2021.</p>
     */

    public String getProductKey() {
        return this.productKey;
    }

    /**
     *  <p>Name of the Product.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p><code>slug</code> of the current version of the Product. Updated automatically if the <code>slug</code> changes. Empty if the Product has been deleted. The <code>productSlug</code> field of LineItem is not expanded when using Reference Expansion.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getProductSlug() {
        return this.productSlug;
    }

    /**
     *  <p>Product Type of the Product.</p>
     */

    public com.commercetools.api.models.product_type.ProductTypeReference getProductType() {
        return this.productType;
    }

    /**
     *  <p>Holds the data of the Product Variant added to the Cart.</p>
     *  <p>The data is saved at the time the Product Variant is added to the Cart and is not updated automatically when Product Variant data changes. Must be updated using the Recalculate update action.</p>
     */

    public com.commercetools.api.models.product.ProductVariant getVariant() {
        return this.variant;
    }

    /**
     *  <p>Price of a Line Item selected from the Product Variant according to the Product <code>priceMode</code>. If the <code>priceMode</code> is <code>Embedded</code> ProductPriceMode and the <code>variant</code> field hasn't been updated, the price may not correspond to a price in <code>variant.prices</code>.</p>
     */

    public com.commercetools.api.models.common.Price getPrice() {
        return this.price;
    }

    /**
     *  <p>Number of Line Items of the given Product Variant present in the Cart or Order.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>Total price of this Line Item equalling <code>price</code> multiplied by <code>quantity</code>. If the Line Item is discounted, the total price is the <code>discountedPricePerQuantity</code> multiplied by <code>quantity</code>. Includes taxes if the TaxRate <code>includedInPrice</code> is <code>true</code>.</p>
     */

    public com.commercetools.api.models.common.CentPrecisionMoney getTotalPrice() {
        return this.totalPrice;
    }

    /**
     *  <p>Discounted price of a single quantity of the Line Item.</p>
     */

    public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity() {
        return this.discountedPricePerQuantity;
    }

    /**
     *  <p>Automatically set after <code>taxRate</code> is set.</p>
     */

    public com.commercetools.api.models.cart.TaxedItemPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
     *  <p>Taxed price of the Shipping Method that is automatically set after <code>perMethodTaxRate</code> is set.</p>
     */

    public java.util.List<com.commercetools.api.models.cart.MethodTaxedPrice> getTaxedPricePortions() {
        return this.taxedPricePortions;
    }

    /**
     *  <p>State of the Line Item in the Cart or the Order.</p>
     */

    public java.util.List<com.commercetools.api.models.order.ItemState> getState() {
        return this.state;
    }

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> TaxMode, the <code>taxRate</code> of Line Items is set automatically once a shipping address is set. The rate is based on the TaxCategory that applies for the shipping address.</li>
     *   <li>For a Cart with <code>External</code> TaxMode, the <code>taxRate</code> of Line Items can be set using ExternalTaxRateDraft.</li>
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
     *  <p>Identifies Inventory entries that are reserved. The referenced Channel has the <code>InventorySupply</code> ChannelRoleEnum.</p>
     */

    public com.commercetools.api.models.channel.ChannelReference getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     *  <p>Used to select a Product Price. The referenced Channel has the <code>ProductDistribution</code> ChannelRoleEnum.</p>
     */

    public com.commercetools.api.models.channel.ChannelReference getDistributionChannel() {
        return this.distributionChannel;
    }

    /**
     *  <p>Indicates how the Price for the Line Item is set.</p>
     */

    public com.commercetools.api.models.cart.LineItemPriceMode getPriceMode() {
        return this.priceMode;
    }

    /**
     *  <p>Indicates how the Line Item is added to the Cart.</p>
     */

    public com.commercetools.api.models.cart.LineItemMode getLineItemMode() {
        return this.lineItemMode;
    }

    /**
     *  <p>Inventory mode specific to this Line Item only, and valid for the entire <code>quantity</code> of the Line Item. Only present if the inventory mode is different from the <code>inventoryMode</code> specified on the Cart.</p>
     */

    public com.commercetools.api.models.cart.InventoryMode getInventoryMode() {
        return this.inventoryMode;
    }

    /**
     *  <p>Container for Line Item-specific addresses.</p>
     */

    public com.commercetools.api.models.cart.ItemShippingDetails getShippingDetails() {
        return this.shippingDetails;
    }

    /**
     *  <p>Custom Fields of the Line Item.</p>
     */

    public com.commercetools.api.models.type.CustomFields getCustom() {
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

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setProductSlug(final com.commercetools.api.models.common.LocalizedString productSlug) {
        this.productSlug = productSlug;
    }

    public void setProductType(final com.commercetools.api.models.product_type.ProductTypeReference productType) {
        this.productType = productType;
    }

    public void setVariant(final com.commercetools.api.models.product.ProductVariant variant) {
        this.variant = variant;
    }

    public void setPrice(final com.commercetools.api.models.common.Price price) {
        this.price = price;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    public void setTotalPrice(final com.commercetools.api.models.common.CentPrecisionMoney totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setDiscountedPricePerQuantity(
            final com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity... discountedPricePerQuantity) {
        this.discountedPricePerQuantity = new ArrayList<>(Arrays.asList(discountedPricePerQuantity));
    }

    public void setDiscountedPricePerQuantity(
            final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
        this.discountedPricePerQuantity = discountedPricePerQuantity;
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

    public void setState(final com.commercetools.api.models.order.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
    }

    public void setState(final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.state = state;
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

    public void setSupplyChannel(final com.commercetools.api.models.channel.ChannelReference supplyChannel) {
        this.supplyChannel = supplyChannel;
    }

    public void setDistributionChannel(
            final com.commercetools.api.models.channel.ChannelReference distributionChannel) {
        this.distributionChannel = distributionChannel;
    }

    public void setPriceMode(final com.commercetools.api.models.cart.LineItemPriceMode priceMode) {
        this.priceMode = priceMode;
    }

    public void setLineItemMode(final com.commercetools.api.models.cart.LineItemMode lineItemMode) {
        this.lineItemMode = lineItemMode;
    }

    public void setInventoryMode(final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
    }

    public void setShippingDetails(final com.commercetools.api.models.cart.ItemShippingDetails shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
    }

    public void setAddedAt(final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
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
                .toHashCode();
    }

}
