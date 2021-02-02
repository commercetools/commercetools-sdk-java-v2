
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetCustomLineItemTaxRateActionImpl.class)
public interface StagedOrderSetCustomLineItemTaxRateAction extends StagedOrderUpdateAction {

    String SET_CUSTOM_LINE_ITEM_TAX_RATE = "setCustomLineItemTaxRate";

    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    public void setCustomLineItemId(final String customLineItemId);

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    public static StagedOrderSetCustomLineItemTaxRateAction of() {
        return new StagedOrderSetCustomLineItemTaxRateActionImpl();
    }

    public static StagedOrderSetCustomLineItemTaxRateAction of(
            final StagedOrderSetCustomLineItemTaxRateAction template) {
        StagedOrderSetCustomLineItemTaxRateActionImpl instance = new StagedOrderSetCustomLineItemTaxRateActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    public static StagedOrderSetCustomLineItemTaxRateActionBuilder builder() {
        return StagedOrderSetCustomLineItemTaxRateActionBuilder.of();
    }

    public static StagedOrderSetCustomLineItemTaxRateActionBuilder builder(
            final StagedOrderSetCustomLineItemTaxRateAction template) {
        return StagedOrderSetCustomLineItemTaxRateActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetCustomLineItemTaxRateAction(
            Function<StagedOrderSetCustomLineItemTaxRateAction, T> helper) {
        return helper.apply(this);
    }
}
