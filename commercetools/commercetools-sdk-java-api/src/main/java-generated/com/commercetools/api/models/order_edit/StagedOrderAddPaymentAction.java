
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.payment.PaymentResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderAddPaymentActionImpl.class)
public interface StagedOrderAddPaymentAction extends StagedOrderUpdateAction {

    String ADD_PAYMENT = "addPayment";

    @NotNull
    @Valid
    @JsonProperty("payment")
    public PaymentResourceIdentifier getPayment();

    public void setPayment(final PaymentResourceIdentifier payment);

    public static StagedOrderAddPaymentAction of() {
        return new StagedOrderAddPaymentActionImpl();
    }

    public static StagedOrderAddPaymentAction of(final StagedOrderAddPaymentAction template) {
        StagedOrderAddPaymentActionImpl instance = new StagedOrderAddPaymentActionImpl();
        instance.setPayment(template.getPayment());
        return instance;
    }

    public static StagedOrderAddPaymentActionBuilder builder() {
        return StagedOrderAddPaymentActionBuilder.of();
    }

    public static StagedOrderAddPaymentActionBuilder builder(final StagedOrderAddPaymentAction template) {
        return StagedOrderAddPaymentActionBuilder.of(template);
    }

    default <T> T withStagedOrderAddPaymentAction(Function<StagedOrderAddPaymentAction, T> helper) {
        return helper.apply(this);
    }
}
