
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
     * set the value to the version
     * @param version value to be set
     * @return Builder
     */

    public OrderEditUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     * set values to the actions
     * @param actions value to be set
     * @return Builder
     */

    public OrderEditUpdateBuilder actions(
            final com.commercetools.api.models.order_edit.OrderEditUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     * set value to the actions
     * @param actions value to be set
     * @return Builder
     */

    public OrderEditUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.order_edit.OrderEditUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * add values to the actions
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
     * add a value to the actions using the builder function
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
     * set the value to the actions using the builder function
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
     * set the value to the dryRun
     * @param dryRun value to be set
     * @return Builder
     */

    public OrderEditUpdateBuilder dryRun(@Nullable final Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * value of version}
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     * value of actions}
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.order_edit.OrderEditUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * value of dryRun}
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
