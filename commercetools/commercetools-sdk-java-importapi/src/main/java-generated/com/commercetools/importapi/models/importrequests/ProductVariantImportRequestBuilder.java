
package com.commercetools.importapi.models.importrequests;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantImportRequestBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantImportRequest productVariantImportRequest = ProductVariantImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantImportRequestBuilder implements Builder<ProductVariantImportRequest> {

    private java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantImport> resources;

    /**
     *  <p>The product variant import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */

    public ProductVariantImportRequestBuilder resources(
            final com.commercetools.importapi.models.productvariants.ProductVariantImport... resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
        return this;
    }

    /**
     *  <p>The product variant import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */

    public ProductVariantImportRequestBuilder resources(
            final java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantImport> resources) {
        this.resources = resources;
        return this;
    }

    /**
     *  <p>The product variant import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */

    public ProductVariantImportRequestBuilder plusResources(
            final com.commercetools.importapi.models.productvariants.ProductVariantImport... resources) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.addAll(Arrays.asList(resources));
        return this;
    }

    /**
     *  <p>The product variant import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public ProductVariantImportRequestBuilder plusResources(
            Function<com.commercetools.importapi.models.productvariants.ProductVariantImportBuilder, com.commercetools.importapi.models.productvariants.ProductVariantImportBuilder> builder) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(
            builder.apply(com.commercetools.importapi.models.productvariants.ProductVariantImportBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The product variant import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public ProductVariantImportRequestBuilder withResources(
            Function<com.commercetools.importapi.models.productvariants.ProductVariantImportBuilder, com.commercetools.importapi.models.productvariants.ProductVariantImportBuilder> builder) {
        this.resources = new ArrayList<>();
        this.resources.add(
            builder.apply(com.commercetools.importapi.models.productvariants.ProductVariantImportBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The product variant import resources of this request.</p>
     * @return resources
     */

    public java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantImport> getResources() {
        return this.resources;
    }

    /**
     * builds ProductVariantImportRequest with checking for non-null required values
     * @return ProductVariantImportRequest
     */
    public ProductVariantImportRequest build() {
        Objects.requireNonNull(resources, ProductVariantImportRequest.class + ": resources is missing");
        return new ProductVariantImportRequestImpl(resources);
    }

    /**
     * builds ProductVariantImportRequest without checking for non-null required values
     * @return ProductVariantImportRequest
     */
    public ProductVariantImportRequest buildUnchecked() {
        return new ProductVariantImportRequestImpl(resources);
    }

    /**
     * factory method for an instance of ProductVariantImportRequestBuilder
     * @return builder
     */
    public static ProductVariantImportRequestBuilder of() {
        return new ProductVariantImportRequestBuilder();
    }

    /**
     * create builder for ProductVariantImportRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantImportRequestBuilder of(final ProductVariantImportRequest template) {
        ProductVariantImportRequestBuilder builder = new ProductVariantImportRequestBuilder();
        builder.resources = template.getResources();
        return builder;
    }

}
