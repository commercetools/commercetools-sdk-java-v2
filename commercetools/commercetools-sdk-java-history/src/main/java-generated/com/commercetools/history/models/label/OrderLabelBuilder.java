
package com.commercetools.history.models.label;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderLabelBuilder implements Builder<OrderLabel> {

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
        Objects.requireNonNull(customerEmail, OrderLabel.class + ": customerEmail is missing");
        Objects.requireNonNull(orderNumber, OrderLabel.class + ": orderNumber is missing");
        return new OrderLabelImpl(customerEmail, orderNumber);
    }

    /**
     * builds OrderLabel without checking for non null required values
     */
    public OrderLabel buildUnchecked() {
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
