package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.RoundingMode;
import com.commercetools.api.models.cart.CartChangeTaxRoundingModeActionImpl;

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
@JsonDeserialize(as = CartChangeTaxRoundingModeActionImpl.class)
public interface CartChangeTaxRoundingModeAction extends CartUpdateAction {

    
    @NotNull
    @JsonProperty("taxRoundingMode")
    public RoundingMode getTaxRoundingMode();

    public void setTaxRoundingMode(final RoundingMode taxRoundingMode);

    public static CartChangeTaxRoundingModeActionImpl of(){
        return new CartChangeTaxRoundingModeActionImpl();
    }
    

    public static CartChangeTaxRoundingModeActionImpl of(final CartChangeTaxRoundingModeAction template) {
        CartChangeTaxRoundingModeActionImpl instance = new CartChangeTaxRoundingModeActionImpl();
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        return instance;
    }

    default <T> T withCartChangeTaxRoundingModeAction(Function<CartChangeTaxRoundingModeAction, T> helper) {
        return helper.apply(this);
    }
}
