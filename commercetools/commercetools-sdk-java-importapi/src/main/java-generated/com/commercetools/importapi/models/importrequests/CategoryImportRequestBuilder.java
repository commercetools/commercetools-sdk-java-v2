
package com.commercetools.importapi.models.importrequests;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategoryImportRequestBuilder implements Builder<CategoryImportRequest> {

    private java.util.List<com.commercetools.importapi.models.categories.CategoryImport> resources;

    public CategoryImportRequestBuilder resources(
            final com.commercetools.importapi.models.categories.CategoryImport... resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
        return this;
    }

    public CategoryImportRequestBuilder withResources(
            Function<com.commercetools.importapi.models.categories.CategoryImportBuilder, com.commercetools.importapi.models.categories.CategoryImportBuilder> builder) {
        this.resources = new ArrayList<>();
        this.resources
                .add(builder.apply(com.commercetools.importapi.models.categories.CategoryImportBuilder.of()).build());
        return this;
    }

    public CategoryImportRequestBuilder plusResources(
            Function<com.commercetools.importapi.models.categories.CategoryImportBuilder, com.commercetools.importapi.models.categories.CategoryImportBuilder> builder) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources
                .add(builder.apply(com.commercetools.importapi.models.categories.CategoryImportBuilder.of()).build());
        return this;
    }

    public CategoryImportRequestBuilder resources(
            final java.util.List<com.commercetools.importapi.models.categories.CategoryImport> resources) {
        this.resources = resources;
        return this;
    }

    public java.util.List<com.commercetools.importapi.models.categories.CategoryImport> getResources() {
        return this.resources;
    }

    public CategoryImportRequest build() {
        Objects.requireNonNull(resources, CategoryImportRequest.class + ": resources is missing");
        return new CategoryImportRequestImpl(resources);
    }

    /**
     * builds CategoryImportRequest without checking for non null required values
     */
    public CategoryImportRequest buildUnchecked() {
        return new CategoryImportRequestImpl(resources);
    }

    public static CategoryImportRequestBuilder of() {
        return new CategoryImportRequestBuilder();
    }

    public static CategoryImportRequestBuilder of(final CategoryImportRequest template) {
        CategoryImportRequestBuilder builder = new CategoryImportRequestBuilder();
        builder.resources = template.getResources();
        return builder;
    }

}
