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
import java.util.List;
import java.util.Map;
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

    public static CartSetBillingAddressActionImpl of(){
        return new CartSetBillingAddressActionImpl();
    }
    

    public static CartSetBillingAddressActionImpl of(final CartSetBillingAddressAction template) {
        CartSetBillingAddressActionImpl instance = new CartSetBillingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    default <T extends Accessor<CartSetBillingAddressAction>> T withCartSetBillingAddressAction(Function<CartSetBillingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
