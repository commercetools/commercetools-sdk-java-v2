
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
 *  <p>Change triggered by the Change EnumValue Label update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeEnumValueLabelChangeImpl implements ChangeEnumValueLabelChange, ModelBase {

    private String type;

    private String change;

    private String previousValue;

    private String nextValue;

    private String fieldName;

    private String valueKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeEnumValueLabelChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final String previousValue,
            @JsonProperty("nextValue") final String nextValue, @JsonProperty("fieldName") final String fieldName,
            @JsonProperty("valueKey") final String valueKey) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.fieldName = fieldName;
        this.valueKey = valueKey;
        this.type = CHANGE_ENUM_VALUE_LABEL_CHANGE;
    }

    /**
     * create empty instance
     */
    public ChangeEnumValueLabelChangeImpl() {
        this.type = CHANGE_ENUM_VALUE_LABEL_CHANGE;
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
     *  <p>Value before the change.</p>
     */

    public String getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public String getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Name of the updated FieldDefinition.</p>
     */

    public String getFieldName() {
        return this.fieldName;
    }

    /**
     *  <p>Key of the updated values.</p>
     */

    public String getValueKey() {
        return this.valueKey;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final String previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final String nextValue) {
        this.nextValue = nextValue;
    }

    public void setFieldName(final String fieldName) {
        this.fieldName = fieldName;
    }

    public void setValueKey(final String valueKey) {
        this.valueKey = valueKey;
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
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(fieldName, that.fieldName)
                .append(valueKey, that.valueKey)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(fieldName, that.fieldName)
                .append(valueKey, that.valueKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .append(fieldName)
                .append(valueKey)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .append("fieldName", fieldName)
                .append("valueKey", valueKey)
                .build();
    }

    @Override
    public ChangeEnumValueLabelChange copyDeep() {
        return ChangeEnumValueLabelChange.deepCopy(this);
    }
}
