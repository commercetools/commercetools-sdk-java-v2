
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountValueGiftLineItemDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountValueGiftLineItemDraft cartDiscountValueGiftLineItemDraft = CartDiscountValueGiftLineItemDraft.builder()
 *             .product(productBuilder -> productBuilder)
 *             .variantId(0.3)
 *             .build()
 * </code></pre>
 * </div>
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
     *  <p>ResourceIdentifier of a Product.</p>
     *  <p>A Gift Line Item is added to a Cart even if the referenced Product is unpublished.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public CartDiscountValueGiftLineItemDraftBuilder product(
            Function<com.commercetools.api.models.product.ProductResourceIdentifierBuilder, com.commercetools.api.models.product.ProductResourceIdentifierBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier of a Product.</p>
     *  <p>A Gift Line Item is added to a Cart even if the referenced Product is unpublished.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public CartDiscountValueGiftLineItemDraftBuilder withProduct(
            Function<com.commercetools.api.models.product.ProductResourceIdentifierBuilder, com.commercetools.api.models.product.ProductResourceIdentifier> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>ResourceIdentifier of a Product.</p>
     *  <p>A Gift Line Item is added to a Cart even if the referenced Product is unpublished.</p>
     * @param product value to be set
     * @return Builder
     */

    public CartDiscountValueGiftLineItemDraftBuilder product(
            final com.commercetools.api.models.product.ProductResourceIdentifier product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>ProductVariant of the Product.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public CartDiscountValueGiftLineItemDraftBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>Channel must have the role <code>InventorySupply</code>.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public CartDiscountValueGiftLineItemDraftBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Channel must have the role <code>InventorySupply</code>.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public CartDiscountValueGiftLineItemDraftBuilder withSupplyChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Channel must have the role <code>InventorySupply</code>.</p>
     * @param supplyChannel value to be set
     * @return Builder
     */

    public CartDiscountValueGiftLineItemDraftBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     *  <p>Channel must have the role <code>ProductDistribution</code>.</p>
     * @param builder function to build the distributionChannel value
     * @return Builder
     */

    public CartDiscountValueGiftLineItemDraftBuilder distributionChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.distributionChannel = builder
                .apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Channel must have the role <code>ProductDistribution</code>.</p>
     * @param builder function to build the distributionChannel value
     * @return Builder
     */

    public CartDiscountValueGiftLineItemDraftBuilder withDistributionChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        this.distributionChannel = builder
                .apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Channel must have the role <code>ProductDistribution</code>.</p>
     * @param distributionChannel value to be set
     * @return Builder
     */

    public CartDiscountValueGiftLineItemDraftBuilder distributionChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    /**
     *  <p>ResourceIdentifier of a Product.</p>
     *  <p>A Gift Line Item is added to a Cart even if the referenced Product is unpublished.</p>
     * @return product
     */

    public com.commercetools.api.models.product.ProductResourceIdentifier getProduct() {
        return this.product;
    }

    /**
     *  <p>ProductVariant of the Product.</p>
     * @return variantId
     */

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>Channel must have the role <code>InventorySupply</code>.</p>
     * @return supplyChannel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     *  <p>Channel must have the role <code>ProductDistribution</code>.</p>
     * @return distributionChannel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel() {
        return this.distributionChannel;
    }

    /**
     * builds CartDiscountValueGiftLineItemDraft with checking for non-null required values
     * @return CartDiscountValueGiftLineItemDraft
     */
    public CartDiscountValueGiftLineItemDraft build() {
        Objects.requireNonNull(product, CartDiscountValueGiftLineItemDraft.class + ": product is missing");
        Objects.requireNonNull(variantId, CartDiscountValueGiftLineItemDraft.class + ": variantId is missing");
        return new CartDiscountValueGiftLineItemDraftImpl(product, variantId, supplyChannel, distributionChannel);
    }

    /**
     * builds CartDiscountValueGiftLineItemDraft without checking for non-null required values
     * @return CartDiscountValueGiftLineItemDraft
     */
    public CartDiscountValueGiftLineItemDraft buildUnchecked() {
        return new CartDiscountValueGiftLineItemDraftImpl(product, variantId, supplyChannel, distributionChannel);
    }

    /**
     * factory method for an instance of CartDiscountValueGiftLineItemDraftBuilder
     * @return builder
     */
    public static CartDiscountValueGiftLineItemDraftBuilder of() {
        return new CartDiscountValueGiftLineItemDraftBuilder();
    }

    /**
     * create builder for CartDiscountValueGiftLineItemDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountValueGiftLineItemDraftBuilder of(final CartDiscountValueGiftLineItemDraft template) {
        CartDiscountValueGiftLineItemDraftBuilder builder = new CartDiscountValueGiftLineItemDraftBuilder();
        builder.product = template.getProduct();
        builder.variantId = template.getVariantId();
        builder.supplyChannel = template.getSupplyChannel();
        builder.distributionChannel = template.getDistributionChannel();
        return builder;
    }

}
