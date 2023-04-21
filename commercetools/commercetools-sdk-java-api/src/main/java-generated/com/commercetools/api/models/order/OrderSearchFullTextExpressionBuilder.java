
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchFullTextExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchFullTextExpression orderSearchFullTextExpression = OrderSearchFullTextExpression.builder()
 *             .fullText(fullTextBuilder -> fullTextBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchFullTextExpressionBuilder implements Builder<OrderSearchFullTextExpression> {

    private com.commercetools.api.models.order.OrderSearchFullTextValue fullText;

    /**
     * set the value to the fullText using the builder function
     * @param builder function to build the fullText value
     * @return Builder
     */

    public OrderSearchFullTextExpressionBuilder fullText(
            Function<com.commercetools.api.models.order.OrderSearchFullTextValueBuilder, com.commercetools.api.models.order.OrderSearchFullTextValueBuilder> builder) {
        this.fullText = builder.apply(com.commercetools.api.models.order.OrderSearchFullTextValueBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the fullText using the builder function
     * @param builder function to build the fullText value
     * @return Builder
     */

    public OrderSearchFullTextExpressionBuilder withFullText(
            Function<com.commercetools.api.models.order.OrderSearchFullTextValueBuilder, com.commercetools.api.models.order.OrderSearchFullTextValue> builder) {
        this.fullText = builder.apply(com.commercetools.api.models.order.OrderSearchFullTextValueBuilder.of());
        return this;
    }

    /**
     * set the value to the fullText
     * @param fullText value to be set
     * @return Builder
     */

    public OrderSearchFullTextExpressionBuilder fullText(
            final com.commercetools.api.models.order.OrderSearchFullTextValue fullText) {
        this.fullText = fullText;
        return this;
    }

    /**
     * value of fullText}
     * @return fullText
     */

    public com.commercetools.api.models.order.OrderSearchFullTextValue getFullText() {
        return this.fullText;
    }

    /**
     * builds OrderSearchFullTextExpression with checking for non-null required values
     * @return OrderSearchFullTextExpression
     */
    public OrderSearchFullTextExpression build() {
        Objects.requireNonNull(fullText, OrderSearchFullTextExpression.class + ": fullText is missing");
        return new OrderSearchFullTextExpressionImpl(fullText);
    }

    /**
     * builds OrderSearchFullTextExpression without checking for non-null required values
     * @return OrderSearchFullTextExpression
     */
    public OrderSearchFullTextExpression buildUnchecked() {
        return new OrderSearchFullTextExpressionImpl(fullText);
    }

    /**
     * factory method for an instance of OrderSearchFullTextExpressionBuilder
     * @return builder
     */
    public static OrderSearchFullTextExpressionBuilder of() {
        return new OrderSearchFullTextExpressionBuilder();
    }

    /**
     * create builder for OrderSearchFullTextExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchFullTextExpressionBuilder of(final OrderSearchFullTextExpression template) {
        OrderSearchFullTextExpressionBuilder builder = new OrderSearchFullTextExpressionBuilder();
        builder.fullText = template.getFullText();
        return builder;
    }

}
