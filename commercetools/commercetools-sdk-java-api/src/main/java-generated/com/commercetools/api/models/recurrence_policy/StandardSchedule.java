
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
 *  <p>Schedule of a <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> that occurs at a fixed interval—for example, every two weeks or every month.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandardSchedule standardSchedule = StandardSchedule.builder()
 *             .value(0.3)
 *             .intervalUnit(IntervalUnit.DAYS)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("standard")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandardScheduleImpl.class)
public interface StandardSchedule extends RecurrencePolicySchedule {

    /**
     * discriminator value for StandardSchedule
     */
    String STANDARD = "standard";

    /**
     *  <p>Number of intervals between orders.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Long getValue();

    /**
     *  <p>Interval of this schedule.</p>
     * @return intervalUnit
     */
    @NotNull
    @JsonProperty("intervalUnit")
    public IntervalUnit getIntervalUnit();

    /**
     *  <p>Number of intervals between orders.</p>
     * @param value value to be set
     */

    public void setValue(final Long value);

    /**
     *  <p>Interval of this schedule.</p>
     * @param intervalUnit value to be set
     */

    public void setIntervalUnit(final IntervalUnit intervalUnit);

    /**
     * factory method
     * @return instance of StandardSchedule
     */
    public static StandardSchedule of() {
        return new StandardScheduleImpl();
    }

    /**
     * factory method to create a shallow copy StandardSchedule
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandardSchedule of(final StandardSchedule template) {
        StandardScheduleImpl instance = new StandardScheduleImpl();
        instance.setValue(template.getValue());
        instance.setIntervalUnit(template.getIntervalUnit());
        return instance;
    }

    public StandardSchedule copyDeep();

    /**
     * factory method to create a deep copy of StandardSchedule
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandardSchedule deepCopy(@Nullable final StandardSchedule template) {
        if (template == null) {
            return null;
        }
        StandardScheduleImpl instance = new StandardScheduleImpl();
        instance.setValue(template.getValue());
        instance.setIntervalUnit(template.getIntervalUnit());
        return instance;
    }

    /**
     * builder factory method for StandardSchedule
     * @return builder
     */
    public static StandardScheduleBuilder builder() {
        return StandardScheduleBuilder.of();
    }

    /**
     * create builder for StandardSchedule instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandardScheduleBuilder builder(final StandardSchedule template) {
        return StandardScheduleBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandardSchedule(Function<StandardSchedule, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandardSchedule> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandardSchedule>() {
            @Override
            public String toString() {
                return "TypeReference<StandardSchedule>";
            }
        };
    }
}
