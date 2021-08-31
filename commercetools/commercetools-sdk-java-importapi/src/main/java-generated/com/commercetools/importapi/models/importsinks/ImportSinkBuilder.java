
package com.commercetools.importapi.models.importsinks;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ImportSinkBuilder implements Builder<ImportSink> {

    private String key;

    @Nullable
    private com.commercetools.importapi.models.common.ImportResourceType resourceType;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    public ImportSinkBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public ImportSinkBuilder resourceType(
            @Nullable final com.commercetools.importapi.models.common.ImportResourceType resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public ImportSinkBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ImportSinkBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public ImportSinkBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    @Nullable
    public com.commercetools.importapi.models.common.ImportResourceType getResourceType() {
        return this.resourceType;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    public ImportSink build() {
        Objects.requireNonNull(key, ImportSink.class + ": key is missing");
        Objects.requireNonNull(version, ImportSink.class + ": version is missing");
        Objects.requireNonNull(createdAt, ImportSink.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ImportSink.class + ": lastModifiedAt is missing");
        return new ImportSinkImpl(key, resourceType, version, createdAt, lastModifiedAt);
    }

    /**
     * builds ImportSink without checking for non null required values
     */
    public ImportSink buildUnchecked() {
        return new ImportSinkImpl(key, resourceType, version, createdAt, lastModifiedAt);
    }

    public static ImportSinkBuilder of() {
        return new ImportSinkBuilder();
    }

    public static ImportSinkBuilder of(final ImportSink template) {
        ImportSinkBuilder builder = new ImportSinkBuilder();
        builder.key = template.getKey();
        builder.resourceType = template.getResourceType();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        return builder;
    }

}
