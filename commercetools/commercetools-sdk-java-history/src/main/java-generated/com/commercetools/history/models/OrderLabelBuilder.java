
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderLabelBuilder {

    private String customerEmail;

    private String orderNumber;

    public OrderLabelBuilder customerEmail(final String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    public OrderLabelBuilder orderNumber(final String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public String getOrderNumber() {
        return this.orderNumber;
    }

    public OrderLabel build() {
        return new OrderLabelImpl(customerEmail, orderNumber);
    }

    public static OrderLabelBuilder of() {
        return new OrderLabelBuilder();
    }

    public static OrderLabelBuilder of(final OrderLabel template) {
        OrderLabelBuilder builder = new OrderLabelBuilder();
        builder.customerEmail = template.getCustomerEmail();
        builder.orderNumber = template.getOrderNumber();
        return builder;
    }

}
