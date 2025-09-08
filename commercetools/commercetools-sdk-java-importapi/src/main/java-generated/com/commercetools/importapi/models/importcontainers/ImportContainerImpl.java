
package com.commercetools.importapi.models.importcontainers;

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
 *  <p>Contains the resources to be imported. Unless <code>resourceType</code> is specified, the ImportContainer can import all of the supported <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportResourceType" rel="nofollow">ImportResourceTypes</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImportContainerImpl implements ImportContainer, ModelBase {

    private String key;

    private com.commercetools.importapi.models.common.ImportResourceType resourceType;

    private Long version;

    private com.commercetools.importapi.models.importcontainers.RetentionPolicy retentionPolicy;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private java.time.ZonedDateTime expiresAt;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ImportContainerImpl(@JsonProperty("key") final String key,
            @JsonProperty("resourceType") final com.commercetools.importapi.models.common.ImportResourceType resourceType,
            @JsonProperty("version") final Long version,
            @JsonProperty("retentionPolicy") final com.commercetools.importapi.models.importcontainers.RetentionPolicy retentionPolicy,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("expiresAt") final java.time.ZonedDateTime expiresAt) {
        this.key = key;
        this.resourceType = resourceType;
        this.version = version;
        this.retentionPolicy = retentionPolicy;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.expiresAt = expiresAt;
    }

    /**
     * create empty instance
     */
    public ImportContainerImpl() {
    }

    /**
     *  <p>User-defined unique identifier of the ImportContainer.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportResourceType" rel="nofollow">resource type</a> the ImportContainer supports. If not present, the ImportContainer can import all of the supported <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportResourceType" rel="nofollow">ImportResourceTypes</a>.</p>
     */

    public com.commercetools.importapi.models.common.ImportResourceType getResourceType() {
        return this.resourceType;
    }

    /**
     *  <p>Current version of the ImportContainer.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>The retention policy of the ImportContainer.</p>
     */

    public com.commercetools.importapi.models.importcontainers.RetentionPolicy getRetentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     *  <p>Date and time (UTC) the ImportContainer was initially created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the ImportContainer was last updated.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>Date and time (UTC) the ImportContainer is automatically deleted. Only present if a <code>retentionPolicy</code> is set. ImportContainers without <code>expiresAt</code> are permanent until <span>manually deleted</span>.</p>
     */

    public java.time.ZonedDateTime getExpiresAt() {
        return this.expiresAt;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setResourceType(final com.commercetools.importapi.models.common.ImportResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setRetentionPolicy(
            final com.commercetools.importapi.models.importcontainers.RetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
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

        ImportContainerImpl that = (ImportContainerImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(resourceType, that.resourceType)
                .append(version, that.version)
                .append(retentionPolicy, that.retentionPolicy)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(expiresAt, that.expiresAt)
                .append(key, that.key)
                .append(resourceType, that.resourceType)
                .append(version, that.version)
                .append(retentionPolicy, that.retentionPolicy)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(expiresAt, that.expiresAt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(resourceType)
                .append(version)
                .append(retentionPolicy)
                .append(createdAt)
                .append(lastModifiedAt)
                .append(expiresAt)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("resourceType", resourceType)
                .append("version", version)
                .append("retentionPolicy", retentionPolicy)
                .append("createdAt", createdAt)
                .append("lastModifiedAt", lastModifiedAt)
                .append("expiresAt", expiresAt)
                .build();
    }

    @Override
    public ImportContainer copyDeep() {
        return ImportContainer.deepCopy(this);
    }
}
