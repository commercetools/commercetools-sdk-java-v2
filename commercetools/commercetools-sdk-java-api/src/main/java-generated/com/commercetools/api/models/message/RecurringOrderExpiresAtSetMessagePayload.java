
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
 *  <p>Generated after a successful Set Expires At update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderExpiresAtSetMessagePayload recurringOrderExpiresAtSetMessagePayload = RecurringOrderExpiresAtSetMessagePayload.builder()
 *             .newExpiresAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .oldExpiresAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RecurringOrderExpiresAtSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderExpiresAtSetMessagePayloadImpl.class)
public interface RecurringOrderExpiresAtSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for RecurringOrderExpiresAtSetMessagePayload
     */
    String RECURRING_ORDER_EXPIRES_AT_SET = "RecurringOrderExpiresAtSet";

    /**
     *  <p>Expiration date and time of the Recurring Order after the Set Expires At update action.</p>
     * @return newExpiresAt
     */
    @NotNull
    @JsonProperty("newExpiresAt")
    public ZonedDateTime getNewExpiresAt();

    /**
     *  <p>Expiration date and time of the Recurring Order before the Set Expires At update action.</p>
     * @return oldExpiresAt
     */
    @NotNull
    @JsonProperty("oldExpiresAt")
    public ZonedDateTime getOldExpiresAt();

    /**
     *  <p>Expiration date and time of the Recurring Order after the Set Expires At update action.</p>
     * @param newExpiresAt value to be set
     */

    public void setNewExpiresAt(final ZonedDateTime newExpiresAt);

    /**
     *  <p>Expiration date and time of the Recurring Order before the Set Expires At update action.</p>
     * @param oldExpiresAt value to be set
     */

    public void setOldExpiresAt(final ZonedDateTime oldExpiresAt);

    /**
     * factory method
     * @return instance of RecurringOrderExpiresAtSetMessagePayload
     */
    public static RecurringOrderExpiresAtSetMessagePayload of() {
        return new RecurringOrderExpiresAtSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderExpiresAtSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderExpiresAtSetMessagePayload of(final RecurringOrderExpiresAtSetMessagePayload template) {
        RecurringOrderExpiresAtSetMessagePayloadImpl instance = new RecurringOrderExpiresAtSetMessagePayloadImpl();
        instance.setNewExpiresAt(template.getNewExpiresAt());
        instance.setOldExpiresAt(template.getOldExpiresAt());
        return instance;
    }

    public RecurringOrderExpiresAtSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderExpiresAtSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderExpiresAtSetMessagePayload deepCopy(
            @Nullable final RecurringOrderExpiresAtSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        RecurringOrderExpiresAtSetMessagePayloadImpl instance = new RecurringOrderExpiresAtSetMessagePayloadImpl();
        instance.setNewExpiresAt(template.getNewExpiresAt());
        instance.setOldExpiresAt(template.getOldExpiresAt());
        return instance;
    }

    /**
     * builder factory method for RecurringOrderExpiresAtSetMessagePayload
     * @return builder
     */
    public static RecurringOrderExpiresAtSetMessagePayloadBuilder builder() {
        return RecurringOrderExpiresAtSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for RecurringOrderExpiresAtSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderExpiresAtSetMessagePayloadBuilder builder(
            final RecurringOrderExpiresAtSetMessagePayload template) {
        return RecurringOrderExpiresAtSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderExpiresAtSetMessagePayload(
            Function<RecurringOrderExpiresAtSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderExpiresAtSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderExpiresAtSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderExpiresAtSetMessagePayload>";
            }
        };
    }
}
