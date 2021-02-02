
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.cart.ExternalTaxAmountDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetShippingMethodTaxAmountActionImpl.class)
public interface StagedOrderSetShippingMethodTaxAmountAction extends StagedOrderUpdateAction {

    String SET_SHIPPING_METHOD_TAX_AMOUNT = "setShippingMethodTaxAmount";

    @Valid
    @JsonProperty("externalTaxAmount")
    public ExternalTaxAmountDraft getExternalTaxAmount();

    public void setExternalTaxAmount(final ExternalTaxAmountDraft externalTaxAmount);

    public static StagedOrderSetShippingMethodTaxAmountAction of() {
        return new StagedOrderSetShippingMethodTaxAmountActionImpl();
    }

    public static StagedOrderSetShippingMethodTaxAmountAction of(
            final StagedOrderSetShippingMethodTaxAmountAction template) {
        StagedOrderSetShippingMethodTaxAmountActionImpl instance = new StagedOrderSetShippingMethodTaxAmountActionImpl();
        instance.setExternalTaxAmount(template.getExternalTaxAmount());
        return instance;
    }

    public static StagedOrderSetShippingMethodTaxAmountActionBuilder builder() {
        return StagedOrderSetShippingMethodTaxAmountActionBuilder.of();
    }

    public static StagedOrderSetShippingMethodTaxAmountActionBuilder builder(
            final StagedOrderSetShippingMethodTaxAmountAction template) {
        return StagedOrderSetShippingMethodTaxAmountActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetShippingMethodTaxAmountAction(
            Function<StagedOrderSetShippingMethodTaxAmountAction, T> helper) {
        return helper.apply(this);
    }
}
