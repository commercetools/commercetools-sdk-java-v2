
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderEditSetStagedActionsActionBuilder {

    private java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions;

    public OrderEditSetStagedActionsActionBuilder stagedActions(
            final com.commercetools.api.models.order.StagedOrderUpdateAction... stagedActions) {
        this.stagedActions = new ArrayList<>(Arrays.asList(stagedActions));
        return this;
    }

    public OrderEditSetStagedActionsActionBuilder stagedActions(
            final java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions) {
        this.stagedActions = stagedActions;
        return this;
    }

    public java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> getStagedActions() {
        return this.stagedActions;
    }

    public OrderEditSetStagedActionsAction build() {
        return new OrderEditSetStagedActionsActionImpl(stagedActions);
    }

    public static OrderEditSetStagedActionsActionBuilder of() {
        return new OrderEditSetStagedActionsActionBuilder();
    }

    public static OrderEditSetStagedActionsActionBuilder of(final OrderEditSetStagedActionsAction template) {
        OrderEditSetStagedActionsActionBuilder builder = new OrderEditSetStagedActionsActionBuilder();
        builder.stagedActions = template.getStagedActions();
        return builder;
    }

}
