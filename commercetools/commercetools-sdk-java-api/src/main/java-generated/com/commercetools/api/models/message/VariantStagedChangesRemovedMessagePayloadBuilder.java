
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantStagedChangesRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantStagedChangesRemovedMessagePayload variantStagedChangesRemovedMessagePayload = VariantStagedChangesRemovedMessagePayload.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantStagedChangesRemovedMessagePayloadBuilder
        implements Builder<VariantStagedChangesRemovedMessagePayload> {

    private com.commercetools.api.models.product.ProductReference product;

    /**
     *  <p>Reference to the Product containing the Variant.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public VariantStagedChangesRemovedMessagePayloadBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Product containing the Variant.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public VariantStagedChangesRemovedMessagePayloadBuilder withProduct(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReference> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Product containing the Variant.</p>
     * @param product value to be set
     * @return Builder
     */

    public VariantStagedChangesRemovedMessagePayloadBuilder product(
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
     * builds VariantStagedChangesRemovedMessagePayload with checking for non-null required values
     * @return VariantStagedChangesRemovedMessagePayload
     */
    public VariantStagedChangesRemovedMessagePayload build() {
        Objects.requireNonNull(product, VariantStagedChangesRemovedMessagePayload.class + ": product is missing");
        return new VariantStagedChangesRemovedMessagePayloadImpl(product);
    }

    /**
     * builds VariantStagedChangesRemovedMessagePayload without checking for non-null required values
     * @return VariantStagedChangesRemovedMessagePayload
     */
    public VariantStagedChangesRemovedMessagePayload buildUnchecked() {
        return new VariantStagedChangesRemovedMessagePayloadImpl(product);
    }

    /**
     * factory method for an instance of VariantStagedChangesRemovedMessagePayloadBuilder
     * @return builder
     */
    public static VariantStagedChangesRemovedMessagePayloadBuilder of() {
        return new VariantStagedChangesRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for VariantStagedChangesRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantStagedChangesRemovedMessagePayloadBuilder of(
            final VariantStagedChangesRemovedMessagePayload template) {
        VariantStagedChangesRemovedMessagePayloadBuilder builder = new VariantStagedChangesRemovedMessagePayloadBuilder();
        builder.product = template.getProduct();
        return builder;
    }

}
