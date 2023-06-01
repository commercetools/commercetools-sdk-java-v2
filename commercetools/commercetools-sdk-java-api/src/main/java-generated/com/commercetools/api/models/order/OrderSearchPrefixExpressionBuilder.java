package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderSearchQueryExpression;
import com.commercetools.api.models.order.OrderSearchStringValue;
import com.commercetools.api.models.order.OrderSearchPrefixExpression;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchPrefixExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchPrefixExpression orderSearchPrefixExpression = OrderSearchPrefixExpression.builder()
 *             .prefix(prefixBuilder -> prefixBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSearchPrefixExpressionBuilder implements Builder<OrderSearchPrefixExpression> {

    
    
    private com.commercetools.api.models.order.OrderSearchStringValue prefix;

    
    /**
     * set the value to the prefix using the builder function
     * @param builder function to build the prefix value
     * @return Builder
     */
    
    public OrderSearchPrefixExpressionBuilder prefix(Function<com.commercetools.api.models.order.OrderSearchStringValueBuilder, com.commercetools.api.models.order.OrderSearchStringValueBuilder> builder) {
        this.prefix = builder.apply(com.commercetools.api.models.order.OrderSearchStringValueBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the prefix using the builder function
     * @param builder function to build the prefix value
     * @return Builder
     */
    
    public OrderSearchPrefixExpressionBuilder withPrefix(Function<com.commercetools.api.models.order.OrderSearchStringValueBuilder, com.commercetools.api.models.order.OrderSearchStringValue> builder) {
        this.prefix = builder.apply(com.commercetools.api.models.order.OrderSearchStringValueBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the prefix
     * @param prefix value to be set
     * @return Builder
     */
    
    public OrderSearchPrefixExpressionBuilder prefix( final com.commercetools.api.models.order.OrderSearchStringValue prefix) {
        this.prefix = prefix;
        return this;
    }
    
    

    /**
     * value of prefix}
     * @return prefix
     */
    
    
    public com.commercetools.api.models.order.OrderSearchStringValue getPrefix(){
        return this.prefix;
    }

    /**
     * builds OrderSearchPrefixExpression with checking for non-null required values
     * @return OrderSearchPrefixExpression
     */
    public OrderSearchPrefixExpression build() {
        Objects.requireNonNull(prefix, OrderSearchPrefixExpression.class + ": prefix is missing");
        return new OrderSearchPrefixExpressionImpl(prefix);
    }
    
    /**
     * builds OrderSearchPrefixExpression without checking for non-null required values
     * @return OrderSearchPrefixExpression
     */
    public OrderSearchPrefixExpression buildUnchecked() {
        return new OrderSearchPrefixExpressionImpl(prefix);
    }

    /**
     * factory method for an instance of OrderSearchPrefixExpressionBuilder
     * @return builder 
     */
    public static OrderSearchPrefixExpressionBuilder of() {
        return new OrderSearchPrefixExpressionBuilder();
    }

    /**
     * create builder for OrderSearchPrefixExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchPrefixExpressionBuilder of(final OrderSearchPrefixExpression template) {
        OrderSearchPrefixExpressionBuilder builder = new OrderSearchPrefixExpressionBuilder();
        builder.prefix = template.getPrefix();
        return builder;
    }

}
