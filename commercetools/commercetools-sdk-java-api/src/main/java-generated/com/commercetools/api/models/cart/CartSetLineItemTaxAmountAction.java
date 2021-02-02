
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
@JsonDeserialize(as = CartSetLineItemTaxAmountActionImpl.class)
public interface CartSetLineItemTaxAmountAction extends CartUpdateAction {

    String SET_LINE_ITEM_TAX_AMOUNT = "setLineItemTaxAmount";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @Valid
    @JsonProperty("externalTaxAmount")
    public ExternalTaxAmountDraft getExternalTaxAmount();

    public void setLineItemId(final String lineItemId);

    public void setExternalTaxAmount(final ExternalTaxAmountDraft externalTaxAmount);

    public static CartSetLineItemTaxAmountAction of() {
        return new CartSetLineItemTaxAmountActionImpl();
    }

    public static CartSetLineItemTaxAmountAction of(final CartSetLineItemTaxAmountAction template) {
        CartSetLineItemTaxAmountActionImpl instance = new CartSetLineItemTaxAmountActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setExternalTaxAmount(template.getExternalTaxAmount());
        return instance;
    }

    public static CartSetLineItemTaxAmountActionBuilder builder() {
        return CartSetLineItemTaxAmountActionBuilder.of();
    }

    public static CartSetLineItemTaxAmountActionBuilder builder(final CartSetLineItemTaxAmountAction template) {
        return CartSetLineItemTaxAmountActionBuilder.of(template);
    }

    default <T> T withCartSetLineItemTaxAmountAction(Function<CartSetLineItemTaxAmountAction, T> helper) {
        return helper.apply(this);
    }
}
