
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetCustomerIdActionImpl.class)
public interface OrderSetCustomerIdAction extends OrderUpdateAction {

    String SET_CUSTOMER_ID = "setCustomerId";

    @JsonProperty("customerId")
    public String getCustomerId();

    public void setCustomerId(final String customerId);

    public static OrderSetCustomerIdAction of() {
        return new OrderSetCustomerIdActionImpl();
    }

    public static OrderSetCustomerIdAction of(final OrderSetCustomerIdAction template) {
        OrderSetCustomerIdActionImpl instance = new OrderSetCustomerIdActionImpl();
        instance.setCustomerId(template.getCustomerId());
        return instance;
    }

    public static OrderSetCustomerIdActionBuilder builder() {
        return OrderSetCustomerIdActionBuilder.of();
    }

    public static OrderSetCustomerIdActionBuilder builder(final OrderSetCustomerIdAction template) {
        return OrderSetCustomerIdActionBuilder.of(template);
    }

    default <T> T withOrderSetCustomerIdAction(Function<OrderSetCustomerIdAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetCustomerIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetCustomerIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetCustomerIdAction>";
            }
        };
    }
}
