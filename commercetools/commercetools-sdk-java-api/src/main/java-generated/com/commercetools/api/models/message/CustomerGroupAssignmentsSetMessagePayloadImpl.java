
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupAssignmentsSetMessagePayloadImpl
        implements CustomerGroupAssignmentsSetMessagePayload, ModelBase {

    private String type;

    private java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> customerGroupAssignments;

    private java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> oldCustomerGroupAssignments;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerGroupAssignmentsSetMessagePayloadImpl(
            @JsonProperty("customerGroupAssignments") final java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> customerGroupAssignments,
            @JsonProperty("oldCustomerGroupAssignments") final java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> oldCustomerGroupAssignments) {
        this.customerGroupAssignments = customerGroupAssignments;
        this.oldCustomerGroupAssignments = oldCustomerGroupAssignments;
        this.type = CUSTOMER_GROUP_ASSIGNMENTS_SET;
    }

    /**
     * create empty instance
     */
    public CustomerGroupAssignmentsSetMessagePayloadImpl() {
        this.type = CUSTOMER_GROUP_ASSIGNMENTS_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Customer Groups assigned to the Customer during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     */

    public java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> getCustomerGroupAssignments() {
        return this.customerGroupAssignments;
    }

    /**
     *  <p>Customer Groups assigned to the Customer before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     */

    public java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> getOldCustomerGroupAssignments() {
        return this.oldCustomerGroupAssignments;
    }

    public void setCustomerGroupAssignments(
            final com.commercetools.api.models.customer.CustomerGroupAssignment... customerGroupAssignments) {
        this.customerGroupAssignments = new ArrayList<>(Arrays.asList(customerGroupAssignments));
    }

    public void setCustomerGroupAssignments(
            final java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> customerGroupAssignments) {
        this.customerGroupAssignments = customerGroupAssignments;
    }

    public void setOldCustomerGroupAssignments(
            final com.commercetools.api.models.customer.CustomerGroupAssignment... oldCustomerGroupAssignments) {
        this.oldCustomerGroupAssignments = new ArrayList<>(Arrays.asList(oldCustomerGroupAssignments));
    }

    public void setOldCustomerGroupAssignments(
            final java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> oldCustomerGroupAssignments) {
        this.oldCustomerGroupAssignments = oldCustomerGroupAssignments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerGroupAssignmentsSetMessagePayloadImpl that = (CustomerGroupAssignmentsSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(customerGroupAssignments, that.customerGroupAssignments)
                .append(oldCustomerGroupAssignments, that.oldCustomerGroupAssignments)
                .append(type, that.type)
                .append(customerGroupAssignments, that.customerGroupAssignments)
                .append(oldCustomerGroupAssignments, that.oldCustomerGroupAssignments)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(customerGroupAssignments)
                .append(oldCustomerGroupAssignments)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("customerGroupAssignments", customerGroupAssignments)
                .append("oldCustomerGroupAssignments", oldCustomerGroupAssignments)
                .build();
    }

    @Override
    public CustomerGroupAssignmentsSetMessagePayload copyDeep() {
        return CustomerGroupAssignmentsSetMessagePayload.deepCopy(this);
    }
}
