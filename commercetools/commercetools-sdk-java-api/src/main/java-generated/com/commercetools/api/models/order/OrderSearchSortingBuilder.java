
package com.commercetools.api.models.order;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchSortingBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchSorting orderSearchSorting = OrderSearchSorting.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchSortingBuilder implements Builder<OrderSearchSorting> {

    /**
     * builds OrderSearchSorting with checking for non-null required values
     * @return OrderSearchSorting
     */
    public OrderSearchSorting build() {
        return new OrderSearchSortingImpl();
    }

    /**
     * builds OrderSearchSorting without checking for non-null required values
     * @return OrderSearchSorting
     */
    public OrderSearchSorting buildUnchecked() {
        return new OrderSearchSortingImpl();
    }

    /**
     * factory method for an instance of OrderSearchSortingBuilder
     * @return builder
     */
    public static OrderSearchSortingBuilder of() {
        return new OrderSearchSortingBuilder();
    }

    /**
     * create builder for OrderSearchSorting instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSearchSortingBuilder of(final OrderSearchSorting template) {
        OrderSearchSortingBuilder builder = new OrderSearchSortingBuilder();
        return builder;
    }

}
