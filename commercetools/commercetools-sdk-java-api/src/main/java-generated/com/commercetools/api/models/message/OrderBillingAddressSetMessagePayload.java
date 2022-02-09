
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
@JsonDeserialize(as = OrderBillingAddressSetMessagePayloadImpl.class)
public interface OrderBillingAddressSetMessagePayload extends OrderMessagePayload {

    String ORDER_BILLING_ADDRESS_SET = "OrderBillingAddressSet";

    @Valid
    @JsonProperty("address")
    public Address getAddress();

    @Valid
    @JsonProperty("oldAddress")
    public Address getOldAddress();

    public void setAddress(final Address address);

    public void setOldAddress(final Address oldAddress);

    public static OrderBillingAddressSetMessagePayload of() {
        return new OrderBillingAddressSetMessagePayloadImpl();
    }

    public static OrderBillingAddressSetMessagePayload of(final OrderBillingAddressSetMessagePayload template) {
        OrderBillingAddressSetMessagePayloadImpl instance = new OrderBillingAddressSetMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        instance.setOldAddress(template.getOldAddress());
        return instance;
    }

    public static OrderBillingAddressSetMessagePayloadBuilder builder() {
        return OrderBillingAddressSetMessagePayloadBuilder.of();
    }

    public static OrderBillingAddressSetMessagePayloadBuilder builder(
            final OrderBillingAddressSetMessagePayload template) {
        return OrderBillingAddressSetMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderBillingAddressSetMessagePayload(Function<OrderBillingAddressSetMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
