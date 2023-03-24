
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductPricesSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPricesSetMessagePayload productPricesSetMessagePayload = ProductPricesSetMessagePayload.builder()
 *             .variantId(0.3)
 *             .plusPrices(pricesBuilder -> pricesBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPricesSetMessagePayloadBuilder implements Builder<ProductPricesSetMessagePayload> {

    private Long variantId;

    private java.util.List<com.commercetools.api.models.common.Price> prices;

    private Boolean staged;

    /**
     *  <p>Unique identifier of the ProductVariant for which the Price was set.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductPricesSetMessagePayloadBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The Embedded Prices that were set on the ProductVariant.</p>
     * @param prices value to be set
     * @return Builder
     */

    public ProductPricesSetMessagePayloadBuilder prices(final com.commercetools.api.models.common.Price... prices) {
        this.prices = new ArrayList<>(Arrays.asList(prices));
        return this;
    }

    /**
     *  <p>The Embedded Prices that were set on the ProductVariant.</p>
     * @param prices value to be set
     * @return Builder
     */

    public ProductPricesSetMessagePayloadBuilder prices(
            final java.util.List<com.commercetools.api.models.common.Price> prices) {
        this.prices = prices;
        return this;
    }

    /**
     *  <p>The Embedded Prices that were set on the ProductVariant.</p>
     * @param prices value to be set
     * @return Builder
     */

    public ProductPricesSetMessagePayloadBuilder plusPrices(final com.commercetools.api.models.common.Price... prices) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.addAll(Arrays.asList(prices));
        return this;
    }

    /**
     *  <p>The Embedded Prices that were set on the ProductVariant.</p>
     * @param builder function to build the prices value
     * @return Builder
     */

    public ProductPricesSetMessagePayloadBuilder plusPrices(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.add(builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Embedded Prices that were set on the ProductVariant.</p>
     * @param builder function to build the prices value
     * @return Builder
     */

    public ProductPricesSetMessagePayloadBuilder withPrices(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.prices = new ArrayList<>();
        this.prices.add(builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductPricesSetMessagePayloadBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public Long getVariantId() {
        return this.variantId;
    }

    public java.util.List<com.commercetools.api.models.common.Price> getPrices() {
        return this.prices;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds ProductPricesSetMessagePayload with checking for non-null required values
     * @return ProductPricesSetMessagePayload
     */
    public ProductPricesSetMessagePayload build() {
        Objects.requireNonNull(variantId, ProductPricesSetMessagePayload.class + ": variantId is missing");
        Objects.requireNonNull(prices, ProductPricesSetMessagePayload.class + ": prices is missing");
        Objects.requireNonNull(staged, ProductPricesSetMessagePayload.class + ": staged is missing");
        return new ProductPricesSetMessagePayloadImpl(variantId, prices, staged);
    }

    /**
     * builds ProductPricesSetMessagePayload without checking for non-null required values
     * @return ProductPricesSetMessagePayload
     */
    public ProductPricesSetMessagePayload buildUnchecked() {
        return new ProductPricesSetMessagePayloadImpl(variantId, prices, staged);
    }

    public static ProductPricesSetMessagePayloadBuilder of() {
        return new ProductPricesSetMessagePayloadBuilder();
    }

    public static ProductPricesSetMessagePayloadBuilder of(final ProductPricesSetMessagePayload template) {
        ProductPricesSetMessagePayloadBuilder builder = new ProductPricesSetMessagePayloadBuilder();
        builder.variantId = template.getVariantId();
        builder.prices = template.getPrices();
        builder.staged = template.getStaged();
        return builder;
    }

}
