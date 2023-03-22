
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductPriceChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceChangedMessagePayload productPriceChangedMessagePayload = ProductPriceChangedMessagePayload.builder()
 *             .variantId(0.3)
 *             .oldPrice(oldPriceBuilder -> oldPriceBuilder)
 *             .newPrice(newPriceBuilder -> newPriceBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPriceChangedMessagePayloadBuilder implements Builder<ProductPriceChangedMessagePayload> {

    private Long variantId;

    private com.commercetools.api.models.common.Price oldPrice;

    private com.commercetools.api.models.common.Price newPrice;

    private Boolean staged;

    @Nullable
    private com.commercetools.api.models.common.Price oldStagedPrice;

    /**
     *  <p>Unique identifier of the ProductVariant for which the Price was changed.</p>
     * @param variantId
     * @return Builder
     */

    public ProductPriceChangedMessagePayloadBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The current Embedded Price before the Change Embedded Price update action.</p>
     * @return Builder
     */

    public ProductPriceChangedMessagePayloadBuilder oldPrice(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.oldPrice = builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The current Embedded Price before the Change Embedded Price update action.</p>
     * @param oldPrice
     * @return Builder
     */

    public ProductPriceChangedMessagePayloadBuilder oldPrice(final com.commercetools.api.models.common.Price oldPrice) {
        this.oldPrice = oldPrice;
        return this;
    }

    /**
     *  <p>The Embedded Price after the Change Embedded Price update action.</p>
     * @return Builder
     */

    public ProductPriceChangedMessagePayloadBuilder newPrice(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.newPrice = builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Embedded Price after the Change Embedded Price update action.</p>
     * @param newPrice
     * @return Builder
     */

    public ProductPriceChangedMessagePayloadBuilder newPrice(final com.commercetools.api.models.common.Price newPrice) {
        this.newPrice = newPrice;
        return this;
    }

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @param staged
     * @return Builder
     */

    public ProductPriceChangedMessagePayloadBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The staged Embedded Price before the Change Embedded Price update action.</p>
     * @return Builder
     */

    public ProductPriceChangedMessagePayloadBuilder oldStagedPrice(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.oldStagedPrice = builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The staged Embedded Price before the Change Embedded Price update action.</p>
     * @param oldStagedPrice
     * @return Builder
     */

    public ProductPriceChangedMessagePayloadBuilder oldStagedPrice(
            @Nullable final com.commercetools.api.models.common.Price oldStagedPrice) {
        this.oldStagedPrice = oldStagedPrice;
        return this;
    }

    public Long getVariantId() {
        return this.variantId;
    }

    public com.commercetools.api.models.common.Price getOldPrice() {
        return this.oldPrice;
    }

    public com.commercetools.api.models.common.Price getNewPrice() {
        return this.newPrice;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    @Nullable
    public com.commercetools.api.models.common.Price getOldStagedPrice() {
        return this.oldStagedPrice;
    }

    public ProductPriceChangedMessagePayload build() {
        Objects.requireNonNull(variantId, ProductPriceChangedMessagePayload.class + ": variantId is missing");
        Objects.requireNonNull(oldPrice, ProductPriceChangedMessagePayload.class + ": oldPrice is missing");
        Objects.requireNonNull(newPrice, ProductPriceChangedMessagePayload.class + ": newPrice is missing");
        Objects.requireNonNull(staged, ProductPriceChangedMessagePayload.class + ": staged is missing");
        return new ProductPriceChangedMessagePayloadImpl(variantId, oldPrice, newPrice, staged, oldStagedPrice);
    }

    /**
     * builds ProductPriceChangedMessagePayload without checking for non null required values
     */
    public ProductPriceChangedMessagePayload buildUnchecked() {
        return new ProductPriceChangedMessagePayloadImpl(variantId, oldPrice, newPrice, staged, oldStagedPrice);
    }

    public static ProductPriceChangedMessagePayloadBuilder of() {
        return new ProductPriceChangedMessagePayloadBuilder();
    }

    public static ProductPriceChangedMessagePayloadBuilder of(final ProductPriceChangedMessagePayload template) {
        ProductPriceChangedMessagePayloadBuilder builder = new ProductPriceChangedMessagePayloadBuilder();
        builder.variantId = template.getVariantId();
        builder.oldPrice = template.getOldPrice();
        builder.newPrice = template.getNewPrice();
        builder.staged = template.getStaged();
        builder.oldStagedPrice = template.getOldStagedPrice();
        return builder;
    }

}
