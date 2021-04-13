
package com.commercetools.history.models.label;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderLabelImpl implements OrderLabel {

    private String type;

    private String customerEmail;

    private String orderNumber;

    @JsonCreator
    OrderLabelImpl(@JsonProperty("customerEmail") final String customerEmail,
            @JsonProperty("orderNumber") final String orderNumber) {
        this.customerEmail = customerEmail;
        this.orderNumber = orderNumber;
        this.type = ORDER_LABEL;
    }

    public OrderLabelImpl() {
        this.type = ORDER_LABEL;
    }

    public String getType() {
        return this.type;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public String getOrderNumber() {
        return this.orderNumber;
    }

    public void setCustomerEmail(final String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setOrderNumber(final String orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderLabelImpl that = (OrderLabelImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(customerEmail, that.customerEmail)
                .append(orderNumber, that.orderNumber)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(customerEmail).append(orderNumber).toHashCode();
    }

}
