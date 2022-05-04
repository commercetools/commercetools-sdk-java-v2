
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class TypeImpl implements Type, ModelBase {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.common.CreatedBy createdBy;

    private String key;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString description;

    private java.util.List<com.commercetools.api.models.type.ResourceTypeId> resourceTypeIds;

    private java.util.List<com.commercetools.api.models.type.FieldDefinition> fieldDefinitions;

    @JsonCreator
    TypeImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy,
            @JsonProperty("key") final String key,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("resourceTypeIds") final java.util.List<com.commercetools.api.models.type.ResourceTypeId> resourceTypeIds,
            @JsonProperty("fieldDefinitions") final java.util.List<com.commercetools.api.models.type.FieldDefinition> fieldDefinitions) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.key = key;
        this.name = name;
        this.description = description;
        this.resourceTypeIds = resourceTypeIds;
        this.fieldDefinitions = fieldDefinitions;
    }

    public TypeImpl() {
    }

    /**
    *  <p>Platform-generated unique identifier of the Type.</p>
    */
    public String getId() {
        return this.id;
    }

    /**
    *  <p>Current version of the Type.</p>
    */
    public Long getVersion() {
        return this.version;
    }

    /**
    *  <p>Date and time (UTC) the Type was initially created.</p>
    */
    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
    *  <p>Date and time (UTC) the Type was last updated.</p>
    */
    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/../api/client-logging#events-tracked">events not tracked</a>.</p>
    */
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/../api/client-logging#events-tracked">events not tracked</a>.</p>
    */
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
    *  <p>User-defined unique identifier of the Type.</p>
    */
    public String getKey() {
        return this.key;
    }

    /**
    *  <p>Name of the Type.</p>
    */
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
    *  <p>Description of the Type.</p>
    */
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
    *  <p>Resources and/or data types for which the Type is defined.</p>
    */
    public java.util.List<com.commercetools.api.models.type.ResourceTypeId> getResourceTypeIds() {
        return this.resourceTypeIds;
    }

    /**
    *  <p>Defines Custom Fields.</p>
    */
    public java.util.List<com.commercetools.api.models.type.FieldDefinition> getFieldDefinitions() {
        return this.fieldDefinitions;
    }

    public void setId(final String id) {
        this.id = id;
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

    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setResourceTypeIds(final com.commercetools.api.models.type.ResourceTypeId... resourceTypeIds) {
        this.resourceTypeIds = new ArrayList<>(Arrays.asList(resourceTypeIds));
    }

    public void setResourceTypeIds(
            final java.util.List<com.commercetools.api.models.type.ResourceTypeId> resourceTypeIds) {
        this.resourceTypeIds = resourceTypeIds;
    }

    public void setFieldDefinitions(final com.commercetools.api.models.type.FieldDefinition... fieldDefinitions) {
        this.fieldDefinitions = new ArrayList<>(Arrays.asList(fieldDefinitions));
    }

    public void setFieldDefinitions(
            final java.util.List<com.commercetools.api.models.type.FieldDefinition> fieldDefinitions) {
        this.fieldDefinitions = fieldDefinitions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TypeImpl that = (TypeImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(key, that.key)
                .append(name, that.name)
                .append(description, that.description)
                .append(resourceTypeIds, that.resourceTypeIds)
                .append(fieldDefinitions, that.fieldDefinitions)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(version)
                .append(createdAt)
                .append(lastModifiedAt)
                .append(lastModifiedBy)
                .append(createdBy)
                .append(key)
                .append(name)
                .append(description)
                .append(resourceTypeIds)
                .append(fieldDefinitions)
                .toHashCode();
    }

}
