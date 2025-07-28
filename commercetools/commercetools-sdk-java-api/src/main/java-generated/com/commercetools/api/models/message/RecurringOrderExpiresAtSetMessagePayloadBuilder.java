
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderExpiresAtSetMessagePayloadBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderExpiresAtSetMessagePayloadBuilder
        implements Builder<RecurringOrderExpiresAtSetMessagePayload> {

    private java.time.ZonedDateTime newExpiresAt;

    private java.time.ZonedDateTime oldExpiresAt;

    /**
     *  <p>Expiration date and time of the Recurring Order after the Set Expires At update action.</p>
     * @param newExpiresAt value to be set
     * @return Builder
     */

    public RecurringOrderExpiresAtSetMessagePayloadBuilder newExpiresAt(final java.time.ZonedDateTime newExpiresAt) {
        this.newExpiresAt = newExpiresAt;
        return this;
    }

    /**
     *  <p>Expiration date and time of the Recurring Order before the Set Expires At update action.</p>
     * @param oldExpiresAt value to be set
     * @return Builder
     */

    public RecurringOrderExpiresAtSetMessagePayloadBuilder oldExpiresAt(final java.time.ZonedDateTime oldExpiresAt) {
        this.oldExpiresAt = oldExpiresAt;
        return this;
    }

    /**
     *  <p>Expiration date and time of the Recurring Order after the Set Expires At update action.</p>
     * @return newExpiresAt
     */

    public java.time.ZonedDateTime getNewExpiresAt() {
        return this.newExpiresAt;
    }

    /**
     *  <p>Expiration date and time of the Recurring Order before the Set Expires At update action.</p>
     * @return oldExpiresAt
     */

    public java.time.ZonedDateTime getOldExpiresAt() {
        return this.oldExpiresAt;
    }

    /**
     * builds RecurringOrderExpiresAtSetMessagePayload with checking for non-null required values
     * @return RecurringOrderExpiresAtSetMessagePayload
     */
    public RecurringOrderExpiresAtSetMessagePayload build() {
        Objects.requireNonNull(newExpiresAt,
            RecurringOrderExpiresAtSetMessagePayload.class + ": newExpiresAt is missing");
        Objects.requireNonNull(oldExpiresAt,
            RecurringOrderExpiresAtSetMessagePayload.class + ": oldExpiresAt is missing");
        return new RecurringOrderExpiresAtSetMessagePayloadImpl(newExpiresAt, oldExpiresAt);
    }

    /**
     * builds RecurringOrderExpiresAtSetMessagePayload without checking for non-null required values
     * @return RecurringOrderExpiresAtSetMessagePayload
     */
    public RecurringOrderExpiresAtSetMessagePayload buildUnchecked() {
        return new RecurringOrderExpiresAtSetMessagePayloadImpl(newExpiresAt, oldExpiresAt);
    }

    /**
     * factory method for an instance of RecurringOrderExpiresAtSetMessagePayloadBuilder
     * @return builder
     */
    public static RecurringOrderExpiresAtSetMessagePayloadBuilder of() {
        return new RecurringOrderExpiresAtSetMessagePayloadBuilder();
    }

    /**
     * create builder for RecurringOrderExpiresAtSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderExpiresAtSetMessagePayloadBuilder of(
            final RecurringOrderExpiresAtSetMessagePayload template) {
        RecurringOrderExpiresAtSetMessagePayloadBuilder builder = new RecurringOrderExpiresAtSetMessagePayloadBuilder();
        builder.newExpiresAt = template.getNewExpiresAt();
        builder.oldExpiresAt = template.getOldExpiresAt();
        return builder;
    }

}
