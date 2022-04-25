
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.BaseAddress;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetShippingAddressActionImpl.class)
public interface OrderSetShippingAddressAction extends OrderUpdateAction {

    String SET_SHIPPING_ADDRESS = "setShippingAddress";

    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    public void setAddress(final BaseAddress address);

    public static OrderSetShippingAddressAction of() {
        return new OrderSetShippingAddressActionImpl();
    }

    public static OrderSetShippingAddressAction of(final OrderSetShippingAddressAction template) {
        OrderSetShippingAddressActionImpl instance = new OrderSetShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static OrderSetShippingAddressActionBuilder builder() {
        return OrderSetShippingAddressActionBuilder.of();
    }

    public static OrderSetShippingAddressActionBuilder builder(final OrderSetShippingAddressAction template) {
        return OrderSetShippingAddressActionBuilder.of(template);
    }

    default <T> T withOrderSetShippingAddressAction(Function<OrderSetShippingAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetShippingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetShippingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetShippingAddressAction>";
            }
        };
    }
}
