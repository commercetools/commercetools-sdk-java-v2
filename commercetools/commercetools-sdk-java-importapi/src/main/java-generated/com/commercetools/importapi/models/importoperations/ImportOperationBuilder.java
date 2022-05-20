
package com.commercetools.importapi.models.importoperations;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ImportOperationBuilder implements Builder<ImportOperation> {

    private Long version;

    private String importContainerKey;

    private String resourceKey;

    private String id;

    private com.commercetools.importapi.models.common.ProcessingState state;

    @Nullable
    private Long resourceVersion;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.errors.ErrorObject> errors;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.common.UnresolvedReferences> unresolvedReferences;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private java.time.ZonedDateTime expiresAt;

    /**
    *  <p>The version of the ImportOperation.</p>
    */

    public ImportOperationBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
    *  <p>The key of the importContainer.</p>
    */

    public ImportOperationBuilder importContainerKey(final String importContainerKey) {
        this.importContainerKey = importContainerKey;
        return this;
    }

    /**
    *  <p>The key of the resource.</p>
    */

    public ImportOperationBuilder resourceKey(final String resourceKey) {
        this.resourceKey = resourceKey;
        return this;
    }

    /**
    *  <p>The ID of the ImportOperation.</p>
    */

    public ImportOperationBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
    *  <p>The import status of the resource. Set to <code>rejected</code> or <code>validationFailed</code> if the import of the resource was not successful.</p>
    */

    public ImportOperationBuilder state(final com.commercetools.importapi.models.common.ProcessingState state) {
        this.state = state;
        return this;
    }

    /**
    *  <p>The version of the impmorted resource when the import was successful.</p>
    */

    public ImportOperationBuilder resourceVersion(@Nullable final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
    *  <p>Contains an error if the import of the resource was not successful. See Errors.</p>
    */

    public ImportOperationBuilder errors(
            @Nullable final com.commercetools.importapi.models.errors.ErrorObject... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
        return this;
    }

    /**
    *  <p>Contains an error if the import of the resource was not successful. See Errors.</p>
    */

    public ImportOperationBuilder errors(
            @Nullable final java.util.List<com.commercetools.importapi.models.errors.ErrorObject> errors) {
        this.errors = errors;
        return this;
    }

    /**
    *  <p>Contains an error if the import of the resource was not successful. See Errors.</p>
    */

    public ImportOperationBuilder plusErrors(
            @Nullable final com.commercetools.importapi.models.errors.ErrorObject... errors) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.addAll(Arrays.asList(errors));
        return this;
    }

    /**
    *  <p>Contains an error if the import of the resource was not successful. See Errors.</p>
    */

    public ImportOperationBuilder plusErrors(
            Function<com.commercetools.importapi.models.errors.ErrorObjectBuilder, Builder<? extends com.commercetools.importapi.models.errors.ErrorObject>> builder) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(builder.apply(com.commercetools.importapi.models.errors.ErrorObjectBuilder.of()).build());
        return this;
    }

    /**
    *  <p>Contains an error if the import of the resource was not successful. See Errors.</p>
    */

    public ImportOperationBuilder withErrors(
            Function<com.commercetools.importapi.models.errors.ErrorObjectBuilder, Builder<? extends com.commercetools.importapi.models.errors.ErrorObject>> builder) {
        this.errors = new ArrayList<>();
        this.errors.add(builder.apply(com.commercetools.importapi.models.errors.ErrorObjectBuilder.of()).build());
        return this;
    }

    /**
    *  <p>In case of unresolved status this array will show the unresolved references</p>
    */

    public ImportOperationBuilder unresolvedReferences(
            @Nullable final com.commercetools.importapi.models.common.UnresolvedReferences... unresolvedReferences) {
        this.unresolvedReferences = new ArrayList<>(Arrays.asList(unresolvedReferences));
        return this;
    }

    /**
    *  <p>In case of unresolved status this array will show the unresolved references</p>
    */

    public ImportOperationBuilder unresolvedReferences(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.UnresolvedReferences> unresolvedReferences) {
        this.unresolvedReferences = unresolvedReferences;
        return this;
    }

    /**
    *  <p>In case of unresolved status this array will show the unresolved references</p>
    */

    public ImportOperationBuilder plusUnresolvedReferences(
            @Nullable final com.commercetools.importapi.models.common.UnresolvedReferences... unresolvedReferences) {
        if (this.unresolvedReferences == null) {
            this.unresolvedReferences = new ArrayList<>();
        }
        this.unresolvedReferences.addAll(Arrays.asList(unresolvedReferences));
        return this;
    }

    /**
    *  <p>In case of unresolved status this array will show the unresolved references</p>
    */

    public ImportOperationBuilder plusUnresolvedReferences(
            Function<com.commercetools.importapi.models.common.UnresolvedReferencesBuilder, com.commercetools.importapi.models.common.UnresolvedReferencesBuilder> builder) {
        if (this.unresolvedReferences == null) {
            this.unresolvedReferences = new ArrayList<>();
        }
        this.unresolvedReferences
                .add(builder.apply(com.commercetools.importapi.models.common.UnresolvedReferencesBuilder.of()).build());
        return this;
    }

    /**
    *  <p>In case of unresolved status this array will show the unresolved references</p>
    */

    public ImportOperationBuilder withUnresolvedReferences(
            Function<com.commercetools.importapi.models.common.UnresolvedReferencesBuilder, com.commercetools.importapi.models.common.UnresolvedReferencesBuilder> builder) {
        this.unresolvedReferences = new ArrayList<>();
        this.unresolvedReferences
                .add(builder.apply(com.commercetools.importapi.models.common.UnresolvedReferencesBuilder.of()).build());
        return this;
    }

    /**
    *  <p>The time when the ImportOperation was created.</p>
    */

    public ImportOperationBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
    *  <p>The last time When the ImportOperation was modified.</p>
    */

    public ImportOperationBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
    *  <p>The expiration time of the ImportOperation.</p>
    */

    public ImportOperationBuilder expiresAt(final java.time.ZonedDateTime expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public String getImportContainerKey() {
        return this.importContainerKey;
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
    public java.util.List<com.commercetools.importapi.models.common.UnresolvedReferences> getUnresolvedReferences() {
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
        Objects.requireNonNull(importContainerKey, ImportOperation.class + ": importContainerKey is missing");
        Objects.requireNonNull(resourceKey, ImportOperation.class + ": resourceKey is missing");
        Objects.requireNonNull(id, ImportOperation.class + ": id is missing");
        Objects.requireNonNull(state, ImportOperation.class + ": state is missing");
        Objects.requireNonNull(createdAt, ImportOperation.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ImportOperation.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(expiresAt, ImportOperation.class + ": expiresAt is missing");
        return new ImportOperationImpl(version, importContainerKey, resourceKey, id, state, resourceVersion, errors,
            unresolvedReferences, createdAt, lastModifiedAt, expiresAt);
    }

    /**
     * builds ImportOperation without checking for non null required values
     */
    public ImportOperation buildUnchecked() {
        return new ImportOperationImpl(version, importContainerKey, resourceKey, id, state, resourceVersion, errors,
            unresolvedReferences, createdAt, lastModifiedAt, expiresAt);
    }

    public static ImportOperationBuilder of() {
        return new ImportOperationBuilder();
    }

    public static ImportOperationBuilder of(final ImportOperation template) {
        ImportOperationBuilder builder = new ImportOperationBuilder();
        builder.version = template.getVersion();
        builder.importContainerKey = template.getImportContainerKey();
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
