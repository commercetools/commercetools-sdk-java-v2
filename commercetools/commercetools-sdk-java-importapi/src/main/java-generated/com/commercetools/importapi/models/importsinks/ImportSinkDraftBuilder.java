
package com.commercetools.importapi.models.importsinks;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ImportSinkDraftBuilder {

    @Nullable
    private Long version;

    private String key;

    private com.commercetools.importapi.models.common.ImportResourceType resourceType;

    public ImportSinkDraftBuilder version(@Nullable final Long version) {
        this.version = version;
        return this;
    }

    public ImportSinkDraftBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public ImportSinkDraftBuilder resourceType(
            final com.commercetools.importapi.models.common.ImportResourceType resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    @Nullable
    public Long getVersion() {
        return this.version;
    }

    public String getKey() {
        return this.key;
    }

    public com.commercetools.importapi.models.common.ImportResourceType getResourceType() {
        return this.resourceType;
    }

    public ImportSinkDraft build() {
        return new ImportSinkDraftImpl(version, key, resourceType);
    }

    public static ImportSinkDraftBuilder of() {
        return new ImportSinkDraftBuilder();
    }

    public static ImportSinkDraftBuilder of(final ImportSinkDraft template) {
        ImportSinkDraftBuilder builder = new ImportSinkDraftBuilder();
        builder.version = template.getVersion();
        builder.key = template.getKey();
        builder.resourceType = template.getResourceType();
        return builder;
    }

}
