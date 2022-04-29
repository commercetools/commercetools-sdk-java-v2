
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ExternalTaxAmountDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetCustomLineItemTaxAmountActionImpl.class)
public interface StagedOrderSetCustomLineItemTaxAmountAction extends StagedOrderUpdateAction {

    String SET_CUSTOM_LINE_ITEM_TAX_AMOUNT = "setCustomLineItemTaxAmount";

    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    @Valid
    @JsonProperty("externalTaxAmount")
    public ExternalTaxAmountDraft getExternalTaxAmount();

    public void setCustomLineItemId(final String customLineItemId);

    public void setExternalTaxAmount(final ExternalTaxAmountDraft externalTaxAmount);

    public static StagedOrderSetCustomLineItemTaxAmountAction of() {
        return new StagedOrderSetCustomLineItemTaxAmountActionImpl();
    }

    public static StagedOrderSetCustomLineItemTaxAmountAction of(
            final StagedOrderSetCustomLineItemTaxAmountAction template) {
        StagedOrderSetCustomLineItemTaxAmountActionImpl instance = new StagedOrderSetCustomLineItemTaxAmountActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setExternalTaxAmount(template.getExternalTaxAmount());
        return instance;
    }

    public static StagedOrderSetCustomLineItemTaxAmountActionBuilder builder() {
        return StagedOrderSetCustomLineItemTaxAmountActionBuilder.of();
    }

    public static StagedOrderSetCustomLineItemTaxAmountActionBuilder builder(
            final StagedOrderSetCustomLineItemTaxAmountAction template) {
        return StagedOrderSetCustomLineItemTaxAmountActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetCustomLineItemTaxAmountAction(
            Function<StagedOrderSetCustomLineItemTaxAmountAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomLineItemTaxAmountAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomLineItemTaxAmountAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetCustomLineItemTaxAmountAction>";
            }
        };
    }
}
