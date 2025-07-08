
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
 *  <p>Determines the schedule for a Recurring Order to occur on a specific day of each month.</p>
 *  <ul>
 *   <li>Orders will be created even if the specified day is a weekend or holiday.</li>
 *   <li>To place orders on different dates within the same month (for example, the 1st and 15th), create separate Recurring Orders—each with its own schedule.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DayOfMonthScheduleDraft dayOfMonthScheduleDraft = DayOfMonthScheduleDraft.builder()
 *             .day(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface DayOfMonthScheduleDraft
        extends RecurrencePolicyScheduleDraft, io.vrap.rmf.base.client.Draft<DayOfMonthScheduleDraft> {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>The day of the month when the Recurring Order should be created. If the value is greater than the number of days in a given month, the order will be created on the last day of the month.</p>
     * @return day
     */
    @NotNull
    @JsonProperty("day")
    public Integer getDay();

    /**
     *  <p>The day of the month when the Recurring Order should be created. If the value is greater than the number of days in a given month, the order will be created on the last day of the month.</p>
     * @param day value to be set
     */

    public void setDay(final Integer day);

    public DayOfMonthScheduleDraft copyDeep();

    /**
     * factory method to create a deep copy of DayOfMonthScheduleDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DayOfMonthScheduleDraft deepCopy(@Nullable final DayOfMonthScheduleDraft template) {
        if (template == null) {
            return null;
        }
        DayOfMonthScheduleDraftImpl instance = new DayOfMonthScheduleDraftImpl();
        instance.setDay(template.getDay());
        return instance;
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDayOfMonthScheduleDraft(Function<DayOfMonthScheduleDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DayOfMonthScheduleDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DayOfMonthScheduleDraft>() {
            @Override
            public String toString() {
                return "TypeReference<DayOfMonthScheduleDraft>";
            }
        };
    }
}
