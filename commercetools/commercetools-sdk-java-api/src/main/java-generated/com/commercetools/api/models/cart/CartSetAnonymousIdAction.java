package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CartSetAnonymousIdActionImpl;

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
@JsonDeserialize(as = CartSetAnonymousIdActionImpl.class)
public interface CartSetAnonymousIdAction extends CartUpdateAction {

    String SET_ANONYMOUS_ID = "setAnonymousId";

    /**
    *  <p>If not set, any existing anonymous ID will be removed.</p>
    */
    
    @JsonProperty("anonymousId")
    public String getAnonymousId();

    
    public void setAnonymousId(final String anonymousId);
    

    public static CartSetAnonymousIdAction of(){
        return new CartSetAnonymousIdActionImpl();
    }
    

    public static CartSetAnonymousIdAction of(final CartSetAnonymousIdAction template) {
        CartSetAnonymousIdActionImpl instance = new CartSetAnonymousIdActionImpl();
        instance.setAnonymousId(template.getAnonymousId());
        return instance;
    }

    public static CartSetAnonymousIdActionBuilder builder(){
        return CartSetAnonymousIdActionBuilder.of();
    }
    
    public static CartSetAnonymousIdActionBuilder builder(final CartSetAnonymousIdAction template){
        return CartSetAnonymousIdActionBuilder.of(template);
    }
    

    default <T> T withCartSetAnonymousIdAction(Function<CartSetAnonymousIdAction, T> helper) {
        return helper.apply(this);
    }
}
