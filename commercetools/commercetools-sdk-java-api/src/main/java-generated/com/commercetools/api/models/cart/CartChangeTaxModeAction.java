package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.TaxMode;
import com.commercetools.api.models.cart.CartChangeTaxModeActionImpl;

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
@JsonDeserialize(as = CartChangeTaxModeActionImpl.class)
public interface CartChangeTaxModeAction extends CartUpdateAction {

    
    @NotNull
    @JsonProperty("taxMode")
    public TaxMode getTaxMode();

    public void setTaxMode(final TaxMode taxMode);

    public static CartChangeTaxModeActionImpl of(){
        return new CartChangeTaxModeActionImpl();
    }
    

    public static CartChangeTaxModeActionImpl of(final CartChangeTaxModeAction template) {
        CartChangeTaxModeActionImpl instance = new CartChangeTaxModeActionImpl();
        instance.setTaxMode(template.getTaxMode());
        return instance;
    }

    default <T> T withCartChangeTaxModeAction(Function<CartChangeTaxModeAction, T> helper) {
        return helper.apply(this);
    }
}
