package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderSearchCompoundExpression;
import com.commercetools.api.models.order.OrderSearchQuery;
import com.commercetools.api.models.order.OrderSearchAndExpression;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchAndExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchAndExpression orderSearchAndExpression = OrderSearchAndExpression.builder()
 *             .plusAnd(andBuilder -> andBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSearchAndExpressionBuilder implements Builder<OrderSearchAndExpression> {

    
    
    private java.util.List<com.commercetools.api.models.order.OrderSearchQuery> and;

    /**
     * set values to the and
     * @param and value to be set
     * @return Builder
     */
    
    public OrderSearchAndExpressionBuilder and( final com.commercetools.api.models.order.OrderSearchQuery ...and) {
        this.and = new ArrayList<>(Arrays.asList(and));
        return this;
    }
    
    /**
     * set value to the and
     * @param and value to be set
     * @return Builder
     */
    
    public OrderSearchAndExpressionBuilder and( final java.util.List<com.commercetools.api.models.order.OrderSearchQuery> and) {
        this.and = and;
        return this;
    }
    
    /**
     * add values to the and
     * @param and value to be set
     * @return Builder
     */
    
    public OrderSearchAndExpressionBuilder plusAnd( final com.commercetools.api.models.order.OrderSearchQuery ...and) {
        if (this.and == null) {
            this.and = new ArrayList<>();
        }
        this.and.addAll(Arrays.asList(and));
        return this;
    }
    
    
    
    /**
     * add the value to the and using the builder function
     * @param builder function to build the and value
     * @return Builder
     */
    
    public OrderSearchAndExpressionBuilder plusAnd(Function<com.commercetools.api.models.order.OrderSearchQueryBuilder, com.commercetools.api.models.order.OrderSearchQueryBuilder> builder) {
        if (this.and == null) {
            this.and = new ArrayList<>();
        }
        this.and.add(builder.apply(com.commercetools.api.models.order.OrderSearchQueryBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the and using the builder function
     * @param builder function to build the and value
     * @return Builder
     */
    
    public OrderSearchAndExpressionBuilder withAnd(Function<com.commercetools.api.models.order.OrderSearchQueryBuilder, com.commercetools.api.models.order.OrderSearchQueryBuilder> builder) {
        this.and = new ArrayList<>();
        this.and.add(builder.apply(com.commercetools.api.models.order.OrderSearchQueryBuilder.of()).build());
        return this;
    }
    
    /**
     * add the value to the and using the builder function
     * @param builder function to build the and value
     * @return Builder
     */
    
    public OrderSearchAndExpressionBuilder addAnd(Function<com.commercetools.api.models.order.OrderSearchQueryBuilder, com.commercetools.api.models.order.OrderSearchQuery> builder) {
        return plusAnd(builder.apply(com.commercetools.api.models.order.OrderSearchQueryBuilder.of()));
    }
    
    /**
     * set the value to the and using the builder function
     * @param builder function to build the and value
     * @return Builder
     */
    
    public OrderSearchAndExpressionBuilder setAnd(Function<com.commercetools.api.models.order.OrderSearchQueryBuilder, com.commercetools.api.models.order.OrderSearchQuery> builder) {
        return and(builder.apply(com.commercetools.api.models.order.OrderSearchQueryBuilder.of()));
    }
                    

    /**
     * value of and}
     * @return and
     */
    
    
    public java.util.List<com.commercetools.api.models.order.OrderSearchQuery> getAnd(){
        return this.and;
    }

    /**
     * builds OrderSearchAndExpression with checking for non-null required values
     * @return OrderSearchAndExpression
     */
    public OrderSearchAndExpression build() {
        Objects.requireNonNull(and, OrderSearchAndExpression.class + ": and is missing");
        return new OrderSearchAndExpressionImpl(and);
    }
    
    /**
     * builds OrderSearchAndExpression without checking for non-null required values
     * @return OrderSearchAndExpression
     */
    public OrderSearchAndExpression buildUnchecked() {
        return new OrderSearchAndExpressionImpl(and);
    }

    /**
     * factory method for an instance of OrderSearchAndExpressionBuilder
     * @return builder 
     */
    public static OrderSearchAndExpressionBuilder of() {
        return new OrderSearchAndExpressionBuilder();
    }

    /**
     * create builder for OrderSearchAndExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchAndExpressionBuilder of(final OrderSearchAndExpression template) {
        OrderSearchAndExpressionBuilder builder = new OrderSearchAndExpressionBuilder();
        builder.and = template.getAnd();
        return builder;
    }

}
