
package com.commercetools.importapi.models.importcontainers;

import java.util.*;

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

    /**
     *  <p>User-defined unique identifier of the ImportContainer. Keys can only contain alphanumeric characters (a-Z, 0-9), underscores and hyphens (_, -).</p>
     * @param key value to be set
     * @return Builder
     */

    public ImportContainerDraftBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>The resource type to be imported. If not given, the ImportContainer is able to import all of the supported ImportResourceTypes.</p>
     * @param resourceType value to be set
     * @return Builder
     */

    public ImportContainerDraftBuilder resourceType(
            @Nullable final com.commercetools.importapi.models.common.ImportResourceType resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    @Nullable
    public com.commercetools.importapi.models.common.ImportResourceType getResourceType() {
        return this.resourceType;
    }

    /**
     * builds ImportContainerDraft with checking for non-null required values
     * @return ImportContainerDraft
     */
    public ImportContainerDraft build() {
        Objects.requireNonNull(key, ImportContainerDraft.class + ": key is missing");
        return new ImportContainerDraftImpl(key, resourceType);
    }

    /**
     * builds ImportContainerDraft without checking for non-null required values
     * @return ImportContainerDraft
     */
    public ImportContainerDraft buildUnchecked() {
        return new ImportContainerDraftImpl(key, resourceType);
    }

    public static ImportContainerDraftBuilder of() {
        return new ImportContainerDraftBuilder();
    }

    public static ImportContainerDraftBuilder of(final ImportContainerDraft template) {
        ImportContainerDraftBuilder builder = new ImportContainerDraftBuilder();
        builder.key = template.getKey();
        builder.resourceType = template.getResourceType();
        return builder;
    }

}
