
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

/**
 *  <p>Change triggered by the Change AttributeDefinition AttributeConstraint update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeAttributeConstraintChangeImpl implements ChangeAttributeConstraintChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.AttributeConstraintEnum previousValue;

    private com.commercetools.history.models.common.AttributeConstraintEnum nextValue;

    private String attributeName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeAttributeConstraintChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.AttributeConstraintEnum previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.AttributeConstraintEnum nextValue,
            @JsonProperty("attributeName") final String attributeName) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.attributeName = attributeName;
        this.type = CHANGE_ATTRIBUTE_CONSTRAINT_CHANGE;
    }

    /**
     * create empty instance
     */
    public ChangeAttributeConstraintChangeImpl() {
        this.type = CHANGE_ATTRIBUTE_CONSTRAINT_CHANGE;
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

    public com.commercetools.history.models.common.AttributeConstraintEnum getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public com.commercetools.history.models.common.AttributeConstraintEnum getNextValue() {
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

    public void setPreviousValue(final com.commercetools.history.models.common.AttributeConstraintEnum previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.AttributeConstraintEnum nextValue) {
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

        ChangeAttributeConstraintChangeImpl that = (ChangeAttributeConstraintChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(attributeName, that.attributeName)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(attributeName, that.attributeName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .append(attributeName)
                .toHashCode();
    }

}
