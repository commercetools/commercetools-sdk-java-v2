
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentSetAmountRefundedActionImpl.class)
public interface PaymentSetAmountRefundedAction extends PaymentUpdateAction {

    String SET_AMOUNT_REFUNDED = "setAmountRefunded";

    @Valid
    @JsonProperty("amount")
    public Money getAmount();

    public void setAmount(final Money amount);

    public static PaymentSetAmountRefundedAction of() {
        return new PaymentSetAmountRefundedActionImpl();
    }

    public static PaymentSetAmountRefundedAction of(final PaymentSetAmountRefundedAction template) {
        PaymentSetAmountRefundedActionImpl instance = new PaymentSetAmountRefundedActionImpl();
        instance.setAmount(template.getAmount());
        return instance;
    }

    public static PaymentSetAmountRefundedActionBuilder builder() {
        return PaymentSetAmountRefundedActionBuilder.of();
    }

    public static PaymentSetAmountRefundedActionBuilder builder(final PaymentSetAmountRefundedAction template) {
        return PaymentSetAmountRefundedActionBuilder.of(template);
    }

    default <T> T withPaymentSetAmountRefundedAction(Function<PaymentSetAmountRefundedAction, T> helper) {
        return helper.apply(this);
    }
}
