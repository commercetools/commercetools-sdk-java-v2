
package com.commercetools.importapi.models.importcontainers;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ImportContainerBuilder implements Builder<ImportContainer> {

    private String key;

    @Nullable
    private com.commercetools.importapi.models.common.ImportResourceType resourceType;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    /**
    *  <p>User-defined unique identifier for the ImportContainer. Keys can only contain alphanumeric characters (a-Z, 0-9), underscores and hyphens (_, -).</p>
    */

    public ImportContainerBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
    *  <p>The resource type the ImportContainer is able to handle. If not present, the ImportContainer is able to import all of the supported ImportResourceTypes.</p>
    */

    public ImportContainerBuilder resourceType(
            @Nullable final com.commercetools.importapi.models.common.ImportResourceType resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
    *  <p>The version of the ImportContainer.</p>
    */

    public ImportContainerBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
    *  <p>The time when the ImportContainer was created.</p>
    */

    public ImportContainerBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
    *  <p>The last time when the ImportContainer was modified.</p>
    */

    public ImportContainerBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
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

    public ImportContainer build() {
        Objects.requireNonNull(key, ImportContainer.class + ": key is missing");
        Objects.requireNonNull(version, ImportContainer.class + ": version is missing");
        Objects.requireNonNull(createdAt, ImportContainer.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ImportContainer.class + ": lastModifiedAt is missing");
        return new ImportContainerImpl(key, resourceType, version, createdAt, lastModifiedAt);
    }

    /**
     * builds ImportContainer without checking for non null required values
     */
    public ImportContainer buildUnchecked() {
        return new ImportContainerImpl(key, resourceType, version, createdAt, lastModifiedAt);
    }

    public static ImportContainerBuilder of() {
        return new ImportContainerBuilder();
    }

    public static ImportContainerBuilder of(final ImportContainer template) {
        ImportContainerBuilder builder = new ImportContainerBuilder();
        builder.key = template.getKey();
        builder.resourceType = template.getResourceType();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        return builder;
    }

}
