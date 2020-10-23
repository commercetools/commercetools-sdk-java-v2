package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.TaxCalculationMode;
import com.commercetools.api.models.cart.CartChangeTaxCalculationModeActionImpl;

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
@JsonDeserialize(as = CartChangeTaxCalculationModeActionImpl.class)
public interface CartChangeTaxCalculationModeAction extends CartUpdateAction {

    
    @NotNull
    @JsonProperty("taxCalculationMode")
    public TaxCalculationMode getTaxCalculationMode();

    public void setTaxCalculationMode(final TaxCalculationMode taxCalculationMode);

    public static CartChangeTaxCalculationModeActionImpl of(){
        return new CartChangeTaxCalculationModeActionImpl();
    }
    

    public static CartChangeTaxCalculationModeActionImpl of(final CartChangeTaxCalculationModeAction template) {
        CartChangeTaxCalculationModeActionImpl instance = new CartChangeTaxCalculationModeActionImpl();
        instance.setTaxCalculationMode(template.getTaxCalculationMode());
        return instance;
    }

    default <T> T withCartChangeTaxCalculationModeAction(Function<CartChangeTaxCalculationModeAction, T> helper) {
        return helper.apply(this);
    }
}
