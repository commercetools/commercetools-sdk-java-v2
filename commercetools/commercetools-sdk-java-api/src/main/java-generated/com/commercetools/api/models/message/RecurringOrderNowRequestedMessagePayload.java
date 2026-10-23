
package com.commercetools.api.models.message;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderRequestOrderNowAction" rel="nofollow">Request Order Now</a> update action. This Message is generated when the request is accepted, not when the Order is created. The resulting Order generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderCreatedFromRecurringOrderMessage" rel="nofollow">OrderCreatedFromRecurringOrder</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderNowRequestedMessagePayload recurringOrderNowRequestedMessagePayload = RecurringOrderNowRequestedMessagePayload.builder()
 *             .requestedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RecurringOrderNowRequested")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderNowRequestedMessagePayloadImpl.class)
public interface RecurringOrderNowRequestedMessagePayload extends MessagePayload {

    /**
     * discriminator value for RecurringOrderNowRequestedMessagePayload
     */
    String RECURRING_ORDER_NOW_REQUESTED = "RecurringOrderNowRequested";

    /**
     *  <p>Date and time (UTC) the early Order was requested.</p>
     * @return requestedAt
     */
    @NotNull
    @JsonProperty("requestedAt")
    public ZonedDateTime getRequestedAt();

    /**
     *  <p>Note provided in the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderRequestOrderNowAction" rel="nofollow">Request Order Now</a> update action.</p>
     * @return reason
     */

    @JsonProperty("reason")
    public String getReason();

    /**
     *  <p>Date and time (UTC) the early Order was requested.</p>
     * @param requestedAt value to be set
     */

    public void setRequestedAt(final ZonedDateTime requestedAt);

    /**
     *  <p>Note provided in the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderRequestOrderNowAction" rel="nofollow">Request Order Now</a> update action.</p>
     * @param reason value to be set
     */

    public void setReason(final String reason);

    /**
     * factory method
     * @return instance of RecurringOrderNowRequestedMessagePayload
     */
    public static RecurringOrderNowRequestedMessagePayload of() {
        return new RecurringOrderNowRequestedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderNowRequestedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderNowRequestedMessagePayload of(final RecurringOrderNowRequestedMessagePayload template) {
        RecurringOrderNowRequestedMessagePayloadImpl instance = new RecurringOrderNowRequestedMessagePayloadImpl();
        instance.setRequestedAt(template.getRequestedAt());
        instance.setReason(template.getReason());
        return instance;
    }

    public RecurringOrderNowRequestedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderNowRequestedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderNowRequestedMessagePayload deepCopy(
            @Nullable final RecurringOrderNowRequestedMessagePayload template) {
        if (template == null) {
            return null;
        }
        RecurringOrderNowRequestedMessagePayloadImpl instance = new RecurringOrderNowRequestedMessagePayloadImpl();
        instance.setRequestedAt(template.getRequestedAt());
        instance.setReason(template.getReason());
        return instance;
    }

    /**
     * builder factory method for RecurringOrderNowRequestedMessagePayload
     * @return builder
     */
    public static RecurringOrderNowRequestedMessagePayloadBuilder builder() {
        return RecurringOrderNowRequestedMessagePayloadBuilder.of();
    }

    /**
     * create builder for RecurringOrderNowRequestedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderNowRequestedMessagePayloadBuilder builder(
            final RecurringOrderNowRequestedMessagePayload template) {
        return RecurringOrderNowRequestedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderNowRequestedMessagePayload(
            Function<RecurringOrderNowRequestedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<RecurringOrderNowRequestedMessagePayload> typeReference() {
        return new tools.jackson.core.type.TypeReference<RecurringOrderNowRequestedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderNowRequestedMessagePayload>";
            }
        };
    }
}
