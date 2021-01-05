package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ExternalTaxAmountDraft;
import com.commercetools.api.models.cart.CartSetCustomLineItemTaxAmountActionImpl;

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
@JsonDeserialize(as = CartSetCustomLineItemTaxAmountActionImpl.class)
public interface CartSetCustomLineItemTaxAmountAction extends CartUpdateAction {

    
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();
    
    @Valid
    @JsonProperty("externalTaxAmount")
    public ExternalTaxAmountDraft getExternalTaxAmount();

    public void setCustomLineItemId(final String customLineItemId);
    
    public void setExternalTaxAmount(final ExternalTaxAmountDraft externalTaxAmount);

    public static CartSetCustomLineItemTaxAmountAction of(){
        return new CartSetCustomLineItemTaxAmountActionImpl();
    }
    

    public static CartSetCustomLineItemTaxAmountAction of(final CartSetCustomLineItemTaxAmountAction template) {
        CartSetCustomLineItemTaxAmountActionImpl instance = new CartSetCustomLineItemTaxAmountActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setExternalTaxAmount(template.getExternalTaxAmount());
        return instance;
    }

    public static CartSetCustomLineItemTaxAmountActionBuilder builder(){
        return CartSetCustomLineItemTaxAmountActionBuilder.of();
    }
    
    public static CartSetCustomLineItemTaxAmountActionBuilder builder(final CartSetCustomLineItemTaxAmountAction template){
        return CartSetCustomLineItemTaxAmountActionBuilder.of(template);
    }
    

    default <T> T withCartSetCustomLineItemTaxAmountAction(Function<CartSetCustomLineItemTaxAmountAction, T> helper) {
        return helper.apply(this);
    }
}
