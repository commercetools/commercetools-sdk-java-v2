
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartChangeTaxCalculationModeActionImpl.class)
public interface CartChangeTaxCalculationModeAction extends CartUpdateAction {

    String CHANGE_TAX_CALCULATION_MODE = "changeTaxCalculationMode";

    @NotNull
    @JsonProperty("taxCalculationMode")
    public TaxCalculationMode getTaxCalculationMode();

    public void setTaxCalculationMode(final TaxCalculationMode taxCalculationMode);

    public static CartChangeTaxCalculationModeAction of() {
        return new CartChangeTaxCalculationModeActionImpl();
    }

    public static CartChangeTaxCalculationModeAction of(final CartChangeTaxCalculationModeAction template) {
        CartChangeTaxCalculationModeActionImpl instance = new CartChangeTaxCalculationModeActionImpl();
        instance.setTaxCalculationMode(template.getTaxCalculationMode());
        return instance;
    }

    public static CartChangeTaxCalculationModeActionBuilder builder() {
        return CartChangeTaxCalculationModeActionBuilder.of();
    }

    public static CartChangeTaxCalculationModeActionBuilder builder(final CartChangeTaxCalculationModeAction template) {
        return CartChangeTaxCalculationModeActionBuilder.of(template);
    }

    default <T> T withCartChangeTaxCalculationModeAction(Function<CartChangeTaxCalculationModeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartChangeTaxCalculationModeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartChangeTaxCalculationModeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartChangeTaxCalculationModeAction>";
            }
        };
    }
}
