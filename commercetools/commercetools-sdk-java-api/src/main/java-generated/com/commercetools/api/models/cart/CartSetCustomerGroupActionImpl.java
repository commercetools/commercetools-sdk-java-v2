
package com.commercetools.api.models.cart;

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
 *  <p>This update action can only be used if a Customer is not assigned to a Cart. If a Customer is already assigned, the Cart has the same Customer Group as the assigned Customer.</p>
 *  <p>Setting the Customer Group also updates the LineItem <code>prices</code> according to the Customer Group.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetCustomerGroupActionImpl implements CartSetCustomerGroupAction, ModelBase {

    private String action;

    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    @JsonCreator
    CartSetCustomerGroupActionImpl(
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        this.action = SET_CUSTOMER_GROUP;
    }

    public CartSetCustomerGroupActionImpl() {
        this.action = SET_CUSTOMER_GROUP;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
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

        CartSetCustomerGroupActionImpl that = (CartSetCustomerGroupActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(customerGroup, that.customerGroup).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(customerGroup).toHashCode();
    }

}
