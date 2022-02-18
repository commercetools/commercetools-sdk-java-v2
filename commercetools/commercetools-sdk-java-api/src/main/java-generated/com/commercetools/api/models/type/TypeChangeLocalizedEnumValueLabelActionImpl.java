
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

/**
*  <p>Changes the <code>label</code> of a <a href="ctp:api:type:CustomFieldLocalizedEnumValue">LocalizedEnumValue</a> of an <a href="ctp:api:type:CustomFieldLocalizedEnumType">LocalizedEnumType</a> FieldDefinition.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class TypeChangeLocalizedEnumValueLabelActionImpl implements TypeChangeLocalizedEnumValueLabelAction, ModelBase {

    private String action;

    private String fieldName;

    private com.commercetools.api.models.type.CustomFieldLocalizedEnumValue value;

    @JsonCreator
    TypeChangeLocalizedEnumValueLabelActionImpl(@JsonProperty("fieldName") final String fieldName,
            @JsonProperty("value") final com.commercetools.api.models.type.CustomFieldLocalizedEnumValue value) {
        this.fieldName = fieldName;
        this.value = value;
        this.action = CHANGE_LOCALIZED_ENUM_VALUE_LABEL;
    }

    public TypeChangeLocalizedEnumValueLabelActionImpl() {
        this.action = CHANGE_LOCALIZED_ENUM_VALUE_LABEL;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p><code>name</code> of the <a href="ctp:api:type:FieldDefinition">FieldDefinition</a> to update.</p>
    */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
    *  <p>New value to set.
    *  Must not be empty.</p>
    */
    public com.commercetools.api.models.type.CustomFieldLocalizedEnumValue getValue() {
        return this.value;
    }

    public void setFieldName(final String fieldName) {
        this.fieldName = fieldName;
    }

    public void setValue(final com.commercetools.api.models.type.CustomFieldLocalizedEnumValue value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TypeChangeLocalizedEnumValueLabelActionImpl that = (TypeChangeLocalizedEnumValueLabelActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(fieldName, that.fieldName)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(fieldName).append(value).toHashCode();
    }

}
