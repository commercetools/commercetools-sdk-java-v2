
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.BaseAddress;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartSetShippingAddressActionImpl.class)
public interface CartSetShippingAddressAction extends CartUpdateAction {

    String SET_SHIPPING_ADDRESS = "setShippingAddress";

    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    public void setAddress(final BaseAddress address);

    public static CartSetShippingAddressAction of() {
        return new CartSetShippingAddressActionImpl();
    }

    public static CartSetShippingAddressAction of(final CartSetShippingAddressAction template) {
        CartSetShippingAddressActionImpl instance = new CartSetShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static CartSetShippingAddressActionBuilder builder() {
        return CartSetShippingAddressActionBuilder.of();
    }

    public static CartSetShippingAddressActionBuilder builder(final CartSetShippingAddressAction template) {
        return CartSetShippingAddressActionBuilder.of(template);
    }

    default <T> T withCartSetShippingAddressAction(Function<CartSetShippingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
