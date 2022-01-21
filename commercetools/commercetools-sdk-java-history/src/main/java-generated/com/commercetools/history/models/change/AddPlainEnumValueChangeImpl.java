
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
public class AddPlainEnumValueChangeImpl implements AddPlainEnumValueChange, ModelBase {

    private String type;

    private String change;

    private String attributeName;

    private com.commercetools.history.models.change_value.EnumValue nextValue;

    @JsonCreator
    AddPlainEnumValueChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("attributeName") final String attributeName,
            @JsonProperty("nextValue") final com.commercetools.history.models.change_value.EnumValue nextValue) {
        this.change = change;
        this.attributeName = attributeName;
        this.nextValue = nextValue;
        this.type = ADD_PLAIN_ENUM_VALUE_CHANGE;
    }

    public AddPlainEnumValueChangeImpl() {
        this.type = ADD_PLAIN_ENUM_VALUE_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>addPlainEnumValue</code> on product types</p>
    */
    public String getChange() {
        return this.change;
    }

    /**
    *  <p>The name of the attribute updated.</p>
    */
    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.history.models.change_value.EnumValue getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setAttributeName(final String attributeName) {
        this.attributeName = attributeName;
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

        AddPlainEnumValueChangeImpl that = (AddPlainEnumValueChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(attributeName, that.attributeName)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(attributeName)
                .append(nextValue)
                .toHashCode();
    }

}
