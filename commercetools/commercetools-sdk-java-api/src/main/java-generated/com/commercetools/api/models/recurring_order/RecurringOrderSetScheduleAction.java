
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>To set the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicySchedule" rel="nofollow">schedule</a>, the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Order</a> must be active, with no active <a href="https://docs.commercetools.com/apis/ctp:api:type:SkipConfiguration" rel="nofollow">Skip Configuration</a> and with available prices for all Cart items for the new schedule. Setting the schedule generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderScheduleSetMessage" rel="nofollow">RecurringOrderScheduleSet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderSetScheduleAction recurringOrderSetScheduleAction = RecurringOrderSetScheduleAction.builder()
 *             .recurrencePolicy(recurrencePolicyBuilder -> recurrencePolicyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setSchedule")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderSetScheduleActionImpl.class)
public interface RecurringOrderSetScheduleAction extends RecurringOrderUpdateAction {

    /**
     * discriminator value for RecurringOrderSetScheduleAction
     */
    String SET_SCHEDULE = "setSchedule";

    /**
     *  <p>Value to set.</p>
     * @return recurrencePolicy
     */
    @NotNull
    @Valid
    @JsonProperty("recurrencePolicy")
    public RecurrencePolicyResourceIdentifier getRecurrencePolicy();

    /**
     *  <p>Value to set.</p>
     * @param recurrencePolicy value to be set
     */

    public void setRecurrencePolicy(final RecurrencePolicyResourceIdentifier recurrencePolicy);

    /**
     * factory method
     * @return instance of RecurringOrderSetScheduleAction
     */
    public static RecurringOrderSetScheduleAction of() {
        return new RecurringOrderSetScheduleActionImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderSetScheduleAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderSetScheduleAction of(final RecurringOrderSetScheduleAction template) {
        RecurringOrderSetScheduleActionImpl instance = new RecurringOrderSetScheduleActionImpl();
        instance.setRecurrencePolicy(template.getRecurrencePolicy());
        return instance;
    }

    public RecurringOrderSetScheduleAction copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderSetScheduleAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderSetScheduleAction deepCopy(@Nullable final RecurringOrderSetScheduleAction template) {
        if (template == null) {
            return null;
        }
        RecurringOrderSetScheduleActionImpl instance = new RecurringOrderSetScheduleActionImpl();
        instance.setRecurrencePolicy(com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier
                .deepCopy(template.getRecurrencePolicy()));
        return instance;
    }

    /**
     * builder factory method for RecurringOrderSetScheduleAction
     * @return builder
     */
    public static RecurringOrderSetScheduleActionBuilder builder() {
        return RecurringOrderSetScheduleActionBuilder.of();
    }

    /**
     * create builder for RecurringOrderSetScheduleAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderSetScheduleActionBuilder builder(final RecurringOrderSetScheduleAction template) {
        return RecurringOrderSetScheduleActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderSetScheduleAction(Function<RecurringOrderSetScheduleAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderSetScheduleAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderSetScheduleAction>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderSetScheduleAction>";
            }
        };
    }
}
