
package com.commercetools.api.models.order;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.OrderSetCustomerEmailActionImpl;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetCustomerEmailActionImpl.class)
public interface OrderSetCustomerEmailAction extends OrderUpdateAction {

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
