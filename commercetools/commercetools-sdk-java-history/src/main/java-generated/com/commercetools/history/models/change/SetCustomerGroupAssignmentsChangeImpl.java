
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCustomerGroupAssignmentsChangeImpl implements SetCustomerGroupAssignmentsChange, ModelBase {

    private String type;

    private String change;

    private java.util.List<com.commercetools.history.models.common.CustomerGroupAssignment> addedItems;

    private java.util.List<com.commercetools.history.models.common.CustomerGroupAssignment> removedItems;

    private java.util.List<com.commercetools.history.models.common.CustomerGroupAssignment> previousValue;

    private java.util.List<com.commercetools.history.models.common.CustomerGroupAssignment> nextValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetCustomerGroupAssignmentsChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("addedItems") final java.util.List<com.commercetools.history.models.common.CustomerGroupAssignment> addedItems,
            @JsonProperty("removedItems") final java.util.List<com.commercetools.history.models.common.CustomerGroupAssignment> removedItems,
            @JsonProperty("previousValue") final java.util.List<com.commercetools.history.models.common.CustomerGroupAssignment> previousValue,
            @JsonProperty("nextValue") final java.util.List<com.commercetools.history.models.common.CustomerGroupAssignment> nextValue) {
        this.change = change;
        this.addedItems = addedItems;
        this.removedItems = removedItems;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = SET_CUSTOMER_GROUP_ASSIGNMENTS_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetCustomerGroupAssignmentsChangeImpl() {
        this.type = SET_CUSTOMER_GROUP_ASSIGNMENTS_CHANGE;
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
     *  <p>Elements added to the array.</p>
     */

    public java.util.List<com.commercetools.history.models.common.CustomerGroupAssignment> getAddedItems() {
        return this.addedItems;
    }

    /**
     *  <p>Elements removed from the array.</p>
     */

    public java.util.List<com.commercetools.history.models.common.CustomerGroupAssignment> getRemovedItems() {
        return this.removedItems;
    }

    /**
     *  <p>Value before the change.</p>
     */

    public java.util.List<com.commercetools.history.models.common.CustomerGroupAssignment> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public java.util.List<com.commercetools.history.models.common.CustomerGroupAssignment> getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setAddedItems(final com.commercetools.history.models.common.CustomerGroupAssignment... addedItems) {
        this.addedItems = new ArrayList<>(Arrays.asList(addedItems));
    }

    public void setAddedItems(
            final java.util.List<com.commercetools.history.models.common.CustomerGroupAssignment> addedItems) {
        this.addedItems = addedItems;
    }

    public void setRemovedItems(final com.commercetools.history.models.common.CustomerGroupAssignment... removedItems) {
        this.removedItems = new ArrayList<>(Arrays.asList(removedItems));
    }

    public void setRemovedItems(
            final java.util.List<com.commercetools.history.models.common.CustomerGroupAssignment> removedItems) {
        this.removedItems = removedItems;
    }

    public void setPreviousValue(
            final com.commercetools.history.models.common.CustomerGroupAssignment... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
    }

    public void setPreviousValue(
            final java.util.List<com.commercetools.history.models.common.CustomerGroupAssignment> previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.CustomerGroupAssignment... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
    }

    public void setNextValue(
            final java.util.List<com.commercetools.history.models.common.CustomerGroupAssignment> nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetCustomerGroupAssignmentsChangeImpl that = (SetCustomerGroupAssignmentsChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(addedItems, that.addedItems)
                .append(removedItems, that.removedItems)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(type, that.type)
                .append(change, that.change)
                .append(addedItems, that.addedItems)
                .append(removedItems, that.removedItems)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(addedItems)
                .append(removedItems)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("addedItems", addedItems)
                .append("removedItems", removedItems)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .build();
    }

    @Override
    public SetCustomerGroupAssignmentsChange copyDeep() {
        return SetCustomerGroupAssignmentsChange.deepCopy(this);
    }
}
