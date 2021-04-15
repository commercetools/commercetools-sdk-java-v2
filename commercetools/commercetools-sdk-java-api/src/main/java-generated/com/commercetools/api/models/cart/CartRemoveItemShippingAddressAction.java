package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CartRemoveItemShippingAddressActionImpl;

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
@JsonDeserialize(as = CartRemoveItemShippingAddressActionImpl.class)
public interface CartRemoveItemShippingAddressAction extends CartUpdateAction {

    String REMOVE_ITEM_SHIPPING_ADDRESS = "removeItemShippingAddress";

    
    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();

    
    public void setAddressKey(final String addressKey);
    

    public static CartRemoveItemShippingAddressAction of(){
        return new CartRemoveItemShippingAddressActionImpl();
    }
    

    public static CartRemoveItemShippingAddressAction of(final CartRemoveItemShippingAddressAction template) {
        CartRemoveItemShippingAddressActionImpl instance = new CartRemoveItemShippingAddressActionImpl();
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static CartRemoveItemShippingAddressActionBuilder builder(){
        return CartRemoveItemShippingAddressActionBuilder.of();
    }
    
    public static CartRemoveItemShippingAddressActionBuilder builder(final CartRemoveItemShippingAddressAction template){
        return CartRemoveItemShippingAddressActionBuilder.of(template);
    }
    

    default <T> T withCartRemoveItemShippingAddressAction(Function<CartRemoveItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
