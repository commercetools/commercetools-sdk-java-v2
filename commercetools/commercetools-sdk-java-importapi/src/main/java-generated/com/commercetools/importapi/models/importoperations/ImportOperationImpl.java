
package com.commercetools.importapi.models.importoperations;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Import Operation describes the import status of a specific resource.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ImportOperationImpl implements ImportOperation, ModelBase {

    private Long version;

    private String importContainerKey;

    private String resourceKey;

    private String id;

    private com.commercetools.importapi.models.common.ProcessingState state;

    private Long resourceVersion;

    private java.util.List<com.commercetools.importapi.models.errors.ErrorObject> errors;

    private java.util.List<com.commercetools.importapi.models.common.UnresolvedReferences> unresolvedReferences;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private java.time.ZonedDateTime expiresAt;

    @JsonCreator
    ImportOperationImpl(@JsonProperty("version") final Long version,
            @JsonProperty("importContainerKey") final String importContainerKey,
            @JsonProperty("resourceKey") final String resourceKey, @JsonProperty("id") final String id,
            @JsonProperty("state") final com.commercetools.importapi.models.common.ProcessingState state,
            @JsonProperty("resourceVersion") final Long resourceVersion,
            @JsonProperty("errors") final java.util.List<com.commercetools.importapi.models.errors.ErrorObject> errors,
            @JsonProperty("unresolvedReferences") final java.util.List<com.commercetools.importapi.models.common.UnresolvedReferences> unresolvedReferences,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("expiresAt") final java.time.ZonedDateTime expiresAt) {
        this.version = version;
        this.importContainerKey = importContainerKey;
        this.resourceKey = resourceKey;
        this.id = id;
        this.state = state;
        this.resourceVersion = resourceVersion;
        this.errors = errors;
        this.unresolvedReferences = unresolvedReferences;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.expiresAt = expiresAt;
    }

    public ImportOperationImpl() {
    }

    /**
    *  <p>The version of the ImportOperation.</p>
    */
    public Long getVersion() {
        return this.version;
    }

    /**
    *  <p>The key of the <a href="/import-container#importcontainer">importContainer</a>.</p>
    */
    public String getImportContainerKey() {
        return this.importContainerKey;
    }

    /**
    *  <p>The key of the resource.</p>
    */
    public String getResourceKey() {
        return this.resourceKey;
    }

    /**
    *  <p>The ID of the ImportOperation.</p>
    */
    public String getId() {
        return this.id;
    }

    /**
    *  <p>The import status of the resource. Set to <code>rejected</code> or <code>validationFailed</code> if the import of the resource was not successful.</p>
    */
    public com.commercetools.importapi.models.common.ProcessingState getState() {
        return this.state;
    }

    /**
    *  <p>The version of the impmorted resource when the import was successful.</p>
    */
    public Long getResourceVersion() {
        return this.resourceVersion;
    }

    /**
    *  <p>Contains an error if the import of the resource was not successful. See <a href="/error">Errors</a>.</p>
    */
    public java.util.List<com.commercetools.importapi.models.errors.ErrorObject> getErrors() {
        return this.errors;
    }

    /**
    *  <p>In case of unresolved status this array will show the unresolved references</p>
    */
    public java.util.List<com.commercetools.importapi.models.common.UnresolvedReferences> getUnresolvedReferences() {
        return this.unresolvedReferences;
    }

    /**
    *  <p>The time when the ImportOperation was created.</p>
    */
    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
    *  <p>The last time When the ImportOperation was modified.</p>
    */
    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
    *  <p>The expiration time of the ImportOperation.</p>
    */
    public java.time.ZonedDateTime getExpiresAt() {
        return this.expiresAt;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setImportContainerKey(final String importContainerKey) {
        this.importContainerKey = importContainerKey;
    }

    public void setResourceKey(final String resourceKey) {
        this.resourceKey = resourceKey;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setState(final com.commercetools.importapi.models.common.ProcessingState state) {
        this.state = state;
    }

    public void setResourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public void setErrors(final com.commercetools.importapi.models.errors.ErrorObject... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
    }

    public void setErrors(final java.util.List<com.commercetools.importapi.models.errors.ErrorObject> errors) {
        this.errors = errors;
    }

    public void setUnresolvedReferences(
            final com.commercetools.importapi.models.common.UnresolvedReferences... unresolvedReferences) {
        this.unresolvedReferences = new ArrayList<>(Arrays.asList(unresolvedReferences));
    }

    public void setUnresolvedReferences(
            final java.util.List<com.commercetools.importapi.models.common.UnresolvedReferences> unresolvedReferences) {
        this.unresolvedReferences = unresolvedReferences;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setExpiresAt(final java.time.ZonedDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ImportOperationImpl that = (ImportOperationImpl) o;

        return new EqualsBuilder().append(version, that.version)
                .append(importContainerKey, that.importContainerKey)
                .append(resourceKey, that.resourceKey)
                .append(id, that.id)
                .append(state, that.state)
                .append(resourceVersion, that.resourceVersion)
                .append(errors, that.errors)
                .append(unresolvedReferences, that.unresolvedReferences)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(expiresAt, that.expiresAt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(version)
                .append(importContainerKey)
                .append(resourceKey)
                .append(id)
                .append(state)
                .append(resourceVersion)
                .append(errors)
                .append(unresolvedReferences)
                .append(createdAt)
                .append(lastModifiedAt)
                .append(expiresAt)
                .toHashCode();
    }

}
