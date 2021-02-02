
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartSetLineItemTaxRateActionImpl.class)
public interface CartSetLineItemTaxRateAction extends CartUpdateAction {

    String SET_LINE_ITEM_TAX_RATE = "setLineItemTaxRate";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    public void setLineItemId(final String lineItemId);

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    public static CartSetLineItemTaxRateAction of() {
        return new CartSetLineItemTaxRateActionImpl();
    }

    public static CartSetLineItemTaxRateAction of(final CartSetLineItemTaxRateAction template) {
        CartSetLineItemTaxRateActionImpl instance = new CartSetLineItemTaxRateActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    public static CartSetLineItemTaxRateActionBuilder builder() {
        return CartSetLineItemTaxRateActionBuilder.of();
    }

    public static CartSetLineItemTaxRateActionBuilder builder(final CartSetLineItemTaxRateAction template) {
        return CartSetLineItemTaxRateActionBuilder.of(template);
    }

    default <T> T withCartSetLineItemTaxRateAction(Function<CartSetLineItemTaxRateAction, T> helper) {
        return helper.apply(this);
    }
}
