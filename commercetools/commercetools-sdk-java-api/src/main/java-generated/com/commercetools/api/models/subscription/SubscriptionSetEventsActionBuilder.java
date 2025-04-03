
package com.commercetools.api.models.subscription;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SubscriptionSetEventsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SubscriptionSetEventsAction subscriptionSetEventsAction = SubscriptionSetEventsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SubscriptionSetEventsActionBuilder implements Builder<SubscriptionSetEventsAction> {

    @Nullable
    private java.util.List<com.commercetools.api.models.subscription.EventSubscription> messages;

    /**
     *  <p>Value to set. Can only be unset if either <code>messages</code> or <code>changes</code> is set.</p>
     * @param messages value to be set
     * @return Builder
     */

    public SubscriptionSetEventsActionBuilder messages(
            @Nullable final com.commercetools.api.models.subscription.EventSubscription... messages) {
        this.messages = new ArrayList<>(Arrays.asList(messages));
        return this;
    }

    /**
     *  <p>Value to set. Can only be unset if either <code>messages</code> or <code>changes</code> is set.</p>
     * @param messages value to be set
     * @return Builder
     */

    public SubscriptionSetEventsActionBuilder messages(
            @Nullable final java.util.List<com.commercetools.api.models.subscription.EventSubscription> messages) {
        this.messages = messages;
        return this;
    }

    /**
     *  <p>Value to set. Can only be unset if either <code>messages</code> or <code>changes</code> is set.</p>
     * @param messages value to be set
     * @return Builder
     */

    public SubscriptionSetEventsActionBuilder plusMessages(
            @Nullable final com.commercetools.api.models.subscription.EventSubscription... messages) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages.addAll(Arrays.asList(messages));
        return this;
    }

    /**
     *  <p>Value to set. Can only be unset if either <code>messages</code> or <code>changes</code> is set.</p>
     * @param builder function to build the messages value
     * @return Builder
     */

    public SubscriptionSetEventsActionBuilder plusMessages(
            Function<com.commercetools.api.models.subscription.EventSubscriptionBuilder, com.commercetools.api.models.subscription.EventSubscriptionBuilder> builder) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages
                .add(builder.apply(com.commercetools.api.models.subscription.EventSubscriptionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value to set. Can only be unset if either <code>messages</code> or <code>changes</code> is set.</p>
     * @param builder function to build the messages value
     * @return Builder
     */

    public SubscriptionSetEventsActionBuilder withMessages(
            Function<com.commercetools.api.models.subscription.EventSubscriptionBuilder, com.commercetools.api.models.subscription.EventSubscriptionBuilder> builder) {
        this.messages = new ArrayList<>();
        this.messages
                .add(builder.apply(com.commercetools.api.models.subscription.EventSubscriptionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value to set. Can only be unset if either <code>messages</code> or <code>changes</code> is set.</p>
     * @param builder function to build the messages value
     * @return Builder
     */

    public SubscriptionSetEventsActionBuilder addMessages(
            Function<com.commercetools.api.models.subscription.EventSubscriptionBuilder, com.commercetools.api.models.subscription.EventSubscription> builder) {
        return plusMessages(builder.apply(com.commercetools.api.models.subscription.EventSubscriptionBuilder.of()));
    }

    /**
     *  <p>Value to set. Can only be unset if either <code>messages</code> or <code>changes</code> is set.</p>
     * @param builder function to build the messages value
     * @return Builder
     */

    public SubscriptionSetEventsActionBuilder setMessages(
            Function<com.commercetools.api.models.subscription.EventSubscriptionBuilder, com.commercetools.api.models.subscription.EventSubscription> builder) {
        return messages(builder.apply(com.commercetools.api.models.subscription.EventSubscriptionBuilder.of()));
    }

    /**
     *  <p>Value to set. Can only be unset if either <code>messages</code> or <code>changes</code> is set.</p>
     * @return messages
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.subscription.EventSubscription> getMessages() {
        return this.messages;
    }

    /**
     * builds SubscriptionSetEventsAction with checking for non-null required values
     * @return SubscriptionSetEventsAction
     */
    public SubscriptionSetEventsAction build() {
        return new SubscriptionSetEventsActionImpl(messages);
    }

    /**
     * builds SubscriptionSetEventsAction without checking for non-null required values
     * @return SubscriptionSetEventsAction
     */
    public SubscriptionSetEventsAction buildUnchecked() {
        return new SubscriptionSetEventsActionImpl(messages);
    }

    /**
     * factory method for an instance of SubscriptionSetEventsActionBuilder
     * @return builder
     */
    public static SubscriptionSetEventsActionBuilder of() {
        return new SubscriptionSetEventsActionBuilder();
    }

    /**
     * create builder for SubscriptionSetEventsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SubscriptionSetEventsActionBuilder of(final SubscriptionSetEventsAction template) {
        SubscriptionSetEventsActionBuilder builder = new SubscriptionSetEventsActionBuilder();
        builder.messages = template.getMessages();
        return builder;
    }

}
