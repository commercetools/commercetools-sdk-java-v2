
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class LineItemImportDraftImpl implements LineItemImportDraft {

    private String productId;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.order.ProductVariantImportDraft variant;

    private com.commercetools.api.models.common.PriceDraft price;

    private Double quantity;

    private java.util.List<com.commercetools.api.models.order.ItemState> state;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    private com.commercetools.api.models.tax_category.TaxRate taxRate;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    @JsonCreator
    LineItemImportDraftImpl(@JsonProperty("productId") final String productId,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("variant") final com.commercetools.api.models.order.ProductVariantImportDraft variant,
            @JsonProperty("price") final com.commercetools.api.models.common.PriceDraft price,
            @JsonProperty("quantity") final Double quantity,
            @JsonProperty("state") final java.util.List<com.commercetools.api.models.order.ItemState> state,
            @JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel,
            @JsonProperty("distributionChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel,
            @JsonProperty("taxRate") final com.commercetools.api.models.tax_category.TaxRate taxRate,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom,
            @JsonProperty("shippingDetails") final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.productId = productId;
        this.name = name;
        this.variant = variant;
        this.price = price;
        this.quantity = quantity;
        this.state = state;
        this.supplyChannel = supplyChannel;
        this.distributionChannel = distributionChannel;
        this.taxRate = taxRate;
        this.custom = custom;
        this.shippingDetails = shippingDetails;
    }

    public LineItemImportDraftImpl() {
    }

    /**
    *  <p>ID of the existing product.
    *  You also need to specify the ID of the variant if this property is set or alternatively you can just specify SKU of the product variant.</p>
    */
    public String getProductId() {
        return this.productId;
    }

    /**
    *  <p>The product name.</p>
    */
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public com.commercetools.api.models.order.ProductVariantImportDraft getVariant() {
        return this.variant;
    }

    public com.commercetools.api.models.common.PriceDraft getPrice() {
        return this.price;
    }

    public Double getQuantity() {
        return this.quantity;
    }

    public java.util.List<com.commercetools.api.models.order.ItemState> getState() {
        return this.state;
    }

    /**
    *  <p>Optional connection to a particular supplier.
    *  By providing supply channel information, you can uniquely identify
    *  inventory entries that should be reserved.
    *  The provided channel should have the
    *  InventorySupply role.</p>
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

    public com.commercetools.api.models.tax_category.TaxRate getTaxRate() {
        return this.taxRate;
    }

    /**
    *  <p>The custom fields.</p>
    */
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    public void setProductId(final String productId) {
        this.productId = productId;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setVariant(final com.commercetools.api.models.order.ProductVariantImportDraft variant) {
        this.variant = variant;
    }

    public void setPrice(final com.commercetools.api.models.common.PriceDraft price) {
        this.price = price;
    }

    public void setQuantity(final Double quantity) {
        this.quantity = quantity;
    }

    public void setState(final com.commercetools.api.models.order.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
    }

    public void setState(final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.state = state;
    }

    public void setSupplyChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
    }

    public void setDistributionChannel(
            final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
    }

    public void setTaxRate(final com.commercetools.api.models.tax_category.TaxRate taxRate) {
        this.taxRate = taxRate;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
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

        LineItemImportDraftImpl that = (LineItemImportDraftImpl) o;

        return new EqualsBuilder().append(productId, that.productId).append(name, that.name).append(variant,
            that.variant).append(price, that.price).append(quantity, that.quantity).append(state, that.state).append(
                supplyChannel, that.supplyChannel).append(distributionChannel, that.distributionChannel).append(taxRate,
                    that.taxRate).append(custom, that.custom).append(shippingDetails, that.shippingDetails).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(productId).append(name).append(variant).append(price).append(
            quantity).append(state).append(supplyChannel).append(distributionChannel).append(taxRate).append(
                custom).append(shippingDetails).toHashCode();
    }

}
