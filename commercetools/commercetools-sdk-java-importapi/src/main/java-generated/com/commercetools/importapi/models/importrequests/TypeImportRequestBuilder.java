
package com.commercetools.importapi.models.importrequests;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypeImportRequestBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeImportRequest typeImportRequest = TypeImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeImportRequestBuilder implements Builder<TypeImportRequest> {

    private java.util.List<com.commercetools.importapi.models.types.TypeImport> resources;

    /**
     *  <p>The type import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */

    public TypeImportRequestBuilder resources(final com.commercetools.importapi.models.types.TypeImport... resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
        return this;
    }

    /**
     *  <p>The type import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */

    public TypeImportRequestBuilder resources(
            final java.util.List<com.commercetools.importapi.models.types.TypeImport> resources) {
        this.resources = resources;
        return this;
    }

    /**
     *  <p>The type import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */

    public TypeImportRequestBuilder plusResources(
            final com.commercetools.importapi.models.types.TypeImport... resources) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.addAll(Arrays.asList(resources));
        return this;
    }

    /**
     *  <p>The type import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public TypeImportRequestBuilder plusResources(
            Function<com.commercetools.importapi.models.types.TypeImportBuilder, com.commercetools.importapi.models.types.TypeImportBuilder> builder) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(builder.apply(com.commercetools.importapi.models.types.TypeImportBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The type import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public TypeImportRequestBuilder withResources(
            Function<com.commercetools.importapi.models.types.TypeImportBuilder, com.commercetools.importapi.models.types.TypeImportBuilder> builder) {
        this.resources = new ArrayList<>();
        this.resources.add(builder.apply(com.commercetools.importapi.models.types.TypeImportBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The type import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public TypeImportRequestBuilder addResources(
            Function<com.commercetools.importapi.models.types.TypeImportBuilder, com.commercetools.importapi.models.types.TypeImport> builder) {
        return plusResources(builder.apply(com.commercetools.importapi.models.types.TypeImportBuilder.of()));
    }

    /**
     *  <p>The type import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public TypeImportRequestBuilder setResources(
            Function<com.commercetools.importapi.models.types.TypeImportBuilder, com.commercetools.importapi.models.types.TypeImport> builder) {
        return resources(builder.apply(com.commercetools.importapi.models.types.TypeImportBuilder.of()));
    }

    /**
     *  <p>The type import resources of this request.</p>
     * @return resources
     */

    public java.util.List<com.commercetools.importapi.models.types.TypeImport> getResources() {
        return this.resources;
    }

    /**
     * builds TypeImportRequest with checking for non-null required values
     * @return TypeImportRequest
     */
    public TypeImportRequest build() {
        Objects.requireNonNull(resources, TypeImportRequest.class + ": resources is missing");
        return new TypeImportRequestImpl(resources);
    }

    /**
     * builds TypeImportRequest without checking for non-null required values
     * @return TypeImportRequest
     */
    public TypeImportRequest buildUnchecked() {
        return new TypeImportRequestImpl(resources);
    }

    /**
     * factory method for an instance of TypeImportRequestBuilder
     * @return builder
     */
    public static TypeImportRequestBuilder of() {
        return new TypeImportRequestBuilder();
    }

    /**
     * create builder for TypeImportRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeImportRequestBuilder of(final TypeImportRequest template) {
        TypeImportRequestBuilder builder = new TypeImportRequestBuilder();
        builder.resources = template.getResources();
        return builder;
    }

}
