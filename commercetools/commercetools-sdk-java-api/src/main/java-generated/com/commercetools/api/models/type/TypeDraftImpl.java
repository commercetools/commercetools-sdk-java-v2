
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
public class TypeDraftImpl implements TypeDraft, ModelBase {

    private String key;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString description;

    private java.util.List<com.commercetools.api.models.type.ResourceTypeId> resourceTypeIds;

    private java.util.List<com.commercetools.api.models.type.FieldDefinition> fieldDefinitions;

    @JsonCreator
    TypeDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("resourceTypeIds") final java.util.List<com.commercetools.api.models.type.ResourceTypeId> resourceTypeIds,
            @JsonProperty("fieldDefinitions") final java.util.List<com.commercetools.api.models.type.FieldDefinition> fieldDefinitions) {
        this.key = key;
        this.name = name;
        this.description = description;
        this.resourceTypeIds = resourceTypeIds;
        this.fieldDefinitions = fieldDefinitions;
    }

    public TypeDraftImpl() {
    }

    /**
    *  <p>User-defined unique identifier for the Type.</p>
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

        TypeDraftImpl that = (TypeDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(name, that.name)
                .append(description, that.description)
                .append(resourceTypeIds, that.resourceTypeIds)
                .append(fieldDefinitions, that.fieldDefinitions)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(name)
                .append(description)
                .append(resourceTypeIds)
                .append(fieldDefinitions)
                .toHashCode();
    }

}
