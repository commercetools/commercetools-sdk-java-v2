
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
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTypeAddLocalizedEnumValueAction" rel="nofollow">Add LocalizableEnumValue to AttributeDefinition</a> on Product Types.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:TypeAddLocalizedEnumValueAction" rel="nofollow">Add LocalizedEnumValue to FieldDefinition</a> on Types.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddLocalizedEnumValueChangeImpl implements AddLocalizedEnumValueChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.CustomFieldLocalizedEnumValue nextValue;

    private String fieldName;

    private String attributeName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AddLocalizedEnumValueChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.CustomFieldLocalizedEnumValue nextValue,
            @JsonProperty("fieldName") final String fieldName,
            @JsonProperty("attributeName") final String attributeName) {
        this.change = change;
        this.nextValue = nextValue;
        this.fieldName = fieldName;
        this.attributeName = attributeName;
        this.type = ADD_LOCALIZED_ENUM_VALUE_CHANGE;
    }

    /**
     * create empty instance
     */
    public AddLocalizedEnumValueChangeImpl() {
        this.type = ADD_LOCALIZED_ENUM_VALUE_CHANGE;
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

    public com.commercetools.history.models.common.CustomFieldLocalizedEnumValue getNextValue() {
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

    public void setChange(final String change) {
        this.change = change;
    }

    public void setNextValue(final com.commercetools.history.models.common.CustomFieldLocalizedEnumValue nextValue) {
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

        AddLocalizedEnumValueChangeImpl that = (AddLocalizedEnumValueChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(nextValue, that.nextValue)
                .append(fieldName, that.fieldName)
                .append(attributeName, that.attributeName)
                .append(type, that.type)
                .append(change, that.change)
                .append(nextValue, that.nextValue)
                .append(fieldName, that.fieldName)
                .append(attributeName, that.attributeName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(nextValue)
                .append(fieldName)
                .append(attributeName)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("nextValue", nextValue)
                .append("fieldName", fieldName)
                .append("attributeName", attributeName)
                .build();
    }

    @Override
    public AddLocalizedEnumValueChange copyDeep() {
        return AddLocalizedEnumValueChange.deepCopy(this);
    }
}
