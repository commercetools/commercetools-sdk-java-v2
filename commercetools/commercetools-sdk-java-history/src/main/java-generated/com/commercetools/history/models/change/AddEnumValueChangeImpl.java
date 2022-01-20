
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class AddEnumValueChangeImpl implements AddEnumValueChange, ModelBase {

    private String type;

    private String change;

    private String fieldName;

    private com.commercetools.history.models.change_value.EnumValue nextValue;

    @JsonCreator
    AddEnumValueChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("fieldName") final String fieldName,
            @JsonProperty("nextValue") final com.commercetools.history.models.change_value.EnumValue nextValue) {
        this.change = change;
        this.fieldName = fieldName;
        this.nextValue = nextValue;
        this.type = ADD_ENUM_VALUE_CHANGE;
    }

    public AddEnumValueChangeImpl() {
        this.type = ADD_ENUM_VALUE_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>addEnumValue</code> on types</p>
    */
    public String getChange() {
        return this.change;
    }

    /**
    *  <p>The name of the field/attribute definition updated.</p>
    */
    public String getFieldName() {
        return this.fieldName;
    }

    public com.commercetools.history.models.change_value.EnumValue getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setFieldName(final String fieldName) {
        this.fieldName = fieldName;
    }

    public void setNextValue(final com.commercetools.history.models.change_value.EnumValue nextValue) {
        this.nextValue = nextValue;
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
                .append(fieldName, that.fieldName)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(change).append(fieldName).append(nextValue).toHashCode();
    }

}
