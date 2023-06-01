package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderSearchDateRangeValue;
import com.commercetools.api.models.order.OrderSearchQueryExpression;
import com.commercetools.api.models.order.OrderSearchDateRangeExpression;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchDateRangeExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchDateRangeExpression orderSearchDateRangeExpression = OrderSearchDateRangeExpression.builder()
 *             .range(rangeBuilder -> rangeBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSearchDateRangeExpressionBuilder implements Builder<OrderSearchDateRangeExpression> {

    
    
    private com.commercetools.api.models.order.OrderSearchDateRangeValue range;

    
    /**
     * set the value to the range using the builder function
     * @param builder function to build the range value
     * @return Builder
     */
    
    public OrderSearchDateRangeExpressionBuilder range(Function<com.commercetools.api.models.order.OrderSearchDateRangeValueBuilder, com.commercetools.api.models.order.OrderSearchDateRangeValueBuilder> builder) {
        this.range = builder.apply(com.commercetools.api.models.order.OrderSearchDateRangeValueBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the range using the builder function
     * @param builder function to build the range value
     * @return Builder
     */
    
    public OrderSearchDateRangeExpressionBuilder withRange(Function<com.commercetools.api.models.order.OrderSearchDateRangeValueBuilder, com.commercetools.api.models.order.OrderSearchDateRangeValue> builder) {
        this.range = builder.apply(com.commercetools.api.models.order.OrderSearchDateRangeValueBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the range
     * @param range value to be set
     * @return Builder
     */
    
    public OrderSearchDateRangeExpressionBuilder range( final com.commercetools.api.models.order.OrderSearchDateRangeValue range) {
        this.range = range;
        return this;
    }
    
    

    /**
     * value of range}
     * @return range
     */
    
    
    public com.commercetools.api.models.order.OrderSearchDateRangeValue getRange(){
        return this.range;
    }

    /**
     * builds OrderSearchDateRangeExpression with checking for non-null required values
     * @return OrderSearchDateRangeExpression
     */
    public OrderSearchDateRangeExpression build() {
        Objects.requireNonNull(range, OrderSearchDateRangeExpression.class + ": range is missing");
        return new OrderSearchDateRangeExpressionImpl(range);
    }
    
    /**
     * builds OrderSearchDateRangeExpression without checking for non-null required values
     * @return OrderSearchDateRangeExpression
     */
    public OrderSearchDateRangeExpression buildUnchecked() {
        return new OrderSearchDateRangeExpressionImpl(range);
    }

    /**
     * factory method for an instance of OrderSearchDateRangeExpressionBuilder
     * @return builder 
     */
    public static OrderSearchDateRangeExpressionBuilder of() {
        return new OrderSearchDateRangeExpressionBuilder();
    }

    /**
     * create builder for OrderSearchDateRangeExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchDateRangeExpressionBuilder of(final OrderSearchDateRangeExpression template) {
        OrderSearchDateRangeExpressionBuilder builder = new OrderSearchDateRangeExpressionBuilder();
        builder.range = template.getRange();
        return builder;
    }

}
