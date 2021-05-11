
package com.commercetools.api.models.me;

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
@JsonDeserialize(as = MyCartAddItemShippingAddressActionImpl.class)
public interface MyCartAddItemShippingAddressAction extends MyCartUpdateAction {

    String ADD_ITEM_SHIPPING_ADDRESS = "addItemShippingAddress";

    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    public void setAddress(final BaseAddress address);

    public static MyCartAddItemShippingAddressAction of() {
        return new MyCartAddItemShippingAddressActionImpl();
    }

    public static MyCartAddItemShippingAddressAction of(final MyCartAddItemShippingAddressAction template) {
        MyCartAddItemShippingAddressActionImpl instance = new MyCartAddItemShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static MyCartAddItemShippingAddressActionBuilder builder() {
        return MyCartAddItemShippingAddressActionBuilder.of();
    }

    public static MyCartAddItemShippingAddressActionBuilder builder(final MyCartAddItemShippingAddressAction template) {
        return MyCartAddItemShippingAddressActionBuilder.of(template);
    }

    default <T> T withMyCartAddItemShippingAddressAction(Function<MyCartAddItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
