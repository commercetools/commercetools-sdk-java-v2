
package com.commercetools.api.models.recurrence_policy;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * RecurrencePolicySetScheduleAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurrencePolicySetScheduleAction recurrencePolicySetScheduleAction = RecurrencePolicySetScheduleAction.builder()
 *             .schedule(scheduleBuilder -> scheduleBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setSchedule")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurrencePolicySetScheduleActionImpl.class)
public interface RecurrencePolicySetScheduleAction extends RecurrencePolicyUpdateAction {

    /**
     * discriminator value for RecurrencePolicySetScheduleAction
     */
    String SET_SCHEDULE = "setSchedule";

    /**
     *  <p>Schedule where the recurrence is defined.</p>
     * @return schedule
     */
    @NotNull
    @Valid
    @JsonProperty("schedule")
    public RecurrencePolicyScheduleDraft getSchedule();

    /**
     *  <p>Schedule where the recurrence is defined.</p>
     * @param schedule value to be set
     */

    public void setSchedule(final RecurrencePolicyScheduleDraft schedule);

    /**
     * factory method
     * @return instance of RecurrencePolicySetScheduleAction
     */
    public static RecurrencePolicySetScheduleAction of() {
        return new RecurrencePolicySetScheduleActionImpl();
    }

    /**
     * factory method to create a shallow copy RecurrencePolicySetScheduleAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurrencePolicySetScheduleAction of(final RecurrencePolicySetScheduleAction template) {
        RecurrencePolicySetScheduleActionImpl instance = new RecurrencePolicySetScheduleActionImpl();
        instance.setSchedule(template.getSchedule());
        return instance;
    }

    public RecurrencePolicySetScheduleAction copyDeep();

    /**
     * factory method to create a deep copy of RecurrencePolicySetScheduleAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurrencePolicySetScheduleAction deepCopy(
            @Nullable final RecurrencePolicySetScheduleAction template) {
        if (template == null) {
            return null;
        }
        RecurrencePolicySetScheduleActionImpl instance = new RecurrencePolicySetScheduleActionImpl();
        instance.setSchedule(com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleDraft
                .deepCopy(template.getSchedule()));
        return instance;
    }

    /**
     * builder factory method for RecurrencePolicySetScheduleAction
     * @return builder
     */
    public static RecurrencePolicySetScheduleActionBuilder builder() {
        return RecurrencePolicySetScheduleActionBuilder.of();
    }

    /**
     * create builder for RecurrencePolicySetScheduleAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurrencePolicySetScheduleActionBuilder builder(final RecurrencePolicySetScheduleAction template) {
        return RecurrencePolicySetScheduleActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurrencePolicySetScheduleAction(Function<RecurrencePolicySetScheduleAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurrencePolicySetScheduleAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurrencePolicySetScheduleAction>() {
            @Override
            public String toString() {
                return "TypeReference<RecurrencePolicySetScheduleAction>";
            }
        };
    }
}
