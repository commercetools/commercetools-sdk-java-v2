
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantDeletedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantDeletedMessagePayload variantDeletedMessagePayload = VariantDeletedMessagePayload.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantDeletedMessagePayloadBuilder implements Builder<VariantDeletedMessagePayload> {

    private com.commercetools.api.models.product.ProductReference product;

    /**
     *  <p>Reference to the Product containing the Variant.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public VariantDeletedMessagePayloadBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Product containing the Variant.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public VariantDeletedMessagePayloadBuilder withProduct(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReference> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Product containing the Variant.</p>
     * @param product value to be set
     * @return Builder
     */

    public VariantDeletedMessagePayloadBuilder product(
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
     * builds VariantDeletedMessagePayload with checking for non-null required values
     * @return VariantDeletedMessagePayload
     */
    public VariantDeletedMessagePayload build() {
        Objects.requireNonNull(product, VariantDeletedMessagePayload.class + ": product is missing");
        return new VariantDeletedMessagePayloadImpl(product);
    }

    /**
     * builds VariantDeletedMessagePayload without checking for non-null required values
     * @return VariantDeletedMessagePayload
     */
    public VariantDeletedMessagePayload buildUnchecked() {
        return new VariantDeletedMessagePayloadImpl(product);
    }

    /**
     * factory method for an instance of VariantDeletedMessagePayloadBuilder
     * @return builder
     */
    public static VariantDeletedMessagePayloadBuilder of() {
        return new VariantDeletedMessagePayloadBuilder();
    }

    /**
     * create builder for VariantDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantDeletedMessagePayloadBuilder of(final VariantDeletedMessagePayload template) {
        VariantDeletedMessagePayloadBuilder builder = new VariantDeletedMessagePayloadBuilder();
        builder.product = template.getProduct();
        return builder;
    }

}
