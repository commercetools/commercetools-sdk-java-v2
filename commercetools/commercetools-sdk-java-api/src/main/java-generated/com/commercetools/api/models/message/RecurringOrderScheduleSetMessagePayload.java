
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetScheduleAction" rel="nofollow">Set Schedule</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderScheduleSetMessagePayload recurringOrderScheduleSetMessagePayload = RecurringOrderScheduleSetMessagePayload.builder()
 *             .recurrencePolicySchedule(recurrencePolicyScheduleBuilder -> recurrencePolicyScheduleBuilder)
 *             .oldRecurrencePolicySchedule(oldRecurrencePolicyScheduleBuilder -> oldRecurrencePolicyScheduleBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RecurringOrderScheduleSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderScheduleSetMessagePayloadImpl.class)
public interface RecurringOrderScheduleSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for RecurringOrderScheduleSetMessagePayload
     */
    String RECURRING_ORDER_SCHEDULE_SET = "RecurringOrderScheduleSet";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicySchedule" rel="nofollow">Schedule</a> of the Recurring Order after the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetScheduleAction" rel="nofollow">Set Schedule</a> update action.</p>
     * @return recurrencePolicySchedule
     */
    @NotNull
    @Valid
    @JsonProperty("recurrencePolicySchedule")
    public RecurrencePolicySchedule getRecurrencePolicySchedule();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicySchedule" rel="nofollow">Schedule</a> of the Recurring Order before the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetScheduleAction" rel="nofollow">Set Schedule</a> update action.</p>
     * @return oldRecurrencePolicySchedule
     */
    @NotNull
    @Valid
    @JsonProperty("oldRecurrencePolicySchedule")
    public RecurrencePolicySchedule getOldRecurrencePolicySchedule();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicySchedule" rel="nofollow">Schedule</a> of the Recurring Order after the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetScheduleAction" rel="nofollow">Set Schedule</a> update action.</p>
     * @param recurrencePolicySchedule value to be set
     */

    public void setRecurrencePolicySchedule(final RecurrencePolicySchedule recurrencePolicySchedule);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicySchedule" rel="nofollow">Schedule</a> of the Recurring Order before the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetScheduleAction" rel="nofollow">Set Schedule</a> update action.</p>
     * @param oldRecurrencePolicySchedule value to be set
     */

    public void setOldRecurrencePolicySchedule(final RecurrencePolicySchedule oldRecurrencePolicySchedule);

    /**
     * factory method
     * @return instance of RecurringOrderScheduleSetMessagePayload
     */
    public static RecurringOrderScheduleSetMessagePayload of() {
        return new RecurringOrderScheduleSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderScheduleSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderScheduleSetMessagePayload of(final RecurringOrderScheduleSetMessagePayload template) {
        RecurringOrderScheduleSetMessagePayloadImpl instance = new RecurringOrderScheduleSetMessagePayloadImpl();
        instance.setRecurrencePolicySchedule(template.getRecurrencePolicySchedule());
        instance.setOldRecurrencePolicySchedule(template.getOldRecurrencePolicySchedule());
        return instance;
    }

    public RecurringOrderScheduleSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderScheduleSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderScheduleSetMessagePayload deepCopy(
            @Nullable final RecurringOrderScheduleSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        RecurringOrderScheduleSetMessagePayloadImpl instance = new RecurringOrderScheduleSetMessagePayloadImpl();
        instance.setRecurrencePolicySchedule(com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule
                .deepCopy(template.getRecurrencePolicySchedule()));
        instance.setOldRecurrencePolicySchedule(com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule
                .deepCopy(template.getOldRecurrencePolicySchedule()));
        return instance;
    }

    /**
     * builder factory method for RecurringOrderScheduleSetMessagePayload
     * @return builder
     */
    public static RecurringOrderScheduleSetMessagePayloadBuilder builder() {
        return RecurringOrderScheduleSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for RecurringOrderScheduleSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderScheduleSetMessagePayloadBuilder builder(
            final RecurringOrderScheduleSetMessagePayload template) {
        return RecurringOrderScheduleSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderScheduleSetMessagePayload(
            Function<RecurringOrderScheduleSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderScheduleSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderScheduleSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderScheduleSetMessagePayload>";
            }
        };
    }
}
