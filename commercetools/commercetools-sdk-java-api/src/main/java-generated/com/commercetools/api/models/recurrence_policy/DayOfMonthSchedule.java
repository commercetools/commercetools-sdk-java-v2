
package com.commercetools.api.models.recurrence_policy;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Schedule of a <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Order</a> that occurs on a specific day of each month. This type is returned in the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a> for an active <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Order</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DayOfMonthSchedule dayOfMonthSchedule = DayOfMonthSchedule.builder()
 *             .day(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("dayOfMonth")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DayOfMonthScheduleImpl.class)
public interface DayOfMonthSchedule extends RecurrencePolicySchedule {

    /**
     * discriminator value for DayOfMonthSchedule
     */
    String DAY_OF_MONTH = "dayOfMonth";

    /**
     *  <p>The day of the month when the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Order</a> is created. If the value is greater than the number of days in a given month, the order is created on the last day of the month.</p>
     * @return day
     */
    @NotNull
    @JsonProperty("day")
    public Integer getDay();

    /**
     *  <p>The day of the month when the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Order</a> is created. If the value is greater than the number of days in a given month, the order is created on the last day of the month.</p>
     * @param day value to be set
     */

    public void setDay(final Integer day);

    /**
     * factory method
     * @return instance of DayOfMonthSchedule
     */
    public static DayOfMonthSchedule of() {
        return new DayOfMonthScheduleImpl();
    }

    /**
     * factory method to create a shallow copy DayOfMonthSchedule
     * @param template instance to be copied
     * @return copy instance
     */
    public static DayOfMonthSchedule of(final DayOfMonthSchedule template) {
        DayOfMonthScheduleImpl instance = new DayOfMonthScheduleImpl();
        instance.setDay(template.getDay());
        return instance;
    }

    public DayOfMonthSchedule copyDeep();

    /**
     * factory method to create a deep copy of DayOfMonthSchedule
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DayOfMonthSchedule deepCopy(@Nullable final DayOfMonthSchedule template) {
        if (template == null) {
            return null;
        }
        DayOfMonthScheduleImpl instance = new DayOfMonthScheduleImpl();
        instance.setDay(template.getDay());
        return instance;
    }

    /**
     * builder factory method for DayOfMonthSchedule
     * @return builder
     */
    public static DayOfMonthScheduleBuilder builder() {
        return DayOfMonthScheduleBuilder.of();
    }

    /**
     * create builder for DayOfMonthSchedule instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DayOfMonthScheduleBuilder builder(final DayOfMonthSchedule template) {
        return DayOfMonthScheduleBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDayOfMonthSchedule(Function<DayOfMonthSchedule, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DayOfMonthSchedule> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DayOfMonthSchedule>() {
            @Override
            public String toString() {
                return "TypeReference<DayOfMonthSchedule>";
            }
        };
    }
}
