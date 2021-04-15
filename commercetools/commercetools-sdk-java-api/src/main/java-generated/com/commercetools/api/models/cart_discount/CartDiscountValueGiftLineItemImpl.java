
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountValueGiftLineItemImpl implements CartDiscountValueGiftLineItem {

    private String type;

    private com.commercetools.api.models.product.ProductReference product;

    private Long variantId;

    private com.commercetools.api.models.channel.ChannelReference supplyChannel;

    private com.commercetools.api.models.channel.ChannelReference distributionChannel;

    @JsonCreator
    CartDiscountValueGiftLineItemImpl(
            @JsonProperty("product") final com.commercetools.api.models.product.ProductReference product,
            @JsonProperty("variantId") final Long variantId,
            @JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelReference supplyChannel,
            @JsonProperty("distributionChannel") final com.commercetools.api.models.channel.ChannelReference distributionChannel) {
        this.product = product;
        this.variantId = variantId;
        this.supplyChannel = supplyChannel;
        this.distributionChannel = distributionChannel;
        this.type = GIFT_LINE_ITEM;
    }

    public CartDiscountValueGiftLineItemImpl() {
        this.type = GIFT_LINE_ITEM;
    }

    public String getType() {
        return this.type;
    }

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    public Long getVariantId() {
        return this.variantId;
    }

    /**
    *  <p>The channel must have the role <code>InventorySupply</code></p>
    */
    public com.commercetools.api.models.channel.ChannelReference getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
    *  <p>The channel must have the role <code>ProductDistribution</code></p>
    */
    public com.commercetools.api.models.channel.ChannelReference getDistributionChannel() {
        return this.distributionChannel;
    }

    public void setProduct(final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
    }

    public void setVariantId(final Long variantId) {
        this.variantId = variantId;
    }

    public void setSupplyChannel(final com.commercetools.api.models.channel.ChannelReference supplyChannel) {
        this.supplyChannel = supplyChannel;
    }

    public void setDistributionChannel(
            final com.commercetools.api.models.channel.ChannelReference distributionChannel) {
        this.distributionChannel = distributionChannel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartDiscountValueGiftLineItemImpl that = (CartDiscountValueGiftLineItemImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(product, that.product)
                .append(variantId, that.variantId)
                .append(supplyChannel, that.supplyChannel)
                .append(distributionChannel, that.distributionChannel)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(product)
                .append(variantId)
                .append(supplyChannel)
                .append(distributionChannel)
                .toHashCode();
    }

}
