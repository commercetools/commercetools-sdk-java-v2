
package com.commercetools.importapi.models.importrequests;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductDraftImportRequestBuilder implements Builder<ProductDraftImportRequest> {

    private java.util.List<com.commercetools.importapi.models.productdrafts.ProductDraftImport> resources;

    public ProductDraftImportRequestBuilder resources(
            final com.commercetools.importapi.models.productdrafts.ProductDraftImport... resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
        return this;
    }

    public ProductDraftImportRequestBuilder resources(
            final java.util.List<com.commercetools.importapi.models.productdrafts.ProductDraftImport> resources) {
        this.resources = resources;
        return this;
    }

    public ProductDraftImportRequestBuilder plusResources(
            final com.commercetools.importapi.models.productdrafts.ProductDraftImport... resources) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.addAll(Arrays.asList(resources));
        return this;
    }

    public ProductDraftImportRequestBuilder plusResources(
            Function<com.commercetools.importapi.models.productdrafts.ProductDraftImportBuilder, com.commercetools.importapi.models.productdrafts.ProductDraftImportBuilder> builder) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(
            builder.apply(com.commercetools.importapi.models.productdrafts.ProductDraftImportBuilder.of()).build());
        return this;
    }

    public ProductDraftImportRequestBuilder withResources(
            Function<com.commercetools.importapi.models.productdrafts.ProductDraftImportBuilder, com.commercetools.importapi.models.productdrafts.ProductDraftImportBuilder> builder) {
        this.resources = new ArrayList<>();
        this.resources.add(
            builder.apply(com.commercetools.importapi.models.productdrafts.ProductDraftImportBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.importapi.models.productdrafts.ProductDraftImport> getResources() {
        return this.resources;
    }

    public ProductDraftImportRequest build() {
        Objects.requireNonNull(resources, ProductDraftImportRequest.class + ": resources is missing");
        return new ProductDraftImportRequestImpl(resources);
    }

    /**
     * builds ProductDraftImportRequest without checking for non null required values
     */
    public ProductDraftImportRequest buildUnchecked() {
        return new ProductDraftImportRequestImpl(resources);
    }

    public static ProductDraftImportRequestBuilder of() {
        return new ProductDraftImportRequestBuilder();
    }

    public static ProductDraftImportRequestBuilder of(final ProductDraftImportRequest template) {
        ProductDraftImportRequestBuilder builder = new ProductDraftImportRequestBuilder();
        builder.resources = template.getResources();
        return builder;
    }

}
