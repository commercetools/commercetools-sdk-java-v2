
package com.commercetools.api.models.order;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchQueryBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchQuery orderSearchQuery = OrderSearchQuery.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchQueryBuilder implements Builder<OrderSearchQuery>, OrderSearchQueryBuilderMixin {

    /**
     * builds OrderSearchQuery with checking for non-null required values
     * @return OrderSearchQuery
     */
    public OrderSearchQuery build() {
        return new OrderSearchQueryImpl();
    }

    /**
     * builds OrderSearchQuery without checking for non-null required values
     * @return OrderSearchQuery
     */
    public OrderSearchQuery buildUnchecked() {
        return new OrderSearchQueryImpl();
    }

    /**
     * factory method for an instance of OrderSearchQueryBuilder
     * @return builder
     */
    public static OrderSearchQueryBuilder of() {
        return new OrderSearchQueryBuilder();
    }

    /**
     * create builder for OrderSearchQuery instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchQueryBuilder of(final OrderSearchQuery template) {
        OrderSearchQueryBuilder builder = new OrderSearchQueryBuilder();
        return builder;
    }

}
