
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Sets the <code>paymentStrategy</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentConfiguration" rel="nofollow">RecurringPaymentConfiguration</a> without changing the existing <code>paymentAllocations</code>. To set both at once, use the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetRecurringPaymentConfigurationAction" rel="nofollow">Set RecurringPaymentConfiguration</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetRecurringPaymentStrategyAction cartSetRecurringPaymentStrategyAction = CartSetRecurringPaymentStrategyAction.builder()
 *             .paymentStrategy(PaymentStrategy.CHECKOUT)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setRecurringPaymentStrategy")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetRecurringPaymentStrategyActionImpl.class)
public interface CartSetRecurringPaymentStrategyAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetRecurringPaymentStrategyAction
     */
    String SET_RECURRING_PAYMENT_STRATEGY = "setRecurringPaymentStrategy";

    /**
     *  <p>New value to set.</p>
     * @return paymentStrategy
     */
    @NotNull
    @JsonProperty("paymentStrategy")
    public PaymentStrategy getPaymentStrategy();

    /**
     *  <p>New value to set.</p>
     * @param paymentStrategy value to be set
     */

    public void setPaymentStrategy(final PaymentStrategy paymentStrategy);

    /**
     * factory method
     * @return instance of CartSetRecurringPaymentStrategyAction
     */
    public static CartSetRecurringPaymentStrategyAction of() {
        return new CartSetRecurringPaymentStrategyActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetRecurringPaymentStrategyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetRecurringPaymentStrategyAction of(final CartSetRecurringPaymentStrategyAction template) {
        CartSetRecurringPaymentStrategyActionImpl instance = new CartSetRecurringPaymentStrategyActionImpl();
        instance.setPaymentStrategy(template.getPaymentStrategy());
        return instance;
    }

    public CartSetRecurringPaymentStrategyAction copyDeep();

    /**
     * factory method to create a deep copy of CartSetRecurringPaymentStrategyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetRecurringPaymentStrategyAction deepCopy(
            @Nullable final CartSetRecurringPaymentStrategyAction template) {
        if (template == null) {
            return null;
        }
        CartSetRecurringPaymentStrategyActionImpl instance = new CartSetRecurringPaymentStrategyActionImpl();
        instance.setPaymentStrategy(template.getPaymentStrategy());
        return instance;
    }

    /**
     * builder factory method for CartSetRecurringPaymentStrategyAction
     * @return builder
     */
    public static CartSetRecurringPaymentStrategyActionBuilder builder() {
        return CartSetRecurringPaymentStrategyActionBuilder.of();
    }

    /**
     * create builder for CartSetRecurringPaymentStrategyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetRecurringPaymentStrategyActionBuilder builder(
            final CartSetRecurringPaymentStrategyAction template) {
        return CartSetRecurringPaymentStrategyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetRecurringPaymentStrategyAction(Function<CartSetRecurringPaymentStrategyAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<CartSetRecurringPaymentStrategyAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<CartSetRecurringPaymentStrategyAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetRecurringPaymentStrategyAction>";
            }
        };
    }
}
