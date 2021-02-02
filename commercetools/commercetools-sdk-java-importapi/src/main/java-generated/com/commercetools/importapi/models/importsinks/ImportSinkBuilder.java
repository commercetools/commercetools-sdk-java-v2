
package com.commercetools.importapi.models.importsinks;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ImportSinkBuilder {

    private String key;

    private com.commercetools.importapi.models.common.ImportResourceType resourceType;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    public ImportSinkBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public ImportSinkBuilder resourceType(
            final com.commercetools.importapi.models.common.ImportResourceType resourceType) {
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
