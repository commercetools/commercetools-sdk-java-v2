
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
public final class TypeChangeEnumValueLabelActionImpl implements TypeChangeEnumValueLabelAction {

    private String action;

    private String fieldName;

    private com.commercetools.api.models.type.CustomFieldEnumValue value;

    @JsonCreator
    TypeChangeEnumValueLabelActionImpl(@JsonProperty("fieldName") final String fieldName,
            @JsonProperty("value") final com.commercetools.api.models.type.CustomFieldEnumValue value) {
        this.fieldName = fieldName;
        this.value = value;
        this.action = CHANGE_ENUM_VALUE_LABEL;
    }

    public TypeChangeEnumValueLabelActionImpl() {
        this.action = CHANGE_ENUM_VALUE_LABEL;
    }

    public String getAction() {
        return this.action;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public com.commercetools.api.models.type.CustomFieldEnumValue getValue() {
        return this.value;
    }

    public void setFieldName(final String fieldName) {
        this.fieldName = fieldName;
    }

    public void setValue(final com.commercetools.api.models.type.CustomFieldEnumValue value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TypeChangeEnumValueLabelActionImpl that = (TypeChangeEnumValueLabelActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(fieldName, that.fieldName).append(value,
            that.value).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(fieldName).append(value).toHashCode();
    }

}
