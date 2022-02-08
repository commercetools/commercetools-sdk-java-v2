
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderShippingAddressSetMessagePayloadImpl.class)
public interface OrderShippingAddressSetMessagePayload extends OrderMessagePayload {

    String ORDER_SHIPPING_ADDRESS_SET = "OrderShippingAddressSet";

    @Valid
    @JsonProperty("address")
    public Address getAddress();

    @Valid
    @JsonProperty("oldAddress")
    public Address getOldAddress();

    public void setAddress(final Address address);

    public void setOldAddress(final Address oldAddress);

    public static OrderShippingAddressSetMessagePayload of() {
        return new OrderShippingAddressSetMessagePayloadImpl();
    }

    public static OrderShippingAddressSetMessagePayload of(final OrderShippingAddressSetMessagePayload template) {
        OrderShippingAddressSetMessagePayloadImpl instance = new OrderShippingAddressSetMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        instance.setOldAddress(template.getOldAddress());
        return instance;
    }

    public static OrderShippingAddressSetMessagePayloadBuilder builder() {
        return OrderShippingAddressSetMessagePayloadBuilder.of();
    }

    public static OrderShippingAddressSetMessagePayloadBuilder builder(
            final OrderShippingAddressSetMessagePayload template) {
        return OrderShippingAddressSetMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderShippingAddressSetMessagePayload(Function<OrderShippingAddressSetMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
