
package com.commercetools.importapi.models.importoperations;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Tracks the status of a single import resource as it is imported into the commercetools project.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ImportOperationImpl implements ImportOperation {

    private Long version;

    private String importSinkKey;

    private String resourceKey;

    private String id;

    private com.commercetools.importapi.models.common.ProcessingState state;

    private Long resourceVersion;

    private Integer retryCount;

    private java.util.List<com.commercetools.importapi.models.errors.ErrorObject> errors;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private java.time.ZonedDateTime expiresAt;

    @JsonCreator
    ImportOperationImpl(@JsonProperty("version") final Long version,
            @JsonProperty("importSinkKey") final String importSinkKey,
            @JsonProperty("resourceKey") final String resourceKey, @JsonProperty("id") final String id,
            @JsonProperty("state") final com.commercetools.importapi.models.common.ProcessingState state,
            @JsonProperty("resourceVersion") final Long resourceVersion,
            @JsonProperty("retryCount") final Integer retryCount,
            @JsonProperty("errors") final java.util.List<com.commercetools.importapi.models.errors.ErrorObject> errors,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("expiresAt") final java.time.ZonedDateTime expiresAt) {
        this.version = version;
        this.importSinkKey = importSinkKey;
        this.resourceKey = resourceKey;
        this.id = id;
        this.state = state;
        this.resourceVersion = resourceVersion;
        this.retryCount = retryCount;
        this.errors = errors;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.expiresAt = expiresAt;
    }

    public ImportOperationImpl() {
    }

    /**
    *  <p>The import operation version.</p>
    */
    public Long getVersion() {
        return this.version;
    }

    /**
    *  <p>The key of the import sink.</p>
    */
    public String getImportSinkKey() {
        return this.importSinkKey;
    }

    /**
    *  <p>The key of the import resource.</p>
    */
    public String getResourceKey() {
        return this.resourceKey;
    }

    /**
    *  <p>The identifier of the operaton that is to be commited</p>
    */
    public String getId() {
        return this.id;
    }

    /**
    *  <p>The status of the import resource.</p>
    */
    public com.commercetools.importapi.models.common.ProcessingState getState() {
        return this.state;
    }

    /**
    *  <p>When the resource is successfully imported, this represents the imported resource version</p>
    */
    public Long getResourceVersion() {
        return this.resourceVersion;
    }

    /**
    *  <p>The number of request retries for processing the import resource.</p>
    */
    public Integer getRetryCount() {
        return this.retryCount;
    }

    /**
    *  <p>If an import resource does not import correctly, the state is set to <code>Rejected</code> or <code>ValidationFailed</code>
    *  and this property contains the errors.</p>
    */
    public java.util.List<com.commercetools.importapi.models.errors.ErrorObject> getErrors() {
        return this.errors;
    }

    /**
    *  <p>When the import operation was created.</p>
    */
    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
    *  <p>When the import operation was modified.</p>
    */
    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
    *  <p>When the import operation expires.</p>
    */
    public java.time.ZonedDateTime getExpiresAt() {
        return this.expiresAt;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setImportSinkKey(final String importSinkKey) {
        this.importSinkKey = importSinkKey;
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

    public void setRetryCount(final Integer retryCount) {
        this.retryCount = retryCount;
    }

    public void setErrors(final com.commercetools.importapi.models.errors.ErrorObject... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
    }

    public void setErrors(final java.util.List<com.commercetools.importapi.models.errors.ErrorObject> errors) {
        this.errors = errors;
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

        return new EqualsBuilder().append(version, that.version).append(importSinkKey, that.importSinkKey).append(
            resourceKey, that.resourceKey).append(id, that.id).append(state, that.state).append(resourceVersion,
                that.resourceVersion).append(retryCount, that.retryCount).append(errors, that.errors).append(createdAt,
                    that.createdAt).append(lastModifiedAt, that.lastModifiedAt).append(expiresAt,
                        that.expiresAt).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(version).append(importSinkKey).append(resourceKey).append(id).append(
            state).append(resourceVersion).append(retryCount).append(errors).append(createdAt).append(
                lastModifiedAt).append(expiresAt).toHashCode();
    }

}
