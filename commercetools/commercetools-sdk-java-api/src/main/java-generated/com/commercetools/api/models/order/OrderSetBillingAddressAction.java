
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetBillingAddressActionImpl.class)
public interface OrderSetBillingAddressAction extends OrderUpdateAction {

    String SET_BILLING_ADDRESS = "setBillingAddress";

    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static OrderSetBillingAddressAction of() {
        return new OrderSetBillingAddressActionImpl();
    }

    public static OrderSetBillingAddressAction of(final OrderSetBillingAddressAction template) {
        OrderSetBillingAddressActionImpl instance = new OrderSetBillingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static OrderSetBillingAddressActionBuilder builder() {
        return OrderSetBillingAddressActionBuilder.of();
    }

    public static OrderSetBillingAddressActionBuilder builder(final OrderSetBillingAddressAction template) {
        return OrderSetBillingAddressActionBuilder.of(template);
    }

    default <T> T withOrderSetBillingAddressAction(Function<OrderSetBillingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
