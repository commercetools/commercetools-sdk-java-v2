
package com.commercetools.importapi.models.types;

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
 *  <p>Represents the data used to import a Type. Once imported, this data is persisted as a <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> in the Project.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeImportImpl implements TypeImport, ModelBase {

    private String key;

    private com.commercetools.importapi.models.common.LocalizedString name;

    private com.commercetools.importapi.models.common.LocalizedString description;

    private java.util.List<com.commercetools.importapi.models.types.ResourceTypeId> resourceTypeIds;

    private java.util.List<com.commercetools.importapi.models.types.FieldDefinition> fieldDefinitions;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TypeImportImpl(@JsonProperty("key") final String key,
            @JsonProperty("name") final com.commercetools.importapi.models.common.LocalizedString name,
            @JsonProperty("description") final com.commercetools.importapi.models.common.LocalizedString description,
            @JsonProperty("resourceTypeIds") final java.util.List<com.commercetools.importapi.models.types.ResourceTypeId> resourceTypeIds,
            @JsonProperty("fieldDefinitions") final java.util.List<com.commercetools.importapi.models.types.FieldDefinition> fieldDefinitions) {
        this.key = key;
        this.name = name;
        this.description = description;
        this.resourceTypeIds = resourceTypeIds;
        this.fieldDefinitions = fieldDefinitions;
    }

    /**
     * create empty instance
     */
    public TypeImportImpl() {
    }

    /**
     *  <p>User-defined unique identifier for the Type. If a <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> with this <code>key</code> exists, it is updated with the imported data.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Maps to <code>Type.name</code>.</p>
     */

    public com.commercetools.importapi.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Maps to <code>Type.description</code>.</p>
     */

    public com.commercetools.importapi.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Maps to <code>Type.resourceTypeIds</code>. This value cannot be changed after the Type is imported.</p>
     */

    public java.util.List<com.commercetools.importapi.models.types.ResourceTypeId> getResourceTypeIds() {
        return this.resourceTypeIds;
    }

    /**
     *  <p>Maps to <code>Type.fieldDefinitions</code>.</p>
     */

    public java.util.List<com.commercetools.importapi.models.types.FieldDefinition> getFieldDefinitions() {
        return this.fieldDefinitions;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setName(final com.commercetools.importapi.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setDescription(final com.commercetools.importapi.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setResourceTypeIds(final com.commercetools.importapi.models.types.ResourceTypeId... resourceTypeIds) {
        this.resourceTypeIds = new ArrayList<>(Arrays.asList(resourceTypeIds));
    }

    public void setResourceTypeIds(
            final java.util.List<com.commercetools.importapi.models.types.ResourceTypeId> resourceTypeIds) {
        this.resourceTypeIds = resourceTypeIds;
    }

    public void setFieldDefinitions(
            final com.commercetools.importapi.models.types.FieldDefinition... fieldDefinitions) {
        this.fieldDefinitions = new ArrayList<>(Arrays.asList(fieldDefinitions));
    }

    public void setFieldDefinitions(
            final java.util.List<com.commercetools.importapi.models.types.FieldDefinition> fieldDefinitions) {
        this.fieldDefinitions = fieldDefinitions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TypeImportImpl that = (TypeImportImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(name, that.name)
                .append(description, that.description)
                .append(resourceTypeIds, that.resourceTypeIds)
                .append(fieldDefinitions, that.fieldDefinitions)
                .append(key, that.key)
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("name", name)
                .append("description", description)
                .append("resourceTypeIds", resourceTypeIds)
                .append("fieldDefinitions", fieldDefinitions)
                .build();
    }

    @Override
    public TypeImport copyDeep() {
        return TypeImport.deepCopy(this);
    }
}
