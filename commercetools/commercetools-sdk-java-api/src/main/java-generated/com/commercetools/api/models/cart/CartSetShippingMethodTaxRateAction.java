
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartSetShippingMethodTaxRateActionImpl.class)
public interface CartSetShippingMethodTaxRateAction extends CartUpdateAction {

    String SET_SHIPPING_METHOD_TAX_RATE = "setShippingMethodTaxRate";

    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    public static CartSetShippingMethodTaxRateAction of() {
        return new CartSetShippingMethodTaxRateActionImpl();
    }

    public static CartSetShippingMethodTaxRateAction of(final CartSetShippingMethodTaxRateAction template) {
        CartSetShippingMethodTaxRateActionImpl instance = new CartSetShippingMethodTaxRateActionImpl();
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    public static CartSetShippingMethodTaxRateActionBuilder builder() {
        return CartSetShippingMethodTaxRateActionBuilder.of();
    }

    public static CartSetShippingMethodTaxRateActionBuilder builder(final CartSetShippingMethodTaxRateAction template) {
        return CartSetShippingMethodTaxRateActionBuilder.of(template);
    }

    default <T> T withCartSetShippingMethodTaxRateAction(Function<CartSetShippingMethodTaxRateAction, T> helper) {
        return helper.apply(this);
    }
}
