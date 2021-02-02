
package com.commercetools.importapi.models.importrequests;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductImportRequestBuilder {

    private java.util.List<com.commercetools.importapi.models.products.ProductImport> resources;

    public ProductImportRequestBuilder resources(
            final com.commercetools.importapi.models.products.ProductImport... resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
        return this;
    }

    public ProductImportRequestBuilder resources(
            final java.util.List<com.commercetools.importapi.models.products.ProductImport> resources) {
        this.resources = resources;
        return this;
    }

    public java.util.List<com.commercetools.importapi.models.products.ProductImport> getResources() {
        return this.resources;
    }

    public ProductImportRequest build() {
        return new ProductImportRequestImpl(resources);
    }

    public static ProductImportRequestBuilder of() {
        return new ProductImportRequestBuilder();
    }

    public static ProductImportRequestBuilder of(final ProductImportRequest template) {
        ProductImportRequestBuilder builder = new ProductImportRequestBuilder();
        builder.resources = template.getResources();
        return builder;
    }

}
