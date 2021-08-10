
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderEditNotProcessedBuilder implements Builder<OrderEditNotProcessed> {

    public OrderEditNotProcessed build() {
        return new OrderEditNotProcessedImpl();
    }

    /**
     * builds OrderEditNotProcessed without checking for non null required values
     */
    public OrderEditNotProcessed buildUnchecked() {
        return new OrderEditNotProcessedImpl();
    }

    public static OrderEditNotProcessedBuilder of() {
        return new OrderEditNotProcessedBuilder();
    }

    public static OrderEditNotProcessedBuilder of(final OrderEditNotProcessed template) {
        OrderEditNotProcessedBuilder builder = new OrderEditNotProcessedBuilder();
        return builder;
    }

}
