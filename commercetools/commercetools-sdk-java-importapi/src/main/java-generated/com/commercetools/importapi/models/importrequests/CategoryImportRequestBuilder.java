
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
     * @param resources value to be set
     * @return Builder
     */

    public CategoryImportRequestBuilder resources(
            final com.commercetools.importapi.models.categories.CategoryImport... resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
        return this;
    }

    /**
     *  <p>The category import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */

    public CategoryImportRequestBuilder resources(
            final java.util.List<com.commercetools.importapi.models.categories.CategoryImport> resources) {
        this.resources = resources;
        return this;
    }

    /**
     *  <p>The category import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
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
     * @param builder function to build the resources value
     * @return Builder
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
     * @param builder function to build the resources value
     * @return Builder
     */

    public CategoryImportRequestBuilder withResources(
            Function<com.commercetools.importapi.models.categories.CategoryImportBuilder, com.commercetools.importapi.models.categories.CategoryImportBuilder> builder) {
        this.resources = new ArrayList<>();
        this.resources
                .add(builder.apply(com.commercetools.importapi.models.categories.CategoryImportBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The category import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public CategoryImportRequestBuilder addResources(
            Function<com.commercetools.importapi.models.categories.CategoryImportBuilder, com.commercetools.importapi.models.categories.CategoryImport> builder) {
        return plusResources(builder.apply(com.commercetools.importapi.models.categories.CategoryImportBuilder.of()));
    }

    /**
     *  <p>The category import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public CategoryImportRequestBuilder setResources(
            Function<com.commercetools.importapi.models.categories.CategoryImportBuilder, com.commercetools.importapi.models.categories.CategoryImport> builder) {
        return resources(builder.apply(com.commercetools.importapi.models.categories.CategoryImportBuilder.of()));
    }

    /**
     *  <p>The category import resources of this request.</p>
     * @return resources
     */

    public java.util.List<com.commercetools.importapi.models.categories.CategoryImport> getResources() {
        return this.resources;
    }

    /**
     * builds CategoryImportRequest with checking for non-null required values
     * @return CategoryImportRequest
     */
    public CategoryImportRequest build() {
        Objects.requireNonNull(resources, CategoryImportRequest.class + ": resources is missing");
        return new CategoryImportRequestImpl(resources);
    }

    /**
     * builds CategoryImportRequest without checking for non-null required values
     * @return CategoryImportRequest
     */
    public CategoryImportRequest buildUnchecked() {
        return new CategoryImportRequestImpl(resources);
    }

    /**
     * factory method for an instance of CategoryImportRequestBuilder
     * @return builder
     */
    public static CategoryImportRequestBuilder of() {
        return new CategoryImportRequestBuilder();
    }

    /**
     * create builder for CategoryImportRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryImportRequestBuilder of(final CategoryImportRequest template) {
        CategoryImportRequestBuilder builder = new CategoryImportRequestBuilder();
        builder.resources = template.getResources();
        return builder;
    }

}
