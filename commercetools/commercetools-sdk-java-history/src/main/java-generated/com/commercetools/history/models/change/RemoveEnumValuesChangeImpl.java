
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTypeRemoveEnumValuesAction" rel="nofollow">Remove EnumValues from AttributeDefinition</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveEnumValuesChangeImpl implements RemoveEnumValuesChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.change_value.EnumValue previousValue;

    private String attributeName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RemoveEnumValuesChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final com.commercetools.history.models.change_value.EnumValue previousValue,
            @JsonProperty("attributeName") final String attributeName) {
        this.change = change;
        this.previousValue = previousValue;
        this.attributeName = attributeName;
        this.type = REMOVE_ENUM_VALUES_CHANGE;
    }

    /**
     * create empty instance
     */
    public RemoveEnumValuesChangeImpl() {
        this.type = REMOVE_ENUM_VALUES_CHANGE;
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

    public com.commercetools.history.models.change_value.EnumValue getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final com.commercetools.history.models.change_value.EnumValue previousValue) {
        this.previousValue = previousValue;
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

        RemoveEnumValuesChangeImpl that = (RemoveEnumValuesChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(attributeName, that.attributeName)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(attributeName, that.attributeName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(attributeName)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("previousValue", previousValue)
                .append("attributeName", attributeName)
                .build();
    }

    @Override
    public RemoveEnumValuesChange copyDeep() {
        return RemoveEnumValuesChange.deepCopy(this);
    }
}
