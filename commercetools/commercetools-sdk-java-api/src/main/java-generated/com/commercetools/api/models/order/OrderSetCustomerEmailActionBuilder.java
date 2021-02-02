
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderSetCustomerEmailActionBuilder {

    @Nullable
    private String email;

    public OrderSetCustomerEmailActionBuilder email(@Nullable final String email) {
        this.email = email;
        return this;
    }

    @Nullable
    public String getEmail() {
        return this.email;
    }

    public OrderSetCustomerEmailAction build() {
        return new OrderSetCustomerEmailActionImpl(email);
    }

    public static OrderSetCustomerEmailActionBuilder of() {
        return new OrderSetCustomerEmailActionBuilder();
    }

    public static OrderSetCustomerEmailActionBuilder of(final OrderSetCustomerEmailAction template) {
        OrderSetCustomerEmailActionBuilder builder = new OrderSetCustomerEmailActionBuilder();
        builder.email = template.getEmail();
        return builder;
    }

}
