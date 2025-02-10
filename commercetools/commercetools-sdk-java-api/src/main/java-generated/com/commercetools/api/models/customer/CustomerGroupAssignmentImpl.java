
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
 *  <p>Represents an individual Customer Group assignment as a Reference to a CustomerGroup.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupAssignmentImpl implements CustomerGroupAssignment, ModelBase {

    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerGroupAssignmentImpl(
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
    }

    /**
     * create empty instance
     */
    public CustomerGroupAssignmentImpl() {
    }

    /**
     *  <p>Reference to a Customer Group.</p>
     */

    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    public void setCustomerGroup(
            final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerGroupAssignmentImpl that = (CustomerGroupAssignmentImpl) o;

        return new EqualsBuilder().append(customerGroup, that.customerGroup)
                .append(customerGroup, that.customerGroup)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(customerGroup).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("customerGroup", customerGroup)
                .build();
    }

}
