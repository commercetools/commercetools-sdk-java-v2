
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
@JsonDeserialize(as = OrderUpdateItemShippingAddressActionImpl.class)
public interface OrderUpdateItemShippingAddressAction extends OrderUpdateAction {

    String UPDATE_ITEM_SHIPPING_ADDRESS = "updateItemShippingAddress";

    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    public void setAddress(final BaseAddress address);

    public static OrderUpdateItemShippingAddressAction of() {
        return new OrderUpdateItemShippingAddressActionImpl();
    }

    public static OrderUpdateItemShippingAddressAction of(final OrderUpdateItemShippingAddressAction template) {
        OrderUpdateItemShippingAddressActionImpl instance = new OrderUpdateItemShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static OrderUpdateItemShippingAddressActionBuilder builder() {
        return OrderUpdateItemShippingAddressActionBuilder.of();
    }

    public static OrderUpdateItemShippingAddressActionBuilder builder(
            final OrderUpdateItemShippingAddressAction template) {
        return OrderUpdateItemShippingAddressActionBuilder.of(template);
    }

    default <T> T withOrderUpdateItemShippingAddressAction(Function<OrderUpdateItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
