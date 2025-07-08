
package com.commercetools.api.models.recurring_order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderUpdate recurringOrderUpdate = RecurringOrderUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderUpdateBuilder implements Builder<RecurringOrderUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.recurring_order.RecurringOrderUpdateAction> actions;

    /**
     *  <p>Expected version of the RecurringOrder on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public RecurringOrderUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the RecurringOrder.</p>
     * @param actions value to be set
     * @return Builder
     */

    public RecurringOrderUpdateBuilder actions(
            final com.commercetools.api.models.recurring_order.RecurringOrderUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the RecurringOrder.</p>
     * @param actions value to be set
     * @return Builder
     */

    public RecurringOrderUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.recurring_order.RecurringOrderUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the RecurringOrder.</p>
     * @param actions value to be set
     * @return Builder
     */

    public RecurringOrderUpdateBuilder plusActions(
            final com.commercetools.api.models.recurring_order.RecurringOrderUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the RecurringOrder.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public RecurringOrderUpdateBuilder plusActions(
            Function<com.commercetools.api.models.recurring_order.RecurringOrderUpdateActionBuilder, Builder<? extends com.commercetools.api.models.recurring_order.RecurringOrderUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(
            builder.apply(com.commercetools.api.models.recurring_order.RecurringOrderUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the RecurringOrder.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public RecurringOrderUpdateBuilder withActions(
            Function<com.commercetools.api.models.recurring_order.RecurringOrderUpdateActionBuilder, Builder<? extends com.commercetools.api.models.recurring_order.RecurringOrderUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(
            builder.apply(com.commercetools.api.models.recurring_order.RecurringOrderUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Expected version of the RecurringOrder on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the RecurringOrder.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.recurring_order.RecurringOrderUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds RecurringOrderUpdate with checking for non-null required values
     * @return RecurringOrderUpdate
     */
    public RecurringOrderUpdate build() {
        Objects.requireNonNull(version, RecurringOrderUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, RecurringOrderUpdate.class + ": actions is missing");
        return new RecurringOrderUpdateImpl(version, actions);
    }

    /**
     * builds RecurringOrderUpdate without checking for non-null required values
     * @return RecurringOrderUpdate
     */
    public RecurringOrderUpdate buildUnchecked() {
        return new RecurringOrderUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of RecurringOrderUpdateBuilder
     * @return builder
     */
    public static RecurringOrderUpdateBuilder of() {
        return new RecurringOrderUpdateBuilder();
    }

    /**
     * create builder for RecurringOrderUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderUpdateBuilder of(final RecurringOrderUpdate template) {
        RecurringOrderUpdateBuilder builder = new RecurringOrderUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
