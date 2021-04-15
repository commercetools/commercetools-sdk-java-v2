
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class LineItemDraftImpl implements LineItemDraft {

    private String productId;

    private Long variantId;

    private String sku;

    private Long quantity;

    private java.time.ZonedDateTime addedAt;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    private com.commercetools.api.models.common.Money externalPrice;

    private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;

    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    @JsonCreator
    LineItemDraftImpl(@JsonProperty("productId") final String productId,
            @JsonProperty("variantId") final Long variantId, @JsonProperty("sku") final String sku,
            @JsonProperty("quantity") final Long quantity,
            @JsonProperty("addedAt") final java.time.ZonedDateTime addedAt,
            @JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel,
            @JsonProperty("distributionChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel,
            @JsonProperty("externalTaxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom,
            @JsonProperty("externalPrice") final com.commercetools.api.models.common.Money externalPrice,
            @JsonProperty("externalTotalPrice") final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice,
            @JsonProperty("shippingDetails") final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.productId = productId;
        this.variantId = variantId;
        this.sku = sku;
        this.quantity = quantity;
        this.addedAt = addedAt;
        this.supplyChannel = supplyChannel;
        this.distributionChannel = distributionChannel;
        this.externalTaxRate = externalTaxRate;
        this.custom = custom;
        this.externalPrice = externalPrice;
        this.externalTotalPrice = externalTotalPrice;
        this.shippingDetails = shippingDetails;
    }

    public LineItemDraftImpl() {
    }

    public String getProductId() {
        return this.productId;
    }

    public Long getVariantId() {
        return this.variantId;
    }

    public String getSku() {
        return this.sku;
    }

    /**
    *  <p>The amount of a <code>LineItem</code>in the cart.
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

    /**
    *  <p>By providing supply channel information, you can unique identify
    *  inventory entries that should be reserved.
    *  The provided channel should have
    *  the InventorySupply role.</p>
    */
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
    *  <p>The channel is used to select a ProductPrice.
    *  The provided channel should have the ProductDistribution role.</p>
    */
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel() {
        return this.distributionChannel;
    }

    /**
    *  <p>An external tax rate can be set if the cart has the <code>External</code> TaxMode.</p>
    */
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    /**
    *  <p>The custom fields.</p>
    */
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
    *  <p>Sets the line item <code>price</code> to the given value and sets the line item <code>priceMode</code> to <code>ExternalPrice</code> LineItemPriceMode.</p>
    */
    public com.commercetools.api.models.common.Money getExternalPrice() {
        return this.externalPrice;
    }

    /**
    *  <p>Sets the line item <code>price</code> and <code>totalPrice</code> to the given values and sets the line item <code>priceMode</code> to <code>ExternalTotal</code> LineItemPriceMode.</p>
    */
    public com.commercetools.api.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice() {
        return this.externalTotalPrice;
    }

    /**
    *  <p>Container for line item specific address(es).</p>
    */
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
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

    public void setAddedAt(final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
    }

    public void setSupplyChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
    }

    public void setDistributionChannel(
            final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
    }

    public void setExternalTaxRate(final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    public void setExternalPrice(final com.commercetools.api.models.common.Money externalPrice) {
        this.externalPrice = externalPrice;
    }

    public void setExternalTotalPrice(
            final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
        this.externalTotalPrice = externalTotalPrice;
    }

    public void setShippingDetails(final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        LineItemDraftImpl that = (LineItemDraftImpl) o;

        return new EqualsBuilder().append(productId, that.productId)
                .append(variantId, that.variantId)
                .append(sku, that.sku)
                .append(quantity, that.quantity)
                .append(addedAt, that.addedAt)
                .append(supplyChannel, that.supplyChannel)
                .append(distributionChannel, that.distributionChannel)
                .append(externalTaxRate, that.externalTaxRate)
                .append(custom, that.custom)
                .append(externalPrice, that.externalPrice)
                .append(externalTotalPrice, that.externalTotalPrice)
                .append(shippingDetails, that.shippingDetails)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(productId)
                .append(variantId)
                .append(sku)
                .append(quantity)
                .append(addedAt)
                .append(supplyChannel)
                .append(distributionChannel)
                .append(externalTaxRate)
                .append(custom)
                .append(externalPrice)
                .append(externalTotalPrice)
                .append(shippingDetails)
                .toHashCode();
    }

}
