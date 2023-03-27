
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductPriceDiscountsSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceDiscountsSetMessagePayload productPriceDiscountsSetMessagePayload = ProductPriceDiscountsSetMessagePayload.builder()
 *             .plusUpdatedPrices(updatedPricesBuilder -> updatedPricesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPriceDiscountsSetMessagePayloadBuilder implements Builder<ProductPriceDiscountsSetMessagePayload> {

    private java.util.List<com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice> updatedPrices;

    /**
     *  <p>Array containing details about the Embedded Prices that were updated.</p>
     * @param updatedPrices value to be set
     * @return Builder
     */

    public ProductPriceDiscountsSetMessagePayloadBuilder updatedPrices(
            final com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice... updatedPrices) {
        this.updatedPrices = new ArrayList<>(Arrays.asList(updatedPrices));
        return this;
    }

    /**
     *  <p>Array containing details about the Embedded Prices that were updated.</p>
     * @param updatedPrices value to be set
     * @return Builder
     */

    public ProductPriceDiscountsSetMessagePayloadBuilder updatedPrices(
            final java.util.List<com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice> updatedPrices) {
        this.updatedPrices = updatedPrices;
        return this;
    }

    /**
     *  <p>Array containing details about the Embedded Prices that were updated.</p>
     * @param updatedPrices value to be set
     * @return Builder
     */

    public ProductPriceDiscountsSetMessagePayloadBuilder plusUpdatedPrices(
            final com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice... updatedPrices) {
        if (this.updatedPrices == null) {
            this.updatedPrices = new ArrayList<>();
        }
        this.updatedPrices.addAll(Arrays.asList(updatedPrices));
        return this;
    }

    /**
     *  <p>Array containing details about the Embedded Prices that were updated.</p>
     * @param builder function to build the updatedPrices value
     * @return Builder
     */

    public ProductPriceDiscountsSetMessagePayloadBuilder plusUpdatedPrices(
            Function<com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPriceBuilder, com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPriceBuilder> builder) {
        if (this.updatedPrices == null) {
            this.updatedPrices = new ArrayList<>();
        }
        this.updatedPrices.add(
            builder.apply(com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPriceBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Array containing details about the Embedded Prices that were updated.</p>
     * @param builder function to build the updatedPrices value
     * @return Builder
     */

    public ProductPriceDiscountsSetMessagePayloadBuilder withUpdatedPrices(
            Function<com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPriceBuilder, com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPriceBuilder> builder) {
        this.updatedPrices = new ArrayList<>();
        this.updatedPrices.add(
            builder.apply(com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPriceBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Array containing details about the Embedded Prices that were updated.</p>
     * @return updatedPrices
     */

    public java.util.List<com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice> getUpdatedPrices() {
        return this.updatedPrices;
    }

    /**
     * builds ProductPriceDiscountsSetMessagePayload with checking for non-null required values
     * @return ProductPriceDiscountsSetMessagePayload
     */
    public ProductPriceDiscountsSetMessagePayload build() {
        Objects.requireNonNull(updatedPrices,
            ProductPriceDiscountsSetMessagePayload.class + ": updatedPrices is missing");
        return new ProductPriceDiscountsSetMessagePayloadImpl(updatedPrices);
    }

    /**
     * builds ProductPriceDiscountsSetMessagePayload without checking for non-null required values
     * @return ProductPriceDiscountsSetMessagePayload
     */
    public ProductPriceDiscountsSetMessagePayload buildUnchecked() {
        return new ProductPriceDiscountsSetMessagePayloadImpl(updatedPrices);
    }

    /**
     * factory method for an instance of ProductPriceDiscountsSetMessagePayloadBuilder
     * @return builder
     */
    public static ProductPriceDiscountsSetMessagePayloadBuilder of() {
        return new ProductPriceDiscountsSetMessagePayloadBuilder();
    }

    /**
     * create builder for ProductPriceDiscountsSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceDiscountsSetMessagePayloadBuilder of(
            final ProductPriceDiscountsSetMessagePayload template) {
        ProductPriceDiscountsSetMessagePayloadBuilder builder = new ProductPriceDiscountsSetMessagePayloadBuilder();
        builder.updatedPrices = template.getUpdatedPrices();
        return builder;
    }

}
