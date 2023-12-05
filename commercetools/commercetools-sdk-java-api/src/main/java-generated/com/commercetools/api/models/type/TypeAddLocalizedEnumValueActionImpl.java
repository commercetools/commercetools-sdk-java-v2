
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
 *  <p>Adds a value to a LocalizedEnumType. This update action can be used to update a LocalizedEnumType FieldDefinition and a SetType FieldDefinition of CustomFieldLocalizedEnumType.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeAddLocalizedEnumValueActionImpl implements TypeAddLocalizedEnumValueAction, ModelBase {

    private String action;

    private String fieldName;

    private com.commercetools.api.models.type.CustomFieldLocalizedEnumValue value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TypeAddLocalizedEnumValueActionImpl(@JsonProperty("fieldName") final String fieldName,
            @JsonProperty("value") final com.commercetools.api.models.type.CustomFieldLocalizedEnumValue value) {
        this.fieldName = fieldName;
        this.value = value;
        this.action = ADD_LOCALIZED_ENUM_VALUE;
    }

    /**
     * create empty instance
     */
    public TypeAddLocalizedEnumValueActionImpl() {
        this.action = ADD_LOCALIZED_ENUM_VALUE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>name</code> of the FieldDefinition to update.</p>
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
                .append(action, that.action)
                .append(fieldName, that.fieldName)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(fieldName).append(value).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("fieldName", fieldName)
                .append("value", value)
                .build();
    }

}
