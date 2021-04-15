
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetCustomerEmailActionImpl.class)
public interface OrderSetCustomerEmailAction extends OrderUpdateAction {

    String SET_CUSTOMER_EMAIL = "setCustomerEmail";

    @JsonProperty("email")
    public String getEmail();

    public void setEmail(final String email);

    public static OrderSetCustomerEmailAction of() {
        return new OrderSetCustomerEmailActionImpl();
    }

    public static OrderSetCustomerEmailAction of(final OrderSetCustomerEmailAction template) {
        OrderSetCustomerEmailActionImpl instance = new OrderSetCustomerEmailActionImpl();
        instance.setEmail(template.getEmail());
        return instance;
    }

    public static OrderSetCustomerEmailActionBuilder builder() {
        return OrderSetCustomerEmailActionBuilder.of();
    }

    public static OrderSetCustomerEmailActionBuilder builder(final OrderSetCustomerEmailAction template) {
        return OrderSetCustomerEmailActionBuilder.of(template);
    }

    default <T> T withOrderSetCustomerEmailAction(Function<OrderSetCustomerEmailAction, T> helper) {
        return helper.apply(this);
    }
}
