
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchExactExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchExactExpression orderSearchExactExpression = OrderSearchExactExpression.builder()
 *             .exact(exactBuilder -> exactBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchExactExpressionBuilder implements Builder<OrderSearchExactExpression> {

    private com.commercetools.api.models.order.OrderSearchAnyValue exact;

    /**
     * set the value to the exact using the builder function
     * @param builder function to build the exact value
     * @return Builder
     */

    public OrderSearchExactExpressionBuilder exact(
            Function<com.commercetools.api.models.order.OrderSearchAnyValueBuilder, com.commercetools.api.models.order.OrderSearchAnyValueBuilder> builder) {
        this.exact = builder.apply(com.commercetools.api.models.order.OrderSearchAnyValueBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the exact using the builder function
     * @param builder function to build the exact value
     * @return Builder
     */

    public OrderSearchExactExpressionBuilder withExact(
            Function<com.commercetools.api.models.order.OrderSearchAnyValueBuilder, com.commercetools.api.models.order.OrderSearchAnyValue> builder) {
        this.exact = builder.apply(com.commercetools.api.models.order.OrderSearchAnyValueBuilder.of());
        return this;
    }

    /**
     * set the value to the exact
     * @param exact value to be set
     * @return Builder
     */

    public OrderSearchExactExpressionBuilder exact(final com.commercetools.api.models.order.OrderSearchAnyValue exact) {
        this.exact = exact;
        return this;
    }

    /**
     * value of exact}
     * @return exact
     */

    public com.commercetools.api.models.order.OrderSearchAnyValue getExact() {
        return this.exact;
    }

    /**
     * builds OrderSearchExactExpression with checking for non-null required values
     * @return OrderSearchExactExpression
     */
    public OrderSearchExactExpression build() {
        Objects.requireNonNull(exact, OrderSearchExactExpression.class + ": exact is missing");
        return new OrderSearchExactExpressionImpl(exact);
    }

    /**
     * builds OrderSearchExactExpression without checking for non-null required values
     * @return OrderSearchExactExpression
     */
    public OrderSearchExactExpression buildUnchecked() {
        return new OrderSearchExactExpressionImpl(exact);
    }

    /**
     * factory method for an instance of OrderSearchExactExpressionBuilder
     * @return builder
     */
    public static OrderSearchExactExpressionBuilder of() {
        return new OrderSearchExactExpressionBuilder();
    }

    /**
     * create builder for OrderSearchExactExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchExactExpressionBuilder of(final OrderSearchExactExpression template) {
        OrderSearchExactExpressionBuilder builder = new OrderSearchExactExpressionBuilder();
        builder.exact = template.getExact();
        return builder;
    }

}
