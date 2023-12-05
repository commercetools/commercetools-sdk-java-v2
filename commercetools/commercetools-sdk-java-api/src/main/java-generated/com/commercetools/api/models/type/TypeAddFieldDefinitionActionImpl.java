
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Defines a new field for a Type. Adding new required fields to a Type that is already referenced by existing entities can put those entities in a temporarily inconsistent state.</p>
 *  <p>If a Type that is already in use requires new fields, we recommend making them optional (<code>required</code> set to <code>false</code>) whenever possible. Alternatively, any new required fields should be added one at a time followed by an update to all the resources using the Type. This prevents validation errors caused by an entity missing more than one required custom field.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeAddFieldDefinitionActionImpl implements TypeAddFieldDefinitionAction, ModelBase {

    private String action;

    private com.commercetools.api.models.type.FieldDefinition fieldDefinition;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TypeAddFieldDefinitionActionImpl(
            @JsonProperty("fieldDefinition") final com.commercetools.api.models.type.FieldDefinition fieldDefinition) {
        this.fieldDefinition = fieldDefinition;
        this.action = ADD_FIELD_DEFINITION;
    }

    /**
     * create empty instance
     */
    public TypeAddFieldDefinitionActionImpl() {
        this.action = ADD_FIELD_DEFINITION;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to append to the array.</p>
     */

    public com.commercetools.api.models.type.FieldDefinition getFieldDefinition() {
        return this.fieldDefinition;
    }

    public void setFieldDefinition(final com.commercetools.api.models.type.FieldDefinition fieldDefinition) {
        this.fieldDefinition = fieldDefinition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TypeAddFieldDefinitionActionImpl that = (TypeAddFieldDefinitionActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(fieldDefinition, that.fieldDefinition)
                .append(action, that.action)
                .append(fieldDefinition, that.fieldDefinition)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(fieldDefinition).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("fieldDefinition", fieldDefinition)
                .build();
    }

}
