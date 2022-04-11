
package com.commercetools.importapi.models.importrequests;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductVariantImportRequestBuilder implements Builder<ProductVariantImportRequest> {

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

    public ProductVariantImportRequestBuilder plusResources(
            final com.commercetools.importapi.models.productvariants.ProductVariantImport... resources) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.addAll(Arrays.asList(resources));
        return this;
    }

    public ProductVariantImportRequestBuilder plusResources(
            Function<com.commercetools.importapi.models.productvariants.ProductVariantImportBuilder, com.commercetools.importapi.models.productvariants.ProductVariantImportBuilder> builder) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(
            builder.apply(com.commercetools.importapi.models.productvariants.ProductVariantImportBuilder.of()).build());
        return this;
    }

    public ProductVariantImportRequestBuilder withResources(
            Function<com.commercetools.importapi.models.productvariants.ProductVariantImportBuilder, com.commercetools.importapi.models.productvariants.ProductVariantImportBuilder> builder) {
        this.resources = new ArrayList<>();
        this.resources.add(
            builder.apply(com.commercetools.importapi.models.productvariants.ProductVariantImportBuilder.of()).build());
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
