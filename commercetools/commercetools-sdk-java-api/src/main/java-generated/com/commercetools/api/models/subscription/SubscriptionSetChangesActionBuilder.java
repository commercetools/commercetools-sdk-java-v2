
package com.commercetools.api.models.subscription;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SubscriptionSetChangesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SubscriptionSetChangesAction subscriptionSetChangesAction = SubscriptionSetChangesAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SubscriptionSetChangesActionBuilder implements Builder<SubscriptionSetChangesAction> {

    @Nullable
    private java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> changes;

    /**
     *  <p>Value to set. Can only be unset if either <code>messages</code> or <code>events</code> is set.</p>
     * @param changes value to be set
     * @return Builder
     */

    public SubscriptionSetChangesActionBuilder changes(
            @Nullable final com.commercetools.api.models.subscription.ChangeSubscription... changes) {
        this.changes = new ArrayList<>(Arrays.asList(changes));
        return this;
    }

    /**
     *  <p>Value to set. Can only be unset if either <code>messages</code> or <code>events</code> is set.</p>
     * @param changes value to be set
     * @return Builder
     */

    public SubscriptionSetChangesActionBuilder changes(
            @Nullable final java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> changes) {
        this.changes = changes;
        return this;
    }

    /**
     *  <p>Value to set. Can only be unset if either <code>messages</code> or <code>events</code> is set.</p>
     * @param changes value to be set
     * @return Builder
     */

    public SubscriptionSetChangesActionBuilder plusChanges(
            @Nullable final com.commercetools.api.models.subscription.ChangeSubscription... changes) {
        if (this.changes == null) {
            this.changes = new ArrayList<>();
        }
        this.changes.addAll(Arrays.asList(changes));
        return this;
    }

    /**
     *  <p>Value to set. Can only be unset if either <code>messages</code> or <code>events</code> is set.</p>
     * @param builder function to build the changes value
     * @return Builder
     */

    public SubscriptionSetChangesActionBuilder plusChanges(
            Function<com.commercetools.api.models.subscription.ChangeSubscriptionBuilder, com.commercetools.api.models.subscription.ChangeSubscriptionBuilder> builder) {
        if (this.changes == null) {
            this.changes = new ArrayList<>();
        }
        this.changes
                .add(builder.apply(com.commercetools.api.models.subscription.ChangeSubscriptionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value to set. Can only be unset if either <code>messages</code> or <code>events</code> is set.</p>
     * @param builder function to build the changes value
     * @return Builder
     */

    public SubscriptionSetChangesActionBuilder withChanges(
            Function<com.commercetools.api.models.subscription.ChangeSubscriptionBuilder, com.commercetools.api.models.subscription.ChangeSubscriptionBuilder> builder) {
        this.changes = new ArrayList<>();
        this.changes
                .add(builder.apply(com.commercetools.api.models.subscription.ChangeSubscriptionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value to set. Can only be unset if either <code>messages</code> or <code>events</code> is set.</p>
     * @param builder function to build the changes value
     * @return Builder
     */

    public SubscriptionSetChangesActionBuilder addChanges(
            Function<com.commercetools.api.models.subscription.ChangeSubscriptionBuilder, com.commercetools.api.models.subscription.ChangeSubscription> builder) {
        return plusChanges(builder.apply(com.commercetools.api.models.subscription.ChangeSubscriptionBuilder.of()));
    }

    /**
     *  <p>Value to set. Can only be unset if either <code>messages</code> or <code>events</code> is set.</p>
     * @param builder function to build the changes value
     * @return Builder
     */

    public SubscriptionSetChangesActionBuilder setChanges(
            Function<com.commercetools.api.models.subscription.ChangeSubscriptionBuilder, com.commercetools.api.models.subscription.ChangeSubscription> builder) {
        return changes(builder.apply(com.commercetools.api.models.subscription.ChangeSubscriptionBuilder.of()));
    }

    /**
     *  <p>Value to set. Can only be unset if either <code>messages</code> or <code>events</code> is set.</p>
     * @return changes
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> getChanges() {
        return this.changes;
    }

    /**
     * builds SubscriptionSetChangesAction with checking for non-null required values
     * @return SubscriptionSetChangesAction
     */
    public SubscriptionSetChangesAction build() {
        return new SubscriptionSetChangesActionImpl(changes);
    }

    /**
     * builds SubscriptionSetChangesAction without checking for non-null required values
     * @return SubscriptionSetChangesAction
     */
    public SubscriptionSetChangesAction buildUnchecked() {
        return new SubscriptionSetChangesActionImpl(changes);
    }

    /**
     * factory method for an instance of SubscriptionSetChangesActionBuilder
     * @return builder
     */
    public static SubscriptionSetChangesActionBuilder of() {
        return new SubscriptionSetChangesActionBuilder();
    }

    /**
     * create builder for SubscriptionSetChangesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SubscriptionSetChangesActionBuilder of(final SubscriptionSetChangesAction template) {
        SubscriptionSetChangesActionBuilder builder = new SubscriptionSetChangesActionBuilder();
        builder.changes = template.getChanges();
        return builder;
    }

}
