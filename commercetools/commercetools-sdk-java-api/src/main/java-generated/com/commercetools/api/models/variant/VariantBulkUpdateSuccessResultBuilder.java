
package com.commercetools.api.models.variant;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantBulkUpdateSuccessResultBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantBulkUpdateSuccessResult variantBulkUpdateSuccessResult = VariantBulkUpdateSuccessResult.builder()
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantBulkUpdateSuccessResultBuilder implements Builder<VariantBulkUpdateSuccessResult> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    private com.commercetools.api.models.variant.VariantBulkUpdateResource resource;

    /**
     *  <p>Unique identifier of the Variant from the request. Present when the Variant was identified by <code>id</code>.</p>
     * @param id value to be set
     * @return Builder
     */

    public VariantBulkUpdateSuccessResultBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Variant from the request. Present when the Variant was identified by <code>key</code>.</p>
     * @param key value to be set
     * @return Builder
     */

    public VariantBulkUpdateSuccessResultBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>A lightweight reference containing the <code>id</code> and updated <code>version</code> of the Variant.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public VariantBulkUpdateSuccessResultBuilder resource(
            Function<com.commercetools.api.models.variant.VariantBulkUpdateResourceBuilder, com.commercetools.api.models.variant.VariantBulkUpdateResourceBuilder> builder) {
        this.resource = builder.apply(com.commercetools.api.models.variant.VariantBulkUpdateResourceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>A lightweight reference containing the <code>id</code> and updated <code>version</code> of the Variant.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public VariantBulkUpdateSuccessResultBuilder withResource(
            Function<com.commercetools.api.models.variant.VariantBulkUpdateResourceBuilder, com.commercetools.api.models.variant.VariantBulkUpdateResource> builder) {
        this.resource = builder.apply(com.commercetools.api.models.variant.VariantBulkUpdateResourceBuilder.of());
        return this;
    }

    /**
     *  <p>A lightweight reference containing the <code>id</code> and updated <code>version</code> of the Variant.</p>
     * @param resource value to be set
     * @return Builder
     */

    public VariantBulkUpdateSuccessResultBuilder resource(
            final com.commercetools.api.models.variant.VariantBulkUpdateResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Unique identifier of the Variant from the request. Present when the Variant was identified by <code>id</code>.</p>
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the Variant from the request. Present when the Variant was identified by <code>key</code>.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>A lightweight reference containing the <code>id</code> and updated <code>version</code> of the Variant.</p>
     * @return resource
     */

    public com.commercetools.api.models.variant.VariantBulkUpdateResource getResource() {
        return this.resource;
    }

    /**
     * builds VariantBulkUpdateSuccessResult with checking for non-null required values
     * @return VariantBulkUpdateSuccessResult
     */
    public VariantBulkUpdateSuccessResult build() {
        Objects.requireNonNull(resource, VariantBulkUpdateSuccessResult.class + ": resource is missing");
        return new VariantBulkUpdateSuccessResultImpl(id, key, resource);
    }

    /**
     * builds VariantBulkUpdateSuccessResult without checking for non-null required values
     * @return VariantBulkUpdateSuccessResult
     */
    public VariantBulkUpdateSuccessResult buildUnchecked() {
        return new VariantBulkUpdateSuccessResultImpl(id, key, resource);
    }

    /**
     * factory method for an instance of VariantBulkUpdateSuccessResultBuilder
     * @return builder
     */
    public static VariantBulkUpdateSuccessResultBuilder of() {
        return new VariantBulkUpdateSuccessResultBuilder();
    }

    /**
     * create builder for VariantBulkUpdateSuccessResult instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantBulkUpdateSuccessResultBuilder of(final VariantBulkUpdateSuccessResult template) {
        VariantBulkUpdateSuccessResultBuilder builder = new VariantBulkUpdateSuccessResultBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        builder.resource = template.getResource();
        return builder;
    }

}
