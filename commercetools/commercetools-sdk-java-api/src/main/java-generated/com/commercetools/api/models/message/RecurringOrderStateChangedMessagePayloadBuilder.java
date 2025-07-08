
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderStateChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderStateChangedMessagePayload recurringOrderStateChangedMessagePayload = RecurringOrderStateChangedMessagePayload.builder()
 *             .state(RecurringOrderState.ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderStateChangedMessagePayloadBuilder
        implements Builder<RecurringOrderStateChangedMessagePayload> {

    private com.commercetools.api.models.recurring_order.RecurringOrderState state;

    @Nullable
    private com.commercetools.api.models.recurring_order.RecurringOrderState oldState;

    /**
     *  <p>RecurringOrderState after the Set RecurringOrderState update action.</p>
     * @param state value to be set
     * @return Builder
     */

    public RecurringOrderStateChangedMessagePayloadBuilder state(
            final com.commercetools.api.models.recurring_order.RecurringOrderState state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>RecurringOrderState before the Set RecurringOrderState update action.</p>
     * @param oldState value to be set
     * @return Builder
     */

    public RecurringOrderStateChangedMessagePayloadBuilder oldState(
            @Nullable final com.commercetools.api.models.recurring_order.RecurringOrderState oldState) {
        this.oldState = oldState;
        return this;
    }

    /**
     *  <p>RecurringOrderState after the Set RecurringOrderState update action.</p>
     * @return state
     */

    public com.commercetools.api.models.recurring_order.RecurringOrderState getState() {
        return this.state;
    }

    /**
     *  <p>RecurringOrderState before the Set RecurringOrderState update action.</p>
     * @return oldState
     */

    @Nullable
    public com.commercetools.api.models.recurring_order.RecurringOrderState getOldState() {
        return this.oldState;
    }

    /**
     * builds RecurringOrderStateChangedMessagePayload with checking for non-null required values
     * @return RecurringOrderStateChangedMessagePayload
     */
    public RecurringOrderStateChangedMessagePayload build() {
        Objects.requireNonNull(state, RecurringOrderStateChangedMessagePayload.class + ": state is missing");
        return new RecurringOrderStateChangedMessagePayloadImpl(state, oldState);
    }

    /**
     * builds RecurringOrderStateChangedMessagePayload without checking for non-null required values
     * @return RecurringOrderStateChangedMessagePayload
     */
    public RecurringOrderStateChangedMessagePayload buildUnchecked() {
        return new RecurringOrderStateChangedMessagePayloadImpl(state, oldState);
    }

    /**
     * factory method for an instance of RecurringOrderStateChangedMessagePayloadBuilder
     * @return builder
     */
    public static RecurringOrderStateChangedMessagePayloadBuilder of() {
        return new RecurringOrderStateChangedMessagePayloadBuilder();
    }

    /**
     * create builder for RecurringOrderStateChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderStateChangedMessagePayloadBuilder of(
            final RecurringOrderStateChangedMessagePayload template) {
        RecurringOrderStateChangedMessagePayloadBuilder builder = new RecurringOrderStateChangedMessagePayloadBuilder();
        builder.state = template.getState();
        builder.oldState = template.getOldState();
        return builder;
    }

}
