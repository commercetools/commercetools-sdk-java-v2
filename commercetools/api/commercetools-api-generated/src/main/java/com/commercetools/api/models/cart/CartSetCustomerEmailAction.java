package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CartSetCustomerEmailActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartSetCustomerEmailActionImpl.class)
public interface CartSetCustomerEmailAction extends CartUpdateAction {

    
    @NotNull
    @JsonProperty("email")
    public String getEmail();

    public void setEmail(final String email);

    public static CartSetCustomerEmailActionImpl of(){
        return new CartSetCustomerEmailActionImpl();
    }
    

    public static CartSetCustomerEmailActionImpl of(final CartSetCustomerEmailAction template) {
        CartSetCustomerEmailActionImpl instance = new CartSetCustomerEmailActionImpl();
        instance.setEmail(template.getEmail());
        return instance;
    }

}
