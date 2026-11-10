
package com.commercetools.importapi.models.importrequests;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantImportRequestBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantImportRequest variantImportRequest = VariantImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantImportRequestBuilder implements Builder<VariantImportRequest> {

    private java.util.List<com.commercetools.importapi.models.variants.VariantImport> resources;

    /**
     *  <p>The Variant import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */

    public VariantImportRequestBuilder resources(
            final com.commercetools.importapi.models.variants.VariantImport... resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
        return this;
    }

    /**
     *  <p>The Variant import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */

    public VariantImportRequestBuilder resources(
            final java.util.List<com.commercetools.importapi.models.variants.VariantImport> resources) {
        this.resources = resources;
        return this;
    }

    /**
     *  <p>The Variant import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */

    public VariantImportRequestBuilder plusResources(
            final com.commercetools.importapi.models.variants.VariantImport... resources) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.addAll(Arrays.asList(resources));
        return this;
    }

    /**
     *  <p>The Variant import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public VariantImportRequestBuilder plusResources(
            Function<com.commercetools.importapi.models.variants.VariantImportBuilder, com.commercetools.importapi.models.variants.VariantImportBuilder> builder) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources
                .add(builder.apply(com.commercetools.importapi.models.variants.VariantImportBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Variant import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public VariantImportRequestBuilder withResources(
            Function<com.commercetools.importapi.models.variants.VariantImportBuilder, com.commercetools.importapi.models.variants.VariantImportBuilder> builder) {
        this.resources = new ArrayList<>();
        this.resources
                .add(builder.apply(com.commercetools.importapi.models.variants.VariantImportBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Variant import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public VariantImportRequestBuilder addResources(
            Function<com.commercetools.importapi.models.variants.VariantImportBuilder, com.commercetools.importapi.models.variants.VariantImport> builder) {
        return plusResources(builder.apply(com.commercetools.importapi.models.variants.VariantImportBuilder.of()));
    }

    /**
     *  <p>The Variant import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public VariantImportRequestBuilder setResources(
            Function<com.commercetools.importapi.models.variants.VariantImportBuilder, com.commercetools.importapi.models.variants.VariantImport> builder) {
        return resources(builder.apply(com.commercetools.importapi.models.variants.VariantImportBuilder.of()));
    }

    /**
     *  <p>The Variant import resources of this request.</p>
     * @return resources
     */

    public java.util.List<com.commercetools.importapi.models.variants.VariantImport> getResources() {
        return this.resources;
    }

    /**
     * builds VariantImportRequest with checking for non-null required values
     * @return VariantImportRequest
     */
    public VariantImportRequest build() {
        Objects.requireNonNull(resources, VariantImportRequest.class + ": resources is missing");
        return new VariantImportRequestImpl(resources);
    }

    /**
     * builds VariantImportRequest without checking for non-null required values
     * @return VariantImportRequest
     */
    public VariantImportRequest buildUnchecked() {
        return new VariantImportRequestImpl(resources);
    }

    /**
     * factory method for an instance of VariantImportRequestBuilder
     * @return builder
     */
    public static VariantImportRequestBuilder of() {
        return new VariantImportRequestBuilder();
    }

    /**
     * create builder for VariantImportRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantImportRequestBuilder of(final VariantImportRequest template) {
        VariantImportRequestBuilder builder = new VariantImportRequestBuilder();
        builder.resources = template.getResources();
        return builder;
    }

}
