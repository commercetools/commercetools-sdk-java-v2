
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseAddress;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderAddItemShippingAddressActionImpl.class)
public interface OrderAddItemShippingAddressAction extends OrderUpdateAction {

    String ADD_ITEM_SHIPPING_ADDRESS = "addItemShippingAddress";

    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    public void setAddress(final BaseAddress address);

    public static OrderAddItemShippingAddressAction of() {
        return new OrderAddItemShippingAddressActionImpl();
    }

    public static OrderAddItemShippingAddressAction of(final OrderAddItemShippingAddressAction template) {
        OrderAddItemShippingAddressActionImpl instance = new OrderAddItemShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static OrderAddItemShippingAddressActionBuilder builder() {
        return OrderAddItemShippingAddressActionBuilder.of();
    }

    public static OrderAddItemShippingAddressActionBuilder builder(final OrderAddItemShippingAddressAction template) {
        return OrderAddItemShippingAddressActionBuilder.of(template);
    }

    default <T> T withOrderAddItemShippingAddressAction(Function<OrderAddItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderAddItemShippingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderAddItemShippingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderAddItemShippingAddressAction>";
            }
        };
    }
}
