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
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartSetShippingAddressActionImpl.class)
public interface CartSetShippingAddressAction extends CartUpdateAction {

    
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static CartSetShippingAddressActionImpl of(){
        return new CartSetShippingAddressActionImpl();
    }
    

    public static CartSetShippingAddressActionImpl of(final CartSetShippingAddressAction template) {
        CartSetShippingAddressActionImpl instance = new CartSetShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    default <T extends Accessor<CartSetShippingAddressAction>> T withCartSetShippingAddressAction(Function<CartSetShippingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
