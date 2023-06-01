package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderSearchCompoundExpression;
import com.commercetools.api.models.order.OrderSearchQueryExpression;
import com.commercetools.api.models.order.OrderSearchFilterExpression;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchFilterExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchFilterExpression orderSearchFilterExpression = OrderSearchFilterExpression.builder()
 *             .plusFilter(filterBuilder -> filterBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSearchFilterExpressionBuilder implements Builder<OrderSearchFilterExpression> {

    
    
    private java.util.List<com.commercetools.api.models.order.OrderSearchQueryExpression> filter;

    /**
     * set values to the filter
     * @param filter value to be set
     * @return Builder
     */
    
    public OrderSearchFilterExpressionBuilder filter( final com.commercetools.api.models.order.OrderSearchQueryExpression ...filter) {
        this.filter = new ArrayList<>(Arrays.asList(filter));
        return this;
    }
    
    /**
     * set value to the filter
     * @param filter value to be set
     * @return Builder
     */
    
    public OrderSearchFilterExpressionBuilder filter( final java.util.List<com.commercetools.api.models.order.OrderSearchQueryExpression> filter) {
        this.filter = filter;
        return this;
    }
    
    /**
     * add values to the filter
     * @param filter value to be set
     * @return Builder
     */
    
    public OrderSearchFilterExpressionBuilder plusFilter( final com.commercetools.api.models.order.OrderSearchQueryExpression ...filter) {
        if (this.filter == null) {
            this.filter = new ArrayList<>();
        }
        this.filter.addAll(Arrays.asList(filter));
        return this;
    }
    
    
    
    /**
     * add the value to the filter using the builder function
     * @param builder function to build the filter value
     * @return Builder
     */
    
    public OrderSearchFilterExpressionBuilder plusFilter(Function<com.commercetools.api.models.order.OrderSearchQueryExpressionBuilder, com.commercetools.api.models.order.OrderSearchQueryExpressionBuilder> builder) {
        if (this.filter == null) {
            this.filter = new ArrayList<>();
        }
        this.filter.add(builder.apply(com.commercetools.api.models.order.OrderSearchQueryExpressionBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the filter using the builder function
     * @param builder function to build the filter value
     * @return Builder
     */
    
    public OrderSearchFilterExpressionBuilder withFilter(Function<com.commercetools.api.models.order.OrderSearchQueryExpressionBuilder, com.commercetools.api.models.order.OrderSearchQueryExpressionBuilder> builder) {
        this.filter = new ArrayList<>();
        this.filter.add(builder.apply(com.commercetools.api.models.order.OrderSearchQueryExpressionBuilder.of()).build());
        return this;
    }
    
    /**
     * add the value to the filter using the builder function
     * @param builder function to build the filter value
     * @return Builder
     */
    
    public OrderSearchFilterExpressionBuilder addFilter(Function<com.commercetools.api.models.order.OrderSearchQueryExpressionBuilder, com.commercetools.api.models.order.OrderSearchQueryExpression> builder) {
        return plusFilter(builder.apply(com.commercetools.api.models.order.OrderSearchQueryExpressionBuilder.of()));
    }
    
    /**
     * set the value to the filter using the builder function
     * @param builder function to build the filter value
     * @return Builder
     */
    
    public OrderSearchFilterExpressionBuilder setFilter(Function<com.commercetools.api.models.order.OrderSearchQueryExpressionBuilder, com.commercetools.api.models.order.OrderSearchQueryExpression> builder) {
        return filter(builder.apply(com.commercetools.api.models.order.OrderSearchQueryExpressionBuilder.of()));
    }
                    

    /**
     * value of filter}
     * @return filter
     */
    
    
    public java.util.List<com.commercetools.api.models.order.OrderSearchQueryExpression> getFilter(){
        return this.filter;
    }

    /**
     * builds OrderSearchFilterExpression with checking for non-null required values
     * @return OrderSearchFilterExpression
     */
    public OrderSearchFilterExpression build() {
        Objects.requireNonNull(filter, OrderSearchFilterExpression.class + ": filter is missing");
        return new OrderSearchFilterExpressionImpl(filter);
    }
    
    /**
     * builds OrderSearchFilterExpression without checking for non-null required values
     * @return OrderSearchFilterExpression
     */
    public OrderSearchFilterExpression buildUnchecked() {
        return new OrderSearchFilterExpressionImpl(filter);
    }

    /**
     * factory method for an instance of OrderSearchFilterExpressionBuilder
     * @return builder 
     */
    public static OrderSearchFilterExpressionBuilder of() {
        return new OrderSearchFilterExpressionBuilder();
    }

    /**
     * create builder for OrderSearchFilterExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchFilterExpressionBuilder of(final OrderSearchFilterExpression template) {
        OrderSearchFilterExpressionBuilder builder = new OrderSearchFilterExpressionBuilder();
        builder.filter = template.getFilter();
        return builder;
    }

}
