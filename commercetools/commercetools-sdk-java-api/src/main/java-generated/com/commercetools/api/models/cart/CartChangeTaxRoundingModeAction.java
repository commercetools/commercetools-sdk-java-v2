
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartChangeTaxRoundingModeActionImpl.class)
public interface CartChangeTaxRoundingModeAction extends CartUpdateAction {

    String CHANGE_TAX_ROUNDING_MODE = "changeTaxRoundingMode";

    @NotNull
    @JsonProperty("taxRoundingMode")
    public RoundingMode getTaxRoundingMode();

    public void setTaxRoundingMode(final RoundingMode taxRoundingMode);

    public static CartChangeTaxRoundingModeAction of() {
        return new CartChangeTaxRoundingModeActionImpl();
    }

    public static CartChangeTaxRoundingModeAction of(final CartChangeTaxRoundingModeAction template) {
        CartChangeTaxRoundingModeActionImpl instance = new CartChangeTaxRoundingModeActionImpl();
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        return instance;
    }

    public static CartChangeTaxRoundingModeActionBuilder builder() {
        return CartChangeTaxRoundingModeActionBuilder.of();
    }

    public static CartChangeTaxRoundingModeActionBuilder builder(final CartChangeTaxRoundingModeAction template) {
        return CartChangeTaxRoundingModeActionBuilder.of(template);
    }

    default <T> T withCartChangeTaxRoundingModeAction(Function<CartChangeTaxRoundingModeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartChangeTaxRoundingModeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartChangeTaxRoundingModeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartChangeTaxRoundingModeAction>";
            }
        };
    }
}
