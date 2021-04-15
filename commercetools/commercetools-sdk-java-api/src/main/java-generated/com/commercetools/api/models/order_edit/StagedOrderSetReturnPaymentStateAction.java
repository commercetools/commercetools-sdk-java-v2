
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.ReturnPaymentState;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetReturnPaymentStateActionImpl.class)
public interface StagedOrderSetReturnPaymentStateAction extends StagedOrderUpdateAction {

    String SET_RETURN_PAYMENT_STATE = "setReturnPaymentState";

    @NotNull
    @JsonProperty("returnItemId")
    public String getReturnItemId();

    @NotNull
    @JsonProperty("paymentState")
    public ReturnPaymentState getPaymentState();

    public void setReturnItemId(final String returnItemId);

    public void setPaymentState(final ReturnPaymentState paymentState);

    public static StagedOrderSetReturnPaymentStateAction of() {
        return new StagedOrderSetReturnPaymentStateActionImpl();
    }

    public static StagedOrderSetReturnPaymentStateAction of(final StagedOrderSetReturnPaymentStateAction template) {
        StagedOrderSetReturnPaymentStateActionImpl instance = new StagedOrderSetReturnPaymentStateActionImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setPaymentState(template.getPaymentState());
        return instance;
    }

    public static StagedOrderSetReturnPaymentStateActionBuilder builder() {
        return StagedOrderSetReturnPaymentStateActionBuilder.of();
    }

    public static StagedOrderSetReturnPaymentStateActionBuilder builder(
            final StagedOrderSetReturnPaymentStateAction template) {
        return StagedOrderSetReturnPaymentStateActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetReturnPaymentStateAction(
            Function<StagedOrderSetReturnPaymentStateAction, T> helper) {
        return helper.apply(this);
    }
}
