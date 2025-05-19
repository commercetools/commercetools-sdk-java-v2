
package com.commercetools.history.models.change;

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
 *  <p>Change triggered by the Add EnumValue to FieldDefinition update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddEnumValueChangeImpl implements AddEnumValueChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.change_value.EnumValue nextValue;

    private String fieldName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AddEnumValueChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("nextValue") final com.commercetools.history.models.change_value.EnumValue nextValue,
            @JsonProperty("fieldName") final String fieldName) {
        this.change = change;
        this.nextValue = nextValue;
        this.fieldName = fieldName;
        this.type = ADD_ENUM_VALUE_CHANGE;
    }

    /**
     * create empty instance
     */
    public AddEnumValueChangeImpl() {
        this.type = ADD_ENUM_VALUE_CHANGE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public com.commercetools.history.models.change_value.EnumValue getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Name of the updated FieldDefinition.</p>
     */

    public String getFieldName() {
        return this.fieldName;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setNextValue(final com.commercetools.history.models.change_value.EnumValue nextValue) {
        this.nextValue = nextValue;
    }

    public void setFieldName(final String fieldName) {
        this.fieldName = fieldName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AddEnumValueChangeImpl that = (AddEnumValueChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(nextValue, that.nextValue)
                .append(fieldName, that.fieldName)
                .append(type, that.type)
                .append(change, that.change)
                .append(nextValue, that.nextValue)
                .append(fieldName, that.fieldName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(change).append(nextValue).append(fieldName).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("nextValue", nextValue)
                .append("fieldName", fieldName)
                .build();
    }

    @Override
    public AddEnumValueChange copyDeep() {
        return AddEnumValueChange.deepCopy(this);
    }
}
