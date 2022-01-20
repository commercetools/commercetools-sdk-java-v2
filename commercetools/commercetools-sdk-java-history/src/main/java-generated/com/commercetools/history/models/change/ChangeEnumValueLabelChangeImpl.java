
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
public class ChangeEnumValueLabelChangeImpl implements ChangeEnumValueLabelChange, ModelBase {

    private String type;

    private String change;

    private String fieldName;

    private String valueKey;

    private String previousValue;

    private String nextValue;

    @JsonCreator
    ChangeEnumValueLabelChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("fieldName") final String fieldName, @JsonProperty("valueKey") final String valueKey,
            @JsonProperty("previousValue") final String previousValue,
            @JsonProperty("nextValue") final String nextValue) {
        this.change = change;
        this.fieldName = fieldName;
        this.valueKey = valueKey;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = CHANGE_ENUM_VALUE_LABEL_CHANGE;
    }

    public ChangeEnumValueLabelChangeImpl() {
        this.type = CHANGE_ENUM_VALUE_LABEL_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>changeEnumValueLabel</code> on types</p>
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
    *  <p>Key of the values that was updated</p>
    */
    public String getValueKey() {
        return this.valueKey;
    }

    public String getPreviousValue() {
        return this.previousValue;
    }

    public String getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setFieldName(final String fieldName) {
        this.fieldName = fieldName;
    }

    public void setValueKey(final String valueKey) {
        this.valueKey = valueKey;
    }

    public void setPreviousValue(final String previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final String nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeEnumValueLabelChangeImpl that = (ChangeEnumValueLabelChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(fieldName, that.fieldName)
                .append(valueKey, that.valueKey)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(fieldName)
                .append(valueKey)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

}
