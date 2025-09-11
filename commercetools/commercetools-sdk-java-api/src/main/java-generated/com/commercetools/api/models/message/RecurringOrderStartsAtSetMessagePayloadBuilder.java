
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderStartsAtSetMessagePayloadBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderStartsAtSetMessagePayloadBuilder
        implements Builder<RecurringOrderStartsAtSetMessagePayload> {

    private java.time.ZonedDateTime startsAt;

    private java.time.ZonedDateTime oldStartsAt;

    /**
     *  <p>Start date and time of the Recurring Order after the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetStartsAtAction" rel="nofollow">Set Starts At</a> update action.</p>
     * @param startsAt value to be set
     * @return Builder
     */

    public RecurringOrderStartsAtSetMessagePayloadBuilder startsAt(final java.time.ZonedDateTime startsAt) {
        this.startsAt = startsAt;
        return this;
    }

    /**
     *  <p>Start date and time of the Recurring Order before the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetStartsAtAction" rel="nofollow">Set Starts At</a> update action.</p>
     * @param oldStartsAt value to be set
     * @return Builder
     */

    public RecurringOrderStartsAtSetMessagePayloadBuilder oldStartsAt(final java.time.ZonedDateTime oldStartsAt) {
        this.oldStartsAt = oldStartsAt;
        return this;
    }

    /**
     *  <p>Start date and time of the Recurring Order after the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetStartsAtAction" rel="nofollow">Set Starts At</a> update action.</p>
     * @return startsAt
     */

    public java.time.ZonedDateTime getStartsAt() {
        return this.startsAt;
    }

    /**
     *  <p>Start date and time of the Recurring Order before the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetStartsAtAction" rel="nofollow">Set Starts At</a> update action.</p>
     * @return oldStartsAt
     */

    public java.time.ZonedDateTime getOldStartsAt() {
        return this.oldStartsAt;
    }

    /**
     * builds RecurringOrderStartsAtSetMessagePayload with checking for non-null required values
     * @return RecurringOrderStartsAtSetMessagePayload
     */
    public RecurringOrderStartsAtSetMessagePayload build() {
        Objects.requireNonNull(startsAt, RecurringOrderStartsAtSetMessagePayload.class + ": startsAt is missing");
        Objects.requireNonNull(oldStartsAt, RecurringOrderStartsAtSetMessagePayload.class + ": oldStartsAt is missing");
        return new RecurringOrderStartsAtSetMessagePayloadImpl(startsAt, oldStartsAt);
    }

    /**
     * builds RecurringOrderStartsAtSetMessagePayload without checking for non-null required values
     * @return RecurringOrderStartsAtSetMessagePayload
     */
    public RecurringOrderStartsAtSetMessagePayload buildUnchecked() {
        return new RecurringOrderStartsAtSetMessagePayloadImpl(startsAt, oldStartsAt);
    }

    /**
     * factory method for an instance of RecurringOrderStartsAtSetMessagePayloadBuilder
     * @return builder
     */
    public static RecurringOrderStartsAtSetMessagePayloadBuilder of() {
        return new RecurringOrderStartsAtSetMessagePayloadBuilder();
    }

    /**
     * create builder for RecurringOrderStartsAtSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderStartsAtSetMessagePayloadBuilder of(
            final RecurringOrderStartsAtSetMessagePayload template) {
        RecurringOrderStartsAtSetMessagePayloadBuilder builder = new RecurringOrderStartsAtSetMessagePayloadBuilder();
        builder.startsAt = template.getStartsAt();
        builder.oldStartsAt = template.getOldStartsAt();
        return builder;
    }

}
