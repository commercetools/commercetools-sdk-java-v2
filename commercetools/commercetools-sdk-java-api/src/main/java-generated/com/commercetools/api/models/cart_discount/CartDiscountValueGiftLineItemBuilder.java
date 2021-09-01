
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountValueGiftLineItemBuilder implements Builder<CartDiscountValueGiftLineItem> {

    private com.commercetools.api.models.product.ProductReference product;

    private Long variantId;

    @Nullable
    private com.commercetools.api.models.channel.ChannelReference supplyChannel;

    @Nullable
    private com.commercetools.api.models.channel.ChannelReference distributionChannel;

    public CartDiscountValueGiftLineItemBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    public CartDiscountValueGiftLineItemBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    public CartDiscountValueGiftLineItemBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    public CartDiscountValueGiftLineItemBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelReference supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    public CartDiscountValueGiftLineItemBuilder distributionChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelReference distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    public Long getVariantId() {
        return this.variantId;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getSupplyChannel() {
        return this.supplyChannel;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getDistributionChannel() {
        return this.distributionChannel;
    }

    public CartDiscountValueGiftLineItem build() {
        Objects.requireNonNull(product, CartDiscountValueGiftLineItem.class + ": product is missing");
        Objects.requireNonNull(variantId, CartDiscountValueGiftLineItem.class + ": variantId is missing");
        return new CartDiscountValueGiftLineItemImpl(product, variantId, supplyChannel, distributionChannel);
    }

    /**
     * builds CartDiscountValueGiftLineItem without checking for non null required values
     */
    public CartDiscountValueGiftLineItem buildUnchecked() {
        return new CartDiscountValueGiftLineItemImpl(product, variantId, supplyChannel, distributionChannel);
    }

    public static CartDiscountValueGiftLineItemBuilder of() {
        return new CartDiscountValueGiftLineItemBuilder();
    }

    public static CartDiscountValueGiftLineItemBuilder of(final CartDiscountValueGiftLineItem template) {
        CartDiscountValueGiftLineItemBuilder builder = new CartDiscountValueGiftLineItemBuilder();
        builder.product = template.getProduct();
        builder.variantId = template.getVariantId();
        builder.supplyChannel = template.getSupplyChannel();
        builder.distributionChannel = template.getDistributionChannel();
        return builder;
    }

}
