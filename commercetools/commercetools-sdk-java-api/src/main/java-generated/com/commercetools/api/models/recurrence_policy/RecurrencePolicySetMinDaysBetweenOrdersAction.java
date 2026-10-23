
package com.commercetools.api.models.recurrence_policy;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>The new value applies immediately to all <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a> that use the RecurrencePolicy. It does not affect the recurrence schedule.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurrencePolicySetMinDaysBetweenOrdersAction recurrencePolicySetMinDaysBetweenOrdersAction = RecurrencePolicySetMinDaysBetweenOrdersAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setMinDaysBetweenOrders")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurrencePolicySetMinDaysBetweenOrdersActionImpl.class)
public interface RecurrencePolicySetMinDaysBetweenOrdersAction extends RecurrencePolicyUpdateAction {

    /**
     * discriminator value for RecurrencePolicySetMinDaysBetweenOrdersAction
     */
    String SET_MIN_DAYS_BETWEEN_ORDERS = "setMinDaysBetweenOrders";

    /**
     *  <p>Value to set. Must be greater than <code>0</code>. If omitted, any existing value is removed and there is no limit.</p>
     * @return minDaysBetweenOrders
     */

    @JsonProperty("minDaysBetweenOrders")
    public Integer getMinDaysBetweenOrders();

    /**
     *  <p>Value to set. Must be greater than <code>0</code>. If omitted, any existing value is removed and there is no limit.</p>
     * @param minDaysBetweenOrders value to be set
     */

    public void setMinDaysBetweenOrders(final Integer minDaysBetweenOrders);

    /**
     * factory method
     * @return instance of RecurrencePolicySetMinDaysBetweenOrdersAction
     */
    public static RecurrencePolicySetMinDaysBetweenOrdersAction of() {
        return new RecurrencePolicySetMinDaysBetweenOrdersActionImpl();
    }

    /**
     * factory method to create a shallow copy RecurrencePolicySetMinDaysBetweenOrdersAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurrencePolicySetMinDaysBetweenOrdersAction of(
            final RecurrencePolicySetMinDaysBetweenOrdersAction template) {
        RecurrencePolicySetMinDaysBetweenOrdersActionImpl instance = new RecurrencePolicySetMinDaysBetweenOrdersActionImpl();
        instance.setMinDaysBetweenOrders(template.getMinDaysBetweenOrders());
        return instance;
    }

    public RecurrencePolicySetMinDaysBetweenOrdersAction copyDeep();

    /**
     * factory method to create a deep copy of RecurrencePolicySetMinDaysBetweenOrdersAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurrencePolicySetMinDaysBetweenOrdersAction deepCopy(
            @Nullable final RecurrencePolicySetMinDaysBetweenOrdersAction template) {
        if (template == null) {
            return null;
        }
        RecurrencePolicySetMinDaysBetweenOrdersActionImpl instance = new RecurrencePolicySetMinDaysBetweenOrdersActionImpl();
        instance.setMinDaysBetweenOrders(template.getMinDaysBetweenOrders());
        return instance;
    }

    /**
     * builder factory method for RecurrencePolicySetMinDaysBetweenOrdersAction
     * @return builder
     */
    public static RecurrencePolicySetMinDaysBetweenOrdersActionBuilder builder() {
        return RecurrencePolicySetMinDaysBetweenOrdersActionBuilder.of();
    }

    /**
     * create builder for RecurrencePolicySetMinDaysBetweenOrdersAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurrencePolicySetMinDaysBetweenOrdersActionBuilder builder(
            final RecurrencePolicySetMinDaysBetweenOrdersAction template) {
        return RecurrencePolicySetMinDaysBetweenOrdersActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurrencePolicySetMinDaysBetweenOrdersAction(
            Function<RecurrencePolicySetMinDaysBetweenOrdersAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<RecurrencePolicySetMinDaysBetweenOrdersAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<RecurrencePolicySetMinDaysBetweenOrdersAction>() {
            @Override
            public String toString() {
                return "TypeReference<RecurrencePolicySetMinDaysBetweenOrdersAction>";
            }
        };
    }
}
