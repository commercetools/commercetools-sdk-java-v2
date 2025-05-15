
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
 *  <p>Generated after a successful Set CustomerGroupAssignments update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupAssignmentsSetMessagePayloadImpl
        implements CustomerGroupAssignmentsSetMessagePayload, ModelBase {

    private String type;

    private java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> customerGroupAssignments;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerGroupAssignmentsSetMessagePayloadImpl(
            @JsonProperty("customerGroupAssignments") final java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> customerGroupAssignments) {
        this.customerGroupAssignments = customerGroupAssignments;
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
     *  <p>Customer Groups assigned to the Customer during the Set CustomerGroupAssignments update action.</p>
     */

    public java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> getCustomerGroupAssignments() {
        return this.customerGroupAssignments;
    }

    public void setCustomerGroupAssignments(
            final com.commercetools.api.models.customer.CustomerGroupAssignment... customerGroupAssignments) {
        this.customerGroupAssignments = new ArrayList<>(Arrays.asList(customerGroupAssignments));
    }

    public void setCustomerGroupAssignments(
            final java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> customerGroupAssignments) {
        this.customerGroupAssignments = customerGroupAssignments;
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
                .append(type, that.type)
                .append(customerGroupAssignments, that.customerGroupAssignments)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(customerGroupAssignments).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("customerGroupAssignments", customerGroupAssignments)
                .build();
    }

    @Override
    public CustomerGroupAssignmentsSetMessagePayload copyDeep() {
        return CustomerGroupAssignmentsSetMessagePayload.deepCopy(this);
    }
}
