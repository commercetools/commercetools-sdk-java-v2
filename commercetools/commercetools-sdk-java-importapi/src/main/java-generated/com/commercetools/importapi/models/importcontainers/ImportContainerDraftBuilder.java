
package com.commercetools.importapi.models.importcontainers;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImportContainerDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportContainerDraft importContainerDraft = ImportContainerDraft.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImportContainerDraftBuilder implements Builder<ImportContainerDraft> {

    private String key;

    @Nullable
    private com.commercetools.importapi.models.common.ImportResourceType resourceType;

    @Nullable
    private com.commercetools.importapi.models.importcontainers.RetentionPolicy retentionPolicy;

    /**
     *  <p>User-defined unique identifier of the ImportContainer.</p>
     * @param key value to be set
     * @return Builder
     */

    public ImportContainerDraftBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>The resource type the ImportContainer will accept. If not specified, the ImportContainer can import all of the supported ImportResourceTypes.</p>
     * @param resourceType value to be set
     * @return Builder
     */

    public ImportContainerDraftBuilder resourceType(
            @Nullable final com.commercetools.importapi.models.common.ImportResourceType resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     *  <p>Set a retention policy to automatically delete the ImportContainer after a defined period.</p>
     * @param retentionPolicy value to be set
     * @return Builder
     */

    public ImportContainerDraftBuilder retentionPolicy(
            @Nullable final com.commercetools.importapi.models.importcontainers.RetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

    /**
     *  <p>Set a retention policy to automatically delete the ImportContainer after a defined period.</p>
     * @param builder function to build the retentionPolicy value
     * @return Builder
     */

    public ImportContainerDraftBuilder retentionPolicy(
            Function<com.commercetools.importapi.models.importcontainers.RetentionPolicyBuilder, Builder<? extends com.commercetools.importapi.models.importcontainers.RetentionPolicy>> builder) {
        this.retentionPolicy = builder
                .apply(com.commercetools.importapi.models.importcontainers.RetentionPolicyBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the ImportContainer.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The resource type the ImportContainer will accept. If not specified, the ImportContainer can import all of the supported ImportResourceTypes.</p>
     * @return resourceType
     */

    @Nullable
    public com.commercetools.importapi.models.common.ImportResourceType getResourceType() {
        return this.resourceType;
    }

    /**
     *  <p>Set a retention policy to automatically delete the ImportContainer after a defined period.</p>
     * @return retentionPolicy
     */

    @Nullable
    public com.commercetools.importapi.models.importcontainers.RetentionPolicy getRetentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * builds ImportContainerDraft with checking for non-null required values
     * @return ImportContainerDraft
     */
    public ImportContainerDraft build() {
        Objects.requireNonNull(key, ImportContainerDraft.class + ": key is missing");
        return new ImportContainerDraftImpl(key, resourceType, retentionPolicy);
    }

    /**
     * builds ImportContainerDraft without checking for non-null required values
     * @return ImportContainerDraft
     */
    public ImportContainerDraft buildUnchecked() {
        return new ImportContainerDraftImpl(key, resourceType, retentionPolicy);
    }

    /**
     * factory method for an instance of ImportContainerDraftBuilder
     * @return builder
     */
    public static ImportContainerDraftBuilder of() {
        return new ImportContainerDraftBuilder();
    }

    /**
     * create builder for ImportContainerDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportContainerDraftBuilder of(final ImportContainerDraft template) {
        ImportContainerDraftBuilder builder = new ImportContainerDraftBuilder();
        builder.key = template.getKey();
        builder.resourceType = template.getResourceType();
        builder.retentionPolicy = template.getRetentionPolicy();
        return builder;
    }

}
