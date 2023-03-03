
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
 *  <p>If the Cart contains a LineItem for a Product Variant with the same LineItemMode, Custom Fields, supply and distribution channel, then only the quantity of the existing Line Item is increased. If LineItem <code>shippingDetails</code> is set, it is merged. All addresses will be present afterwards and, for address keys present in both shipping details, the quantity will be summed up. A new Line Item is added when the <code>externalPrice</code> or <code>externalTotalPrice</code> is set in this update action. The LineItem price is set as described in LineItem Price selection.</p>
 *  <p>If the Tax Rate is not set, a MissingTaxRateForCountry error is returned.</p>
 *  <p>If the Line Items do not have a Price according to the Product <code>priceMode</code> value for a selected currency and/or country, Customer Group, or Channel, a MatchingPriceNotFound error is returned.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartAddLineItemActionImpl implements CartAddLineItemAction, ModelBase {

    private String action;

    private String productId;

    private Long variantId;

    private String sku;

    private Long quantity;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    private com.commercetools.api.models.common.Money externalPrice;

    private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;

    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @JsonCreator
    CartAddLineItemActionImpl(@JsonProperty("productId") final String productId,
            @JsonProperty("variantId") final Long variantId, @JsonProperty("sku") final String sku,
            @JsonProperty("quantity") final Long quantity,
            @JsonProperty("distributionChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel,
            @JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel,
            @JsonProperty("externalPrice") final com.commercetools.api.models.common.Money externalPrice,
            @JsonProperty("externalTotalPrice") final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice,
            @JsonProperty("externalTaxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate,
            @JsonProperty("shippingDetails") final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.productId = productId;
        this.variantId = variantId;
        this.sku = sku;
        this.quantity = quantity;
        this.distributionChannel = distributionChannel;
        this.supplyChannel = supplyChannel;
        this.externalPrice = externalPrice;
        this.externalTotalPrice = externalTotalPrice;
        this.externalTaxRate = externalTaxRate;
        this.shippingDetails = shippingDetails;
        this.custom = custom;
        this.action = ADD_LINE_ITEM;
    }

    public CartAddLineItemActionImpl() {
        this.action = ADD_LINE_ITEM;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>ID of an existing Product.</p>
     *  <p>Either the <code>productId</code> and <code>variantId</code>, or <code>sku</code> must be provided.</p>
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     *  <p>ID of an existing ProductVariant in the Product.</p>
     *  <p>If not given, the Master Variant is used.</p>
     *  <p>Either the <code>productId</code> and <code>variantId</code>, or <code>sku</code> must be provided.</p>
     */

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>SKU of an existing ProductVariant.</p>
     *  <p>Either the <code>productId</code> and <code>variantId</code>, or <code>sku</code> must be provided.</p>
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Number of Line Items to add to the Cart.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>Used to select a Product Price. The Channel must have the <code>ProductDistribution</code> ChannelRoleEnum. If the Cart is bound to a Store with <code>distributionChannels</code> set, the Channel must match one of the Store's distribution channels.</p>
     */

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel() {
        return this.distributionChannel;
    }

    /**
     *  <p>Used to identify Inventory entries that must be reserved. The Channel must have the <code>InventorySupply</code> ChannelRoleEnum.</p>
     */

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     *  <p>Sets the LineItem <code>price</code> value, and the <code>priceMode</code> to <code>ExternalPrice</code> LineItemPriceMode.</p>
     */

    public com.commercetools.api.models.common.Money getExternalPrice() {
        return this.externalPrice;
    }

    /**
     *  <p>Sets the LineItem <code>price</code> and <code>totalPrice</code> values, and the <code>priceMode</code> to <code>ExternalTotal</code> LineItemPriceMode.</p>
     */

    public com.commercetools.api.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice() {
        return this.externalTotalPrice;
    }

    /**
     *  <p>External Tax Rate for the Line Item, if the Cart has the <code>External</code> TaxMode.</p>
     */

    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    /**
     *  <p>Container for Line Item-specific addresses.</p>
     */

    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    /**
     *  <p>Custom Fields for the Line Item.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public void setProductId(final String productId) {
        this.productId = productId;
    }

    public void setVariantId(final Long variantId) {
        this.variantId = variantId;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    public void setDistributionChannel(
            final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
    }

    public void setSupplyChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
    }

    public void setExternalPrice(final com.commercetools.api.models.common.Money externalPrice) {
        this.externalPrice = externalPrice;
    }

    public void setExternalTotalPrice(
            final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
        this.externalTotalPrice = externalTotalPrice;
    }

    public void setExternalTaxRate(final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
    }

    public void setShippingDetails(final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
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

        CartAddLineItemActionImpl that = (CartAddLineItemActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(productId, that.productId)
                .append(variantId, that.variantId)
                .append(sku, that.sku)
                .append(quantity, that.quantity)
                .append(distributionChannel, that.distributionChannel)
                .append(supplyChannel, that.supplyChannel)
                .append(externalPrice, that.externalPrice)
                .append(externalTotalPrice, that.externalTotalPrice)
                .append(externalTaxRate, that.externalTaxRate)
                .append(shippingDetails, that.shippingDetails)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(productId)
                .append(variantId)
                .append(sku)
                .append(quantity)
                .append(distributionChannel)
                .append(supplyChannel)
                .append(externalPrice)
                .append(externalTotalPrice)
                .append(externalTaxRate)
                .append(shippingDetails)
                .append(custom)
                .toHashCode();
    }

}
