
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class LineItemImpl implements LineItem, ModelBase {

    private String id;

    private String productId;

    private String productKey;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString productSlug;

    private com.commercetools.api.models.product_type.ProductTypeReference productType;

    private com.commercetools.api.models.product.ProductVariant variant;

    private com.commercetools.api.models.common.Price price;

    private com.commercetools.api.models.cart.TaxedItemPrice taxedPrice;

    private com.commercetools.api.models.common.TypedMoney totalPrice;

    private Long quantity;

    private java.time.ZonedDateTime addedAt;

    private java.util.List<com.commercetools.api.models.order.ItemState> state;

    private com.commercetools.api.models.tax_category.TaxRate taxRate;

    private com.commercetools.api.models.channel.ChannelReference supplyChannel;

    private com.commercetools.api.models.channel.ChannelReference distributionChannel;

    private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;

    private com.commercetools.api.models.cart.LineItemPriceMode priceMode;

    private com.commercetools.api.models.cart.LineItemMode lineItemMode;

    private com.commercetools.api.models.type.CustomFields custom;

    private com.commercetools.api.models.cart.ItemShippingDetails shippingDetails;

    private java.time.ZonedDateTime lastModifiedAt;

    @JsonCreator
    LineItemImpl(@JsonProperty("id") final String id, @JsonProperty("productId") final String productId,
            @JsonProperty("productKey") final String productKey,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("productSlug") final com.commercetools.api.models.common.LocalizedString productSlug,
            @JsonProperty("productType") final com.commercetools.api.models.product_type.ProductTypeReference productType,
            @JsonProperty("variant") final com.commercetools.api.models.product.ProductVariant variant,
            @JsonProperty("price") final com.commercetools.api.models.common.Price price,
            @JsonProperty("taxedPrice") final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice,
            @JsonProperty("totalPrice") final com.commercetools.api.models.common.TypedMoney totalPrice,
            @JsonProperty("quantity") final Long quantity,
            @JsonProperty("addedAt") final java.time.ZonedDateTime addedAt,
            @JsonProperty("state") final java.util.List<com.commercetools.api.models.order.ItemState> state,
            @JsonProperty("taxRate") final com.commercetools.api.models.tax_category.TaxRate taxRate,
            @JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelReference supplyChannel,
            @JsonProperty("distributionChannel") final com.commercetools.api.models.channel.ChannelReference distributionChannel,
            @JsonProperty("discountedPricePerQuantity") final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity,
            @JsonProperty("priceMode") final com.commercetools.api.models.cart.LineItemPriceMode priceMode,
            @JsonProperty("lineItemMode") final com.commercetools.api.models.cart.LineItemMode lineItemMode,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom,
            @JsonProperty("shippingDetails") final com.commercetools.api.models.cart.ItemShippingDetails shippingDetails,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt) {
        this.id = id;
        this.productId = productId;
        this.productKey = productKey;
        this.name = name;
        this.productSlug = productSlug;
        this.productType = productType;
        this.variant = variant;
        this.price = price;
        this.taxedPrice = taxedPrice;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
        this.addedAt = addedAt;
        this.state = state;
        this.taxRate = taxRate;
        this.supplyChannel = supplyChannel;
        this.distributionChannel = distributionChannel;
        this.discountedPricePerQuantity = discountedPricePerQuantity;
        this.priceMode = priceMode;
        this.lineItemMode = lineItemMode;
        this.custom = custom;
        this.shippingDetails = shippingDetails;
        this.lastModifiedAt = lastModifiedAt;
    }

    public LineItemImpl() {
    }

    /**
    *  <p>The unique ID of this LineItem.</p>
    */
    public String getId() {
        return this.id;
    }

    public String getProductId() {
        return this.productId;
    }

    /**
    *  <p>User-defined unique identifier for the <a href="ctp:api:type:Product">Product</a>.
    *  Only present on Line Items in a <a href="ctp:api:type:Cart">Cart</a> when the <code>key</code> is available on that specific Product at the time the Line Item is created or updated on the Cart. On <a href="/ctp:api:type:Order">Order</a> resources this field is only present when the <code>key</code> is available on the specific Product at the time the Order is created from the Cart. This field is in general not present on Carts that had no updates until 3 December 2021 and on Orders created before this date.</p>
    */
    public String getProductKey() {
        return this.productKey;
    }

    /**
    *  <p>The product name.</p>
    */
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
    *  <p>The slug of a product is inserted on the fly.
    *  It is always up-to-date and can therefore be used to link to the product detail page of the product.
    *  It is empty if the product has been deleted.
    *  The slug is also empty if the cart or order is retrieved via Reference Expansion or is a snapshot in a Message.</p>
    */
    public com.commercetools.api.models.common.LocalizedString getProductSlug() {
        return this.productSlug;
    }

    public com.commercetools.api.models.product_type.ProductTypeReference getProductType() {
        return this.productType;
    }

    /**
    *  <p>The variant data is saved when the variant is added to the cart, and not updated automatically.
    *  It can manually be updated with the Recalculate update action.</p>
    */
    public com.commercetools.api.models.product.ProductVariant getVariant() {
        return this.variant;
    }

    /**
    *  <p>The price of a line item is selected from the prices array of the product variant.
    *  If the <code>variant</code> field hasn't been updated, the price may not correspond to a price in <code>variant.prices</code>.</p>
    */
    public com.commercetools.api.models.common.Price getPrice() {
        return this.price;
    }

    /**
    *  <p>Set once the <code>taxRate</code> is set.</p>
    */
    public com.commercetools.api.models.cart.TaxedItemPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
    *  <p>The total price of this line item.
    *  If the line item is discounted, then the <code>totalPrice</code> is the DiscountedLineItemPriceForQuantity multiplied by <code>quantity</code>.
    *  Otherwise the total price is the product price multiplied by the <code>quantity</code>.
    *  <code>totalPrice</code> may or may not include the taxes: it depends on the taxRate.includedInPrice property.</p>
    */
    public com.commercetools.api.models.common.TypedMoney getTotalPrice() {
        return this.totalPrice;
    }

    /**
    *  <p>The amount of a LineItem in the cart.
    *  Must be a positive integer.</p>
    */
    public Long getQuantity() {
        return this.quantity;
    }

    /**
    *  <p>When the line item was added to the cart. Optional for backwards
    *  compatibility reasons only.</p>
    */
    public java.time.ZonedDateTime getAddedAt() {
        return this.addedAt;
    }

    public java.util.List<com.commercetools.api.models.order.ItemState> getState() {
        return this.state;
    }

    /**
    *  <p>Will be set automatically in the <code>Platform</code> TaxMode once the shipping address is set is set.
    *  For the <code>External</code> tax mode the tax rate has to be set explicitly with the ExternalTaxRateDraft.</p>
    */
    public com.commercetools.api.models.tax_category.TaxRate getTaxRate() {
        return this.taxRate;
    }

    /**
    *  <p>The supply channel identifies the inventory entries that should be reserved.
    *  The channel has
    *  the role InventorySupply.</p>
    */
    public com.commercetools.api.models.channel.ChannelReference getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
    *  <p>The distribution channel is used to select a ProductPrice.
    *  The channel has the role ProductDistribution.</p>
    */
    public com.commercetools.api.models.channel.ChannelReference getDistributionChannel() {
        return this.distributionChannel;
    }

    public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity() {
        return this.discountedPricePerQuantity;
    }

    public com.commercetools.api.models.cart.LineItemPriceMode getPriceMode() {
        return this.priceMode;
    }

    public com.commercetools.api.models.cart.LineItemMode getLineItemMode() {
        return this.lineItemMode;
    }

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
    *  <p>Container for line item specific address(es).</p>
    */
    public com.commercetools.api.models.cart.ItemShippingDetails getShippingDetails() {
        return this.shippingDetails;
    }

    /**
    *  <p>The date when the LineItem was last modified by one of the following actions
    *  setLineItemShippingDetails, addLineItem, removeLineItem, or changeLineItemQuantity.
    *  Optional only for backwards compatible reasons. When the LineItem is created lastModifiedAt is set to addedAt.</p>
    */
    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    public void setId(final String id) {
        this.id = id;
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

    public void setTaxedPrice(final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
    }

    public void setTotalPrice(final com.commercetools.api.models.common.TypedMoney totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    public void setAddedAt(final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
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

    public void setSupplyChannel(final com.commercetools.api.models.channel.ChannelReference supplyChannel) {
        this.supplyChannel = supplyChannel;
    }

    public void setDistributionChannel(
            final com.commercetools.api.models.channel.ChannelReference distributionChannel) {
        this.distributionChannel = distributionChannel;
    }

    public void setDiscountedPricePerQuantity(
            final com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity... discountedPricePerQuantity) {
        this.discountedPricePerQuantity = new ArrayList<>(Arrays.asList(discountedPricePerQuantity));
    }

    public void setDiscountedPricePerQuantity(
            final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
        this.discountedPricePerQuantity = discountedPricePerQuantity;
    }

    public void setPriceMode(final com.commercetools.api.models.cart.LineItemPriceMode priceMode) {
        this.priceMode = priceMode;
    }

    public void setLineItemMode(final com.commercetools.api.models.cart.LineItemMode lineItemMode) {
        this.lineItemMode = lineItemMode;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
    }

    public void setShippingDetails(final com.commercetools.api.models.cart.ItemShippingDetails shippingDetails) {
        this.shippingDetails = shippingDetails;
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
                .append(productId, that.productId)
                .append(productKey, that.productKey)
                .append(name, that.name)
                .append(productSlug, that.productSlug)
                .append(productType, that.productType)
                .append(variant, that.variant)
                .append(price, that.price)
                .append(taxedPrice, that.taxedPrice)
                .append(totalPrice, that.totalPrice)
                .append(quantity, that.quantity)
                .append(addedAt, that.addedAt)
                .append(state, that.state)
                .append(taxRate, that.taxRate)
                .append(supplyChannel, that.supplyChannel)
                .append(distributionChannel, that.distributionChannel)
                .append(discountedPricePerQuantity, that.discountedPricePerQuantity)
                .append(priceMode, that.priceMode)
                .append(lineItemMode, that.lineItemMode)
                .append(custom, that.custom)
                .append(shippingDetails, that.shippingDetails)
                .append(lastModifiedAt, that.lastModifiedAt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(productId)
                .append(productKey)
                .append(name)
                .append(productSlug)
                .append(productType)
                .append(variant)
                .append(price)
                .append(taxedPrice)
                .append(totalPrice)
                .append(quantity)
                .append(addedAt)
                .append(state)
                .append(taxRate)
                .append(supplyChannel)
                .append(distributionChannel)
                .append(discountedPricePerQuantity)
                .append(priceMode)
                .append(lineItemMode)
                .append(custom)
                .append(shippingDetails)
                .append(lastModifiedAt)
                .toHashCode();
    }

}
