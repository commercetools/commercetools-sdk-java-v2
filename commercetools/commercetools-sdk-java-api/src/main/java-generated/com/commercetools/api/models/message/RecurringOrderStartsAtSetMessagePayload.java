
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful Set Starts At update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderStartsAtSetMessagePayload recurringOrderStartsAtSetMessagePayload = RecurringOrderStartsAtSetMessagePayload.builder()
 *             .startsAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .oldStartsAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RecurringOrderStartsAtSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderStartsAtSetMessagePayloadImpl.class)
public interface RecurringOrderStartsAtSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for RecurringOrderStartsAtSetMessagePayload
     */
    String RECURRING_ORDER_STARTS_AT_SET = "RecurringOrderStartsAtSet";

    /**
     *  <p>Start date and time of the Recurring Order after the Set Starts At update action.</p>
     * @return startsAt
     */
    @NotNull
    @JsonProperty("startsAt")
    public ZonedDateTime getStartsAt();

    /**
     *  <p>Start date and time of the Recurring Order before the Set Starts At update action.</p>
     * @return oldStartsAt
     */
    @NotNull
    @JsonProperty("oldStartsAt")
    public ZonedDateTime getOldStartsAt();

    /**
     *  <p>Start date and time of the Recurring Order after the Set Starts At update action.</p>
     * @param startsAt value to be set
     */

    public void setStartsAt(final ZonedDateTime startsAt);

    /**
     *  <p>Start date and time of the Recurring Order before the Set Starts At update action.</p>
     * @param oldStartsAt value to be set
     */

    public void setOldStartsAt(final ZonedDateTime oldStartsAt);

    /**
     * factory method
     * @return instance of RecurringOrderStartsAtSetMessagePayload
     */
    public static RecurringOrderStartsAtSetMessagePayload of() {
        return new RecurringOrderStartsAtSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderStartsAtSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderStartsAtSetMessagePayload of(final RecurringOrderStartsAtSetMessagePayload template) {
        RecurringOrderStartsAtSetMessagePayloadImpl instance = new RecurringOrderStartsAtSetMessagePayloadImpl();
        instance.setStartsAt(template.getStartsAt());
        instance.setOldStartsAt(template.getOldStartsAt());
        return instance;
    }

    public RecurringOrderStartsAtSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderStartsAtSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderStartsAtSetMessagePayload deepCopy(
            @Nullable final RecurringOrderStartsAtSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        RecurringOrderStartsAtSetMessagePayloadImpl instance = new RecurringOrderStartsAtSetMessagePayloadImpl();
        instance.setStartsAt(template.getStartsAt());
        instance.setOldStartsAt(template.getOldStartsAt());
        return instance;
    }

    /**
     * builder factory method for RecurringOrderStartsAtSetMessagePayload
     * @return builder
     */
    public static RecurringOrderStartsAtSetMessagePayloadBuilder builder() {
        return RecurringOrderStartsAtSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for RecurringOrderStartsAtSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderStartsAtSetMessagePayloadBuilder builder(
            final RecurringOrderStartsAtSetMessagePayload template) {
        return RecurringOrderStartsAtSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderStartsAtSetMessagePayload(
            Function<RecurringOrderStartsAtSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderStartsAtSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderStartsAtSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderStartsAtSetMessagePayload>";
            }
        };
    }
}
