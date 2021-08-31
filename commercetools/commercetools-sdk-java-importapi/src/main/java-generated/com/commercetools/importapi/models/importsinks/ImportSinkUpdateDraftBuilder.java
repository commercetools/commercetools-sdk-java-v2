
package com.commercetools.importapi.models.importsinks;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ImportSinkUpdateDraftBuilder implements Builder<ImportSinkUpdateDraft> {

    private Long version;

    @Nullable
    private com.commercetools.importapi.models.common.ImportResourceType resourceType;

    public ImportSinkUpdateDraftBuilder version(final Long version) {
        this.version = version;
        return this;
    }

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
