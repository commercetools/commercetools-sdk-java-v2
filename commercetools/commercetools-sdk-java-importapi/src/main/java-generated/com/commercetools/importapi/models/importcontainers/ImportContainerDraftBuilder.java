
package com.commercetools.importapi.models.importcontainers;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ImportContainerDraftBuilder implements Builder<ImportContainerDraft> {

    private String key;

    @Nullable
    private com.commercetools.importapi.models.common.ImportResourceType resourceType;

    public ImportContainerDraftBuilder key(final String key) {
        this.key = key;
        return this;
    }

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

    public ImportContainerDraft build() {
        Objects.requireNonNull(key, ImportContainerDraft.class + ": key is missing");
        return new ImportContainerDraftImpl(key, resourceType);
    }

    /**
     * builds ImportContainerDraft without checking for non null required values
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
