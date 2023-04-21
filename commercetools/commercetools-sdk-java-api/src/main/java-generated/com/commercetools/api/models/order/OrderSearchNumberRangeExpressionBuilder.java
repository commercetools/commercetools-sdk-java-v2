
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchNumberRangeExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchNumberRangeExpression orderSearchNumberRangeExpression = OrderSearchNumberRangeExpression.builder()
 *             .range(rangeBuilder -> rangeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchNumberRangeExpressionBuilder implements Builder<OrderSearchNumberRangeExpression> {

    private com.commercetools.api.models.order.OrderSearchNumberRangeValue range;

    /**
     * set the value to the range using the builder function
     * @param builder function to build the range value
     * @return Builder
     */

    public OrderSearchNumberRangeExpressionBuilder range(
            Function<com.commercetools.api.models.order.OrderSearchNumberRangeValueBuilder, com.commercetools.api.models.order.OrderSearchNumberRangeValueBuilder> builder) {
        this.range = builder.apply(com.commercetools.api.models.order.OrderSearchNumberRangeValueBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the range using the builder function
     * @param builder function to build the range value
     * @return Builder
     */

    public OrderSearchNumberRangeExpressionBuilder withRange(
            Function<com.commercetools.api.models.order.OrderSearchNumberRangeValueBuilder, com.commercetools.api.models.order.OrderSearchNumberRangeValue> builder) {
        this.range = builder.apply(com.commercetools.api.models.order.OrderSearchNumberRangeValueBuilder.of());
        return this;
    }

    /**
     * set the value to the range
     * @param range value to be set
     * @return Builder
     */

    public OrderSearchNumberRangeExpressionBuilder range(
            final com.commercetools.api.models.order.OrderSearchNumberRangeValue range) {
        this.range = range;
        return this;
    }

    /**
     * value of range}
     * @return range
     */

    public com.commercetools.api.models.order.OrderSearchNumberRangeValue getRange() {
        return this.range;
    }

    /**
     * builds OrderSearchNumberRangeExpression with checking for non-null required values
     * @return OrderSearchNumberRangeExpression
     */
    public OrderSearchNumberRangeExpression build() {
        Objects.requireNonNull(range, OrderSearchNumberRangeExpression.class + ": range is missing");
        return new OrderSearchNumberRangeExpressionImpl(range);
    }

    /**
     * builds OrderSearchNumberRangeExpression without checking for non-null required values
     * @return OrderSearchNumberRangeExpression
     */
    public OrderSearchNumberRangeExpression buildUnchecked() {
        return new OrderSearchNumberRangeExpressionImpl(range);
    }

    /**
     * factory method for an instance of OrderSearchNumberRangeExpressionBuilder
     * @return builder
     */
    public static OrderSearchNumberRangeExpressionBuilder of() {
        return new OrderSearchNumberRangeExpressionBuilder();
    }

    /**
     * create builder for OrderSearchNumberRangeExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchNumberRangeExpressionBuilder of(final OrderSearchNumberRangeExpression template) {
        OrderSearchNumberRangeExpressionBuilder builder = new OrderSearchNumberRangeExpressionBuilder();
        builder.range = template.getRange();
        return builder;
    }

}
