
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderRemoveItemShippingAddressActionImpl.class)
public interface OrderRemoveItemShippingAddressAction extends OrderUpdateAction {

    String REMOVE_ITEM_SHIPPING_ADDRESS = "removeItemShippingAddress";

    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressKey(final String addressKey);

    public static OrderRemoveItemShippingAddressAction of() {
        return new OrderRemoveItemShippingAddressActionImpl();
    }

    public static OrderRemoveItemShippingAddressAction of(final OrderRemoveItemShippingAddressAction template) {
        OrderRemoveItemShippingAddressActionImpl instance = new OrderRemoveItemShippingAddressActionImpl();
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static OrderRemoveItemShippingAddressActionBuilder builder() {
        return OrderRemoveItemShippingAddressActionBuilder.of();
    }

    public static OrderRemoveItemShippingAddressActionBuilder builder(
            final OrderRemoveItemShippingAddressAction template) {
        return OrderRemoveItemShippingAddressActionBuilder.of(template);
    }

    default <T> T withOrderRemoveItemShippingAddressAction(Function<OrderRemoveItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
