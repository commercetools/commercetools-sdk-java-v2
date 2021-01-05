package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.cart.CartAddItemShippingAddressActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartAddItemShippingAddressActionImpl.class)
public interface CartAddItemShippingAddressAction extends CartUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static CartAddItemShippingAddressAction of(){
        return new CartAddItemShippingAddressActionImpl();
    }
    

    public static CartAddItemShippingAddressAction of(final CartAddItemShippingAddressAction template) {
        CartAddItemShippingAddressActionImpl instance = new CartAddItemShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static CartAddItemShippingAddressActionBuilder builder(){
        return CartAddItemShippingAddressActionBuilder.of();
    }
    
    public static CartAddItemShippingAddressActionBuilder builder(final CartAddItemShippingAddressAction template){
        return CartAddItemShippingAddressActionBuilder.of(template);
    }
    

    default <T> T withCartAddItemShippingAddressAction(Function<CartAddItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
