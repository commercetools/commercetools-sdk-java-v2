
package com.commercetools.api.models.me;

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
 *     MyPaymentChangeAmountPlannedAction myPaymentChangeAmountPlannedAction = MyPaymentChangeAmountPlannedAction.builder()
 *             .amount(amountBuilder -> amountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyPaymentChangeAmountPlannedActionImpl.class)
public interface MyPaymentChangeAmountPlannedAction extends MyPaymentUpdateAction {

    /**
     * discriminator value for MyPaymentChangeAmountPlannedAction
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
     * @return instance of MyPaymentChangeAmountPlannedAction
     */
    public static MyPaymentChangeAmountPlannedAction of() {
        return new MyPaymentChangeAmountPlannedActionImpl();
    }

    /**
     * factory method to create a shallow copy MyPaymentChangeAmountPlannedAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyPaymentChangeAmountPlannedAction of(final MyPaymentChangeAmountPlannedAction template) {
        MyPaymentChangeAmountPlannedActionImpl instance = new MyPaymentChangeAmountPlannedActionImpl();
        instance.setAmount(template.getAmount());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyPaymentChangeAmountPlannedAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyPaymentChangeAmountPlannedAction deepCopy(
            @Nullable final MyPaymentChangeAmountPlannedAction template) {
        if (template == null) {
            return null;
        }
        MyPaymentChangeAmountPlannedActionImpl instance = new MyPaymentChangeAmountPlannedActionImpl();
        instance.setAmount(com.commercetools.api.models.common.Money.deepCopy(template.getAmount()));
        return instance;
    }

    /**
     * builder factory method for MyPaymentChangeAmountPlannedAction
     * @return builder
     */
    public static MyPaymentChangeAmountPlannedActionBuilder builder() {
        return MyPaymentChangeAmountPlannedActionBuilder.of();
    }

    /**
     * create builder for MyPaymentChangeAmountPlannedAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyPaymentChangeAmountPlannedActionBuilder builder(final MyPaymentChangeAmountPlannedAction template) {
        return MyPaymentChangeAmountPlannedActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyPaymentChangeAmountPlannedAction(Function<MyPaymentChangeAmountPlannedAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyPaymentChangeAmountPlannedAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyPaymentChangeAmountPlannedAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyPaymentChangeAmountPlannedAction>";
            }
        };
    }
}
