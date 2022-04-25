
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
@JsonDeserialize(as = CartUpdateItemShippingAddressActionImpl.class)
public interface CartUpdateItemShippingAddressAction extends CartUpdateAction {

    String UPDATE_ITEM_SHIPPING_ADDRESS = "updateItemShippingAddress";

    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    public void setAddress(final BaseAddress address);

    public static CartUpdateItemShippingAddressAction of() {
        return new CartUpdateItemShippingAddressActionImpl();
    }

    public static CartUpdateItemShippingAddressAction of(final CartUpdateItemShippingAddressAction template) {
        CartUpdateItemShippingAddressActionImpl instance = new CartUpdateItemShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static CartUpdateItemShippingAddressActionBuilder builder() {
        return CartUpdateItemShippingAddressActionBuilder.of();
    }

    public static CartUpdateItemShippingAddressActionBuilder builder(
            final CartUpdateItemShippingAddressAction template) {
        return CartUpdateItemShippingAddressActionBuilder.of(template);
    }

    default <T> T withCartUpdateItemShippingAddressAction(Function<CartUpdateItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartUpdateItemShippingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartUpdateItemShippingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartUpdateItemShippingAddressAction>";
            }
        };
    }
}
