
package com.commercetools.importapi.models.importrequests;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductVariantImportRequestBuilder implements Builder<ProductVariantImportRequest> {

    private java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantImport> resources;

    public ProductVariantImportRequestBuilder resources(
            final com.commercetools.importapi.models.productvariants.ProductVariantImport... resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
        return this;
    }

    public ProductVariantImportRequestBuilder resources(
            final java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantImport> resources) {
        this.resources = resources;
        return this;
    }

    public java.util.List<com.commercetools.importapi.models.productvariants.ProductVariantImport> getResources() {
        return this.resources;
    }

    public ProductVariantImportRequest build() {
        Objects.requireNonNull(resources, ProductVariantImportRequest.class + ": resources is missing");
        return new ProductVariantImportRequestImpl(resources);
    }

    /**
     * builds ProductVariantImportRequest without checking for non null required values
     */
    public ProductVariantImportRequest buildUnchecked() {
        return new ProductVariantImportRequestImpl(resources);
    }

    public static ProductVariantImportRequestBuilder of() {
        return new ProductVariantImportRequestBuilder();
    }

    public static ProductVariantImportRequestBuilder of(final ProductVariantImportRequest template) {
        ProductVariantImportRequestBuilder builder = new ProductVariantImportRequestBuilder();
        builder.resources = template.getResources();
        return builder;
    }

}
