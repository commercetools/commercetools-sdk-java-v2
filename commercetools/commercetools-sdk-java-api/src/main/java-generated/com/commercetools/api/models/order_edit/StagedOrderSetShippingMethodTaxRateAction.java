
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetShippingMethodTaxRateActionImpl.class)
public interface StagedOrderSetShippingMethodTaxRateAction extends StagedOrderUpdateAction {

    String SET_SHIPPING_METHOD_TAX_RATE = "setShippingMethodTaxRate";

    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    public static StagedOrderSetShippingMethodTaxRateAction of() {
        return new StagedOrderSetShippingMethodTaxRateActionImpl();
    }

    public static StagedOrderSetShippingMethodTaxRateAction of(
            final StagedOrderSetShippingMethodTaxRateAction template) {
        StagedOrderSetShippingMethodTaxRateActionImpl instance = new StagedOrderSetShippingMethodTaxRateActionImpl();
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    public static StagedOrderSetShippingMethodTaxRateActionBuilder builder() {
        return StagedOrderSetShippingMethodTaxRateActionBuilder.of();
    }

    public static StagedOrderSetShippingMethodTaxRateActionBuilder builder(
            final StagedOrderSetShippingMethodTaxRateAction template) {
        return StagedOrderSetShippingMethodTaxRateActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetShippingMethodTaxRateAction(
            Function<StagedOrderSetShippingMethodTaxRateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingMethodTaxRateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingMethodTaxRateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetShippingMethodTaxRateAction>";
            }
        };
    }
}
