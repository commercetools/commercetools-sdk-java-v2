
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetDeliveryAddressActionImpl.class)
public interface OrderSetDeliveryAddressAction extends OrderUpdateAction {

    String SET_DELIVERY_ADDRESS = "setDeliveryAddress";

    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setDeliveryId(final String deliveryId);

    public void setAddress(final Address address);

    public static OrderSetDeliveryAddressAction of() {
        return new OrderSetDeliveryAddressActionImpl();
    }

    public static OrderSetDeliveryAddressAction of(final OrderSetDeliveryAddressAction template) {
        OrderSetDeliveryAddressActionImpl instance = new OrderSetDeliveryAddressActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static OrderSetDeliveryAddressActionBuilder builder() {
        return OrderSetDeliveryAddressActionBuilder.of();
    }

    public static OrderSetDeliveryAddressActionBuilder builder(final OrderSetDeliveryAddressAction template) {
        return OrderSetDeliveryAddressActionBuilder.of(template);
    }

    default <T> T withOrderSetDeliveryAddressAction(Function<OrderSetDeliveryAddressAction, T> helper) {
        return helper.apply(this);
    }
}
