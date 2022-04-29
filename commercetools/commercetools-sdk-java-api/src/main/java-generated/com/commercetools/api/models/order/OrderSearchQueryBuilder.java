
package com.commercetools.api.models.order;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
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
