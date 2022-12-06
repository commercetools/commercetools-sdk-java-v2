
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductPriceSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceSetMessagePayload productPriceSetMessagePayload = ProductPriceSetMessagePayload.builder()
 *             .variantId(0.3)
 *             .plusPrices(pricesBuilder -> pricesBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPriceSetMessagePayloadBuilder implements Builder<ProductPriceSetMessagePayload> {

    private Long variantId;

    private java.util.List<com.commercetools.api.models.common.Price> prices;

    private Boolean staged;

    /**
     *  <p>Unique identifier of the ProductVariant for which the Price was set.</p>
     */

    public ProductPriceSetMessagePayloadBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The Embedded Prices that were set on the ProductVariant.</p>
     */

    public ProductPriceSetMessagePayloadBuilder prices(final com.commercetools.api.models.common.Price... prices) {
        this.prices = new ArrayList<>(Arrays.asList(prices));
        return this;
    }

    /**
     *  <p>The Embedded Prices that were set on the ProductVariant.</p>
     */

    public ProductPriceSetMessagePayloadBuilder prices(
            final java.util.List<com.commercetools.api.models.common.Price> prices) {
        this.prices = prices;
        return this;
    }

    /**
     *  <p>The Embedded Prices that were set on the ProductVariant.</p>
     */

    public ProductPriceSetMessagePayloadBuilder plusPrices(final com.commercetools.api.models.common.Price... prices) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.addAll(Arrays.asList(prices));
        return this;
    }

    /**
     *  <p>The Embedded Prices that were set on the ProductVariant.</p>
     */

    public ProductPriceSetMessagePayloadBuilder plusPrices(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.add(builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Embedded Prices that were set on the ProductVariant.</p>
     */

    public ProductPriceSetMessagePayloadBuilder withPrices(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.prices = new ArrayList<>();
        this.prices.add(builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     */

    public ProductPriceSetMessagePayloadBuilder staged(final Boolean staged) {
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

    public ProductPriceSetMessagePayload build() {
        Objects.requireNonNull(variantId, ProductPriceSetMessagePayload.class + ": variantId is missing");
        Objects.requireNonNull(prices, ProductPriceSetMessagePayload.class + ": prices is missing");
        Objects.requireNonNull(staged, ProductPriceSetMessagePayload.class + ": staged is missing");
        return new ProductPriceSetMessagePayloadImpl(variantId, prices, staged);
    }

    /**
     * builds ProductPriceSetMessagePayload without checking for non null required values
     */
    public ProductPriceSetMessagePayload buildUnchecked() {
        return new ProductPriceSetMessagePayloadImpl(variantId, prices, staged);
    }

    public static ProductPriceSetMessagePayloadBuilder of() {
        return new ProductPriceSetMessagePayloadBuilder();
    }

    public static ProductPriceSetMessagePayloadBuilder of(final ProductPriceSetMessagePayload template) {
        ProductPriceSetMessagePayloadBuilder builder = new ProductPriceSetMessagePayloadBuilder();
        builder.variantId = template.getVariantId();
        builder.prices = template.getPrices();
        builder.staged = template.getStaged();
        return builder;
    }

}
