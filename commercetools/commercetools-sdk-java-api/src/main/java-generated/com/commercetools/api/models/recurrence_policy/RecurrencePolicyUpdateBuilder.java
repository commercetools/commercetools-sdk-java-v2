
package com.commercetools.api.models.recurrence_policy;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurrencePolicyUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurrencePolicyUpdate recurrencePolicyUpdate = RecurrencePolicyUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurrencePolicyUpdateBuilder implements Builder<RecurrencePolicyUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.recurrence_policy.RecurrencePolicyUpdateAction> actions;

    /**
     *  <p>Expected version of the RecurrencePolicy on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public RecurrencePolicyUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the RecurrencePolicy.</p>
     * @param actions value to be set
     * @return Builder
     */

    public RecurrencePolicyUpdateBuilder actions(
            final com.commercetools.api.models.recurrence_policy.RecurrencePolicyUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the RecurrencePolicy.</p>
     * @param actions value to be set
     * @return Builder
     */

    public RecurrencePolicyUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.recurrence_policy.RecurrencePolicyUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the RecurrencePolicy.</p>
     * @param actions value to be set
     * @return Builder
     */

    public RecurrencePolicyUpdateBuilder plusActions(
            final com.commercetools.api.models.recurrence_policy.RecurrencePolicyUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the RecurrencePolicy.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public RecurrencePolicyUpdateBuilder plusActions(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyUpdateActionBuilder, Builder<? extends com.commercetools.api.models.recurrence_policy.RecurrencePolicyUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(
            builder.apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyUpdateActionBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the RecurrencePolicy.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public RecurrencePolicyUpdateBuilder withActions(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyUpdateActionBuilder, Builder<? extends com.commercetools.api.models.recurrence_policy.RecurrencePolicyUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(
            builder.apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyUpdateActionBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Expected version of the RecurrencePolicy on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the RecurrencePolicy.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.recurrence_policy.RecurrencePolicyUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds RecurrencePolicyUpdate with checking for non-null required values
     * @return RecurrencePolicyUpdate
     */
    public RecurrencePolicyUpdate build() {
        Objects.requireNonNull(version, RecurrencePolicyUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, RecurrencePolicyUpdate.class + ": actions is missing");
        return new RecurrencePolicyUpdateImpl(version, actions);
    }

    /**
     * builds RecurrencePolicyUpdate without checking for non-null required values
     * @return RecurrencePolicyUpdate
     */
    public RecurrencePolicyUpdate buildUnchecked() {
        return new RecurrencePolicyUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of RecurrencePolicyUpdateBuilder
     * @return builder
     */
    public static RecurrencePolicyUpdateBuilder of() {
        return new RecurrencePolicyUpdateBuilder();
    }

    /**
     * create builder for RecurrencePolicyUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurrencePolicyUpdateBuilder of(final RecurrencePolicyUpdate template) {
        RecurrencePolicyUpdateBuilder builder = new RecurrencePolicyUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
