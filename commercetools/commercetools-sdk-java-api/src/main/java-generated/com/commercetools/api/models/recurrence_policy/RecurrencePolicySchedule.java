
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
 * RecurrencePolicySchedule
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurrencePolicySchedule recurrencePolicySchedule = RecurrencePolicySchedule.dayOfMonthBuilder()
 *             day(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = RecurrencePolicyScheduleImpl.class, visible = true)
@JsonDeserialize(as = RecurrencePolicyScheduleImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface RecurrencePolicySchedule {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    public RecurrencePolicySchedule copyDeep();

    /**
     * factory method to create a deep copy of RecurrencePolicySchedule
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurrencePolicySchedule deepCopy(@Nullable final RecurrencePolicySchedule template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof RecurrencePolicyScheduleImpl)) {
            return template.copyDeep();
        }
        RecurrencePolicyScheduleImpl instance = new RecurrencePolicyScheduleImpl();
        return instance;
    }

    /**
     * builder for dayOfMonth subtype
     * @return builder
     */
    public static com.commercetools.api.models.recurrence_policy.DayOfMonthScheduleBuilder dayOfMonthBuilder() {
        return com.commercetools.api.models.recurrence_policy.DayOfMonthScheduleBuilder.of();
    }

    /**
     * builder for standard subtype
     * @return builder
     */
    public static com.commercetools.api.models.recurrence_policy.StandardScheduleBuilder standardBuilder() {
        return com.commercetools.api.models.recurrence_policy.StandardScheduleBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurrencePolicySchedule(Function<RecurrencePolicySchedule, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurrencePolicySchedule> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurrencePolicySchedule>() {
            @Override
            public String toString() {
                return "TypeReference<RecurrencePolicySchedule>";
            }
        };
    }
}
