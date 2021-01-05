package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.cart.CartUpdateItemShippingAddressActionImpl;

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
@JsonDeserialize(as = CartUpdateItemShippingAddressActionImpl.class)
public interface CartUpdateItemShippingAddressAction extends CartUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static CartUpdateItemShippingAddressAction of(){
        return new CartUpdateItemShippingAddressActionImpl();
    }
    

    public static CartUpdateItemShippingAddressAction of(final CartUpdateItemShippingAddressAction template) {
        CartUpdateItemShippingAddressActionImpl instance = new CartUpdateItemShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static CartUpdateItemShippingAddressActionBuilder builder(){
        return CartUpdateItemShippingAddressActionBuilder.of();
    }
    
    public static CartUpdateItemShippingAddressActionBuilder builder(final CartUpdateItemShippingAddressAction template){
        return CartUpdateItemShippingAddressActionBuilder.of(template);
    }
    

    default <T> T withCartUpdateItemShippingAddressAction(Function<CartUpdateItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
