
package com.commercetools.importapi.models.importoperations;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ImportOperationBuilder {

    private Long version;

    private String importSinkKey;

    private String resourceKey;

    private String id;

    private com.commercetools.importapi.models.common.ProcessingState state;

    @Nullable
    private Long resourceVersion;

    private Integer retryCount;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.errors.ErrorObject> errors;

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

    public ImportOperationBuilder retryCount(final Integer retryCount) {
        this.retryCount = retryCount;
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

    public Integer getRetryCount() {
        return this.retryCount;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.errors.ErrorObject> getErrors() {
        return this.errors;
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
        return new ImportOperationImpl(version, importSinkKey, resourceKey, id, state, resourceVersion, retryCount,
            errors, createdAt, lastModifiedAt, expiresAt);
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
        builder.retryCount = template.getRetryCount();
        builder.errors = template.getErrors();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.expiresAt = template.getExpiresAt();
        return builder;
    }

}
