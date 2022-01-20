
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
public class ChangePlainEnumValueLabelChangeImpl implements ChangePlainEnumValueLabelChange, ModelBase {

    private String type;

    private String change;

    private String attributeName;

    private String valueKey;

    private String previousValue;

    private String nextValue;

    @JsonCreator
    ChangePlainEnumValueLabelChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("attributeName") final String attributeName, @JsonProperty("valueKey") final String valueKey,
            @JsonProperty("previousValue") final String previousValue,
            @JsonProperty("nextValue") final String nextValue) {
        this.change = change;
        this.attributeName = attributeName;
        this.valueKey = valueKey;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = CHANGE_PLAIN_ENUM_VALUE_LABEL_CHANGE;
    }

    public ChangePlainEnumValueLabelChangeImpl() {
        this.type = CHANGE_PLAIN_ENUM_VALUE_LABEL_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>changePlainEnumValueLabel</code> on types</p>
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

    public void setAttributeName(final String attributeName) {
        this.attributeName = attributeName;
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

        ChangePlainEnumValueLabelChangeImpl that = (ChangePlainEnumValueLabelChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(attributeName, that.attributeName)
                .append(valueKey, that.valueKey)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(attributeName)
                .append(valueKey)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

}
