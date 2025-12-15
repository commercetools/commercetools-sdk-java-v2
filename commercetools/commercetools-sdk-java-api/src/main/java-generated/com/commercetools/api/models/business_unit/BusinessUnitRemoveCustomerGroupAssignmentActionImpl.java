
package com.commercetools.api.models.business_unit;

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
 *  <p>Unassigns a Customer Group from a Business Unit.</p>
 *  <p>This action generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitCustomerGroupAssignmentRemovedMessage" rel="nofollow">BusinessUnitCustomerGroupAssignmentRemoved</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitRemoveCustomerGroupAssignmentActionImpl
        implements BusinessUnitRemoveCustomerGroupAssignmentAction, ModelBase {

    private String action;

    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitRemoveCustomerGroupAssignmentActionImpl(
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        this.action = REMOVE_CUSTOMER_GROUP_ASSIGNMENT;
    }

    /**
     * create empty instance
     */
    public BusinessUnitRemoveCustomerGroupAssignmentActionImpl() {
        this.action = REMOVE_CUSTOMER_GROUP_ASSIGNMENT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Customer Group to unassign the Business Unit from.</p>
     */

    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    public void setCustomerGroup(
            final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitRemoveCustomerGroupAssignmentActionImpl that = (BusinessUnitRemoveCustomerGroupAssignmentActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(customerGroup, that.customerGroup)
                .append(action, that.action)
                .append(customerGroup, that.customerGroup)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(customerGroup).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("customerGroup", customerGroup)
                .build();
    }

    @Override
    public BusinessUnitRemoveCustomerGroupAssignmentAction copyDeep() {
        return BusinessUnitRemoveCustomerGroupAssignmentAction.deepCopy(this);
    }
}
