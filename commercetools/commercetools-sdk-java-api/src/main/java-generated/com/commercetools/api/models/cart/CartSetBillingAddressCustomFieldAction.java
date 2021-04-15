package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.cart.CartSetBillingAddressCustomFieldActionImpl;

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
@JsonDeserialize(as = CartSetBillingAddressCustomFieldActionImpl.class)
public interface CartSetBillingAddressCustomFieldAction extends CartUpdateAction {

    String SET_BILLING_ADDRESS_CUSTOM_FIELD = "setBillingAddressCustomField";

    
    @NotNull
    @JsonProperty("name")
    public String getName();
    
    
    @JsonProperty("value")
    public Object getValue();

    
    public void setName(final String name);
    
    
    
    public void setValue(final Object value);
    

    public static CartSetBillingAddressCustomFieldAction of(){
        return new CartSetBillingAddressCustomFieldActionImpl();
    }
    

    public static CartSetBillingAddressCustomFieldAction of(final CartSetBillingAddressCustomFieldAction template) {
        CartSetBillingAddressCustomFieldActionImpl instance = new CartSetBillingAddressCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static CartSetBillingAddressCustomFieldActionBuilder builder(){
        return CartSetBillingAddressCustomFieldActionBuilder.of();
    }
    
    public static CartSetBillingAddressCustomFieldActionBuilder builder(final CartSetBillingAddressCustomFieldAction template){
        return CartSetBillingAddressCustomFieldActionBuilder.of(template);
    }
    

    default <T> T withCartSetBillingAddressCustomFieldAction(Function<CartSetBillingAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
