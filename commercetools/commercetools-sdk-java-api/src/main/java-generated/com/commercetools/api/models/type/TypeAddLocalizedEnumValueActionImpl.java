
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
*  <p>Adds a value to a <a href="ctp:api:type:CustomFieldLocalizedEnumType">LocalizedEnumType</a>.
*  This update action can be used to update a <a href="ctp:api:type:CustomFieldLocalizedEnumType">LocalizedEnumType</a> FieldDefinition and a <a href="ctp:api:type:CustomFieldSetType">SetType</a> FieldDefinition of <a href="ctp:api:type:CustomFieldLocalizedEnumType">CustomFieldLocalizedEnumType</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class TypeAddLocalizedEnumValueActionImpl implements TypeAddLocalizedEnumValueAction, ModelBase {

    private String action;

    private String fieldName;

    private com.commercetools.api.models.type.CustomFieldLocalizedEnumValue value;

    @JsonCreator
    TypeAddLocalizedEnumValueActionImpl(@JsonProperty("fieldName") final String fieldName,
            @JsonProperty("value") final com.commercetools.api.models.type.CustomFieldLocalizedEnumValue value) {
        this.fieldName = fieldName;
        this.value = value;
        this.action = ADD_LOCALIZED_ENUM_VALUE;
    }

    public TypeAddLocalizedEnumValueActionImpl() {
        this.action = ADD_LOCALIZED_ENUM_VALUE;
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
    *  <p>Value to append to the array.</p>
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

        TypeAddLocalizedEnumValueActionImpl that = (TypeAddLocalizedEnumValueActionImpl) o;

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
