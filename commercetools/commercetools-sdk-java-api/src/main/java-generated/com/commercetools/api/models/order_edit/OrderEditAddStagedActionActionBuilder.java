
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditAddStagedActionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditAddStagedActionAction orderEditAddStagedActionAction = OrderEditAddStagedActionAction.builder()
 *             .stagedAction(stagedActionBuilder -> stagedActionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderEditAddStagedActionActionBuilder implements Builder<OrderEditAddStagedActionAction> {

    private com.commercetools.api.models.order.StagedOrderUpdateAction stagedAction;

    /**
     *  <p>Order update action to append to the <code>stagedActions</code> array.</p>
     * @param stagedAction value to be set
     * @return Builder
     */

    public OrderEditAddStagedActionActionBuilder stagedAction(
            final com.commercetools.api.models.order.StagedOrderUpdateAction stagedAction) {
        this.stagedAction = stagedAction;
        return this;
    }

    /**
     *  <p>Order update action to append to the <code>stagedActions</code> array.</p>
     * @param builder function to build the stagedAction value
     * @return Builder
     */

    public OrderEditAddStagedActionActionBuilder stagedAction(
            Function<com.commercetools.api.models.order.StagedOrderUpdateActionBuilder, Builder<? extends com.commercetools.api.models.order.StagedOrderUpdateAction>> builder) {
        this.stagedAction = builder.apply(com.commercetools.api.models.order.StagedOrderUpdateActionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Order update action to append to the <code>stagedActions</code> array.</p>
     * @return stagedAction
     */

    public com.commercetools.api.models.order.StagedOrderUpdateAction getStagedAction() {
        return this.stagedAction;
    }

    /**
     * builds OrderEditAddStagedActionAction with checking for non-null required values
     * @return OrderEditAddStagedActionAction
     */
    public OrderEditAddStagedActionAction build() {
        Objects.requireNonNull(stagedAction, OrderEditAddStagedActionAction.class + ": stagedAction is missing");
        return new OrderEditAddStagedActionActionImpl(stagedAction);
    }

    /**
     * builds OrderEditAddStagedActionAction without checking for non-null required values
     * @return OrderEditAddStagedActionAction
     */
    public OrderEditAddStagedActionAction buildUnchecked() {
        return new OrderEditAddStagedActionActionImpl(stagedAction);
    }

    /**
     * factory method for an instance of OrderEditAddStagedActionActionBuilder
     * @return builder
     */
    public static OrderEditAddStagedActionActionBuilder of() {
        return new OrderEditAddStagedActionActionBuilder();
    }

    /**
     * create builder for OrderEditAddStagedActionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditAddStagedActionActionBuilder of(final OrderEditAddStagedActionAction template) {
        OrderEditAddStagedActionActionBuilder builder = new OrderEditAddStagedActionActionBuilder();
        builder.stagedAction = template.getStagedAction();
        return builder;
    }

}
