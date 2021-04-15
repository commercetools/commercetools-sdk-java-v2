
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.order.PaymentState;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderChangePaymentStateActionImpl.class)
public interface StagedOrderChangePaymentStateAction extends StagedOrderUpdateAction {

    String CHANGE_PAYMENT_STATE = "changePaymentState";

    @JsonProperty("paymentState")
    public PaymentState getPaymentState();

    public void setPaymentState(final PaymentState paymentState);

    public static StagedOrderChangePaymentStateAction of() {
        return new StagedOrderChangePaymentStateActionImpl();
    }

    public static StagedOrderChangePaymentStateAction of(final StagedOrderChangePaymentStateAction template) {
        StagedOrderChangePaymentStateActionImpl instance = new StagedOrderChangePaymentStateActionImpl();
        instance.setPaymentState(template.getPaymentState());
        return instance;
    }

    public static StagedOrderChangePaymentStateActionBuilder builder() {
        return StagedOrderChangePaymentStateActionBuilder.of();
    }

    public static StagedOrderChangePaymentStateActionBuilder builder(
            final StagedOrderChangePaymentStateAction template) {
        return StagedOrderChangePaymentStateActionBuilder.of(template);
    }

    default <T> T withStagedOrderChangePaymentStateAction(Function<StagedOrderChangePaymentStateAction, T> helper) {
        return helper.apply(this);
    }
}
