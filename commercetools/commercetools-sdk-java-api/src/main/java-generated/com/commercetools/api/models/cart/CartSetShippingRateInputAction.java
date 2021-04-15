
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartSetShippingRateInputActionImpl.class)
public interface CartSetShippingRateInputAction extends CartUpdateAction {

    String SET_SHIPPING_RATE_INPUT = "setShippingRateInput";

    /**
    *  <p>Based on the definition of ShippingRateInputType.
    *  If CartClassification is defined, it must be ClassificationShippingRateInput.
    *  If CartScore is defined, it must be ScoreShippingRateInput.
    *  Otherwise it can not bet set.</p>
    */
    @Valid
    @JsonProperty("shippingRateInput")
    public ShippingRateInputDraft getShippingRateInput();

    public void setShippingRateInput(final ShippingRateInputDraft shippingRateInput);

    public static CartSetShippingRateInputAction of() {
        return new CartSetShippingRateInputActionImpl();
    }

    public static CartSetShippingRateInputAction of(final CartSetShippingRateInputAction template) {
        CartSetShippingRateInputActionImpl instance = new CartSetShippingRateInputActionImpl();
        instance.setShippingRateInput(template.getShippingRateInput());
        return instance;
    }

    public static CartSetShippingRateInputActionBuilder builder() {
        return CartSetShippingRateInputActionBuilder.of();
    }

    public static CartSetShippingRateInputActionBuilder builder(final CartSetShippingRateInputAction template) {
        return CartSetShippingRateInputActionBuilder.of(template);
    }

    default <T> T withCartSetShippingRateInputAction(Function<CartSetShippingRateInputAction, T> helper) {
        return helper.apply(this);
    }
}
