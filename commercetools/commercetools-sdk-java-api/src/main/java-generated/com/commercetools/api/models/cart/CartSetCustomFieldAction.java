package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.cart.CartSetCustomFieldActionImpl;

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
@JsonDeserialize(as = CartSetCustomFieldActionImpl.class)
public interface CartSetCustomFieldAction extends CartUpdateAction {

    String SET_CUSTOM_FIELD = "setCustomField";

    
    @NotNull
    @JsonProperty("name")
    public String getName();
    
    
    @JsonProperty("value")
    public Object getValue();

    
    public void setName(final String name);
    
    
    
    public void setValue(final Object value);
    

    public static CartSetCustomFieldAction of(){
        return new CartSetCustomFieldActionImpl();
    }
    

    public static CartSetCustomFieldAction of(final CartSetCustomFieldAction template) {
        CartSetCustomFieldActionImpl instance = new CartSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static CartSetCustomFieldActionBuilder builder(){
        return CartSetCustomFieldActionBuilder.of();
    }
    
    public static CartSetCustomFieldActionBuilder builder(final CartSetCustomFieldAction template){
        return CartSetCustomFieldActionBuilder.of(template);
    }
    

    default <T> T withCartSetCustomFieldAction(Function<CartSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
