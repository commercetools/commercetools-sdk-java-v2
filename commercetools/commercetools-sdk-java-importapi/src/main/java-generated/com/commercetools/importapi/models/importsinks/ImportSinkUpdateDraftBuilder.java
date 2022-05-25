
package com.commercetools.importapi.models.importsinks;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImportSinkUpdateDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportSinkUpdateDraft importSinkUpdateDraft = ImportSinkUpdateDraft.builder()
 *             .version(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImportSinkUpdateDraftBuilder implements Builder<ImportSinkUpdateDraft> {

    private Long version;

    @Nullable
    private com.commercetools.importapi.models.common.ImportResourceType resourceType;

    /**
     *  <p>Current version of the ImportSink.</p>
     */

    public ImportSinkUpdateDraftBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>The resource type to be imported. If not given, the ImportSink is able to import all of the supported ImportResourceTypes.</p>
     */

    public ImportSinkUpdateDraftBuilder resourceType(
            @Nullable final com.commercetools.importapi.models.common.ImportResourceType resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    @Nullable
    public com.commercetools.importapi.models.common.ImportResourceType getResourceType() {
        return this.resourceType;
    }

    public ImportSinkUpdateDraft build() {
        Objects.requireNonNull(version, ImportSinkUpdateDraft.class + ": version is missing");
        return new ImportSinkUpdateDraftImpl(version, resourceType);
    }

    /**
     * builds ImportSinkUpdateDraft without checking for non null required values
     */
    public ImportSinkUpdateDraft buildUnchecked() {
        return new ImportSinkUpdateDraftImpl(version, resourceType);
    }

    public static ImportSinkUpdateDraftBuilder of() {
        return new ImportSinkUpdateDraftBuilder();
    }

    public static ImportSinkUpdateDraftBuilder of(final ImportSinkUpdateDraft template) {
        ImportSinkUpdateDraftBuilder builder = new ImportSinkUpdateDraftBuilder();
        builder.version = template.getVersion();
        builder.resourceType = template.getResourceType();
        return builder;
    }

}
