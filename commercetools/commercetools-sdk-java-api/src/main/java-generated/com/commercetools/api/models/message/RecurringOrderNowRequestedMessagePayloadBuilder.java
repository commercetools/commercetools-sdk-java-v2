
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderNowRequestedMessagePayloadBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderNowRequestedMessagePayloadBuilder
        implements Builder<RecurringOrderNowRequestedMessagePayload> {

    private java.time.ZonedDateTime requestedAt;

    @Nullable
    private String reason;

    /**
     *  <p>Date and time (UTC) the early Order was requested.</p>
     * @param requestedAt value to be set
     * @return Builder
     */

    public RecurringOrderNowRequestedMessagePayloadBuilder requestedAt(final java.time.ZonedDateTime requestedAt) {
        this.requestedAt = requestedAt;
        return this;
    }

    /**
     *  <p>Note provided in the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderRequestOrderNowAction" rel="nofollow">Request Order Now</a> update action.</p>
     * @param reason value to be set
     * @return Builder
     */

    public RecurringOrderNowRequestedMessagePayloadBuilder reason(@Nullable final String reason) {
        this.reason = reason;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the early Order was requested.</p>
     * @return requestedAt
     */

    public java.time.ZonedDateTime getRequestedAt() {
        return this.requestedAt;
    }

    /**
     *  <p>Note provided in the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderRequestOrderNowAction" rel="nofollow">Request Order Now</a> update action.</p>
     * @return reason
     */

    @Nullable
    public String getReason() {
        return this.reason;
    }

    /**
     * builds RecurringOrderNowRequestedMessagePayload with checking for non-null required values
     * @return RecurringOrderNowRequestedMessagePayload
     */
    public RecurringOrderNowRequestedMessagePayload build() {
        Objects.requireNonNull(requestedAt,
            RecurringOrderNowRequestedMessagePayload.class + ": requestedAt is missing");
        return new RecurringOrderNowRequestedMessagePayloadImpl(requestedAt, reason);
    }

    /**
     * builds RecurringOrderNowRequestedMessagePayload without checking for non-null required values
     * @return RecurringOrderNowRequestedMessagePayload
     */
    public RecurringOrderNowRequestedMessagePayload buildUnchecked() {
        return new RecurringOrderNowRequestedMessagePayloadImpl(requestedAt, reason);
    }

    /**
     * factory method for an instance of RecurringOrderNowRequestedMessagePayloadBuilder
     * @return builder
     */
    public static RecurringOrderNowRequestedMessagePayloadBuilder of() {
        return new RecurringOrderNowRequestedMessagePayloadBuilder();
    }

    /**
     * create builder for RecurringOrderNowRequestedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderNowRequestedMessagePayloadBuilder of(
            final RecurringOrderNowRequestedMessagePayload template) {
        RecurringOrderNowRequestedMessagePayloadBuilder builder = new RecurringOrderNowRequestedMessagePayloadBuilder();
        builder.requestedAt = template.getRequestedAt();
        builder.reason = template.getReason();
        return builder;
    }

}
