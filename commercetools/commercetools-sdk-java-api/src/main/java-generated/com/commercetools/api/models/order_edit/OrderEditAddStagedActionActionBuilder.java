
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderEditAddStagedActionActionBuilder implements Builder<OrderEditAddStagedActionAction> {

    private com.commercetools.api.models.order.StagedOrderUpdateAction stagedAction;

    public OrderEditAddStagedActionActionBuilder stagedAction(
            final com.commercetools.api.models.order.StagedOrderUpdateAction stagedAction) {
        this.stagedAction = stagedAction;
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
