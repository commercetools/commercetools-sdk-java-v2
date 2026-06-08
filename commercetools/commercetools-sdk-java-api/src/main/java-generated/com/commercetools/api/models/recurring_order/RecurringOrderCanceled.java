
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Changes the Recurring Order state to canceled.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderCanceled recurringOrderCanceled = RecurringOrderCanceled.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("canceled")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderCanceledImpl.class)
public interface RecurringOrderCanceled extends RecurringOrderStateDraft {

    /**
     * discriminator value for RecurringOrderCanceled
     */
    String CANCELED = "canceled";

    /**
     *  <p>The reason for the cancelation.</p>
     * @return reason
     */

    @JsonProperty("reason")
    public String getReason();

    /**
     *  <p>The reason for the cancelation.</p>
     * @param reason value to be set
     */

    public void setReason(final String reason);

    /**
     * factory method
     * @return instance of RecurringOrderCanceled
     */
    public static RecurringOrderCanceled of() {
        return new RecurringOrderCanceledImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderCanceled
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderCanceled of(final RecurringOrderCanceled template) {
        RecurringOrderCanceledImpl instance = new RecurringOrderCanceledImpl();
        instance.setReason(template.getReason());
        return instance;
    }

    public RecurringOrderCanceled copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderCanceled
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderCanceled deepCopy(@Nullable final RecurringOrderCanceled template) {
        if (template == null) {
            return null;
        }
        RecurringOrderCanceledImpl instance = new RecurringOrderCanceledImpl();
        instance.setReason(template.getReason());
        return instance;
    }

    /**
     * builder factory method for RecurringOrderCanceled
     * @return builder
     */
    public static RecurringOrderCanceledBuilder builder() {
        return RecurringOrderCanceledBuilder.of();
    }

    /**
     * create builder for RecurringOrderCanceled instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderCanceledBuilder builder(final RecurringOrderCanceled template) {
        return RecurringOrderCanceledBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderCanceled(Function<RecurringOrderCanceled, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderCanceled> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderCanceled>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderCanceled>";
            }
        };
    }
}
