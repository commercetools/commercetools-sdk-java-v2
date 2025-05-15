
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Can be used to update the Payment if a customer changes the Cart, or adds or removes a CartDiscount during checkout.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentChangeAmountPlannedAction paymentChangeAmountPlannedAction = PaymentChangeAmountPlannedAction.builder()
 *             .amount(amountBuilder -> amountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeAmountPlanned")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentChangeAmountPlannedActionImpl.class)
public interface PaymentChangeAmountPlannedAction extends PaymentUpdateAction {

    /**
     * discriminator value for PaymentChangeAmountPlannedAction
     */
    String CHANGE_AMOUNT_PLANNED = "changeAmountPlanned";

    /**
     *  <p>New value to set.</p>
     * @return amount
     */
    @NotNull
    @Valid
    @JsonProperty("amount")
    public Money getAmount();

    /**
     *  <p>New value to set.</p>
     * @param amount value to be set
     */

    public void setAmount(final Money amount);

    /**
     * factory method
     * @return instance of PaymentChangeAmountPlannedAction
     */
    public static PaymentChangeAmountPlannedAction of() {
        return new PaymentChangeAmountPlannedActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentChangeAmountPlannedAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentChangeAmountPlannedAction of(final PaymentChangeAmountPlannedAction template) {
        PaymentChangeAmountPlannedActionImpl instance = new PaymentChangeAmountPlannedActionImpl();
        instance.setAmount(template.getAmount());
        return instance;
    }

    public PaymentChangeAmountPlannedAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentChangeAmountPlannedAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentChangeAmountPlannedAction deepCopy(@Nullable final PaymentChangeAmountPlannedAction template) {
        if (template == null) {
            return null;
        }
        PaymentChangeAmountPlannedActionImpl instance = new PaymentChangeAmountPlannedActionImpl();
        instance.setAmount(com.commercetools.api.models.common.Money.deepCopy(template.getAmount()));
        return instance;
    }

    /**
     * builder factory method for PaymentChangeAmountPlannedAction
     * @return builder
     */
    public static PaymentChangeAmountPlannedActionBuilder builder() {
        return PaymentChangeAmountPlannedActionBuilder.of();
    }

    /**
     * create builder for PaymentChangeAmountPlannedAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentChangeAmountPlannedActionBuilder builder(final PaymentChangeAmountPlannedAction template) {
        return PaymentChangeAmountPlannedActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentChangeAmountPlannedAction(Function<PaymentChangeAmountPlannedAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentChangeAmountPlannedAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentChangeAmountPlannedAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentChangeAmountPlannedAction>";
            }
        };
    }
}
