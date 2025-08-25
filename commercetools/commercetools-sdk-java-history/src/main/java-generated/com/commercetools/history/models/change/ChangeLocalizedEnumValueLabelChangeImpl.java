
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
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTypeChangeLocalizedEnumValueLabelAction" rel="nofollow">Change the label of a LocalizedEnumValue</a> on Product Types.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:TypeChangeLocalizedEnumValueLabelAction" rel="nofollow">Change LocalizedEnumValue Label</a> on Types.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeLocalizedEnumValueLabelChangeImpl implements ChangeLocalizedEnumValueLabelChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    private String fieldName;

    private String attributeName;

    private String valueKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeLocalizedEnumValueLabelChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.LocalizedString previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.LocalizedString nextValue,
            @JsonProperty("fieldName") final String fieldName,
            @JsonProperty("attributeName") final String attributeName,
            @JsonProperty("valueKey") final String valueKey) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.fieldName = fieldName;
        this.attributeName = attributeName;
        this.valueKey = valueKey;
        this.type = CHANGE_LOCALIZED_ENUM_VALUE_LABEL_CHANGE;
    }

    /**
     * create empty instance
     */
    public ChangeLocalizedEnumValueLabelChangeImpl() {
        this.type = CHANGE_LOCALIZED_ENUM_VALUE_LABEL_CHANGE;
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

    public com.commercetools.history.models.common.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public com.commercetools.history.models.common.LocalizedString getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a>; only present on changes to Types.</p>
     */

    public String getFieldName() {
        return this.fieldName;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>; only present on changes to Product Types.</p>
     */

    public String getAttributeName() {
        return this.attributeName;
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

    public void setPreviousValue(final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeLocalizedEnumValueLabelChangeImpl that = (ChangeLocalizedEnumValueLabelChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(fieldName, that.fieldName)
                .append(attributeName, that.attributeName)
                .append(valueKey, that.valueKey)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(fieldName, that.fieldName)
                .append(attributeName, that.attributeName)
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
                .append(attributeName)
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
                .append("attributeName", attributeName)
                .append("valueKey", valueKey)
                .build();
    }

    @Override
    public ChangeLocalizedEnumValueLabelChange copyDeep() {
        return ChangeLocalizedEnumValueLabelChange.deepCopy(this);
    }
}
