
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantUnpublishedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantUnpublishedMessagePayload variantUnpublishedMessagePayload = VariantUnpublishedMessagePayload.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantUnpublishedMessagePayloadBuilder implements Builder<VariantUnpublishedMessagePayload> {

    private com.commercetools.api.models.product.ProductReference product;

    /**
     *  <p>Reference to the Product containing the Variant that was unpublished.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public VariantUnpublishedMessagePayloadBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Product containing the Variant that was unpublished.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public VariantUnpublishedMessagePayloadBuilder withProduct(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReference> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Product containing the Variant that was unpublished.</p>
     * @param product value to be set
     * @return Builder
     */

    public VariantUnpublishedMessagePayloadBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>Reference to the Product containing the Variant that was unpublished.</p>
     * @return product
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     * builds VariantUnpublishedMessagePayload with checking for non-null required values
     * @return VariantUnpublishedMessagePayload
     */
    public VariantUnpublishedMessagePayload build() {
        Objects.requireNonNull(product, VariantUnpublishedMessagePayload.class + ": product is missing");
        return new VariantUnpublishedMessagePayloadImpl(product);
    }

    /**
     * builds VariantUnpublishedMessagePayload without checking for non-null required values
     * @return VariantUnpublishedMessagePayload
     */
    public VariantUnpublishedMessagePayload buildUnchecked() {
        return new VariantUnpublishedMessagePayloadImpl(product);
    }

    /**
     * factory method for an instance of VariantUnpublishedMessagePayloadBuilder
     * @return builder
     */
    public static VariantUnpublishedMessagePayloadBuilder of() {
        return new VariantUnpublishedMessagePayloadBuilder();
    }

    /**
     * create builder for VariantUnpublishedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantUnpublishedMessagePayloadBuilder of(final VariantUnpublishedMessagePayload template) {
        VariantUnpublishedMessagePayloadBuilder builder = new VariantUnpublishedMessagePayloadBuilder();
        builder.product = template.getProduct();
        return builder;
    }

}
