
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditUpdate orderEditUpdate = OrderEditUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderEditUpdateBuilder implements Builder<OrderEditUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.order_edit.OrderEditUpdateAction> actions;

    @Nullable
    private Boolean dryRun;

    /**
     *  <p>Expected version of the Order Edit on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public OrderEditUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Order Edit.</p>
     * @param actions value to be set
     * @return Builder
     */

    public OrderEditUpdateBuilder actions(
            final com.commercetools.api.models.order_edit.OrderEditUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Order Edit.</p>
     * @param actions value to be set
     * @return Builder
     */

    public OrderEditUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.order_edit.OrderEditUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Order Edit.</p>
     * @param actions value to be set
     * @return Builder
     */

    public OrderEditUpdateBuilder plusActions(
            final com.commercetools.api.models.order_edit.OrderEditUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Order Edit.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public OrderEditUpdateBuilder plusActions(
            Function<com.commercetools.api.models.order_edit.OrderEditUpdateActionBuilder, Builder<? extends com.commercetools.api.models.order_edit.OrderEditUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions
                .add(builder.apply(com.commercetools.api.models.order_edit.OrderEditUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Order Edit.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public OrderEditUpdateBuilder withActions(
            Function<com.commercetools.api.models.order_edit.OrderEditUpdateActionBuilder, Builder<? extends com.commercetools.api.models.order_edit.OrderEditUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions
                .add(builder.apply(com.commercetools.api.models.order_edit.OrderEditUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>If set to <code>true</code>, the Order Edit is applied on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> without persisting it.</p>
     * @param dryRun value to be set
     * @return Builder
     */

    public OrderEditUpdateBuilder dryRun(@Nullable final Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     *  <p>Expected version of the Order Edit on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the Order Edit.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.order_edit.OrderEditUpdateAction> getActions() {
        return this.actions;
    }

    /**
     *  <p>If set to <code>true</code>, the Order Edit is applied on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> without persisting it.</p>
     * @return dryRun
     */

    @Nullable
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * builds OrderEditUpdate with checking for non-null required values
     * @return OrderEditUpdate
     */
    public OrderEditUpdate build() {
        Objects.requireNonNull(version, OrderEditUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, OrderEditUpdate.class + ": actions is missing");
        return new OrderEditUpdateImpl(version, actions, dryRun);
    }

    /**
     * builds OrderEditUpdate without checking for non-null required values
     * @return OrderEditUpdate
     */
    public OrderEditUpdate buildUnchecked() {
        return new OrderEditUpdateImpl(version, actions, dryRun);
    }

    /**
     * factory method for an instance of OrderEditUpdateBuilder
     * @return builder
     */
    public static OrderEditUpdateBuilder of() {
        return new OrderEditUpdateBuilder();
    }

    /**
     * create builder for OrderEditUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditUpdateBuilder of(final OrderEditUpdate template) {
        OrderEditUpdateBuilder builder = new OrderEditUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        builder.dryRun = template.getDryRun();
        return builder;
    }

}
