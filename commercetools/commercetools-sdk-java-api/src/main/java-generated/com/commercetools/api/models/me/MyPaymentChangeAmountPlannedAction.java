
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

/**
 *  <p>Can be used to update the Payment if a customer changes the Cart, or adds or removes a CartDiscount during checkout.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyPaymentChangeAmountPlannedAction myPaymentChangeAmountPlannedAction = MyPaymentChangeAmountPlannedAction.builder()
 *             .amount(amountBuilder -> amountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyPaymentChangeAmountPlannedActionImpl.class)
public interface MyPaymentChangeAmountPlannedAction extends MyPaymentUpdateAction {

    String CHANGE_AMOUNT_PLANNED = "changeAmountPlanned";

    /**
     *  <p>New value to set.</p>
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
