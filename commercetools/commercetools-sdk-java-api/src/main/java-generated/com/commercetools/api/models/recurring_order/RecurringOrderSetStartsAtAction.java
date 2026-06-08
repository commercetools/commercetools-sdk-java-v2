
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>To set the start date and time, the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Order</a> must not have been started yet. Setting the start date and time generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderStartsAtSetMessage" rel="nofollow">RecurringOrderStartsAtSet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderSetStartsAtAction recurringOrderSetStartsAtAction = RecurringOrderSetStartsAtAction.builder()
 *             .startsAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setStartsAt")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderSetStartsAtActionImpl.class)
public interface RecurringOrderSetStartsAtAction extends RecurringOrderUpdateAction {

    /**
     * discriminator value for RecurringOrderSetStartsAtAction
     */
    String SET_STARTS_AT = "setStartsAt";

    /**
     *  <p>Date and time (UTC) the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Order</a> should be started. The date and time must be in the future.</p>
     * @return startsAt
     */
    @NotNull
    @JsonProperty("startsAt")
    public ZonedDateTime getStartsAt();

    /**
     *  <p>Date and time (UTC) the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Order</a> should be started. The date and time must be in the future.</p>
     * @param startsAt value to be set
     */

    public void setStartsAt(final ZonedDateTime startsAt);

    /**
     * factory method
     * @return instance of RecurringOrderSetStartsAtAction
     */
    public static RecurringOrderSetStartsAtAction of() {
        return new RecurringOrderSetStartsAtActionImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderSetStartsAtAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderSetStartsAtAction of(final RecurringOrderSetStartsAtAction template) {
        RecurringOrderSetStartsAtActionImpl instance = new RecurringOrderSetStartsAtActionImpl();
        instance.setStartsAt(template.getStartsAt());
        return instance;
    }

    public RecurringOrderSetStartsAtAction copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderSetStartsAtAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderSetStartsAtAction deepCopy(@Nullable final RecurringOrderSetStartsAtAction template) {
        if (template == null) {
            return null;
        }
        RecurringOrderSetStartsAtActionImpl instance = new RecurringOrderSetStartsAtActionImpl();
        instance.setStartsAt(template.getStartsAt());
        return instance;
    }

    /**
     * builder factory method for RecurringOrderSetStartsAtAction
     * @return builder
     */
    public static RecurringOrderSetStartsAtActionBuilder builder() {
        return RecurringOrderSetStartsAtActionBuilder.of();
    }

    /**
     * create builder for RecurringOrderSetStartsAtAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderSetStartsAtActionBuilder builder(final RecurringOrderSetStartsAtAction template) {
        return RecurringOrderSetStartsAtActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderSetStartsAtAction(Function<RecurringOrderSetStartsAtAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderSetStartsAtAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderSetStartsAtAction>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderSetStartsAtAction>";
            }
        };
    }
}
