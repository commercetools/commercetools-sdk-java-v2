
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
 *  <p>Generated after a successful Add CustomerGroupAssignment update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupAssignmentAddedMessagePayloadImpl
        implements CustomerGroupAssignmentAddedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.customer.CustomerGroupAssignment customerGroupAssignment;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerGroupAssignmentAddedMessagePayloadImpl(
            @JsonProperty("customerGroupAssignment") final com.commercetools.api.models.customer.CustomerGroupAssignment customerGroupAssignment) {
        this.customerGroupAssignment = customerGroupAssignment;
        this.type = CUSTOMER_GROUP_ASSIGNMENT_ADDED;
    }

    /**
     * create empty instance
     */
    public CustomerGroupAssignmentAddedMessagePayloadImpl() {
        this.type = CUSTOMER_GROUP_ASSIGNMENT_ADDED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Customer Group assigned to the Customer during the Add CustomerGroupAssignment update action.</p>
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

        CustomerGroupAssignmentAddedMessagePayloadImpl that = (CustomerGroupAssignmentAddedMessagePayloadImpl) o;

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
    public CustomerGroupAssignmentAddedMessagePayload copyDeep() {
        return CustomerGroupAssignmentAddedMessagePayload.deepCopy(this);
    }
}
