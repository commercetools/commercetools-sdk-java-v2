
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
 *  <p>Generated after a successful Remove CustomerGroupAssignment update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupAssignmentRemovedMessagePayloadImpl
        implements CustomerGroupAssignmentRemovedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.customer.CustomerGroupAssignment customerGroupAssignment;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerGroupAssignmentRemovedMessagePayloadImpl(
            @JsonProperty("customerGroupAssignment") final com.commercetools.api.models.customer.CustomerGroupAssignment customerGroupAssignment) {
        this.customerGroupAssignment = customerGroupAssignment;
        this.type = CUSTOMER_GROUP_ASSIGNMENT_REMOVED;
    }

    /**
     * create empty instance
     */
    public CustomerGroupAssignmentRemovedMessagePayloadImpl() {
        this.type = CUSTOMER_GROUP_ASSIGNMENT_REMOVED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Customer Group removed during the Remove CustomerGroupAssignment update action.</p>
     */

    public com.commercetools.api.models.customer.CustomerGroupAssignment getCustomerGroupAssignment() {
        return this.customerGroupAssignment;
    }

    public void setCustomerGroupAssignment(
            final com.commercetools.api.models.customer.CustomerGroupAssignment customerGroupAssignment) {
        this.customerGroupAssignment = customerGroupAssignment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerGroupAssignmentRemovedMessagePayloadImpl that = (CustomerGroupAssignmentRemovedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(customerGroupAssignment, that.customerGroupAssignment)
                .append(type, that.type)
                .append(customerGroupAssignment, that.customerGroupAssignment)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(customerGroupAssignment).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("customerGroupAssignment", customerGroupAssignment)
                .build();
    }

    @Override
    public CustomerGroupAssignmentRemovedMessagePayload copyDeep() {
        return CustomerGroupAssignmentRemovedMessagePayload.deepCopy(this);
    }
}
