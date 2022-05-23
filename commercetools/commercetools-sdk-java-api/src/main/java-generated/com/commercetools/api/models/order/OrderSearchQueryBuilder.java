
package com.commercetools.api.models.order;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   OrderSearchQuery orderSearchQuery = OrderSearchQuery.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchQueryBuilder implements Builder<OrderSearchQuery> {

    public OrderSearchQuery build() {
        return new OrderSearchQueryImpl();
    }

    /**
     * builds OrderSearchQuery without checking for non null required values
     */
    public OrderSearchQuery buildUnchecked() {
        return new OrderSearchQueryImpl();
    }

    public static OrderSearchQueryBuilder of() {
        return new OrderSearchQueryBuilder();
    }

    public static OrderSearchQueryBuilder of(final OrderSearchQuery template) {
        OrderSearchQueryBuilder builder = new OrderSearchQueryBuilder();
        return builder;
    }

}
