
package com.commercetools.api.models.recurring_order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderSetExpiresAtActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderSetExpiresAtAction recurringOrderSetExpiresAtAction = RecurringOrderSetExpiresAtAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderSetExpiresAtActionBuilder implements Builder<RecurringOrderSetExpiresAtAction> {

    @Nullable
    private java.time.ZonedDateTime expiresAt;

    /**
     *  <p>Date and time (UTC) the Recurring Order should expire. If empty, any existing value will be removed.</p>
     *  <p>If the date or time is extended or removed when the RecurringOrderState is <code>Expired</code>, the state will be updated to <code>Active</code>.</p>
     * @param expiresAt value to be set
     * @return Builder
     */

    public RecurringOrderSetExpiresAtActionBuilder expiresAt(@Nullable final java.time.ZonedDateTime expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Recurring Order should expire. If empty, any existing value will be removed.</p>
     *  <p>If the date or time is extended or removed when the RecurringOrderState is <code>Expired</code>, the state will be updated to <code>Active</code>.</p>
     * @return expiresAt
     */

    @Nullable
    public java.time.ZonedDateTime getExpiresAt() {
        return this.expiresAt;
    }

    /**
     * builds RecurringOrderSetExpiresAtAction with checking for non-null required values
     * @return RecurringOrderSetExpiresAtAction
     */
    public RecurringOrderSetExpiresAtAction build() {
        return new RecurringOrderSetExpiresAtActionImpl(expiresAt);
    }

    /**
     * builds RecurringOrderSetExpiresAtAction without checking for non-null required values
     * @return RecurringOrderSetExpiresAtAction
     */
    public RecurringOrderSetExpiresAtAction buildUnchecked() {
        return new RecurringOrderSetExpiresAtActionImpl(expiresAt);
    }

    /**
     * factory method for an instance of RecurringOrderSetExpiresAtActionBuilder
     * @return builder
     */
    public static RecurringOrderSetExpiresAtActionBuilder of() {
        return new RecurringOrderSetExpiresAtActionBuilder();
    }

    /**
     * create builder for RecurringOrderSetExpiresAtAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderSetExpiresAtActionBuilder of(final RecurringOrderSetExpiresAtAction template) {
        RecurringOrderSetExpiresAtActionBuilder builder = new RecurringOrderSetExpiresAtActionBuilder();
        builder.expiresAt = template.getExpiresAt();
        return builder;
    }

}
