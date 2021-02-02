
package com.commercetools.api.models.cart_discount;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountValueGiftLineItemDraftBuilder {

    private com.commercetools.api.models.product.ProductResourceIdentifier product;

    private Long variantId;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    public CartDiscountValueGiftLineItemDraftBuilder product(
            final com.commercetools.api.models.product.ProductResourceIdentifier product) {
        this.product = product;
        return this;
    }

    public CartDiscountValueGiftLineItemDraftBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    public CartDiscountValueGiftLineItemDraftBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    public CartDiscountValueGiftLineItemDraftBuilder distributionChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    public com.commercetools.api.models.product.ProductResourceIdentifier getProduct() {
        return this.product;
    }

    public Long getVariantId() {
        return this.variantId;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel() {
        return this.distributionChannel;
    }

    public CartDiscountValueGiftLineItemDraft build() {
        return new CartDiscountValueGiftLineItemDraftImpl(product, variantId, supplyChannel, distributionChannel);
    }

    public static CartDiscountValueGiftLineItemDraftBuilder of() {
        return new CartDiscountValueGiftLineItemDraftBuilder();
    }

    public static CartDiscountValueGiftLineItemDraftBuilder of(final CartDiscountValueGiftLineItemDraft template) {
        CartDiscountValueGiftLineItemDraftBuilder builder = new CartDiscountValueGiftLineItemDraftBuilder();
        builder.product = template.getProduct();
        builder.variantId = template.getVariantId();
        builder.supplyChannel = template.getSupplyChannel();
        builder.distributionChannel = template.getDistributionChannel();
        return builder;
    }

}
