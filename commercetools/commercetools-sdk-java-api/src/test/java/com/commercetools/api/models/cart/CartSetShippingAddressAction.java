package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.cart.CartSetShippingAddressActionImpl;

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
@JsonDeserialize(as = CartSetShippingAddressActionImpl.class)
public interface CartSetShippingAddressAction extends CartUpdateAction {

    String SET_SHIPPING_ADDRESS = "setShippingAddress";

    
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    
    public void setAddress(final Address address);
    

    public static CartSetShippingAddressAction of(){
        return new CartSetShippingAddressActionImpl();
    }
    

    public static CartSetShippingAddressAction of(final CartSetShippingAddressAction template) {
        CartSetShippingAddressActionImpl instance = new CartSetShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static CartSetShippingAddressActionBuilder builder(){
        return CartSetShippingAddressActionBuilder.of();
    }
    
    public static CartSetShippingAddressActionBuilder builder(final CartSetShippingAddressAction template){
        return CartSetShippingAddressActionBuilder.of(template);
    }
    

    default <T> T withCartSetShippingAddressAction(Function<CartSetShippingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
