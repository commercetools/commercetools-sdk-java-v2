
package com.commercetools.api.models.type;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TypeDraftBuilder {

    private String key;

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    private java.util.List<com.commercetools.api.models.type.ResourceTypeId> resourceTypeIds;

    @Nullable
    private java.util.List<com.commercetools.api.models.type.FieldDefinition> fieldDefinitions;

    public TypeDraftBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public TypeDraftBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public TypeDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    public TypeDraftBuilder resourceTypeIds(final com.commercetools.api.models.type.ResourceTypeId... resourceTypeIds) {
        this.resourceTypeIds = new ArrayList<>(Arrays.asList(resourceTypeIds));
        return this;
    }

    public TypeDraftBuilder resourceTypeIds(
            final java.util.List<com.commercetools.api.models.type.ResourceTypeId> resourceTypeIds) {
        this.resourceTypeIds = resourceTypeIds;
        return this;
    }

    public TypeDraftBuilder fieldDefinitions(
            @Nullable final com.commercetools.api.models.type.FieldDefinition... fieldDefinitions) {
        this.fieldDefinitions = new ArrayList<>(Arrays.asList(fieldDefinitions));
        return this;
    }

    public TypeDraftBuilder fieldDefinitions(
            @Nullable final java.util.List<com.commercetools.api.models.type.FieldDefinition> fieldDefinitions) {
        this.fieldDefinitions = fieldDefinitions;
        return this;
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

    @Nullable
    public java.util.List<com.commercetools.api.models.type.FieldDefinition> getFieldDefinitions() {
        return this.fieldDefinitions;
    }

    public TypeDraft build() {
        return new TypeDraftImpl(key, name, description, resourceTypeIds, fieldDefinitions);
    }

    public static TypeDraftBuilder of() {
        return new TypeDraftBuilder();
    }

    public static TypeDraftBuilder of(final TypeDraft template) {
        TypeDraftBuilder builder = new TypeDraftBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.resourceTypeIds = template.getResourceTypeIds();
        builder.fieldDefinitions = template.getFieldDefinitions();
        return builder;
    }

}
