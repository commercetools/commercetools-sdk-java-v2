
package com.commercetools.importapi.models.importrequests;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantPatchRequestBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantPatchRequest productVariantPatchRequest = ProductVariantPatchRequest.builder()
 *             .plusPatches(patchesBuilder -> patchesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantPatchRequestBuilder implements Builder<ProductVariantPatchRequest> {

    private java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantPatch> patches;

    /**
     *  <p>The product variant patches of this request.</p>
     * @param patches value to be set
     * @return Builder
     */

    public ProductVariantPatchRequestBuilder patches(
            final com.commercetools.importapi.models.productvariants.ProductVariantPatch... patches) {
        this.patches = new ArrayList<>(Arrays.asList(patches));
        return this;
    }

    /**
     *  <p>The product variant patches of this request.</p>
     * @param patches value to be set
     * @return Builder
     */

    public ProductVariantPatchRequestBuilder patches(
            final java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantPatch> patches) {
        this.patches = patches;
        return this;
    }

    /**
     *  <p>The product variant patches of this request.</p>
     * @param patches value to be set
     * @return Builder
     */

    public ProductVariantPatchRequestBuilder plusPatches(
            final com.commercetools.importapi.models.productvariants.ProductVariantPatch... patches) {
        if (this.patches == null) {
            this.patches = new ArrayList<>();
        }
        this.patches.addAll(Arrays.asList(patches));
        return this;
    }

    /**
     *  <p>The product variant patches of this request.</p>
     * @param builder function to build the patches value
     * @return Builder
     */

    public ProductVariantPatchRequestBuilder plusPatches(
            Function<com.commercetools.importapi.models.productvariants.ProductVariantPatchBuilder, com.commercetools.importapi.models.productvariants.ProductVariantPatchBuilder> builder) {
        if (this.patches == null) {
            this.patches = new ArrayList<>();
        }
        this.patches.add(
            builder.apply(com.commercetools.importapi.models.productvariants.ProductVariantPatchBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The product variant patches of this request.</p>
     * @param builder function to build the patches value
     * @return Builder
     */

    public ProductVariantPatchRequestBuilder withPatches(
            Function<com.commercetools.importapi.models.productvariants.ProductVariantPatchBuilder, com.commercetools.importapi.models.productvariants.ProductVariantPatchBuilder> builder) {
        this.patches = new ArrayList<>();
        this.patches.add(
            builder.apply(com.commercetools.importapi.models.productvariants.ProductVariantPatchBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantPatch> getPatches() {
        return this.patches;
    }

    /**
     * builds ProductVariantPatchRequest with checking for non-null required values
     * @return ProductVariantPatchRequest
     */
    public ProductVariantPatchRequest build() {
        Objects.requireNonNull(patches, ProductVariantPatchRequest.class + ": patches is missing");
        return new ProductVariantPatchRequestImpl(patches);
    }

    /**
     * builds ProductVariantPatchRequest without checking for non-null required values
     * @return ProductVariantPatchRequest
     */
    public ProductVariantPatchRequest buildUnchecked() {
        return new ProductVariantPatchRequestImpl(patches);
    }

    public static ProductVariantPatchRequestBuilder of() {
        return new ProductVariantPatchRequestBuilder();
    }

    public static ProductVariantPatchRequestBuilder of(final ProductVariantPatchRequest template) {
        ProductVariantPatchRequestBuilder builder = new ProductVariantPatchRequestBuilder();
        builder.patches = template.getPatches();
        return builder;
    }

}
