
package com.commercetools.api.models.cart;

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
@JsonDeserialize(as = CartAddItemShippingAddressActionImpl.class)
public interface CartAddItemShippingAddressAction extends CartUpdateAction {

    String ADD_ITEM_SHIPPING_ADDRESS = "addItemShippingAddress";

    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    public void setAddress(final BaseAddress address);

    public static CartAddItemShippingAddressAction of() {
        return new CartAddItemShippingAddressActionImpl();
    }

    public static CartAddItemShippingAddressAction of(final CartAddItemShippingAddressAction template) {
        CartAddItemShippingAddressActionImpl instance = new CartAddItemShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static CartAddItemShippingAddressActionBuilder builder() {
        return CartAddItemShippingAddressActionBuilder.of();
    }

    public static CartAddItemShippingAddressActionBuilder builder(final CartAddItemShippingAddressAction template) {
        return CartAddItemShippingAddressActionBuilder.of(template);
    }

    default <T> T withCartAddItemShippingAddressAction(Function<CartAddItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartAddItemShippingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartAddItemShippingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartAddItemShippingAddressAction>";
            }
        };
    }
}
