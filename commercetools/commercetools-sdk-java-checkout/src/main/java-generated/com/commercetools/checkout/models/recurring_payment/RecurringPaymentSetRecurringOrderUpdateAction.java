
package com.commercetools.checkout.models.recurring_payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> of a RecurringPayment.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringPaymentSetRecurringOrderUpdateAction recurringPaymentSetRecurringOrderUpdateAction = RecurringPaymentSetRecurringOrderUpdateAction.builder()
 *             .recurringOrder(recurringOrderBuilder -> recurringOrderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setRecurringOrder")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringPaymentSetRecurringOrderUpdateActionImpl.class)
public interface RecurringPaymentSetRecurringOrderUpdateAction extends RecurringPaymentUpdateAction {

    /**
     * discriminator value for RecurringPaymentSetRecurringOrderUpdateAction
     */
    String SET_RECURRING_ORDER = "setRecurringOrder";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> to set.</p>
     * @return recurringOrder
     */
    @NotNull
    @Valid
    @JsonProperty("recurringOrder")
    public RecurringOrderReference getRecurringOrder();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> to set.</p>
     * @param recurringOrder value to be set
     */

    public void setRecurringOrder(final RecurringOrderReference recurringOrder);

    /**
     * factory method
     * @return instance of RecurringPaymentSetRecurringOrderUpdateAction
     */
    public static RecurringPaymentSetRecurringOrderUpdateAction of() {
        return new RecurringPaymentSetRecurringOrderUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy RecurringPaymentSetRecurringOrderUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringPaymentSetRecurringOrderUpdateAction of(
            final RecurringPaymentSetRecurringOrderUpdateAction template) {
        RecurringPaymentSetRecurringOrderUpdateActionImpl instance = new RecurringPaymentSetRecurringOrderUpdateActionImpl();
        instance.setRecurringOrder(template.getRecurringOrder());
        return instance;
    }

    public RecurringPaymentSetRecurringOrderUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of RecurringPaymentSetRecurringOrderUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringPaymentSetRecurringOrderUpdateAction deepCopy(
            @Nullable final RecurringPaymentSetRecurringOrderUpdateAction template) {
        if (template == null) {
            return null;
        }
        RecurringPaymentSetRecurringOrderUpdateActionImpl instance = new RecurringPaymentSetRecurringOrderUpdateActionImpl();
        instance.setRecurringOrder(com.commercetools.checkout.models.recurring_payment.RecurringOrderReference
                .deepCopy(template.getRecurringOrder()));
        return instance;
    }

    /**
     * builder factory method for RecurringPaymentSetRecurringOrderUpdateAction
     * @return builder
     */
    public static RecurringPaymentSetRecurringOrderUpdateActionBuilder builder() {
        return RecurringPaymentSetRecurringOrderUpdateActionBuilder.of();
    }

    /**
     * create builder for RecurringPaymentSetRecurringOrderUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringPaymentSetRecurringOrderUpdateActionBuilder builder(
            final RecurringPaymentSetRecurringOrderUpdateAction template) {
        return RecurringPaymentSetRecurringOrderUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringPaymentSetRecurringOrderUpdateAction(
            Function<RecurringPaymentSetRecurringOrderUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<RecurringPaymentSetRecurringOrderUpdateAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<RecurringPaymentSetRecurringOrderUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringPaymentSetRecurringOrderUpdateAction>";
            }
        };
    }
}
