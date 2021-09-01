
package com.commercetools.importapi.models.importrequests;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeImportRequestBuilder implements Builder<ProductTypeImportRequest> {

    private java.util.List<com.commercetools.importapi.models.producttypes.ProductTypeImport> resources;

    public ProductTypeImportRequestBuilder resources(
            final com.commercetools.importapi.models.producttypes.ProductTypeImport... resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
        return this;
    }

    public ProductTypeImportRequestBuilder withResources(
            Function<com.commercetools.importapi.models.producttypes.ProductTypeImportBuilder, com.commercetools.importapi.models.producttypes.ProductTypeImportBuilder> builder) {
        this.resources = new ArrayList<>();
        this.resources.add(
            builder.apply(com.commercetools.importapi.models.producttypes.ProductTypeImportBuilder.of()).build());
        return this;
    }

    public ProductTypeImportRequestBuilder plusResources(
            Function<com.commercetools.importapi.models.producttypes.ProductTypeImportBuilder, com.commercetools.importapi.models.producttypes.ProductTypeImportBuilder> builder) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(
            builder.apply(com.commercetools.importapi.models.producttypes.ProductTypeImportBuilder.of()).build());
        return this;
    }

    public ProductTypeImportRequestBuilder resources(
            final java.util.List<com.commercetools.importapi.models.producttypes.ProductTypeImport> resources) {
        this.resources = resources;
        return this;
    }

    public java.util.List<com.commercetools.importapi.models.producttypes.ProductTypeImport> getResources() {
        return this.resources;
    }

    public ProductTypeImportRequest build() {
        Objects.requireNonNull(resources, ProductTypeImportRequest.class + ": resources is missing");
        return new ProductTypeImportRequestImpl(resources);
    }

    /**
     * builds ProductTypeImportRequest without checking for non null required values
     */
    public ProductTypeImportRequest buildUnchecked() {
        return new ProductTypeImportRequestImpl(resources);
    }

    public static ProductTypeImportRequestBuilder of() {
        return new ProductTypeImportRequestBuilder();
    }

    public static ProductTypeImportRequestBuilder of(final ProductTypeImportRequest template) {
        ProductTypeImportRequestBuilder builder = new ProductTypeImportRequestBuilder();
        builder.resources = template.getResources();
        return builder;
    }

}
