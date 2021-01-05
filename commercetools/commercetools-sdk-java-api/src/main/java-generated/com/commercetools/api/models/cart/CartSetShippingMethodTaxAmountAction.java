package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ExternalTaxAmountDraft;
import com.commercetools.api.models.cart.CartSetShippingMethodTaxAmountActionImpl;

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
@JsonDeserialize(as = CartSetShippingMethodTaxAmountActionImpl.class)
public interface CartSetShippingMethodTaxAmountAction extends CartUpdateAction {

    
    @Valid
    @JsonProperty("externalTaxAmount")
    public ExternalTaxAmountDraft getExternalTaxAmount();

    public void setExternalTaxAmount(final ExternalTaxAmountDraft externalTaxAmount);

    public static CartSetShippingMethodTaxAmountAction of(){
        return new CartSetShippingMethodTaxAmountActionImpl();
    }
    

    public static CartSetShippingMethodTaxAmountAction of(final CartSetShippingMethodTaxAmountAction template) {
        CartSetShippingMethodTaxAmountActionImpl instance = new CartSetShippingMethodTaxAmountActionImpl();
        instance.setExternalTaxAmount(template.getExternalTaxAmount());
        return instance;
    }

    public static CartSetShippingMethodTaxAmountActionBuilder builder(){
        return CartSetShippingMethodTaxAmountActionBuilder.of();
    }
    
    public static CartSetShippingMethodTaxAmountActionBuilder builder(final CartSetShippingMethodTaxAmountAction template){
        return CartSetShippingMethodTaxAmountActionBuilder.of(template);
    }
    

    default <T> T withCartSetShippingMethodTaxAmountAction(Function<CartSetShippingMethodTaxAmountAction, T> helper) {
        return helper.apply(this);
    }
}
