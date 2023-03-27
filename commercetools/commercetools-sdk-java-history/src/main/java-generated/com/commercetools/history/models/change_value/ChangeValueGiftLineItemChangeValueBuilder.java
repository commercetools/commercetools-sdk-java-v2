
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
     * set the value to the product using the builder function
     * @param builder function to build the product value
     * @return Builder
     */

    public ChangeValueGiftLineItemChangeValueBuilder product(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the product
     * @param product value to be set
     * @return Builder
     */

    public ChangeValueGiftLineItemChangeValueBuilder product(
            final com.commercetools.history.models.common.Reference product) {
        this.product = product;
        return this;
    }

    /**
     * set the value to the variantId
     * @param variantId value to be set
     * @return Builder
     */

    public ChangeValueGiftLineItemChangeValueBuilder variantId(final Integer variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     * set the value to the supplyChannel using the builder function
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public ChangeValueGiftLineItemChangeValueBuilder supplyChannel(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the supplyChannel
     * @param supplyChannel value to be set
     * @return Builder
     */

    public ChangeValueGiftLineItemChangeValueBuilder supplyChannel(
            @Nullable final com.commercetools.history.models.common.Reference supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     * set the value to the distributionChannel using the builder function
     * @param builder function to build the distributionChannel value
     * @return Builder
     */

    public ChangeValueGiftLineItemChangeValueBuilder distributionChannel(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.distributionChannel = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the distributionChannel
     * @param distributionChannel value to be set
     * @return Builder
     */

    public ChangeValueGiftLineItemChangeValueBuilder distributionChannel(
            final com.commercetools.history.models.common.Reference distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    /**
     * value of product}
     * @return product
     */

    public com.commercetools.history.models.common.Reference getProduct() {
        return this.product;
    }

    /**
     * value of variantId}
     * @return variantId
     */

    public Integer getVariantId() {
        return this.variantId;
    }

    /**
     * value of supplyChannel}
     * @return supplyChannel
     */

    @Nullable
    public com.commercetools.history.models.common.Reference getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     * value of distributionChannel}
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
