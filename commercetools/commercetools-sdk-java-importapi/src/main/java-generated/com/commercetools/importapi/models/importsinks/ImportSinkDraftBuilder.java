
package com.commercetools.importapi.models.importsinks;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ImportSinkDraft importSinkDraft = ImportSinkDraft.builder()
           .key("{key}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImportSinkDraftBuilder implements Builder<ImportSinkDraft> {

    private String key;

    @Nullable
    private com.commercetools.importapi.models.common.ImportResourceType resourceType;

    /**
     *  <p>User-defined unique identifier of the ImportSink. Keys can only contain alphanumeric characters (a-Z, 0-9), underscores and hyphens (_, -).</p>
     */

    public ImportSinkDraftBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>The resource type to be imported. If not given, the ImportSink is able to import all of the supported ImportResourceTypes.</p>
     */

    public ImportSinkDraftBuilder resourceType(
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

    public ImportSinkDraft build() {
        Objects.requireNonNull(key, ImportSinkDraft.class + ": key is missing");
        return new ImportSinkDraftImpl(key, resourceType);
    }

    /**
     * builds ImportSinkDraft without checking for non null required values
     */
    public ImportSinkDraft buildUnchecked() {
        return new ImportSinkDraftImpl(key, resourceType);
    }

    public static ImportSinkDraftBuilder of() {
        return new ImportSinkDraftBuilder();
    }

    public static ImportSinkDraftBuilder of(final ImportSinkDraft template) {
        ImportSinkDraftBuilder builder = new ImportSinkDraftBuilder();
        builder.key = template.getKey();
        builder.resourceType = template.getResourceType();
        return builder;
    }

}
