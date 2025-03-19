
package com.commercetools.api.models.customer;

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
 *  <p>Assigns a Customer Group to a Customer. This action generates the CustomerGroupAssignmentAdded Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerAddCustomerGroupAssignmentActionImpl
        implements CustomerAddCustomerGroupAssignmentAction, ModelBase {

    private String action;

    private com.commercetools.api.models.customer.CustomerGroupAssignmentDraft customerGroupAssignment;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerAddCustomerGroupAssignmentActionImpl(
            @JsonProperty("customerGroupAssignment") final com.commercetools.api.models.customer.CustomerGroupAssignmentDraft customerGroupAssignment) {
        this.customerGroupAssignment = customerGroupAssignment;
        this.action = ADD_CUSTOMER_GROUP_ASSIGNMENT;
    }

    /**
     * create empty instance
     */
    public CustomerAddCustomerGroupAssignmentActionImpl() {
        this.action = ADD_CUSTOMER_GROUP_ASSIGNMENT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Customer Group to assign the Customer to.</p>
     */

    public com.commercetools.api.models.customer.CustomerGroupAssignmentDraft getCustomerGroupAssignment() {
        return this.customerGroupAssignment;
    }

    public void setCustomerGroupAssignment(
            final com.commercetools.api.models.customer.CustomerGroupAssignmentDraft customerGroupAssignment) {
        this.customerGroupAssignment = customerGroupAssignment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerAddCustomerGroupAssignmentActionImpl that = (CustomerAddCustomerGroupAssignmentActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(customerGroupAssignment, that.customerGroupAssignment)
                .append(action, that.action)
                .append(customerGroupAssignment, that.customerGroupAssignment)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(customerGroupAssignment).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("customerGroupAssignment", customerGroupAssignment)
                .build();
    }

}
