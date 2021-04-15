
package com.commercetools.api.models.type;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TypeBuilder {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private String key;

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    private java.util.List<com.commercetools.api.models.type.ResourceTypeId> resourceTypeIds;

    private java.util.List<com.commercetools.api.models.type.FieldDefinition> fieldDefinitions;

    public TypeBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public TypeBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public TypeBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public TypeBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public TypeBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public TypeBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public TypeBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public TypeBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public TypeBuilder description(@Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    public TypeBuilder resourceTypeIds(final com.commercetools.api.models.type.ResourceTypeId... resourceTypeIds) {
        this.resourceTypeIds = new ArrayList<>(Arrays.asList(resourceTypeIds));
        return this;
    }

    public TypeBuilder resourceTypeIds(
            final java.util.List<com.commercetools.api.models.type.ResourceTypeId> resourceTypeIds) {
        this.resourceTypeIds = resourceTypeIds;
        return this;
    }

    public TypeBuilder fieldDefinitions(final com.commercetools.api.models.type.FieldDefinition... fieldDefinitions) {
        this.fieldDefinitions = new ArrayList<>(Arrays.asList(fieldDefinitions));
        return this;
    }

    public TypeBuilder fieldDefinitions(
            final java.util.List<com.commercetools.api.models.type.FieldDefinition> fieldDefinitions) {
        this.fieldDefinitions = fieldDefinitions;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    public String getKey() {
        return this.key;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public java.util.List<com.commercetools.api.models.type.ResourceTypeId> getResourceTypeIds() {
        return this.resourceTypeIds;
    }

    public java.util.List<com.commercetools.api.models.type.FieldDefinition> getFieldDefinitions() {
        return this.fieldDefinitions;
    }

    public Type build() {
        return new TypeImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, name, description,
            resourceTypeIds, fieldDefinitions);
    }

    public static TypeBuilder of() {
        return new TypeBuilder();
    }

    public static TypeBuilder of(final Type template) {
        TypeBuilder builder = new TypeBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.resourceTypeIds = template.getResourceTypeIds();
        builder.fieldDefinitions = template.getFieldDefinitions();
        return builder;
    }

}
