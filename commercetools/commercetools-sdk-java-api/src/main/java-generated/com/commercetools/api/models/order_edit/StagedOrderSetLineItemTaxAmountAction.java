
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
@JsonDeserialize(as = StagedOrderSetLineItemTaxAmountActionImpl.class)
public interface StagedOrderSetLineItemTaxAmountAction extends StagedOrderUpdateAction {

    String SET_LINE_ITEM_TAX_AMOUNT = "setLineItemTaxAmount";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @Valid
    @JsonProperty("externalTaxAmount")
    public ExternalTaxAmountDraft getExternalTaxAmount();

    public void setLineItemId(final String lineItemId);

    public void setExternalTaxAmount(final ExternalTaxAmountDraft externalTaxAmount);

    public static StagedOrderSetLineItemTaxAmountAction of() {
        return new StagedOrderSetLineItemTaxAmountActionImpl();
    }

    public static StagedOrderSetLineItemTaxAmountAction of(final StagedOrderSetLineItemTaxAmountAction template) {
        StagedOrderSetLineItemTaxAmountActionImpl instance = new StagedOrderSetLineItemTaxAmountActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setExternalTaxAmount(template.getExternalTaxAmount());
        return instance;
    }

    public static StagedOrderSetLineItemTaxAmountActionBuilder builder() {
        return StagedOrderSetLineItemTaxAmountActionBuilder.of();
    }

    public static StagedOrderSetLineItemTaxAmountActionBuilder builder(
            final StagedOrderSetLineItemTaxAmountAction template) {
        return StagedOrderSetLineItemTaxAmountActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetLineItemTaxAmountAction(Function<StagedOrderSetLineItemTaxAmountAction, T> helper) {
        return helper.apply(this);
    }
}
