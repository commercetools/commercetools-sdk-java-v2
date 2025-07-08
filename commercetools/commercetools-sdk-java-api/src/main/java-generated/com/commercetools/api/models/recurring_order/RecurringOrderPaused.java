
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Changes the Recurring Order state to paused.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderPaused recurringOrderPaused = RecurringOrderPaused.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("paused")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderPausedImpl.class)
public interface RecurringOrderPaused extends RecurringOrderStateDraft {

    /**
     * discriminator value for RecurringOrderPaused
     */
    String PAUSED = "paused";

    /**
     * factory method
     * @return instance of RecurringOrderPaused
     */
    public static RecurringOrderPaused of() {
        return new RecurringOrderPausedImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderPaused
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderPaused of(final RecurringOrderPaused template) {
        RecurringOrderPausedImpl instance = new RecurringOrderPausedImpl();
        return instance;
    }

    public RecurringOrderPaused copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderPaused
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderPaused deepCopy(@Nullable final RecurringOrderPaused template) {
        if (template == null) {
            return null;
        }
        RecurringOrderPausedImpl instance = new RecurringOrderPausedImpl();
        return instance;
    }

    /**
     * builder factory method for RecurringOrderPaused
     * @return builder
     */
    public static RecurringOrderPausedBuilder builder() {
        return RecurringOrderPausedBuilder.of();
    }

    /**
     * create builder for RecurringOrderPaused instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderPausedBuilder builder(final RecurringOrderPaused template) {
        return RecurringOrderPausedBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderPaused(Function<RecurringOrderPaused, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderPaused> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderPaused>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderPaused>";
            }
        };
    }
}
