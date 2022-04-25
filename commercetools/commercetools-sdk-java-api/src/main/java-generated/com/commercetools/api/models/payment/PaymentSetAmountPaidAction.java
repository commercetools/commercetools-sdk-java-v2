
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
@JsonDeserialize(as = PaymentSetAmountPaidActionImpl.class)
public interface PaymentSetAmountPaidAction extends PaymentUpdateAction {

    String SET_AMOUNT_PAID = "setAmountPaid";

    /**
    *  <p>Draft type that stores amounts in cent precision for the specified currency.
    *  For storing money values in fractions of the minor unit in a currency, use <a href="ctp:api:type:HighPrecisionMoneyDraft">HighPrecisionMoneyDraft</a> instead.</p>
    */
    @Valid
    @JsonProperty("amount")
    public Money getAmount();

    public void setAmount(final Money amount);

    public static PaymentSetAmountPaidAction of() {
        return new PaymentSetAmountPaidActionImpl();
    }

    public static PaymentSetAmountPaidAction of(final PaymentSetAmountPaidAction template) {
        PaymentSetAmountPaidActionImpl instance = new PaymentSetAmountPaidActionImpl();
        instance.setAmount(template.getAmount());
        return instance;
    }

    public static PaymentSetAmountPaidActionBuilder builder() {
        return PaymentSetAmountPaidActionBuilder.of();
    }

    public static PaymentSetAmountPaidActionBuilder builder(final PaymentSetAmountPaidAction template) {
        return PaymentSetAmountPaidActionBuilder.of(template);
    }

    default <T> T withPaymentSetAmountPaidAction(Function<PaymentSetAmountPaidAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentSetAmountPaidAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentSetAmountPaidAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentSetAmountPaidAction>";
            }
        };
    }
}
