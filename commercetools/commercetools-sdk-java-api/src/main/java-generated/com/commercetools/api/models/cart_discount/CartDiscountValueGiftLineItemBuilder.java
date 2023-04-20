
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountValueGiftLineItemBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountValueGiftLineItem cartDiscountValueGiftLineItem = CartDiscountValueGiftLineItem.builder()
 *             .product(productBuilder -> productBuilder)
 *             .variantId(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountValueGiftLineItemBuilder implements Builder<CartDiscountValueGiftLineItem> {

    private com.commercetools.api.models.product.ProductReference product;

    private Long variantId;

    @Nullable
    private com.commercetools.api.models.channel.ChannelReference supplyChannel;

    @Nullable
    private com.commercetools.api.models.channel.ChannelReference distributionChannel;

    /**
     *  <p>Reference to a Product.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public CartDiscountValueGiftLineItemBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to a Product.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public CartDiscountValueGiftLineItemBuilder withProduct(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReference> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to a Product.</p>
     * @param product value to be set
     * @return Builder
     */

    public CartDiscountValueGiftLineItemBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>ProductVariant of the Product.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public CartDiscountValueGiftLineItemBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>Channel must have the ChannelRoleEnum <code>InventorySupply</code>.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public CartDiscountValueGiftLineItemBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Channel must have the ChannelRoleEnum <code>InventorySupply</code>.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public CartDiscountValueGiftLineItemBuilder withSupplyChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Channel must have the ChannelRoleEnum <code>InventorySupply</code>.</p>
     * @param supplyChannel value to be set
     * @return Builder
     */

    public CartDiscountValueGiftLineItemBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelReference supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     *  <p>Channel must have the ChannelRoleEnum <code>ProductDistribution</code>.</p>
     * @param builder function to build the distributionChannel value
     * @return Builder
     */

    public CartDiscountValueGiftLineItemBuilder distributionChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.distributionChannel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Channel must have the ChannelRoleEnum <code>ProductDistribution</code>.</p>
     * @param builder function to build the distributionChannel value
     * @return Builder
     */

    public CartDiscountValueGiftLineItemBuilder withDistributionChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        this.distributionChannel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Channel must have the ChannelRoleEnum <code>ProductDistribution</code>.</p>
     * @param distributionChannel value to be set
     * @return Builder
     */

    public CartDiscountValueGiftLineItemBuilder distributionChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelReference distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    /**
     *  <p>Reference to a Product.</p>
     * @return product
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
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
     *  <p>Channel must have the ChannelRoleEnum <code>InventorySupply</code>.</p>
     * @return supplyChannel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     *  <p>Channel must have the ChannelRoleEnum <code>ProductDistribution</code>.</p>
     * @return distributionChannel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getDistributionChannel() {
        return this.distributionChannel;
    }

    /**
     * builds CartDiscountValueGiftLineItem with checking for non-null required values
     * @return CartDiscountValueGiftLineItem
     */
    public CartDiscountValueGiftLineItem build() {
        Objects.requireNonNull(product, CartDiscountValueGiftLineItem.class + ": product is missing");
        Objects.requireNonNull(variantId, CartDiscountValueGiftLineItem.class + ": variantId is missing");
        return new CartDiscountValueGiftLineItemImpl(product, variantId, supplyChannel, distributionChannel);
    }

    /**
     * builds CartDiscountValueGiftLineItem without checking for non-null required values
     * @return CartDiscountValueGiftLineItem
     */
    public CartDiscountValueGiftLineItem buildUnchecked() {
        return new CartDiscountValueGiftLineItemImpl(product, variantId, supplyChannel, distributionChannel);
    }

    /**
     * factory method for an instance of CartDiscountValueGiftLineItemBuilder
     * @return builder
     */
    public static CartDiscountValueGiftLineItemBuilder of() {
        return new CartDiscountValueGiftLineItemBuilder();
    }

    /**
     * create builder for CartDiscountValueGiftLineItem instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountValueGiftLineItemBuilder of(final CartDiscountValueGiftLineItem template) {
        CartDiscountValueGiftLineItemBuilder builder = new CartDiscountValueGiftLineItemBuilder();
        builder.product = template.getProduct();
        builder.variantId = template.getVariantId();
        builder.supplyChannel = template.getSupplyChannel();
        builder.distributionChannel = template.getDistributionChannel();
        return builder;
    }

}
