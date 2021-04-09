
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeLocalizedEnumValueLabelChangeImpl implements ChangeLocalizedEnumValueLabelChange {

    private String type;

    private String change;

    private String fieldName;

    private String attributeName;

    private String valueKey;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    @JsonCreator
    ChangeLocalizedEnumValueLabelChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("fieldName") final String fieldName,
            @JsonProperty("attributeName") final String attributeName, @JsonProperty("valueKey") final String valueKey,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.LocalizedString previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.change = change;
        this.fieldName = fieldName;
        this.attributeName = attributeName;
        this.valueKey = valueKey;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = CHANGE_LOCALIZED_ENUM_VALUE_LABEL_CHANGE;
    }

    public ChangeLocalizedEnumValueLabelChangeImpl() {
        this.type = CHANGE_LOCALIZED_ENUM_VALUE_LABEL_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>changeLocalizedEnumValueLabel</code> on types</p>
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

    /**
    *  <p>Key of the values that was updated</p>
    */
    public String getValueKey() {
        return this.valueKey;
    }

    public com.commercetools.history.models.common.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.LocalizedString getNextValue() {
        return this.nextValue;
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

    public void setValueKey(final String valueKey) {
        this.valueKey = valueKey;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeLocalizedEnumValueLabelChangeImpl that = (ChangeLocalizedEnumValueLabelChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(fieldName, that.fieldName)
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
                .append(fieldName)
                .append(attributeName)
                .append(valueKey)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

}
