
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderEditAddStagedActionActionBuilder implements Builder<OrderEditAddStagedActionAction> {

    private com.commercetools.api.models.order.StagedOrderUpdateAction stagedAction;

    public OrderEditAddStagedActionActionBuilder stagedAction(
            final com.commercetools.api.models.order.StagedOrderUpdateAction stagedAction) {
        this.stagedAction = stagedAction;
        return this;
    }

    public OrderEditAddStagedActionActionBuilder stagedAction(
            Function<com.commercetools.api.models.order.StagedOrderUpdateActionBuilder, Builder<? extends com.commercetools.api.models.order.StagedOrderUpdateAction>> builder) {
        this.stagedAction = builder.apply(com.commercetools.api.models.order.StagedOrderUpdateActionBuilder.of())
                .build();
        return this;
    }

    public com.commercetools.api.models.order.StagedOrderUpdateAction getStagedAction() {
        return this.stagedAction;
    }

    public OrderEditAddStagedActionAction build() {
        Objects.requireNonNull(stagedAction, OrderEditAddStagedActionAction.class + ": stagedAction is missing");
        return new OrderEditAddStagedActionActionImpl(stagedAction);
    }

    /**
     * builds OrderEditAddStagedActionAction without checking for non null required values
     */
    public OrderEditAddStagedActionAction buildUnchecked() {
        return new OrderEditAddStagedActionActionImpl(stagedAction);
    }

    public static OrderEditAddStagedActionActionBuilder of() {
        return new OrderEditAddStagedActionActionBuilder();
    }

    public static OrderEditAddStagedActionActionBuilder of(final OrderEditAddStagedActionAction template) {
        OrderEditAddStagedActionActionBuilder builder = new OrderEditAddStagedActionActionBuilder();
        builder.stagedAction = template.getStagedAction();
        return builder;
    }

}
