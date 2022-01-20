
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
public class ChangeAttributeConstraintChangeImpl implements ChangeAttributeConstraintChange, ModelBase {

    private String type;

    private String change;

    private String attributeName;

    private com.commercetools.history.models.common.AttributeConstraintEnum previousValue;

    private com.commercetools.history.models.common.AttributeConstraintEnum nextValue;

    @JsonCreator
    ChangeAttributeConstraintChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("attributeName") final String attributeName,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.AttributeConstraintEnum previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.AttributeConstraintEnum nextValue) {
        this.change = change;
        this.attributeName = attributeName;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = CHANGE_ATTRIBUTE_CONSTRAINT_CHANGE;
    }

    public ChangeAttributeConstraintChangeImpl() {
        this.type = CHANGE_ATTRIBUTE_CONSTRAINT_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    public String getChange() {
        return this.change;
    }

    /**
    *  <p>name of the updated attribute</p>
    */
    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.history.models.common.AttributeConstraintEnum getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.AttributeConstraintEnum getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setAttributeName(final String attributeName) {
        this.attributeName = attributeName;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.AttributeConstraintEnum previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.AttributeConstraintEnum nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeAttributeConstraintChangeImpl that = (ChangeAttributeConstraintChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(attributeName, that.attributeName)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(attributeName)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

}
