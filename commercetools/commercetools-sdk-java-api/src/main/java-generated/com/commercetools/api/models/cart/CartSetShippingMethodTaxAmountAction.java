
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartSetShippingMethodTaxAmountActionImpl.class)
public interface CartSetShippingMethodTaxAmountAction extends CartUpdateAction {

    String SET_SHIPPING_METHOD_TAX_AMOUNT = "setShippingMethodTaxAmount";

    @Valid
    @JsonProperty("externalTaxAmount")
    public ExternalTaxAmountDraft getExternalTaxAmount();

    public void setExternalTaxAmount(final ExternalTaxAmountDraft externalTaxAmount);

    public static CartSetShippingMethodTaxAmountAction of() {
        return new CartSetShippingMethodTaxAmountActionImpl();
    }

    public static CartSetShippingMethodTaxAmountAction of(final CartSetShippingMethodTaxAmountAction template) {
        CartSetShippingMethodTaxAmountActionImpl instance = new CartSetShippingMethodTaxAmountActionImpl();
        instance.setExternalTaxAmount(template.getExternalTaxAmount());
        return instance;
    }

    public static CartSetShippingMethodTaxAmountActionBuilder builder() {
        return CartSetShippingMethodTaxAmountActionBuilder.of();
    }

    public static CartSetShippingMethodTaxAmountActionBuilder builder(
            final CartSetShippingMethodTaxAmountAction template) {
        return CartSetShippingMethodTaxAmountActionBuilder.of(template);
    }

    default <T> T withCartSetShippingMethodTaxAmountAction(Function<CartSetShippingMethodTaxAmountAction, T> helper) {
        return helper.apply(this);
    }
}
