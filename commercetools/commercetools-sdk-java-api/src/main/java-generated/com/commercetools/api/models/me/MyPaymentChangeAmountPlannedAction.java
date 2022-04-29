
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyPaymentChangeAmountPlannedActionImpl.class)
public interface MyPaymentChangeAmountPlannedAction extends MyPaymentUpdateAction {

    String CHANGE_AMOUNT_PLANNED = "changeAmountPlanned";

    /**
    *  <p>Draft type that stores amounts in cent precision for the specified currency.
    *  For storing money values in fractions of the minor unit in a currency, use <a href="ctp:api:type:HighPrecisionMoneyDraft">HighPrecisionMoneyDraft</a> instead.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("amount")
    public Money getAmount();

    public void setAmount(final Money amount);

    public static MyPaymentChangeAmountPlannedAction of() {
        return new MyPaymentChangeAmountPlannedActionImpl();
    }

    public static MyPaymentChangeAmountPlannedAction of(final MyPaymentChangeAmountPlannedAction template) {
        MyPaymentChangeAmountPlannedActionImpl instance = new MyPaymentChangeAmountPlannedActionImpl();
        instance.setAmount(template.getAmount());
        return instance;
    }

    public static MyPaymentChangeAmountPlannedActionBuilder builder() {
        return MyPaymentChangeAmountPlannedActionBuilder.of();
    }

    public static MyPaymentChangeAmountPlannedActionBuilder builder(final MyPaymentChangeAmountPlannedAction template) {
        return MyPaymentChangeAmountPlannedActionBuilder.of(template);
    }

    default <T> T withMyPaymentChangeAmountPlannedAction(Function<MyPaymentChangeAmountPlannedAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyPaymentChangeAmountPlannedAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyPaymentChangeAmountPlannedAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyPaymentChangeAmountPlannedAction>";
            }
        };
    }
}
