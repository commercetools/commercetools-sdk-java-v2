
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductPriceAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceAddedMessagePayload productPriceAddedMessagePayload = ProductPriceAddedMessagePayload.builder()
 *             .variantId(0.3)
 *             .price(priceBuilder -> priceBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPriceAddedMessagePayloadBuilder implements Builder<ProductPriceAddedMessagePayload> {

    private Long variantId;

    private com.commercetools.api.models.common.Price price;

    private Boolean staged;

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> for which the Price was added.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductPriceAddedMessagePayloadBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The Embedded Price that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @param builder function to build the price value
     * @return Builder
     */

    public ProductPriceAddedMessagePayloadBuilder price(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Embedded Price that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @param builder function to build the price value
     * @return Builder
     */

    public ProductPriceAddedMessagePayloadBuilder withPrice(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.Price> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.PriceBuilder.of());
        return this;
    }

    /**
     *  <p>The Embedded Price that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @param price value to be set
     * @return Builder
     */

    public ProductPriceAddedMessagePayloadBuilder price(final com.commercetools.api.models.common.Price price) {
        this.price = price;
        return this;
    }

    /**
     *  <p>Whether the update was only applied to the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">Product Projection</a>.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductPriceAddedMessagePayloadBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> for which the Price was added.</p>
     * @return variantId
     */

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>The Embedded Price that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @return price
     */

    public com.commercetools.api.models.common.Price getPrice() {
        return this.price;
    }

    /**
     *  <p>Whether the update was only applied to the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">Product Projection</a>.</p>
     * @return staged
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds ProductPriceAddedMessagePayload with checking for non-null required values
     * @return ProductPriceAddedMessagePayload
     */
    public ProductPriceAddedMessagePayload build() {
        Objects.requireNonNull(variantId, ProductPriceAddedMessagePayload.class + ": variantId is missing");
        Objects.requireNonNull(price, ProductPriceAddedMessagePayload.class + ": price is missing");
        Objects.requireNonNull(staged, ProductPriceAddedMessagePayload.class + ": staged is missing");
        return new ProductPriceAddedMessagePayloadImpl(variantId, price, staged);
    }

    /**
     * builds ProductPriceAddedMessagePayload without checking for non-null required values
     * @return ProductPriceAddedMessagePayload
     */
    public ProductPriceAddedMessagePayload buildUnchecked() {
        return new ProductPriceAddedMessagePayloadImpl(variantId, price, staged);
    }

    /**
     * factory method for an instance of ProductPriceAddedMessagePayloadBuilder
     * @return builder
     */
    public static ProductPriceAddedMessagePayloadBuilder of() {
        return new ProductPriceAddedMessagePayloadBuilder();
    }

    /**
     * create builder for ProductPriceAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceAddedMessagePayloadBuilder of(final ProductPriceAddedMessagePayload template) {
        ProductPriceAddedMessagePayloadBuilder builder = new ProductPriceAddedMessagePayloadBuilder();
        builder.variantId = template.getVariantId();
        builder.price = template.getPrice();
        builder.staged = template.getStaged();
        return builder;
    }

}
