
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
 *  <p>Change triggered by the Add PlainEnumValue to AttributeDefinition update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddPlainEnumValueChangeImpl implements AddPlainEnumValueChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.AttributePlainEnumValue nextValue;

    private String attributeName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AddPlainEnumValueChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.AttributePlainEnumValue nextValue,
            @JsonProperty("attributeName") final String attributeName) {
        this.change = change;
        this.nextValue = nextValue;
        this.attributeName = attributeName;
        this.type = ADD_PLAIN_ENUM_VALUE_CHANGE;
    }

    /**
     * create empty instance
     */
    public AddPlainEnumValueChangeImpl() {
        this.type = ADD_PLAIN_ENUM_VALUE_CHANGE;
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

    public com.commercetools.history.models.common.AttributePlainEnumValue getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Name of the updated AttributeDefinition.</p>
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setNextValue(final com.commercetools.history.models.common.AttributePlainEnumValue nextValue) {
        this.nextValue = nextValue;
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

        AddPlainEnumValueChangeImpl that = (AddPlainEnumValueChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(nextValue, that.nextValue)
                .append(attributeName, that.attributeName)
                .append(type, that.type)
                .append(change, that.change)
                .append(nextValue, that.nextValue)
                .append(attributeName, that.attributeName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(nextValue)
                .append(attributeName)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("nextValue", nextValue)
                .append("attributeName", attributeName)
                .build();
    }

    @Override
    public AddPlainEnumValueChange copyDeep() {
        return AddPlainEnumValueChange.deepCopy(this);
    }
}
