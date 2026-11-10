
package com.commercetools.importapi.models.importrequests;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringImportRequestBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringImportRequest productTailoringImportRequest = ProductTailoringImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringImportRequestBuilder implements Builder<ProductTailoringImportRequest> {

    private java.util.List<com.commercetools.importapi.models.product_tailoring.ProductTailoringImport> resources;

    /**
     *  <p>The Product Tailoring import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */

    public ProductTailoringImportRequestBuilder resources(
            final com.commercetools.importapi.models.product_tailoring.ProductTailoringImport... resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
        return this;
    }

    /**
     *  <p>The Product Tailoring import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */

    public ProductTailoringImportRequestBuilder resources(
            final java.util.List<com.commercetools.importapi.models.product_tailoring.ProductTailoringImport> resources) {
        this.resources = resources;
        return this;
    }

    /**
     *  <p>The Product Tailoring import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */

    public ProductTailoringImportRequestBuilder plusResources(
            final com.commercetools.importapi.models.product_tailoring.ProductTailoringImport... resources) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.addAll(Arrays.asList(resources));
        return this;
    }

    /**
     *  <p>The Product Tailoring import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public ProductTailoringImportRequestBuilder plusResources(
            Function<com.commercetools.importapi.models.product_tailoring.ProductTailoringImportBuilder, com.commercetools.importapi.models.product_tailoring.ProductTailoringImportBuilder> builder) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(
            builder.apply(com.commercetools.importapi.models.product_tailoring.ProductTailoringImportBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>The Product Tailoring import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public ProductTailoringImportRequestBuilder withResources(
            Function<com.commercetools.importapi.models.product_tailoring.ProductTailoringImportBuilder, com.commercetools.importapi.models.product_tailoring.ProductTailoringImportBuilder> builder) {
        this.resources = new ArrayList<>();
        this.resources.add(
            builder.apply(com.commercetools.importapi.models.product_tailoring.ProductTailoringImportBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>The Product Tailoring import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public ProductTailoringImportRequestBuilder addResources(
            Function<com.commercetools.importapi.models.product_tailoring.ProductTailoringImportBuilder, com.commercetools.importapi.models.product_tailoring.ProductTailoringImport> builder) {
        return plusResources(
            builder.apply(com.commercetools.importapi.models.product_tailoring.ProductTailoringImportBuilder.of()));
    }

    /**
     *  <p>The Product Tailoring import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public ProductTailoringImportRequestBuilder setResources(
            Function<com.commercetools.importapi.models.product_tailoring.ProductTailoringImportBuilder, com.commercetools.importapi.models.product_tailoring.ProductTailoringImport> builder) {
        return resources(
            builder.apply(com.commercetools.importapi.models.product_tailoring.ProductTailoringImportBuilder.of()));
    }

    /**
     *  <p>The Product Tailoring import resources of this request.</p>
     * @return resources
     */

    public java.util.List<com.commercetools.importapi.models.product_tailoring.ProductTailoringImport> getResources() {
        return this.resources;
    }

    /**
     * builds ProductTailoringImportRequest with checking for non-null required values
     * @return ProductTailoringImportRequest
     */
    public ProductTailoringImportRequest build() {
        Objects.requireNonNull(resources, ProductTailoringImportRequest.class + ": resources is missing");
        return new ProductTailoringImportRequestImpl(resources);
    }

    /**
     * builds ProductTailoringImportRequest without checking for non-null required values
     * @return ProductTailoringImportRequest
     */
    public ProductTailoringImportRequest buildUnchecked() {
        return new ProductTailoringImportRequestImpl(resources);
    }

    /**
     * factory method for an instance of ProductTailoringImportRequestBuilder
     * @return builder
     */
    public static ProductTailoringImportRequestBuilder of() {
        return new ProductTailoringImportRequestBuilder();
    }

    /**
     * create builder for ProductTailoringImportRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringImportRequestBuilder of(final ProductTailoringImportRequest template) {
        ProductTailoringImportRequestBuilder builder = new ProductTailoringImportRequestBuilder();
        builder.resources = template.getResources();
        return builder;
    }

}
