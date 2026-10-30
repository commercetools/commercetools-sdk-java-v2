
package com.commercetools.api.models.recurrence_policy;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurrencePolicySetMinDaysBetweenOrdersActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurrencePolicySetMinDaysBetweenOrdersAction recurrencePolicySetMinDaysBetweenOrdersAction = RecurrencePolicySetMinDaysBetweenOrdersAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurrencePolicySetMinDaysBetweenOrdersActionBuilder
        implements Builder<RecurrencePolicySetMinDaysBetweenOrdersAction> {

    @Nullable
    private Integer minDaysBetweenOrders;

    /**
     *  <p>Value to set. Must be greater than <code>0</code>. If omitted, any existing value is removed and there is no limit.</p>
     * @param minDaysBetweenOrders value to be set
     * @return Builder
     */

    public RecurrencePolicySetMinDaysBetweenOrdersActionBuilder minDaysBetweenOrders(
            @Nullable final Integer minDaysBetweenOrders) {
        this.minDaysBetweenOrders = minDaysBetweenOrders;
        return this;
    }

    /**
     *  <p>Value to set. Must be greater than <code>0</code>. If omitted, any existing value is removed and there is no limit.</p>
     * @return minDaysBetweenOrders
     */

    @Nullable
    public Integer getMinDaysBetweenOrders() {
        return this.minDaysBetweenOrders;
    }

    /**
     * builds RecurrencePolicySetMinDaysBetweenOrdersAction with checking for non-null required values
     * @return RecurrencePolicySetMinDaysBetweenOrdersAction
     */
    public RecurrencePolicySetMinDaysBetweenOrdersAction build() {
        return new RecurrencePolicySetMinDaysBetweenOrdersActionImpl(minDaysBetweenOrders);
    }

    /**
     * builds RecurrencePolicySetMinDaysBetweenOrdersAction without checking for non-null required values
     * @return RecurrencePolicySetMinDaysBetweenOrdersAction
     */
    public RecurrencePolicySetMinDaysBetweenOrdersAction buildUnchecked() {
        return new RecurrencePolicySetMinDaysBetweenOrdersActionImpl(minDaysBetweenOrders);
    }

    /**
     * factory method for an instance of RecurrencePolicySetMinDaysBetweenOrdersActionBuilder
     * @return builder
     */
    public static RecurrencePolicySetMinDaysBetweenOrdersActionBuilder of() {
        return new RecurrencePolicySetMinDaysBetweenOrdersActionBuilder();
    }

    /**
     * create builder for RecurrencePolicySetMinDaysBetweenOrdersAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurrencePolicySetMinDaysBetweenOrdersActionBuilder of(
            final RecurrencePolicySetMinDaysBetweenOrdersAction template) {
        RecurrencePolicySetMinDaysBetweenOrdersActionBuilder builder = new RecurrencePolicySetMinDaysBetweenOrdersActionBuilder();
        builder.minDaysBetweenOrders = template.getMinDaysBetweenOrders();
        return builder;
    }

}
