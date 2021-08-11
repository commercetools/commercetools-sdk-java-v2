
package com.commercetools.importapi.models.importoperations;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ImportOperationBuilder implements Builder<ImportOperation> {

    private Long version;

    private String importSinkKey;

    private String resourceKey;

    private String id;

    private com.commercetools.importapi.models.common.ProcessingState state;

    @Nullable
    private Long resourceVersion;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.errors.ErrorObject> errors;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.common.KeyReference> unresolvedReferences;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private java.time.ZonedDateTime expiresAt;

    public ImportOperationBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ImportOperationBuilder importSinkKey(final String importSinkKey) {
        this.importSinkKey = importSinkKey;
        return this;
    }

    public ImportOperationBuilder resourceKey(final String resourceKey) {
        this.resourceKey = resourceKey;
        return this;
    }

    public ImportOperationBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ImportOperationBuilder state(final com.commercetools.importapi.models.common.ProcessingState state) {
        this.state = state;
        return this;
    }

    public ImportOperationBuilder resourceVersion(@Nullable final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public ImportOperationBuilder errors(
            @Nullable final com.commercetools.importapi.models.errors.ErrorObject... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
        return this;
    }

    public ImportOperationBuilder errors(
            @Nullable final java.util.List<com.commercetools.importapi.models.errors.ErrorObject> errors) {
        this.errors = errors;
        return this;
    }

    public ImportOperationBuilder unresolvedReferences(
            @Nullable final com.commercetools.importapi.models.common.KeyReference... unresolvedReferences) {
        this.unresolvedReferences = new ArrayList<>(Arrays.asList(unresolvedReferences));
        return this;
    }

    public ImportOperationBuilder unresolvedReferences(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.KeyReference> unresolvedReferences) {
        this.unresolvedReferences = unresolvedReferences;
        return this;
    }

    public ImportOperationBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public ImportOperationBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public ImportOperationBuilder expiresAt(final java.time.ZonedDateTime expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public String getImportSinkKey() {
        return this.importSinkKey;
    }

    public String getResourceKey() {
        return this.resourceKey;
    }

    public String getId() {
        return this.id;
    }

    public com.commercetools.importapi.models.common.ProcessingState getState() {
        return this.state;
    }

    @Nullable
    public Long getResourceVersion() {
        return this.resourceVersion;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.errors.ErrorObject> getErrors() {
        return this.errors;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.KeyReference> getUnresolvedReferences() {
        return this.unresolvedReferences;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    public java.time.ZonedDateTime getExpiresAt() {
        return this.expiresAt;
    }

    public ImportOperation build() {
        Objects.requireNonNull(version, ImportOperation.class + ": version is missing");
        Objects.requireNonNull(importSinkKey, ImportOperation.class + ": importSinkKey is missing");
        Objects.requireNonNull(resourceKey, ImportOperation.class + ": resourceKey is missing");
        Objects.requireNonNull(id, ImportOperation.class + ": id is missing");
        Objects.requireNonNull(state, ImportOperation.class + ": state is missing");
        Objects.requireNonNull(createdAt, ImportOperation.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ImportOperation.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(expiresAt, ImportOperation.class + ": expiresAt is missing");
        return new ImportOperationImpl(version, importSinkKey, resourceKey, id, state, resourceVersion, errors,
            unresolvedReferences, createdAt, lastModifiedAt, expiresAt);
    }

    /**
     * builds ImportOperation without checking for non null required values
     */
    public ImportOperation buildUnchecked() {
        return new ImportOperationImpl(version, importSinkKey, resourceKey, id, state, resourceVersion, errors,
            unresolvedReferences, createdAt, lastModifiedAt, expiresAt);
    }

    public static ImportOperationBuilder of() {
        return new ImportOperationBuilder();
    }

    public static ImportOperationBuilder of(final ImportOperation template) {
        ImportOperationBuilder builder = new ImportOperationBuilder();
        builder.version = template.getVersion();
        builder.importSinkKey = template.getImportSinkKey();
        builder.resourceKey = template.getResourceKey();
        builder.id = template.getId();
        builder.state = template.getState();
        builder.resourceVersion = template.getResourceVersion();
        builder.errors = template.getErrors();
        builder.unresolvedReferences = template.getUnresolvedReferences();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.expiresAt = template.getExpiresAt();
        return builder;
    }

}
