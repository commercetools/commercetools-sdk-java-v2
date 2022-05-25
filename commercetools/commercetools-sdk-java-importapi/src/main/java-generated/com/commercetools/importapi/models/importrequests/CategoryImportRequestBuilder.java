
package com.commercetools.importapi.models.importrequests;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryImportRequestBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryImportRequest categoryImportRequest = CategoryImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryImportRequestBuilder implements Builder<CategoryImportRequest> {

    private java.util.List<com.commercetools.importapi.models.categories.CategoryImport> resources;

    /**
     *  <p>The category import resources of this request.</p>
     */

    public CategoryImportRequestBuilder resources(
            final com.commercetools.importapi.models.categories.CategoryImport... resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
        return this;
    }

    /**
     *  <p>The category import resources of this request.</p>
     */

    public CategoryImportRequestBuilder resources(
            final java.util.List<com.commercetools.importapi.models.categories.CategoryImport> resources) {
        this.resources = resources;
        return this;
    }

    /**
     *  <p>The category import resources of this request.</p>
     */

    public CategoryImportRequestBuilder plusResources(
            final com.commercetools.importapi.models.categories.CategoryImport... resources) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.addAll(Arrays.asList(resources));
        return this;
    }

    /**
     *  <p>The category import resources of this request.</p>
     */

    public CategoryImportRequestBuilder plusResources(
            Function<com.commercetools.importapi.models.categories.CategoryImportBuilder, com.commercetools.importapi.models.categories.CategoryImportBuilder> builder) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources
                .add(builder.apply(com.commercetools.importapi.models.categories.CategoryImportBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The category import resources of this request.</p>
     */

    public CategoryImportRequestBuilder withResources(
            Function<com.commercetools.importapi.models.categories.CategoryImportBuilder, com.commercetools.importapi.models.categories.CategoryImportBuilder> builder) {
        this.resources = new ArrayList<>();
        this.resources
                .add(builder.apply(com.commercetools.importapi.models.categories.CategoryImportBuilder.of()).build());
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
