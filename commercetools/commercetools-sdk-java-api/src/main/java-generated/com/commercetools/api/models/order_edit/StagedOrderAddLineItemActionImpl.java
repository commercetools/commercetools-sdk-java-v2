
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderAddLineItemActionImpl implements StagedOrderAddLineItemAction {

    private String action;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    private String productId;

    private Long variantId;

    private String sku;

    private Double quantity;

    private java.time.ZonedDateTime addedAt;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    private com.commercetools.api.models.common.Money externalPrice;

    private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;

    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    @JsonCreator
    StagedOrderAddLineItemActionImpl(
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom,
            @JsonProperty("distributionChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel,
            @JsonProperty("externalTaxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate,
            @JsonProperty("productId") final String productId, @JsonProperty("variantId") final Long variantId,
            @JsonProperty("sku") final String sku, @JsonProperty("quantity") final Double quantity,
            @JsonProperty("addedAt") final java.time.ZonedDateTime addedAt,
            @JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel,
            @JsonProperty("externalPrice") final com.commercetools.api.models.common.Money externalPrice,
            @JsonProperty("externalTotalPrice") final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice,
            @JsonProperty("shippingDetails") final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.custom = custom;
        this.distributionChannel = distributionChannel;
        this.externalTaxRate = externalTaxRate;
        this.productId = productId;
        this.variantId = variantId;
        this.sku = sku;
        this.quantity = quantity;
        this.addedAt = addedAt;
        this.supplyChannel = supplyChannel;
        this.externalPrice = externalPrice;
        this.externalTotalPrice = externalTotalPrice;
        this.shippingDetails = shippingDetails;
        this.action = ADD_LINE_ITEM;
    }

    public StagedOrderAddLineItemActionImpl() {
        this.action = ADD_LINE_ITEM;
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel() {
        return this.distributionChannel;
    }

    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
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

    public Double getQuantity() {
        return this.quantity;
    }

    public java.time.ZonedDateTime getAddedAt() {
        return this.addedAt;
    }

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    public com.commercetools.api.models.common.Money getExternalPrice() {
        return this.externalPrice;
    }

    public com.commercetools.api.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice() {
        return this.externalTotalPrice;
    }

    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    public void setDistributionChannel(
            final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
    }

    public void setExternalTaxRate(final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
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

    public void setQuantity(final Double quantity) {
        this.quantity = quantity;
    }

    public void setAddedAt(final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
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

    public void setShippingDetails(final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderAddLineItemActionImpl that = (StagedOrderAddLineItemActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(custom, that.custom)
                .append(distributionChannel, that.distributionChannel)
                .append(externalTaxRate, that.externalTaxRate)
                .append(productId, that.productId)
                .append(variantId, that.variantId)
                .append(sku, that.sku)
                .append(quantity, that.quantity)
                .append(addedAt, that.addedAt)
                .append(supplyChannel, that.supplyChannel)
                .append(externalPrice, that.externalPrice)
                .append(externalTotalPrice, that.externalTotalPrice)
                .append(shippingDetails, that.shippingDetails)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(custom)
                .append(distributionChannel)
                .append(externalTaxRate)
                .append(productId)
                .append(variantId)
                .append(sku)
                .append(quantity)
                .append(addedAt)
                .append(supplyChannel)
                .append(externalPrice)
                .append(externalTotalPrice)
                .append(shippingDetails)
                .toHashCode();
    }

}
