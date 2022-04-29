
package com.commercetools.importapi.models.importrequests;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class PriceImportRequestBuilder implements Builder<PriceImportRequest> {

    private java.util.List<com.commercetools.importapi.models.prices.PriceImport> resources;

    public PriceImportRequestBuilder resources(
            final com.commercetools.importapi.models.prices.PriceImport... resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
        return this;
    }

    public PriceImportRequestBuilder resources(
            final java.util.List<com.commercetools.importapi.models.prices.PriceImport> resources) {
        this.resources = resources;
        return this;
    }

    public PriceImportRequestBuilder plusResources(
            final com.commercetools.importapi.models.prices.PriceImport... resources) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.addAll(Arrays.asList(resources));
        return this;
    }

    public PriceImportRequestBuilder plusResources(
            Function<com.commercetools.importapi.models.prices.PriceImportBuilder, com.commercetools.importapi.models.prices.PriceImportBuilder> builder) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(builder.apply(com.commercetools.importapi.models.prices.PriceImportBuilder.of()).build());
        return this;
    }

    public PriceImportRequestBuilder withResources(
            Function<com.commercetools.importapi.models.prices.PriceImportBuilder, com.commercetools.importapi.models.prices.PriceImportBuilder> builder) {
        this.resources = new ArrayList<>();
        this.resources.add(builder.apply(com.commercetools.importapi.models.prices.PriceImportBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.importapi.models.prices.PriceImport> getResources() {
        return this.resources;
    }

    public PriceImportRequest build() {
        Objects.requireNonNull(resources, PriceImportRequest.class + ": resources is missing");
        return new PriceImportRequestImpl(resources);
    }

    /**
     * builds PriceImportRequest without checking for non null required values
     */
    public PriceImportRequest buildUnchecked() {
        return new PriceImportRequestImpl(resources);
    }

    public static PriceImportRequestBuilder of() {
        return new PriceImportRequestBuilder();
    }

    public static PriceImportRequestBuilder of(final PriceImportRequest template) {
        PriceImportRequestBuilder builder = new PriceImportRequestBuilder();
        builder.resources = template.getResources();
        return builder;
    }

}
