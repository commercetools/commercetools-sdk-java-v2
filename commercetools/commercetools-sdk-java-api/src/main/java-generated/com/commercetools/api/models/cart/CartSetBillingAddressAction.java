
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
@JsonDeserialize(as = CartSetBillingAddressActionImpl.class)
public interface CartSetBillingAddressAction extends CartUpdateAction {

    String SET_BILLING_ADDRESS = "setBillingAddress";

    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    public void setAddress(final BaseAddress address);

    public static CartSetBillingAddressAction of() {
        return new CartSetBillingAddressActionImpl();
    }

    public static CartSetBillingAddressAction of(final CartSetBillingAddressAction template) {
        CartSetBillingAddressActionImpl instance = new CartSetBillingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static CartSetBillingAddressActionBuilder builder() {
        return CartSetBillingAddressActionBuilder.of();
    }

    public static CartSetBillingAddressActionBuilder builder(final CartSetBillingAddressAction template) {
        return CartSetBillingAddressActionBuilder.of(template);
    }

    default <T> T withCartSetBillingAddressAction(Function<CartSetBillingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
