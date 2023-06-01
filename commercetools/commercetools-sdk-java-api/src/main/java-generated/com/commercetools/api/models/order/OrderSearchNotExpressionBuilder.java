package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderSearchCompoundExpression;
import com.commercetools.api.models.order.OrderSearchQuery;
import com.commercetools.api.models.order.OrderSearchNotExpression;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchNotExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchNotExpression orderSearchNotExpression = OrderSearchNotExpression.builder()
 *             .plusNot(notBuilder -> notBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSearchNotExpressionBuilder implements Builder<OrderSearchNotExpression> {

    
    
    private java.util.List<com.commercetools.api.models.order.OrderSearchQuery> not;

    /**
     * set values to the not
     * @param not value to be set
     * @return Builder
     */
    
    public OrderSearchNotExpressionBuilder not( final com.commercetools.api.models.order.OrderSearchQuery ...not) {
        this.not = new ArrayList<>(Arrays.asList(not));
        return this;
    }
    
    /**
     * set value to the not
     * @param not value to be set
     * @return Builder
     */
    
    public OrderSearchNotExpressionBuilder not( final java.util.List<com.commercetools.api.models.order.OrderSearchQuery> not) {
        this.not = not;
        return this;
    }
    
    /**
     * add values to the not
     * @param not value to be set
     * @return Builder
     */
    
    public OrderSearchNotExpressionBuilder plusNot( final com.commercetools.api.models.order.OrderSearchQuery ...not) {
        if (this.not == null) {
            this.not = new ArrayList<>();
        }
        this.not.addAll(Arrays.asList(not));
        return this;
    }
    
    
    
    /**
     * add the value to the not using the builder function
     * @param builder function to build the not value
     * @return Builder
     */
    
    public OrderSearchNotExpressionBuilder plusNot(Function<com.commercetools.api.models.order.OrderSearchQueryBuilder, com.commercetools.api.models.order.OrderSearchQueryBuilder> builder) {
        if (this.not == null) {
            this.not = new ArrayList<>();
        }
        this.not.add(builder.apply(com.commercetools.api.models.order.OrderSearchQueryBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the not using the builder function
     * @param builder function to build the not value
     * @return Builder
     */
    
    public OrderSearchNotExpressionBuilder withNot(Function<com.commercetools.api.models.order.OrderSearchQueryBuilder, com.commercetools.api.models.order.OrderSearchQueryBuilder> builder) {
        this.not = new ArrayList<>();
        this.not.add(builder.apply(com.commercetools.api.models.order.OrderSearchQueryBuilder.of()).build());
        return this;
    }
    
    /**
     * add the value to the not using the builder function
     * @param builder function to build the not value
     * @return Builder
     */
    
    public OrderSearchNotExpressionBuilder addNot(Function<com.commercetools.api.models.order.OrderSearchQueryBuilder, com.commercetools.api.models.order.OrderSearchQuery> builder) {
        return plusNot(builder.apply(com.commercetools.api.models.order.OrderSearchQueryBuilder.of()));
    }
    
    /**
     * set the value to the not using the builder function
     * @param builder function to build the not value
     * @return Builder
     */
    
    public OrderSearchNotExpressionBuilder setNot(Function<com.commercetools.api.models.order.OrderSearchQueryBuilder, com.commercetools.api.models.order.OrderSearchQuery> builder) {
        return not(builder.apply(com.commercetools.api.models.order.OrderSearchQueryBuilder.of()));
    }
                    

    /**
     * value of not}
     * @return not
     */
    
    
    public java.util.List<com.commercetools.api.models.order.OrderSearchQuery> getNot(){
        return this.not;
    }

    /**
     * builds OrderSearchNotExpression with checking for non-null required values
     * @return OrderSearchNotExpression
     */
    public OrderSearchNotExpression build() {
        Objects.requireNonNull(not, OrderSearchNotExpression.class + ": not is missing");
        return new OrderSearchNotExpressionImpl(not);
    }
    
    /**
     * builds OrderSearchNotExpression without checking for non-null required values
     * @return OrderSearchNotExpression
     */
    public OrderSearchNotExpression buildUnchecked() {
        return new OrderSearchNotExpressionImpl(not);
    }

    /**
     * factory method for an instance of OrderSearchNotExpressionBuilder
     * @return builder 
     */
    public static OrderSearchNotExpressionBuilder of() {
        return new OrderSearchNotExpressionBuilder();
    }

    /**
     * create builder for OrderSearchNotExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchNotExpressionBuilder of(final OrderSearchNotExpression template) {
        OrderSearchNotExpressionBuilder builder = new OrderSearchNotExpressionBuilder();
        builder.not = template.getNot();
        return builder;
    }

}
