package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.cart.CartSetBillingAddressActionImpl;

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
@JsonDeserialize(as = CartSetBillingAddressActionImpl.class)
public interface CartSetBillingAddressAction extends CartUpdateAction {

    
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static CartSetBillingAddressAction of(){
        return new CartSetBillingAddressActionImpl();
    }
    

    public static CartSetBillingAddressAction of(final CartSetBillingAddressAction template) {
        CartSetBillingAddressActionImpl instance = new CartSetBillingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static CartSetBillingAddressActionBuilder builder(){
        return CartSetBillingAddressActionBuilder.of();
    }
    
    public static CartSetBillingAddressActionBuilder builder(final CartSetBillingAddressAction template){
        return CartSetBillingAddressActionBuilder.of(template);
    }
    

    default <T> T withCartSetBillingAddressAction(Function<CartSetBillingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
