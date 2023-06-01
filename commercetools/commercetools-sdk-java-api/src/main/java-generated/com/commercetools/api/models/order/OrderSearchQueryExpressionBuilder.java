package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderSearchDateRangeExpression;
import com.commercetools.api.models.order.OrderSearchExactExpression;
import com.commercetools.api.models.order.OrderSearchExistsExpression;
import com.commercetools.api.models.order.OrderSearchFullTextExpression;
import com.commercetools.api.models.order.OrderSearchLongRangeExpression;
import com.commercetools.api.models.order.OrderSearchNumberRangeExpression;
import com.commercetools.api.models.order.OrderSearchPrefixExpression;
import com.commercetools.api.models.order.OrderSearchQuery;
import com.commercetools.api.models.order.OrderSearchWildCardExpression;
import com.commercetools.api.models.order.OrderSearchQueryExpression;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchQueryExpressionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchQueryExpression orderSearchQueryExpression = OrderSearchQueryExpression.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSearchQueryExpressionBuilder implements Builder<OrderSearchQueryExpression> {




    /**
     * builds OrderSearchQueryExpression with checking for non-null required values
     * @return OrderSearchQueryExpression
     */
    public OrderSearchQueryExpression build() {
        return new OrderSearchQueryExpressionImpl();
    }
    
    /**
     * builds OrderSearchQueryExpression without checking for non-null required values
     * @return OrderSearchQueryExpression
     */
    public OrderSearchQueryExpression buildUnchecked() {
        return new OrderSearchQueryExpressionImpl();
    }

    /**
     * factory method for an instance of OrderSearchQueryExpressionBuilder
     * @return builder 
     */
    public static OrderSearchQueryExpressionBuilder of() {
        return new OrderSearchQueryExpressionBuilder();
    }

    /**
     * create builder for OrderSearchQueryExpression instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchQueryExpressionBuilder of(final OrderSearchQueryExpression template) {
        OrderSearchQueryExpressionBuilder builder = new OrderSearchQueryExpressionBuilder();
        return builder;
    }

}
