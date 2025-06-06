
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
 *  <p>Serves as the entry point of resources. An Import Container is not resource type-specific.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImportContainerImpl implements ImportContainer, ModelBase {

    private String key;

    private com.commercetools.importapi.models.common.ImportResourceType resourceType;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ImportContainerImpl(@JsonProperty("key") final String key,
            @JsonProperty("resourceType") final com.commercetools.importapi.models.common.ImportResourceType resourceType,
            @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt) {
        this.key = key;
        this.resourceType = resourceType;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
    }

    /**
     * create empty instance
     */
    public ImportContainerImpl() {
    }

    /**
     *  <p>User-defined unique identifier for the ImportContainer. Keys can only contain alphanumeric characters (a-Z, 0-9), underscores and hyphens (_, -).</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The resource type the ImportContainer is able to handle. If not present, the ImportContainer is able to import all of the supported ImportResourceTypes.</p>
     */

    public com.commercetools.importapi.models.common.ImportResourceType getResourceType() {
        return this.resourceType;
    }

    /**
     *  <p>The version of the ImportContainer.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>The time when the ImportContainer was created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>The last time when the ImportContainer was modified.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
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

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
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
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(key, that.key)
                .append(resourceType, that.resourceType)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(resourceType)
                .append(version)
                .append(createdAt)
                .append(lastModifiedAt)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("resourceType", resourceType)
                .append("version", version)
                .append("createdAt", createdAt)
                .append("lastModifiedAt", lastModifiedAt)
                .build();
    }

    @Override
    public ImportContainer copyDeep() {
        return ImportContainer.deepCopy(this);
    }
}
