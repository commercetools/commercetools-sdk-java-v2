
package com.commercetools.history.models.change_value;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeValueGiftLineItemChangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeValueGiftLineItemChangeValue changeValueGiftLineItemChangeValue = ChangeValueGiftLineItemChangeValue.builder()
 *             .product(productBuilder -> productBuilder)
 *             .variantId(1)
 *             .distributionChannel(distributionChannelBuilder -> distributionChannelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeValueGiftLineItemChangeValueBuilder implements Builder<ChangeValueGiftLineItemChangeValue> {

    private com.commercetools.history.models.common.Reference product;

    private Integer variantId;

    @Nullable
    private com.commercetools.history.models.common.Reference supplyChannel;

    private com.commercetools.history.models.common.Reference distributionChannel;

    /**
     *  <p>Reference to a <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param product value to be set
     * @return Builder
     */

    public ChangeValueGiftLineItemChangeValueBuilder product(
            final com.commercetools.history.models.common.Reference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>Reference to a <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ChangeValueGiftLineItemChangeValueBuilder product(
            Function<com.commercetools.history.models.common.ReferenceBuilder, Builder<? extends com.commercetools.history.models.common.Reference>> builder) {
        this.product = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ChangeValueGiftLineItemChangeValueBuilder variantId(final Integer variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>Channel with <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a> <code>InventorySupply</code>.</p>
     * @param supplyChannel value to be set
     * @return Builder
     */

    public ChangeValueGiftLineItemChangeValueBuilder supplyChannel(
            @Nullable final com.commercetools.history.models.common.Reference supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     *  <p>Channel with <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a> <code>InventorySupply</code>.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public ChangeValueGiftLineItemChangeValueBuilder supplyChannel(
            Function<com.commercetools.history.models.common.ReferenceBuilder, Builder<? extends com.commercetools.history.models.common.Reference>> builder) {
        this.supplyChannel = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Channel with <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a> <code>ProductDistribution</code>.</p>
     * @param distributionChannel value to be set
     * @return Builder
     */

    public ChangeValueGiftLineItemChangeValueBuilder distributionChannel(
            final com.commercetools.history.models.common.Reference distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    /**
     *  <p>Channel with <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a> <code>ProductDistribution</code>.</p>
     * @param builder function to build the distributionChannel value
     * @return Builder
     */

    public ChangeValueGiftLineItemChangeValueBuilder distributionChannel(
            Function<com.commercetools.history.models.common.ReferenceBuilder, Builder<? extends com.commercetools.history.models.common.Reference>> builder) {
        this.distributionChannel = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to a <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return product
     */

    public com.commercetools.history.models.common.Reference getProduct() {
        return this.product;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @return variantId
     */

    public Integer getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>Channel with <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a> <code>InventorySupply</code>.</p>
     * @return supplyChannel
     */

    @Nullable
    public com.commercetools.history.models.common.Reference getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     *  <p>Channel with <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a> <code>ProductDistribution</code>.</p>
     * @return distributionChannel
     */

    public com.commercetools.history.models.common.Reference getDistributionChannel() {
        return this.distributionChannel;
    }

    /**
     * builds ChangeValueGiftLineItemChangeValue with checking for non-null required values
     * @return ChangeValueGiftLineItemChangeValue
     */
    public ChangeValueGiftLineItemChangeValue build() {
        Objects.requireNonNull(product, ChangeValueGiftLineItemChangeValue.class + ": product is missing");
        Objects.requireNonNull(variantId, ChangeValueGiftLineItemChangeValue.class + ": variantId is missing");
        Objects.requireNonNull(distributionChannel,
            ChangeValueGiftLineItemChangeValue.class + ": distributionChannel is missing");
        return new ChangeValueGiftLineItemChangeValueImpl(product, variantId, supplyChannel, distributionChannel);
    }

    /**
     * builds ChangeValueGiftLineItemChangeValue without checking for non-null required values
     * @return ChangeValueGiftLineItemChangeValue
     */
    public ChangeValueGiftLineItemChangeValue buildUnchecked() {
        return new ChangeValueGiftLineItemChangeValueImpl(product, variantId, supplyChannel, distributionChannel);
    }

    /**
     * factory method for an instance of ChangeValueGiftLineItemChangeValueBuilder
     * @return builder
     */
    public static ChangeValueGiftLineItemChangeValueBuilder of() {
        return new ChangeValueGiftLineItemChangeValueBuilder();
    }

    /**
     * create builder for ChangeValueGiftLineItemChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeValueGiftLineItemChangeValueBuilder of(final ChangeValueGiftLineItemChangeValue template) {
        ChangeValueGiftLineItemChangeValueBuilder builder = new ChangeValueGiftLineItemChangeValueBuilder();
        builder.product = template.getProduct();
        builder.variantId = template.getVariantId();
        builder.supplyChannel = template.getSupplyChannel();
        builder.distributionChannel = template.getDistributionChannel();
        return builder;
    }

}
