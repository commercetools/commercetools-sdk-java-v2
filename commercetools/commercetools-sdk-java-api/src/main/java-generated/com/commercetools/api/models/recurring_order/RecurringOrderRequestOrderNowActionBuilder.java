
package com.commercetools.api.models.recurring_order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderRequestOrderNowActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderRequestOrderNowAction recurringOrderRequestOrderNowAction = RecurringOrderRequestOrderNowAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderRequestOrderNowActionBuilder implements Builder<RecurringOrderRequestOrderNowAction> {

    @Nullable
    private String reason;

    /**
     *  <p>Note recorded on the resulting <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderNowRequestedMessage" rel="nofollow">RecurringOrderNowRequested</a> Message.</p>
     *  <p>If <code>reason</code> is longer than 256 characters, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @param reason value to be set
     * @return Builder
     */

    public RecurringOrderRequestOrderNowActionBuilder reason(@Nullable final String reason) {
        this.reason = reason;
        return this;
    }

    /**
     *  <p>Note recorded on the resulting <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderNowRequestedMessage" rel="nofollow">RecurringOrderNowRequested</a> Message.</p>
     *  <p>If <code>reason</code> is longer than 256 characters, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @return reason
     */

    @Nullable
    public String getReason() {
        return this.reason;
    }

    /**
     * builds RecurringOrderRequestOrderNowAction with checking for non-null required values
     * @return RecurringOrderRequestOrderNowAction
     */
    public RecurringOrderRequestOrderNowAction build() {
        return new RecurringOrderRequestOrderNowActionImpl(reason);
    }

    /**
     * builds RecurringOrderRequestOrderNowAction without checking for non-null required values
     * @return RecurringOrderRequestOrderNowAction
     */
    public RecurringOrderRequestOrderNowAction buildUnchecked() {
        return new RecurringOrderRequestOrderNowActionImpl(reason);
    }

    /**
     * factory method for an instance of RecurringOrderRequestOrderNowActionBuilder
     * @return builder
     */
    public static RecurringOrderRequestOrderNowActionBuilder of() {
        return new RecurringOrderRequestOrderNowActionBuilder();
    }

    /**
     * create builder for RecurringOrderRequestOrderNowAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderRequestOrderNowActionBuilder of(final RecurringOrderRequestOrderNowAction template) {
        RecurringOrderRequestOrderNowActionBuilder builder = new RecurringOrderRequestOrderNowActionBuilder();
        builder.reason = template.getReason();
        return builder;
    }

}
