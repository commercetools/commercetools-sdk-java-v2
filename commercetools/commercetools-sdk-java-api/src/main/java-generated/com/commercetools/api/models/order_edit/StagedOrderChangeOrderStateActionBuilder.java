
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderChangeOrderStateActionBuilder {

    private com.commercetools.api.models.order.OrderState orderState;

    public StagedOrderChangeOrderStateActionBuilder orderState(
            final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
        return this;
    }

    public com.commercetools.api.models.order.OrderState getOrderState() {
        return this.orderState;
    }

    public StagedOrderChangeOrderStateAction build() {
        return new StagedOrderChangeOrderStateActionImpl(orderState);
    }

    public static StagedOrderChangeOrderStateActionBuilder of() {
        return new StagedOrderChangeOrderStateActionBuilder();
    }

    public static StagedOrderChangeOrderStateActionBuilder of(final StagedOrderChangeOrderStateAction template) {
        StagedOrderChangeOrderStateActionBuilder builder = new StagedOrderChangeOrderStateActionBuilder();
        builder.orderState = template.getOrderState();
        return builder;
    }

}
