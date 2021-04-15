
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
@JsonDeserialize(as = CartSetCustomLineItemTaxAmountActionImpl.class)
public interface CartSetCustomLineItemTaxAmountAction extends CartUpdateAction {

    String SET_CUSTOM_LINE_ITEM_TAX_AMOUNT = "setCustomLineItemTaxAmount";

    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    @Valid
    @JsonProperty("externalTaxAmount")
    public ExternalTaxAmountDraft getExternalTaxAmount();

    public void setCustomLineItemId(final String customLineItemId);

    public void setExternalTaxAmount(final ExternalTaxAmountDraft externalTaxAmount);

    public static CartSetCustomLineItemTaxAmountAction of() {
        return new CartSetCustomLineItemTaxAmountActionImpl();
    }

    public static CartSetCustomLineItemTaxAmountAction of(final CartSetCustomLineItemTaxAmountAction template) {
        CartSetCustomLineItemTaxAmountActionImpl instance = new CartSetCustomLineItemTaxAmountActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setExternalTaxAmount(template.getExternalTaxAmount());
        return instance;
    }

    public static CartSetCustomLineItemTaxAmountActionBuilder builder() {
        return CartSetCustomLineItemTaxAmountActionBuilder.of();
    }

    public static CartSetCustomLineItemTaxAmountActionBuilder builder(
            final CartSetCustomLineItemTaxAmountAction template) {
        return CartSetCustomLineItemTaxAmountActionBuilder.of(template);
    }

    default <T> T withCartSetCustomLineItemTaxAmountAction(Function<CartSetCustomLineItemTaxAmountAction, T> helper) {
        return helper.apply(this);
    }
}
