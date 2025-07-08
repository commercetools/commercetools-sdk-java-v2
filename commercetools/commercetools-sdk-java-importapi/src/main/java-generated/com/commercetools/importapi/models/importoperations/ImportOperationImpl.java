
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Represents the import status of a resource.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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

    /**
     * create instance with all properties
     */
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

    /**
     * create empty instance
     */
    public ImportOperationImpl() {
    }

    /**
     *  <p>Current version of the ImportOperation.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p><code>key</code> of the ImportContainer.</p>
     */

    public String getImportContainerKey() {
        return this.importContainerKey;
    }

    /**
     *  <p><code>key</code> of the resource being imported.</p>
     */

    public String getResourceKey() {
        return this.resourceKey;
    }

    /**
     *  <p>Unique identifier of the ImportOperation.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>The import status of the resource. If <code>rejected</code> or <code>validationFailed</code>, the import was unsuccessful.</p>
     */

    public com.commercetools.importapi.models.common.ProcessingState getState() {
        return this.state;
    }

    /**
     *  <p>The <code>version</code> of the imported resource when the import was successful.</p>
     */

    public Long getResourceVersion() {
        return this.resourceVersion;
    }

    /**
     *  <p>Contains errors if the import was unsuccessful. See Errors.</p>
     */

    public java.util.List<com.commercetools.importapi.models.errors.ErrorObject> getErrors() {
        return this.errors;
    }

    /**
     *  <p>If the resource being imported contains references to resources which do not exist, these references are contained within this array.</p>
     */

    public java.util.List<com.commercetools.importapi.models.common.UnresolvedReferences> getUnresolvedReferences() {
        return this.unresolvedReferences;
    }

    /**
     *  <p>Date and time (UTC) the ImportOperation was created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the ImportOperation was last updated.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>Date and time (UTC) the ImportOperation will be deleted.</p>
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
                .append(version, that.version)
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("version", version)
                .append("importContainerKey", importContainerKey)
                .append("resourceKey", resourceKey)
                .append("id", id)
                .append("state", state)
                .append("resourceVersion", resourceVersion)
                .append("errors", errors)
                .append("unresolvedReferences", unresolvedReferences)
                .append("createdAt", createdAt)
                .append("lastModifiedAt", lastModifiedAt)
                .append("expiresAt", expiresAt)
                .build();
    }

    @Override
    public ImportOperation copyDeep() {
        return ImportOperation.deepCopy(this);
    }
}
