
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchLongRangeExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchLongRangeExpression orderSearchLongRangeExpression = OrderSearchLongRangeExpression.builder()
 *             .range(rangeBuilder -> rangeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchLongRangeExpressionBuilder implements Builder<OrderSearchLongRangeExpression> {

    private com.commercetools.api.models.order.OrderSearchLongRangeValue range;

    /**
     * set the value to the range using the builder function
     * @param builder function to build the range value
     * @return Builder
     */

    public OrderSearchLongRangeExpressionBuilder range(
            Function<com.commercetools.api.models.order.OrderSearchLongRangeValueBuilder, com.commercetools.api.models.order.OrderSearchLongRangeValueBuilder> builder) {
        this.range = builder.apply(com.commercetools.api.models.order.OrderSearchLongRangeValueBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the range using the builder function
     * @param builder function to build the range value
     * @return Builder
     */

    public OrderSearchLongRangeExpressionBuilder withRange(
            Function<com.commercetools.api.models.order.OrderSearchLongRangeValueBuilder, com.commercetools.api.models.order.OrderSearchLongRangeValue> builder) {
        this.range = builder.apply(com.commercetools.api.models.order.OrderSearchLongRangeValueBuilder.of());
        return this;
    }

    /**
     * set the value to the range
     * @param range value to be set
     * @return Builder
     */

    public OrderSearchLongRangeExpressionBuilder range(
            final com.commercetools.api.models.order.OrderSearchLongRangeValue range) {
        this.range = range;
        return this;
    }

    /**
     * value of range}
     * @return range
     */

    public com.commercetools.api.models.order.OrderSearchLongRangeValue getRange() {
        return this.range;
    }

    /**
     * builds OrderSearchLongRangeExpression with checking for non-null required values
     * @return OrderSearchLongRangeExpression
     */
    public OrderSearchLongRangeExpression build() {
        Objects.requireNonNull(range, OrderSearchLongRangeExpression.class + ": range is missing");
        return new OrderSearchLongRangeExpressionImpl(range);
    }

    /**
     * builds OrderSearchLongRangeExpression without checking for non-null required values
     * @return OrderSearchLongRangeExpression
     */
    public OrderSearchLongRangeExpression buildUnchecked() {
        return new OrderSearchLongRangeExpressionImpl(range);
    }

    /**
     * factory method for an instance of OrderSearchLongRangeExpressionBuilder
     * @return builder
     */
    public static OrderSearchLongRangeExpressionBuilder of() {
        return new OrderSearchLongRangeExpressionBuilder();
    }

    /**
     * create builder for OrderSearchLongRangeExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchLongRangeExpressionBuilder of(final OrderSearchLongRangeExpression template) {
        OrderSearchLongRangeExpressionBuilder builder = new OrderSearchLongRangeExpressionBuilder();
        builder.range = template.getRange();
        return builder;
    }

}
