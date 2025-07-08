
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Changes the Recurring Order state to expired.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderExpired recurringOrderExpired = RecurringOrderExpired.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("expired")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderExpiredImpl.class)
public interface RecurringOrderExpired extends RecurringOrderStateDraft {

    /**
     * discriminator value for RecurringOrderExpired
     */
    String EXPIRED = "expired";

    /**
     * factory method
     * @return instance of RecurringOrderExpired
     */
    public static RecurringOrderExpired of() {
        return new RecurringOrderExpiredImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderExpired
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderExpired of(final RecurringOrderExpired template) {
        RecurringOrderExpiredImpl instance = new RecurringOrderExpiredImpl();
        return instance;
    }

    public RecurringOrderExpired copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderExpired
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderExpired deepCopy(@Nullable final RecurringOrderExpired template) {
        if (template == null) {
            return null;
        }
        RecurringOrderExpiredImpl instance = new RecurringOrderExpiredImpl();
        return instance;
    }

    /**
     * builder factory method for RecurringOrderExpired
     * @return builder
     */
    public static RecurringOrderExpiredBuilder builder() {
        return RecurringOrderExpiredBuilder.of();
    }

    /**
     * create builder for RecurringOrderExpired instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderExpiredBuilder builder(final RecurringOrderExpired template) {
        return RecurringOrderExpiredBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderExpired(Function<RecurringOrderExpired, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderExpired> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderExpired>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderExpired>";
            }
        };
    }
}
