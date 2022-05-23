
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   CartDiscountValueGiftLineItemDraft cartDiscountValueGiftLineItemDraft = CartDiscountValueGiftLineItemDraft.builder()
           .product(productBuilder -> productBuilder)
           .variantId(0.3)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountValueGiftLineItemDraftBuilder implements Builder<CartDiscountValueGiftLineItemDraft> {

    private com.commercetools.api.models.product.ProductResourceIdentifier product;

    private Long variantId;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    /**
     *  <p>ResourceIdentifier to a Product.</p>
     */

    public CartDiscountValueGiftLineItemDraftBuilder product(
            Function<com.commercetools.api.models.product.ProductResourceIdentifierBuilder, com.commercetools.api.models.product.ProductResourceIdentifierBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a Product.</p>
     */

    public CartDiscountValueGiftLineItemDraftBuilder product(
            final com.commercetools.api.models.product.ProductResourceIdentifier product) {
        this.product = product;
        return this;
    }

    public CartDiscountValueGiftLineItemDraftBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The channel must have the role <code>InventorySupply</code></p>
     */

    public CartDiscountValueGiftLineItemDraftBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The channel must have the role <code>InventorySupply</code></p>
     */

    public CartDiscountValueGiftLineItemDraftBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     *  <p>The channel must have the role <code>ProductDistribution</code></p>
     */

    public CartDiscountValueGiftLineItemDraftBuilder distributionChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.distributionChannel = builder
                .apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The channel must have the role <code>ProductDistribution</code></p>
     */

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
        Objects.requireNonNull(product, CartDiscountValueGiftLineItemDraft.class + ": product is missing");
        Objects.requireNonNull(variantId, CartDiscountValueGiftLineItemDraft.class + ": variantId is missing");
        return new CartDiscountValueGiftLineItemDraftImpl(product, variantId, supplyChannel, distributionChannel);
    }

    /**
     * builds CartDiscountValueGiftLineItemDraft without checking for non null required values
     */
    public CartDiscountValueGiftLineItemDraft buildUnchecked() {
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
