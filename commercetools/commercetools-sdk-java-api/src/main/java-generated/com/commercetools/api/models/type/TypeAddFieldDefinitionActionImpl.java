
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TypeAddFieldDefinitionActionImpl implements TypeAddFieldDefinitionAction {

    private String action;

    private com.commercetools.api.models.type.FieldDefinition fieldDefinition;

    @JsonCreator
    TypeAddFieldDefinitionActionImpl(
            @JsonProperty("fieldDefinition") final com.commercetools.api.models.type.FieldDefinition fieldDefinition) {
        this.fieldDefinition = fieldDefinition;
        this.action = ADD_FIELD_DEFINITION;
    }

    public TypeAddFieldDefinitionActionImpl() {
        this.action = ADD_FIELD_DEFINITION;
    }

    public String getAction() {
        return this.action;
    }

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

        return new EqualsBuilder().append(action, that.action).append(fieldDefinition, that.fieldDefinition).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(fieldDefinition).toHashCode();
    }

}
