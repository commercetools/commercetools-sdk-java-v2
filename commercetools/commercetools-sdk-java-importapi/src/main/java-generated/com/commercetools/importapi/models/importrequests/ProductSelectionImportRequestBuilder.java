
package com.commercetools.importapi.models.importrequests;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionImportRequestBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionImportRequest productSelectionImportRequest = ProductSelectionImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionImportRequestBuilder implements Builder<ProductSelectionImportRequest> {

    private java.util.List<com.commercetools.importapi.models.product_selections.ProductSelectionImport> resources;

    /**
     *  <p>The Product Selection import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */

    public ProductSelectionImportRequestBuilder resources(
            final com.commercetools.importapi.models.product_selections.ProductSelectionImport... resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
        return this;
    }

    /**
     *  <p>The Product Selection import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */

    public ProductSelectionImportRequestBuilder resources(
            final java.util.List<com.commercetools.importapi.models.product_selections.ProductSelectionImport> resources) {
        this.resources = resources;
        return this;
    }

    /**
     *  <p>The Product Selection import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */

    public ProductSelectionImportRequestBuilder plusResources(
            final com.commercetools.importapi.models.product_selections.ProductSelectionImport... resources) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.addAll(Arrays.asList(resources));
        return this;
    }

    /**
     *  <p>The Product Selection import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public ProductSelectionImportRequestBuilder plusResources(
            Function<com.commercetools.importapi.models.product_selections.ProductSelectionImportBuilder, com.commercetools.importapi.models.product_selections.ProductSelectionImportBuilder> builder) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(
            builder.apply(com.commercetools.importapi.models.product_selections.ProductSelectionImportBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>The Product Selection import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public ProductSelectionImportRequestBuilder withResources(
            Function<com.commercetools.importapi.models.product_selections.ProductSelectionImportBuilder, com.commercetools.importapi.models.product_selections.ProductSelectionImportBuilder> builder) {
        this.resources = new ArrayList<>();
        this.resources.add(
            builder.apply(com.commercetools.importapi.models.product_selections.ProductSelectionImportBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>The Product Selection import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public ProductSelectionImportRequestBuilder addResources(
            Function<com.commercetools.importapi.models.product_selections.ProductSelectionImportBuilder, com.commercetools.importapi.models.product_selections.ProductSelectionImport> builder) {
        return plusResources(
            builder.apply(com.commercetools.importapi.models.product_selections.ProductSelectionImportBuilder.of()));
    }

    /**
     *  <p>The Product Selection import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public ProductSelectionImportRequestBuilder setResources(
            Function<com.commercetools.importapi.models.product_selections.ProductSelectionImportBuilder, com.commercetools.importapi.models.product_selections.ProductSelectionImport> builder) {
        return resources(
            builder.apply(com.commercetools.importapi.models.product_selections.ProductSelectionImportBuilder.of()));
    }

    /**
     *  <p>The Product Selection import resources of this request.</p>
     * @return resources
     */

    public java.util.List<com.commercetools.importapi.models.product_selections.ProductSelectionImport> getResources() {
        return this.resources;
    }

    /**
     * builds ProductSelectionImportRequest with checking for non-null required values
     * @return ProductSelectionImportRequest
     */
    public ProductSelectionImportRequest build() {
        Objects.requireNonNull(resources, ProductSelectionImportRequest.class + ": resources is missing");
        return new ProductSelectionImportRequestImpl(resources);
    }

    /**
     * builds ProductSelectionImportRequest without checking for non-null required values
     * @return ProductSelectionImportRequest
     */
    public ProductSelectionImportRequest buildUnchecked() {
        return new ProductSelectionImportRequestImpl(resources);
    }

    /**
     * factory method for an instance of ProductSelectionImportRequestBuilder
     * @return builder
     */
    public static ProductSelectionImportRequestBuilder of() {
        return new ProductSelectionImportRequestBuilder();
    }

    /**
     * create builder for ProductSelectionImportRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionImportRequestBuilder of(final ProductSelectionImportRequest template) {
        ProductSelectionImportRequestBuilder builder = new ProductSelectionImportRequestBuilder();
        builder.resources = template.getResources();
        return builder;
    }

}
