
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
 *  <p>Adds a value to an EnumType. This update action can be used to update an EnumType FieldDefinition and a SetType FieldDefinition of EnumType.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeAddEnumValueActionImpl implements TypeAddEnumValueAction, ModelBase {

    private String action;

    private String fieldName;

    private com.commercetools.api.models.type.CustomFieldEnumValue value;

    @JsonCreator
    TypeAddEnumValueActionImpl(@JsonProperty("fieldName") final String fieldName,
            @JsonProperty("value") final com.commercetools.api.models.type.CustomFieldEnumValue value) {
        this.fieldName = fieldName;
        this.value = value;
        this.action = ADD_ENUM_VALUE;
    }

    public TypeAddEnumValueActionImpl() {
        this.action = ADD_ENUM_VALUE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>name</code> of the Field Definition to update.</p>
     */

    public String getFieldName() {
        return this.fieldName;
    }

    /**
     *  <p>Value to append to the array.</p>
     */

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

        TypeAddEnumValueActionImpl that = (TypeAddEnumValueActionImpl) o;

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
