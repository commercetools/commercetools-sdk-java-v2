
package com.commercetools.importapi.models.importcontainers;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ImportContainerUpdateDraftBuilder implements Builder<ImportContainerUpdateDraft> {

    private Long version;

    @Nullable
    private com.commercetools.importapi.models.common.ImportResourceType resourceType;

    public ImportContainerUpdateDraftBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ImportContainerUpdateDraftBuilder resourceType(
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

    public ImportContainerUpdateDraft build() {
        Objects.requireNonNull(version, ImportContainerUpdateDraft.class + ": version is missing");
        return new ImportContainerUpdateDraftImpl(version, resourceType);
    }

    /**
     * builds ImportContainerUpdateDraft without checking for non null required values
     */
    public ImportContainerUpdateDraft buildUnchecked() {
        return new ImportContainerUpdateDraftImpl(version, resourceType);
    }

    public static ImportContainerUpdateDraftBuilder of() {
        return new ImportContainerUpdateDraftBuilder();
    }

    public static ImportContainerUpdateDraftBuilder of(final ImportContainerUpdateDraft template) {
        ImportContainerUpdateDraftBuilder builder = new ImportContainerUpdateDraftBuilder();
        builder.version = template.getVersion();
        builder.resourceType = template.getResourceType();
        return builder;
    }

}
