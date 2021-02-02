
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
public final class TypeChangeFieldDefinitionOrderActionImpl implements TypeChangeFieldDefinitionOrderAction {

    private String action;

    private java.util.List<String> fieldNames;

    @JsonCreator
    TypeChangeFieldDefinitionOrderActionImpl(@JsonProperty("fieldNames") final java.util.List<String> fieldNames) {
        this.fieldNames = fieldNames;
        this.action = CHANGE_FIELD_DEFINITION_ORDER;
    }

    public TypeChangeFieldDefinitionOrderActionImpl() {
        this.action = CHANGE_FIELD_DEFINITION_ORDER;
    }

    public String getAction() {
        return this.action;
    }

    public java.util.List<String> getFieldNames() {
        return this.fieldNames;
    }

    public void setFieldNames(final String... fieldNames) {
        this.fieldNames = new ArrayList<>(Arrays.asList(fieldNames));
    }

    public void setFieldNames(final java.util.List<String> fieldNames) {
        this.fieldNames = fieldNames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TypeChangeFieldDefinitionOrderActionImpl that = (TypeChangeFieldDefinitionOrderActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(fieldNames, that.fieldNames).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(fieldNames).toHashCode();
    }

}
