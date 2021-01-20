
package com.commercetools.api.models.cart;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.CartSetCustomLineItemTaxRateActionImpl;
import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartSetCustomLineItemTaxRateActionImpl.class)
public interface CartSetCustomLineItemTaxRateAction extends CartUpdateAction {

    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    public void setCustomLineItemId(final String customLineItemId);

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    public static CartSetCustomLineItemTaxRateAction of() {
        return new CartSetCustomLineItemTaxRateActionImpl();
    }

    public static CartSetCustomLineItemTaxRateAction of(final CartSetCustomLineItemTaxRateAction template) {
        CartSetCustomLineItemTaxRateActionImpl instance = new CartSetCustomLineItemTaxRateActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    public static CartSetCustomLineItemTaxRateActionBuilder builder() {
        return CartSetCustomLineItemTaxRateActionBuilder.of();
    }

    public static CartSetCustomLineItemTaxRateActionBuilder builder(final CartSetCustomLineItemTaxRateAction template) {
        return CartSetCustomLineItemTaxRateActionBuilder.of(template);
    }

    default <T> T withCartSetCustomLineItemTaxRateAction(Function<CartSetCustomLineItemTaxRateAction, T> helper) {
        return helper.apply(this);
    }
}
