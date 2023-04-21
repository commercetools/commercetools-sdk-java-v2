
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchWildCardExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchWildCardExpression orderSearchWildCardExpression = OrderSearchWildCardExpression.builder()
 *             .wildcard(wildcardBuilder -> wildcardBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchWildCardExpressionBuilder implements Builder<OrderSearchWildCardExpression> {

    private com.commercetools.api.models.order.OrderSearchStringValue wildcard;

    /**
     * set the value to the wildcard using the builder function
     * @param builder function to build the wildcard value
     * @return Builder
     */

    public OrderSearchWildCardExpressionBuilder wildcard(
            Function<com.commercetools.api.models.order.OrderSearchStringValueBuilder, com.commercetools.api.models.order.OrderSearchStringValueBuilder> builder) {
        this.wildcard = builder.apply(com.commercetools.api.models.order.OrderSearchStringValueBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the wildcard using the builder function
     * @param builder function to build the wildcard value
     * @return Builder
     */

    public OrderSearchWildCardExpressionBuilder withWildcard(
            Function<com.commercetools.api.models.order.OrderSearchStringValueBuilder, com.commercetools.api.models.order.OrderSearchStringValue> builder) {
        this.wildcard = builder.apply(com.commercetools.api.models.order.OrderSearchStringValueBuilder.of());
        return this;
    }

    /**
     * set the value to the wildcard
     * @param wildcard value to be set
     * @return Builder
     */

    public OrderSearchWildCardExpressionBuilder wildcard(
            final com.commercetools.api.models.order.OrderSearchStringValue wildcard) {
        this.wildcard = wildcard;
        return this;
    }

    /**
     * value of wildcard}
     * @return wildcard
     */

    public com.commercetools.api.models.order.OrderSearchStringValue getWildcard() {
        return this.wildcard;
    }

    /**
     * builds OrderSearchWildCardExpression with checking for non-null required values
     * @return OrderSearchWildCardExpression
     */
    public OrderSearchWildCardExpression build() {
        Objects.requireNonNull(wildcard, OrderSearchWildCardExpression.class + ": wildcard is missing");
        return new OrderSearchWildCardExpressionImpl(wildcard);
    }

    /**
     * builds OrderSearchWildCardExpression without checking for non-null required values
     * @return OrderSearchWildCardExpression
     */
    public OrderSearchWildCardExpression buildUnchecked() {
        return new OrderSearchWildCardExpressionImpl(wildcard);
    }

    /**
     * factory method for an instance of OrderSearchWildCardExpressionBuilder
     * @return builder
     */
    public static OrderSearchWildCardExpressionBuilder of() {
        return new OrderSearchWildCardExpressionBuilder();
    }

    /**
     * create builder for OrderSearchWildCardExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchWildCardExpressionBuilder of(final OrderSearchWildCardExpression template) {
        OrderSearchWildCardExpressionBuilder builder = new OrderSearchWildCardExpressionBuilder();
        builder.wildcard = template.getWildcard();
        return builder;
    }

}
