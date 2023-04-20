
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductPriceRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceRemovedMessagePayload productPriceRemovedMessagePayload = ProductPriceRemovedMessagePayload.builder()
 *             .variantId(0.3)
 *             .price(priceBuilder -> priceBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPriceRemovedMessagePayloadBuilder implements Builder<ProductPriceRemovedMessagePayload> {

    private Long variantId;

    private com.commercetools.api.models.common.Price price;

    private Boolean staged;

    /**
     *  <p>Unique identifier of the ProductVariant for which the Price was removed.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductPriceRemovedMessagePayloadBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The Embedded Price that was removed from the ProductVariant.</p>
     * @param builder function to build the price value
     * @return Builder
     */

    public ProductPriceRemovedMessagePayloadBuilder price(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Embedded Price that was removed from the ProductVariant.</p>
     * @param builder function to build the price value
     * @return Builder
     */

    public ProductPriceRemovedMessagePayloadBuilder withPrice(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.Price> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.PriceBuilder.of());
        return this;
    }

    /**
     *  <p>The Embedded Price that was removed from the ProductVariant.</p>
     * @param price value to be set
     * @return Builder
     */

    public ProductPriceRemovedMessagePayloadBuilder price(final com.commercetools.api.models.common.Price price) {
        this.price = price;
        return this;
    }

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductPriceRemovedMessagePayloadBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Unique identifier of the ProductVariant for which the Price was removed.</p>
     * @return variantId
     */

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>The Embedded Price that was removed from the ProductVariant.</p>
     * @return price
     */

    public com.commercetools.api.models.common.Price getPrice() {
        return this.price;
    }

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @return staged
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds ProductPriceRemovedMessagePayload with checking for non-null required values
     * @return ProductPriceRemovedMessagePayload
     */
    public ProductPriceRemovedMessagePayload build() {
        Objects.requireNonNull(variantId, ProductPriceRemovedMessagePayload.class + ": variantId is missing");
        Objects.requireNonNull(price, ProductPriceRemovedMessagePayload.class + ": price is missing");
        Objects.requireNonNull(staged, ProductPriceRemovedMessagePayload.class + ": staged is missing");
        return new ProductPriceRemovedMessagePayloadImpl(variantId, price, staged);
    }

    /**
     * builds ProductPriceRemovedMessagePayload without checking for non-null required values
     * @return ProductPriceRemovedMessagePayload
     */
    public ProductPriceRemovedMessagePayload buildUnchecked() {
        return new ProductPriceRemovedMessagePayloadImpl(variantId, price, staged);
    }

    /**
     * factory method for an instance of ProductPriceRemovedMessagePayloadBuilder
     * @return builder
     */
    public static ProductPriceRemovedMessagePayloadBuilder of() {
        return new ProductPriceRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for ProductPriceRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceRemovedMessagePayloadBuilder of(final ProductPriceRemovedMessagePayload template) {
        ProductPriceRemovedMessagePayloadBuilder builder = new ProductPriceRemovedMessagePayloadBuilder();
        builder.variantId = template.getVariantId();
        builder.price = template.getPrice();
        builder.staged = template.getStaged();
        return builder;
    }

}
