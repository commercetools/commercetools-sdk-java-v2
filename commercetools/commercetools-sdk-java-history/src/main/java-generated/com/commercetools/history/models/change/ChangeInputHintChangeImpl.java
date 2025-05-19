
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
 *   <li>Change AttributeDefinition InputHint on Product Types.</li>
 *   <li>Change InputHint on Types.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeInputHintChangeImpl implements ChangeInputHintChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.TextInputHint previousValue;

    private com.commercetools.history.models.common.TextInputHint nextValue;

    private String fieldName;

    private String attributeName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeInputHintChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.TextInputHint previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.TextInputHint nextValue,
            @JsonProperty("fieldName") final String fieldName,
            @JsonProperty("attributeName") final String attributeName) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.fieldName = fieldName;
        this.attributeName = attributeName;
        this.type = CHANGE_INPUT_HINT_CHANGE;
    }

    /**
     * create empty instance
     */
    public ChangeInputHintChangeImpl() {
        this.type = CHANGE_INPUT_HINT_CHANGE;
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

    public com.commercetools.history.models.common.TextInputHint getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public com.commercetools.history.models.common.TextInputHint getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Name of the updated FieldDefinition; only present on changes to Types.</p>
     */

    public String getFieldName() {
        return this.fieldName;
    }

    /**
     *  <p>Name of the updated AttributeDefinition; only present on changes to Product Types.</p>
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.TextInputHint previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.TextInputHint nextValue) {
        this.nextValue = nextValue;
    }

    public void setFieldName(final String fieldName) {
        this.fieldName = fieldName;
    }

    public void setAttributeName(final String attributeName) {
        this.attributeName = attributeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeInputHintChangeImpl that = (ChangeInputHintChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(fieldName, that.fieldName)
                .append(attributeName, that.attributeName)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(fieldName, that.fieldName)
                .append(attributeName, that.attributeName)
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
                .build();
    }

    @Override
    public ChangeInputHintChange copyDeep() {
        return ChangeInputHintChange.deepCopy(this);
    }
}
