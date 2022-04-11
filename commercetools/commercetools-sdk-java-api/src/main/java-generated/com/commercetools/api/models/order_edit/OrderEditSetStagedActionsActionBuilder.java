
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderEditSetStagedActionsActionBuilder implements Builder<OrderEditSetStagedActionsAction> {

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

    public OrderEditSetStagedActionsActionBuilder plusStagedActions(
            final com.commercetools.api.models.order.StagedOrderUpdateAction... stagedActions) {
        if (this.stagedActions == null) {
            this.stagedActions = new ArrayList<>();
        }
        this.stagedActions.addAll(Arrays.asList(stagedActions));
        return this;
    }

    public OrderEditSetStagedActionsActionBuilder plusStagedActions(
            Function<com.commercetools.api.models.order.StagedOrderUpdateActionBuilder, Builder<? extends com.commercetools.api.models.order.StagedOrderUpdateAction>> builder) {
        if (this.stagedActions == null) {
            this.stagedActions = new ArrayList<>();
        }
        this.stagedActions
                .add(builder.apply(com.commercetools.api.models.order.StagedOrderUpdateActionBuilder.of()).build());
        return this;
    }

    public OrderEditSetStagedActionsActionBuilder withStagedActions(
            Function<com.commercetools.api.models.order.StagedOrderUpdateActionBuilder, Builder<? extends com.commercetools.api.models.order.StagedOrderUpdateAction>> builder) {
        this.stagedActions = new ArrayList<>();
        this.stagedActions
                .add(builder.apply(com.commercetools.api.models.order.StagedOrderUpdateActionBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> getStagedActions() {
        return this.stagedActions;
    }

    public OrderEditSetStagedActionsAction build() {
        Objects.requireNonNull(stagedActions, OrderEditSetStagedActionsAction.class + ": stagedActions is missing");
        return new OrderEditSetStagedActionsActionImpl(stagedActions);
    }

    /**
     * builds OrderEditSetStagedActionsAction without checking for non null required values
     */
    public OrderEditSetStagedActionsAction buildUnchecked() {
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
