
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.BaseAddress;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCartSetShippingAddressActionImpl.class)
public interface MyCartSetShippingAddressAction extends MyCartUpdateAction {

    String SET_SHIPPING_ADDRESS = "setShippingAddress";

    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    public void setAddress(final BaseAddress address);

    public static MyCartSetShippingAddressAction of() {
        return new MyCartSetShippingAddressActionImpl();
    }

    public static MyCartSetShippingAddressAction of(final MyCartSetShippingAddressAction template) {
        MyCartSetShippingAddressActionImpl instance = new MyCartSetShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static MyCartSetShippingAddressActionBuilder builder() {
        return MyCartSetShippingAddressActionBuilder.of();
    }

    public static MyCartSetShippingAddressActionBuilder builder(final MyCartSetShippingAddressAction template) {
        return MyCartSetShippingAddressActionBuilder.of(template);
    }

    default <T> T withMyCartSetShippingAddressAction(Function<MyCartSetShippingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
