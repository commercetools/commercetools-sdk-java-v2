
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchExistsExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchExistsExpression orderSearchExistsExpression = OrderSearchExistsExpression.builder()
 *             .exists(existsBuilder -> existsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchExistsExpressionBuilder implements Builder<OrderSearchExistsExpression> {

    private com.commercetools.api.models.order.OrderSearchQueryExpressionValue exists;

    /**
     * set the value to the exists using the builder function
     * @param builder function to build the exists value
     * @return Builder
     */

    public OrderSearchExistsExpressionBuilder exists(
            Function<com.commercetools.api.models.order.OrderSearchQueryExpressionValueBuilder, com.commercetools.api.models.order.OrderSearchQueryExpressionValueBuilder> builder) {
        this.exists = builder.apply(com.commercetools.api.models.order.OrderSearchQueryExpressionValueBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the exists using the builder function
     * @param builder function to build the exists value
     * @return Builder
     */

    public OrderSearchExistsExpressionBuilder withExists(
            Function<com.commercetools.api.models.order.OrderSearchQueryExpressionValueBuilder, com.commercetools.api.models.order.OrderSearchQueryExpressionValue> builder) {
        this.exists = builder.apply(com.commercetools.api.models.order.OrderSearchQueryExpressionValueBuilder.of());
        return this;
    }

    /**
     * set the value to the exists
     * @param exists value to be set
     * @return Builder
     */

    public OrderSearchExistsExpressionBuilder exists(
            final com.commercetools.api.models.order.OrderSearchQueryExpressionValue exists) {
        this.exists = exists;
        return this;
    }

    /**
     * value of exists}
     * @return exists
     */

    public com.commercetools.api.models.order.OrderSearchQueryExpressionValue getExists() {
        return this.exists;
    }

    /**
     * builds OrderSearchExistsExpression with checking for non-null required values
     * @return OrderSearchExistsExpression
     */
    public OrderSearchExistsExpression build() {
        Objects.requireNonNull(exists, OrderSearchExistsExpression.class + ": exists is missing");
        return new OrderSearchExistsExpressionImpl(exists);
    }

    /**
     * builds OrderSearchExistsExpression without checking for non-null required values
     * @return OrderSearchExistsExpression
     */
    public OrderSearchExistsExpression buildUnchecked() {
        return new OrderSearchExistsExpressionImpl(exists);
    }

    /**
     * factory method for an instance of OrderSearchExistsExpressionBuilder
     * @return builder
     */
    public static OrderSearchExistsExpressionBuilder of() {
        return new OrderSearchExistsExpressionBuilder();
    }

    /**
     * create builder for OrderSearchExistsExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchExistsExpressionBuilder of(final OrderSearchExistsExpression template) {
        OrderSearchExistsExpressionBuilder builder = new OrderSearchExistsExpressionBuilder();
        builder.exists = template.getExists();
        return builder;
    }

}
