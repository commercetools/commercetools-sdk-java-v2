
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderSetCustomerIdActionBuilder {

    @Nullable
    private String customerId;

    public OrderSetCustomerIdActionBuilder customerId(@Nullable final String customerId) {
        this.customerId = customerId;
        return this;
    }

    @Nullable
    public String getCustomerId() {
        return this.customerId;
    }

    public OrderSetCustomerIdAction build() {
        return new OrderSetCustomerIdActionImpl(customerId);
    }

    public static OrderSetCustomerIdActionBuilder of() {
        return new OrderSetCustomerIdActionBuilder();
    }

    public static OrderSetCustomerIdActionBuilder of(final OrderSetCustomerIdAction template) {
        OrderSetCustomerIdActionBuilder builder = new OrderSetCustomerIdActionBuilder();
        builder.customerId = template.getCustomerId();
        return builder;
    }

}
