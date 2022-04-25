
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetOrderNumberActionImpl.class)
public interface OrderSetOrderNumberAction extends OrderUpdateAction {

    String SET_ORDER_NUMBER = "setOrderNumber";

    @JsonProperty("orderNumber")
    public String getOrderNumber();

    public void setOrderNumber(final String orderNumber);

    public static OrderSetOrderNumberAction of() {
        return new OrderSetOrderNumberActionImpl();
    }

    public static OrderSetOrderNumberAction of(final OrderSetOrderNumberAction template) {
        OrderSetOrderNumberActionImpl instance = new OrderSetOrderNumberActionImpl();
        instance.setOrderNumber(template.getOrderNumber());
        return instance;
    }

    public static OrderSetOrderNumberActionBuilder builder() {
        return OrderSetOrderNumberActionBuilder.of();
    }

    public static OrderSetOrderNumberActionBuilder builder(final OrderSetOrderNumberAction template) {
        return OrderSetOrderNumberActionBuilder.of(template);
    }

    default <T> T withOrderSetOrderNumberAction(Function<OrderSetOrderNumberAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetOrderNumberAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetOrderNumberAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetOrderNumberAction>";
            }
        };
    }
}
