
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderCustomerSetMessagePayloadImpl implements OrderCustomerSetMessagePayload {

    private String type;

    private com.commercetools.api.models.customer.CustomerReference customer;

    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    private com.commercetools.api.models.customer.CustomerReference oldCustomer;

    private com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup;

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

    public OrderCustomerSetMessagePayloadImpl() {
        this.type = ORDER_CUSTOMER_SET;
    }

    public String getType() {
        return this.type;
    }

    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    public com.commercetools.api.models.customer.CustomerReference getOldCustomer() {
        return this.oldCustomer;
    }

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

        return new EqualsBuilder().append(type, that.type).append(customer, that.customer).append(customerGroup,
            that.customerGroup).append(oldCustomer, that.oldCustomer).append(oldCustomerGroup,
                that.oldCustomerGroup).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(customer).append(customerGroup).append(
            oldCustomer).append(oldCustomerGroup).toHashCode();
    }

}
