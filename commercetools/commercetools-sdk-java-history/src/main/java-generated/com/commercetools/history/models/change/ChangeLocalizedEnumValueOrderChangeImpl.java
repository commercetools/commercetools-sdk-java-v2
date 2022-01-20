
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
public class ChangeLocalizedEnumValueOrderChangeImpl implements ChangeLocalizedEnumValueOrderChange, ModelBase {

    private String type;

    private String change;

    private String fieldName;

    private String attributeName;

    private java.util.List<com.commercetools.history.models.change_value.LocalizedEnumValue> nextValue;

    private java.util.List<com.commercetools.history.models.change_value.LocalizedEnumValue> previousValue;

    @JsonCreator
    ChangeLocalizedEnumValueOrderChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("fieldName") final String fieldName,
            @JsonProperty("attributeName") final String attributeName,
            @JsonProperty("nextValue") final java.util.List<com.commercetools.history.models.change_value.LocalizedEnumValue> nextValue,
            @JsonProperty("previousValue") final java.util.List<com.commercetools.history.models.change_value.LocalizedEnumValue> previousValue) {
        this.change = change;
        this.fieldName = fieldName;
        this.attributeName = attributeName;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type = CHANGE_LOCALIZED_ENUM_VALUE_ORDER_CHANGE;
    }

    public ChangeLocalizedEnumValueOrderChangeImpl() {
        this.type = CHANGE_LOCALIZED_ENUM_VALUE_ORDER_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>changeLocalizedEnumValueOrder</code> on types and product types</p>
    */
    public String getChange() {
        return this.change;
    }

    /**
    *  <p>The name of the field definition updated.</p>
    */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
    *  <p>The name of the attribute updated.</p>
    */
    public String getAttributeName() {
        return this.attributeName;
    }

    public java.util.List<com.commercetools.history.models.change_value.LocalizedEnumValue> getNextValue() {
        return this.nextValue;
    }

    public java.util.List<com.commercetools.history.models.change_value.LocalizedEnumValue> getPreviousValue() {
        return this.previousValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setFieldName(final String fieldName) {
        this.fieldName = fieldName;
    }

    public void setAttributeName(final String attributeName) {
        this.attributeName = attributeName;
    }

    public void setNextValue(final com.commercetools.history.models.change_value.LocalizedEnumValue... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
    }

    public void setNextValue(
            final java.util.List<com.commercetools.history.models.change_value.LocalizedEnumValue> nextValue) {
        this.nextValue = nextValue;
    }

    public void setPreviousValue(
            final com.commercetools.history.models.change_value.LocalizedEnumValue... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
    }

    public void setPreviousValue(
            final java.util.List<com.commercetools.history.models.change_value.LocalizedEnumValue> previousValue) {
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeLocalizedEnumValueOrderChangeImpl that = (ChangeLocalizedEnumValueOrderChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(fieldName, that.fieldName)
                .append(attributeName, that.attributeName)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(fieldName)
                .append(attributeName)
                .append(nextValue)
                .append(previousValue)
                .toHashCode();
    }

}
