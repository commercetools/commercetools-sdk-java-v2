
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
@JsonDeserialize(as = StagedOrderSetLineItemTaxRateActionImpl.class)
public interface StagedOrderSetLineItemTaxRateAction extends StagedOrderUpdateAction {

    String SET_LINE_ITEM_TAX_RATE = "setLineItemTaxRate";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    public void setLineItemId(final String lineItemId);

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    public static StagedOrderSetLineItemTaxRateAction of() {
        return new StagedOrderSetLineItemTaxRateActionImpl();
    }

    public static StagedOrderSetLineItemTaxRateAction of(final StagedOrderSetLineItemTaxRateAction template) {
        StagedOrderSetLineItemTaxRateActionImpl instance = new StagedOrderSetLineItemTaxRateActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    public static StagedOrderSetLineItemTaxRateActionBuilder builder() {
        return StagedOrderSetLineItemTaxRateActionBuilder.of();
    }

    public static StagedOrderSetLineItemTaxRateActionBuilder builder(
            final StagedOrderSetLineItemTaxRateAction template) {
        return StagedOrderSetLineItemTaxRateActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetLineItemTaxRateAction(Function<StagedOrderSetLineItemTaxRateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetLineItemTaxRateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetLineItemTaxRateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetLineItemTaxRateAction>";
            }
        };
    }
}
