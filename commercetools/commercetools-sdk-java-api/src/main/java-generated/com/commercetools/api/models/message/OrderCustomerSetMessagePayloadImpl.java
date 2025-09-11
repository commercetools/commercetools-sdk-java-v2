
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetCustomerIdAction" rel="nofollow">Set Customer ID</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderCustomerSetMessagePayloadImpl implements OrderCustomerSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.customer.CustomerReference customer;

    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    private com.commercetools.api.models.customer.CustomerReference oldCustomer;

    private com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderCustomerSetMessagePayloadImpl(
            @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerReference customer,
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup,
            @JsonProperty("oldCustomer") final com.commercetools.api.models.customer.CustomerReference oldCustomer,
            @JsonProperty("oldCustomerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup) {
        this.customer = customer;
        this.customerGroup = customerGroup;
        this.oldCustomer = oldCustomer;
        this.oldCustomerGroup = oldCustomerGroup;
        this.type = ORDER_CUSTOMER_SET;
    }

    /**
     * create empty instance
     */
    public OrderCustomerSetMessagePayloadImpl() {
        this.type = ORDER_CUSTOMER_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetCustomerIdAction" rel="nofollow">Set Customer ID</a> update action.</p>
     */

    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetCustomerIdAction" rel="nofollow">Set Customer ID</a> update action.</p>
     */

    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetCustomerIdAction" rel="nofollow">Set Customer ID</a> update action.</p>
     */

    public com.commercetools.api.models.customer.CustomerReference getOldCustomer() {
        return this.oldCustomer;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetCustomerIdAction" rel="nofollow">Set Customer ID</a> update action.</p>
     */

    public com.commercetools.api.models.customer_group.CustomerGroupReference getOldCustomerGroup() {
        return this.oldCustomerGroup;
    }

    public void setCustomer(final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
    }

    public void setCustomerGroup(
            final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
    }

    public void setOldCustomer(final com.commercetools.api.models.customer.CustomerReference oldCustomer) {
        this.oldCustomer = oldCustomer;
    }

    public void setOldCustomerGroup(
            final com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup) {
        this.oldCustomerGroup = oldCustomerGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderCustomerSetMessagePayloadImpl that = (OrderCustomerSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(customer, that.customer)
                .append(customerGroup, that.customerGroup)
                .append(oldCustomer, that.oldCustomer)
                .append(oldCustomerGroup, that.oldCustomerGroup)
                .append(type, that.type)
                .append(customer, that.customer)
                .append(customerGroup, that.customerGroup)
                .append(oldCustomer, that.oldCustomer)
                .append(oldCustomerGroup, that.oldCustomerGroup)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(customer)
                .append(customerGroup)
                .append(oldCustomer)
                .append(oldCustomerGroup)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("customer", customer)
                .append("customerGroup", customerGroup)
                .append("oldCustomer", oldCustomer)
                .append("oldCustomerGroup", oldCustomerGroup)
                .build();
    }

    @Override
    public OrderCustomerSetMessagePayload copyDeep() {
        return OrderCustomerSetMessagePayload.deepCopy(this);
    }
}
