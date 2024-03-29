
package com.commercetools.importapi.models.importrequests;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDraftImportRequestBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDraftImportRequest productDraftImportRequest = ProductDraftImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDraftImportRequestBuilder implements Builder<ProductDraftImportRequest> {

    private java.util.List<com.commercetools.importapi.models.productdrafts.ProductDraftImport> resources;

    /**
     *  <p>The product draft import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */

    public ProductDraftImportRequestBuilder resources(
            final com.commercetools.importapi.models.productdrafts.ProductDraftImport... resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
        return this;
    }

    /**
     *  <p>The product draft import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */

    public ProductDraftImportRequestBuilder resources(
            final java.util.List<com.commercetools.importapi.models.productdrafts.ProductDraftImport> resources) {
        this.resources = resources;
        return this;
    }

    /**
     *  <p>The product draft import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */

    public ProductDraftImportRequestBuilder plusResources(
            final com.commercetools.importapi.models.productdrafts.ProductDraftImport... resources) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.addAll(Arrays.asList(resources));
        return this;
    }

    /**
     *  <p>The product draft import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public ProductDraftImportRequestBuilder plusResources(
            Function<com.commercetools.importapi.models.productdrafts.ProductDraftImportBuilder, com.commercetools.importapi.models.productdrafts.ProductDraftImportBuilder> builder) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(
            builder.apply(com.commercetools.importapi.models.productdrafts.ProductDraftImportBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The product draft import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public ProductDraftImportRequestBuilder withResources(
            Function<com.commercetools.importapi.models.productdrafts.ProductDraftImportBuilder, com.commercetools.importapi.models.productdrafts.ProductDraftImportBuilder> builder) {
        this.resources = new ArrayList<>();
        this.resources.add(
            builder.apply(com.commercetools.importapi.models.productdrafts.ProductDraftImportBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The product draft import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public ProductDraftImportRequestBuilder addResources(
            Function<com.commercetools.importapi.models.productdrafts.ProductDraftImportBuilder, com.commercetools.importapi.models.productdrafts.ProductDraftImport> builder) {
        return plusResources(
            builder.apply(com.commercetools.importapi.models.productdrafts.ProductDraftImportBuilder.of()));
    }

    /**
     *  <p>The product draft import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public ProductDraftImportRequestBuilder setResources(
            Function<com.commercetools.importapi.models.productdrafts.ProductDraftImportBuilder, com.commercetools.importapi.models.productdrafts.ProductDraftImport> builder) {
        return resources(
            builder.apply(com.commercetools.importapi.models.productdrafts.ProductDraftImportBuilder.of()));
    }

    /**
     *  <p>The product draft import resources of this request.</p>
     * @return resources
     */

    public java.util.List<com.commercetools.importapi.models.productdrafts.ProductDraftImport> getResources() {
        return this.resources;
    }

    /**
     * builds ProductDraftImportRequest with checking for non-null required values
     * @return ProductDraftImportRequest
     */
    public ProductDraftImportRequest build() {
        Objects.requireNonNull(resources, ProductDraftImportRequest.class + ": resources is missing");
        return new ProductDraftImportRequestImpl(resources);
    }

    /**
     * builds ProductDraftImportRequest without checking for non-null required values
     * @return ProductDraftImportRequest
     */
    public ProductDraftImportRequest buildUnchecked() {
        return new ProductDraftImportRequestImpl(resources);
    }

    /**
     * factory method for an instance of ProductDraftImportRequestBuilder
     * @return builder
     */
    public static ProductDraftImportRequestBuilder of() {
        return new ProductDraftImportRequestBuilder();
    }

    /**
     * create builder for ProductDraftImportRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDraftImportRequestBuilder of(final ProductDraftImportRequest template) {
        ProductDraftImportRequestBuilder builder = new ProductDraftImportRequestBuilder();
        builder.resources = template.getResources();
        return builder;
    }

}
