
package com.commercetools.api.models.order;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchCompoundExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchCompoundExpression orderSearchCompoundExpression = OrderSearchCompoundExpression.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchCompoundExpressionBuilder implements Builder<OrderSearchCompoundExpression> {

    /**
     * builds OrderSearchCompoundExpression with checking for non-null required values
     * @return OrderSearchCompoundExpression
     */
    public OrderSearchCompoundExpression build() {
        return new OrderSearchCompoundExpressionImpl();
    }

    /**
     * builds OrderSearchCompoundExpression without checking for non-null required values
     * @return OrderSearchCompoundExpression
     */
    public OrderSearchCompoundExpression buildUnchecked() {
        return new OrderSearchCompoundExpressionImpl();
    }

    /**
     * factory method for an instance of OrderSearchCompoundExpressionBuilder
     * @return builder
     */
    public static OrderSearchCompoundExpressionBuilder of() {
        return new OrderSearchCompoundExpressionBuilder();
    }

    /**
     * create builder for OrderSearchCompoundExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchCompoundExpressionBuilder of(final OrderSearchCompoundExpression template) {
        OrderSearchCompoundExpressionBuilder builder = new OrderSearchCompoundExpressionBuilder();
        return builder;
    }

}
