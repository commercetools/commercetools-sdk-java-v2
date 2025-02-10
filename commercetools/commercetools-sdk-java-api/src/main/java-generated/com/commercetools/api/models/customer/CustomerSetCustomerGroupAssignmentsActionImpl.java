
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
 *  <p>Assigns multiple Customer Groups to a Customer. Assigning Customer Groups generates the CustomerGroupAssignmentsSetMessage Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSetCustomerGroupAssignmentsActionImpl
        implements CustomerSetCustomerGroupAssignmentsAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignmentDraft> customerGroupAssignments;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerSetCustomerGroupAssignmentsActionImpl(
            @JsonProperty("customerGroupAssignments") final java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignmentDraft> customerGroupAssignments) {
        this.customerGroupAssignments = customerGroupAssignments;
        this.action = SET_CUSTOMER_GROUP_ASSIGNMENTS;
    }

    /**
     * create empty instance
     */
    public CustomerSetCustomerGroupAssignmentsActionImpl() {
        this.action = SET_CUSTOMER_GROUP_ASSIGNMENTS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Customer Groups to assign to the Customer.</p>
     */

    public java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignmentDraft> getCustomerGroupAssignments() {
        return this.customerGroupAssignments;
    }

    public void setCustomerGroupAssignments(
            final com.commercetools.api.models.customer.CustomerGroupAssignmentDraft... customerGroupAssignments) {
        this.customerGroupAssignments = new ArrayList<>(Arrays.asList(customerGroupAssignments));
    }

    public void setCustomerGroupAssignments(
            final java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignmentDraft> customerGroupAssignments) {
        this.customerGroupAssignments = customerGroupAssignments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerSetCustomerGroupAssignmentsActionImpl that = (CustomerSetCustomerGroupAssignmentsActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(customerGroupAssignments, that.customerGroupAssignments)
                .append(action, that.action)
                .append(customerGroupAssignments, that.customerGroupAssignments)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(customerGroupAssignments).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("customerGroupAssignments", customerGroupAssignments)
                .build();
    }

}
