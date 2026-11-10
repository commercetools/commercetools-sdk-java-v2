
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantPublishedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantPublishedMessagePayload variantPublishedMessagePayload = VariantPublishedMessagePayload.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantPublishedMessagePayloadBuilder implements Builder<VariantPublishedMessagePayload> {

    private com.commercetools.api.models.product.ProductReference product;

    /**
     *  <p>Reference to the Product containing the Variant.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public VariantPublishedMessagePayloadBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Product containing the Variant.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public VariantPublishedMessagePayloadBuilder withProduct(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReference> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Product containing the Variant.</p>
     * @param product value to be set
     * @return Builder
     */

    public VariantPublishedMessagePayloadBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>Reference to the Product containing the Variant.</p>
     * @return product
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     * builds VariantPublishedMessagePayload with checking for non-null required values
     * @return VariantPublishedMessagePayload
     */
    public VariantPublishedMessagePayload build() {
        Objects.requireNonNull(product, VariantPublishedMessagePayload.class + ": product is missing");
        return new VariantPublishedMessagePayloadImpl(product);
    }

    /**
     * builds VariantPublishedMessagePayload without checking for non-null required values
     * @return VariantPublishedMessagePayload
     */
    public VariantPublishedMessagePayload buildUnchecked() {
        return new VariantPublishedMessagePayloadImpl(product);
    }

    /**
     * factory method for an instance of VariantPublishedMessagePayloadBuilder
     * @return builder
     */
    public static VariantPublishedMessagePayloadBuilder of() {
        return new VariantPublishedMessagePayloadBuilder();
    }

    /**
     * create builder for VariantPublishedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantPublishedMessagePayloadBuilder of(final VariantPublishedMessagePayload template) {
        VariantPublishedMessagePayloadBuilder builder = new VariantPublishedMessagePayloadBuilder();
        builder.product = template.getProduct();
        return builder;
    }

}
