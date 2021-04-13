package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CartRemoveCustomLineItemActionImpl;

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
@JsonDeserialize(as = CartRemoveCustomLineItemActionImpl.class)
public interface CartRemoveCustomLineItemAction extends CartUpdateAction {

    String REMOVE_CUSTOM_LINE_ITEM = "removeCustomLineItem";

    
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    
    public void setCustomLineItemId(final String customLineItemId);
    

    public static CartRemoveCustomLineItemAction of(){
        return new CartRemoveCustomLineItemActionImpl();
    }
    

    public static CartRemoveCustomLineItemAction of(final CartRemoveCustomLineItemAction template) {
        CartRemoveCustomLineItemActionImpl instance = new CartRemoveCustomLineItemActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        return instance;
    }

    public static CartRemoveCustomLineItemActionBuilder builder(){
        return CartRemoveCustomLineItemActionBuilder.of();
    }
    
    public static CartRemoveCustomLineItemActionBuilder builder(final CartRemoveCustomLineItemAction template){
        return CartRemoveCustomLineItemActionBuilder.of(template);
    }
    

    default <T> T withCartRemoveCustomLineItemAction(Function<CartRemoveCustomLineItemAction, T> helper) {
        return helper.apply(this);
    }
}
