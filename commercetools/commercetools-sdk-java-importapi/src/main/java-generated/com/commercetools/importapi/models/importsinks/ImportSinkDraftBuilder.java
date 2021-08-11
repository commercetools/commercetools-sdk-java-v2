
package com.commercetools.importapi.models.importsinks;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ImportSinkDraftBuilder implements Builder<ImportSinkDraft> {

    private String key;

    @Nullable
    private com.commercetools.importapi.models.common.ImportResourceType resourceType;

    public ImportSinkDraftBuilder key(final String key) {
        this.key = key;
        return this;
    }

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
