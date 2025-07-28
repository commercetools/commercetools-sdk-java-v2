
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Setting the expiration date and time generates the RecurringOrderExpiresAtSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderSetExpiresAtAction recurringOrderSetExpiresAtAction = RecurringOrderSetExpiresAtAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setExpiresAt")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderSetExpiresAtActionImpl.class)
public interface RecurringOrderSetExpiresAtAction extends RecurringOrderUpdateAction {

    /**
     * discriminator value for RecurringOrderSetExpiresAtAction
     */
    String SET_EXPIRES_AT = "setExpiresAt";

    /**
     *  <p>Date and time (UTC) the Recurring Order should expire. If empty, any existing value will be removed.</p>
     *  <p>If the date or time is extended or removed when the RecurringOrderState is <code>Expired</code>, the state will be updated to <code>Active</code>.</p>
     * @return expiresAt
     */

    @JsonProperty("expiresAt")
    public ZonedDateTime getExpiresAt();

    /**
     *  <p>Date and time (UTC) the Recurring Order should expire. If empty, any existing value will be removed.</p>
     *  <p>If the date or time is extended or removed when the RecurringOrderState is <code>Expired</code>, the state will be updated to <code>Active</code>.</p>
     * @param expiresAt value to be set
     */

    public void setExpiresAt(final ZonedDateTime expiresAt);

    /**
     * factory method
     * @return instance of RecurringOrderSetExpiresAtAction
     */
    public static RecurringOrderSetExpiresAtAction of() {
        return new RecurringOrderSetExpiresAtActionImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderSetExpiresAtAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderSetExpiresAtAction of(final RecurringOrderSetExpiresAtAction template) {
        RecurringOrderSetExpiresAtActionImpl instance = new RecurringOrderSetExpiresAtActionImpl();
        instance.setExpiresAt(template.getExpiresAt());
        return instance;
    }

    public RecurringOrderSetExpiresAtAction copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderSetExpiresAtAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderSetExpiresAtAction deepCopy(@Nullable final RecurringOrderSetExpiresAtAction template) {
        if (template == null) {
            return null;
        }
        RecurringOrderSetExpiresAtActionImpl instance = new RecurringOrderSetExpiresAtActionImpl();
        instance.setExpiresAt(template.getExpiresAt());
        return instance;
    }

    /**
     * builder factory method for RecurringOrderSetExpiresAtAction
     * @return builder
     */
    public static RecurringOrderSetExpiresAtActionBuilder builder() {
        return RecurringOrderSetExpiresAtActionBuilder.of();
    }

    /**
     * create builder for RecurringOrderSetExpiresAtAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderSetExpiresAtActionBuilder builder(final RecurringOrderSetExpiresAtAction template) {
        return RecurringOrderSetExpiresAtActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderSetExpiresAtAction(Function<RecurringOrderSetExpiresAtAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderSetExpiresAtAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderSetExpiresAtAction>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderSetExpiresAtAction>";
            }
        };
    }
}
