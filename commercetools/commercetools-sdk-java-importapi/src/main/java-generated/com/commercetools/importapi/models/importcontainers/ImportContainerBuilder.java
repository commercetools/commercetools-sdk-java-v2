
package com.commercetools.importapi.models.importcontainers;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImportContainerBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportContainer importContainer = ImportContainer.builder()
 *             .key("{key}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImportContainerBuilder implements Builder<ImportContainer> {

    private String key;

    @Nullable
    private com.commercetools.importapi.models.common.ImportResourceType resourceType;

    private Long version;

    @Nullable
    private com.commercetools.importapi.models.importcontainers.RetentionPolicy retentionPolicy;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private java.time.ZonedDateTime expiresAt;

    /**
     *  <p>User-defined unique identifier of the ImportContainer.</p>
     * @param key value to be set
     * @return Builder
     */

    public ImportContainerBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>The resource type the ImportContainer supports. If not present, the ImportContainer can import all of the supported ImportResourceTypes.</p>
     * @param resourceType value to be set
     * @return Builder
     */

    public ImportContainerBuilder resourceType(
            @Nullable final com.commercetools.importapi.models.common.ImportResourceType resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     *  <p>Current version of the ImportContainer.</p>
     * @param version value to be set
     * @return Builder
     */

    public ImportContainerBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>The retention policy of the ImportContainer.</p>
     * @param retentionPolicy value to be set
     * @return Builder
     */

    public ImportContainerBuilder retentionPolicy(
            @Nullable final com.commercetools.importapi.models.importcontainers.RetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

    /**
     *  <p>The retention policy of the ImportContainer.</p>
     * @param builder function to build the retentionPolicy value
     * @return Builder
     */

    public ImportContainerBuilder retentionPolicy(
            Function<com.commercetools.importapi.models.importcontainers.RetentionPolicyBuilder, Builder<? extends com.commercetools.importapi.models.importcontainers.RetentionPolicy>> builder) {
        this.retentionPolicy = builder
                .apply(com.commercetools.importapi.models.importcontainers.RetentionPolicyBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Date and time (UTC) the ImportContainer was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public ImportContainerBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the ImportContainer was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public ImportContainerBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the ImportContainer is automatically deleted. Only present if a <code>retentionPolicy</code> is set. ImportContainers without <code>expiresAt</code> are permanent until manually deleted.</p>
     * @param expiresAt value to be set
     * @return Builder
     */

    public ImportContainerBuilder expiresAt(@Nullable final java.time.ZonedDateTime expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the ImportContainer.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The resource type the ImportContainer supports. If not present, the ImportContainer can import all of the supported ImportResourceTypes.</p>
     * @return resourceType
     */

    @Nullable
    public com.commercetools.importapi.models.common.ImportResourceType getResourceType() {
        return this.resourceType;
    }

    /**
     *  <p>Current version of the ImportContainer.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>The retention policy of the ImportContainer.</p>
     * @return retentionPolicy
     */

    @Nullable
    public com.commercetools.importapi.models.importcontainers.RetentionPolicy getRetentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     *  <p>Date and time (UTC) the ImportContainer was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the ImportContainer was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>Date and time (UTC) the ImportContainer is automatically deleted. Only present if a <code>retentionPolicy</code> is set. ImportContainers without <code>expiresAt</code> are permanent until manually deleted.</p>
     * @return expiresAt
     */

    @Nullable
    public java.time.ZonedDateTime getExpiresAt() {
        return this.expiresAt;
    }

    /**
     * builds ImportContainer with checking for non-null required values
     * @return ImportContainer
     */
    public ImportContainer build() {
        Objects.requireNonNull(key, ImportContainer.class + ": key is missing");
        Objects.requireNonNull(version, ImportContainer.class + ": version is missing");
        Objects.requireNonNull(createdAt, ImportContainer.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ImportContainer.class + ": lastModifiedAt is missing");
        return new ImportContainerImpl(key, resourceType, version, retentionPolicy, createdAt, lastModifiedAt,
            expiresAt);
    }

    /**
     * builds ImportContainer without checking for non-null required values
     * @return ImportContainer
     */
    public ImportContainer buildUnchecked() {
        return new ImportContainerImpl(key, resourceType, version, retentionPolicy, createdAt, lastModifiedAt,
            expiresAt);
    }

    /**
     * factory method for an instance of ImportContainerBuilder
     * @return builder
     */
    public static ImportContainerBuilder of() {
        return new ImportContainerBuilder();
    }

    /**
     * create builder for ImportContainer instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportContainerBuilder of(final ImportContainer template) {
        ImportContainerBuilder builder = new ImportContainerBuilder();
        builder.key = template.getKey();
        builder.resourceType = template.getResourceType();
        builder.version = template.getVersion();
        builder.retentionPolicy = template.getRetentionPolicy();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.expiresAt = template.getExpiresAt();
        return builder;
    }

}
