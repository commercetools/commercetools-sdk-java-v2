
package com.commercetools.importapi.models.importrequests;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductVariantPatchRequestBuilder implements Builder<ProductVariantPatchRequest> {

    private java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantPatch> patches;

    public ProductVariantPatchRequestBuilder patches(
            final com.commercetools.importapi.models.productvariants.ProductVariantPatch... patches) {
        this.patches = new ArrayList<>(Arrays.asList(patches));
        return this;
    }

    public ProductVariantPatchRequestBuilder patches(
            final java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantPatch> patches) {
        this.patches = patches;
        return this;
    }

    public java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantPatch> getPatches() {
        return this.patches;
    }

    public ProductVariantPatchRequest build() {
        Objects.requireNonNull(patches);
        return new ProductVariantPatchRequestImpl(patches);
    }

    /**
     * builds ProductVariantPatchRequest without checking for non null required values
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
