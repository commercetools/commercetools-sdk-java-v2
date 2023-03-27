
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditSetStagedActionsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditSetStagedActionsAction orderEditSetStagedActionsAction = OrderEditSetStagedActionsAction.builder()
 *             .plusStagedActions(stagedActionsBuilder -> stagedActionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderEditSetStagedActionsActionBuilder implements Builder<OrderEditSetStagedActionsAction> {

    private java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions;

    /**
     *  <p>The actions to edit the <code>resource</code>.</p>
     * @param stagedActions value to be set
     * @return Builder
     */

    public OrderEditSetStagedActionsActionBuilder stagedActions(
            final com.commercetools.api.models.order.StagedOrderUpdateAction... stagedActions) {
        this.stagedActions = new ArrayList<>(Arrays.asList(stagedActions));
        return this;
    }

    /**
     *  <p>The actions to edit the <code>resource</code>.</p>
     * @param stagedActions value to be set
     * @return Builder
     */

    public OrderEditSetStagedActionsActionBuilder stagedActions(
            final java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions) {
        this.stagedActions = stagedActions;
        return this;
    }

    /**
     *  <p>The actions to edit the <code>resource</code>.</p>
     * @param stagedActions value to be set
     * @return Builder
     */

    public OrderEditSetStagedActionsActionBuilder plusStagedActions(
            final com.commercetools.api.models.order.StagedOrderUpdateAction... stagedActions) {
        if (this.stagedActions == null) {
            this.stagedActions = new ArrayList<>();
        }
        this.stagedActions.addAll(Arrays.asList(stagedActions));
        return this;
    }

    /**
     *  <p>The actions to edit the <code>resource</code>.</p>
     * @param builder function to build the stagedActions value
     * @return Builder
     */

    public OrderEditSetStagedActionsActionBuilder plusStagedActions(
            Function<com.commercetools.api.models.order.StagedOrderUpdateActionBuilder, Builder<? extends com.commercetools.api.models.order.StagedOrderUpdateAction>> builder) {
        if (this.stagedActions == null) {
            this.stagedActions = new ArrayList<>();
        }
        this.stagedActions
                .add(builder.apply(com.commercetools.api.models.order.StagedOrderUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The actions to edit the <code>resource</code>.</p>
     * @param builder function to build the stagedActions value
     * @return Builder
     */

    public OrderEditSetStagedActionsActionBuilder withStagedActions(
            Function<com.commercetools.api.models.order.StagedOrderUpdateActionBuilder, Builder<? extends com.commercetools.api.models.order.StagedOrderUpdateAction>> builder) {
        this.stagedActions = new ArrayList<>();
        this.stagedActions
                .add(builder.apply(com.commercetools.api.models.order.StagedOrderUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The actions to edit the <code>resource</code>.</p>
     * @return stagedActions
     */

    public java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> getStagedActions() {
        return this.stagedActions;
    }

    /**
     * builds OrderEditSetStagedActionsAction with checking for non-null required values
     * @return OrderEditSetStagedActionsAction
     */
    public OrderEditSetStagedActionsAction build() {
        Objects.requireNonNull(stagedActions, OrderEditSetStagedActionsAction.class + ": stagedActions is missing");
        return new OrderEditSetStagedActionsActionImpl(stagedActions);
    }

    /**
     * builds OrderEditSetStagedActionsAction without checking for non-null required values
     * @return OrderEditSetStagedActionsAction
     */
    public OrderEditSetStagedActionsAction buildUnchecked() {
        return new OrderEditSetStagedActionsActionImpl(stagedActions);
    }

    /**
     * factory method for an instance of OrderEditSetStagedActionsActionBuilder
     * @return builder
     */
    public static OrderEditSetStagedActionsActionBuilder of() {
        return new OrderEditSetStagedActionsActionBuilder();
    }

    /**
     * create builder for OrderEditSetStagedActionsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditSetStagedActionsActionBuilder of(final OrderEditSetStagedActionsAction template) {
        OrderEditSetStagedActionsActionBuilder builder = new OrderEditSetStagedActionsActionBuilder();
        builder.stagedActions = template.getStagedActions();
        return builder;
    }

}
