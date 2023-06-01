package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderSearchCompoundExpression;
import com.commercetools.api.models.order.OrderSearchQuery;
import com.commercetools.api.models.order.OrderSearchOrExpression;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchOrExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchOrExpression orderSearchOrExpression = OrderSearchOrExpression.builder()
 *             .plusOr(orBuilder -> orBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSearchOrExpressionBuilder implements Builder<OrderSearchOrExpression> {

    
    
    private java.util.List<com.commercetools.api.models.order.OrderSearchQuery> or;

    /**
     * set values to the or
     * @param or value to be set
     * @return Builder
     */
    
    public OrderSearchOrExpressionBuilder or( final com.commercetools.api.models.order.OrderSearchQuery ...or) {
        this.or = new ArrayList<>(Arrays.asList(or));
        return this;
    }
    
    /**
     * set value to the or
     * @param or value to be set
     * @return Builder
     */
    
    public OrderSearchOrExpressionBuilder or( final java.util.List<com.commercetools.api.models.order.OrderSearchQuery> or) {
        this.or = or;
        return this;
    }
    
    /**
     * add values to the or
     * @param or value to be set
     * @return Builder
     */
    
    public OrderSearchOrExpressionBuilder plusOr( final com.commercetools.api.models.order.OrderSearchQuery ...or) {
        if (this.or == null) {
            this.or = new ArrayList<>();
        }
        this.or.addAll(Arrays.asList(or));
        return this;
    }
    
    
    
    /**
     * add the value to the or using the builder function
     * @param builder function to build the or value
     * @return Builder
     */
    
    public OrderSearchOrExpressionBuilder plusOr(Function<com.commercetools.api.models.order.OrderSearchQueryBuilder, com.commercetools.api.models.order.OrderSearchQueryBuilder> builder) {
        if (this.or == null) {
            this.or = new ArrayList<>();
        }
        this.or.add(builder.apply(com.commercetools.api.models.order.OrderSearchQueryBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the or using the builder function
     * @param builder function to build the or value
     * @return Builder
     */
    
    public OrderSearchOrExpressionBuilder withOr(Function<com.commercetools.api.models.order.OrderSearchQueryBuilder, com.commercetools.api.models.order.OrderSearchQueryBuilder> builder) {
        this.or = new ArrayList<>();
        this.or.add(builder.apply(com.commercetools.api.models.order.OrderSearchQueryBuilder.of()).build());
        return this;
    }
    
    /**
     * add the value to the or using the builder function
     * @param builder function to build the or value
     * @return Builder
     */
    
    public OrderSearchOrExpressionBuilder addOr(Function<com.commercetools.api.models.order.OrderSearchQueryBuilder, com.commercetools.api.models.order.OrderSearchQuery> builder) {
        return plusOr(builder.apply(com.commercetools.api.models.order.OrderSearchQueryBuilder.of()));
    }
    
    /**
     * set the value to the or using the builder function
     * @param builder function to build the or value
     * @return Builder
     */
    
    public OrderSearchOrExpressionBuilder setOr(Function<com.commercetools.api.models.order.OrderSearchQueryBuilder, com.commercetools.api.models.order.OrderSearchQuery> builder) {
        return or(builder.apply(com.commercetools.api.models.order.OrderSearchQueryBuilder.of()));
    }
                    

    /**
     * value of or}
     * @return or
     */
    
    
    public java.util.List<com.commercetools.api.models.order.OrderSearchQuery> getOr(){
        return this.or;
    }

    /**
     * builds OrderSearchOrExpression with checking for non-null required values
     * @return OrderSearchOrExpression
     */
    public OrderSearchOrExpression build() {
        Objects.requireNonNull(or, OrderSearchOrExpression.class + ": or is missing");
        return new OrderSearchOrExpressionImpl(or);
    }
    
    /**
     * builds OrderSearchOrExpression without checking for non-null required values
     * @return OrderSearchOrExpression
     */
    public OrderSearchOrExpression buildUnchecked() {
        return new OrderSearchOrExpressionImpl(or);
    }

    /**
     * factory method for an instance of OrderSearchOrExpressionBuilder
     * @return builder 
     */
    public static OrderSearchOrExpressionBuilder of() {
        return new OrderSearchOrExpressionBuilder();
    }

    /**
     * create builder for OrderSearchOrExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchOrExpressionBuilder of(final OrderSearchOrExpression template) {
        OrderSearchOrExpressionBuilder builder = new OrderSearchOrExpressionBuilder();
        builder.or = template.getOr();
        return builder;
    }

}
