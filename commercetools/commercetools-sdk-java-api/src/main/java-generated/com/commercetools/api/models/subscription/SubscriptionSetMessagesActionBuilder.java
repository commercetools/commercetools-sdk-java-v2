
package com.commercetools.api.models.subscription;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SubscriptionSetMessagesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SubscriptionSetMessagesAction subscriptionSetMessagesAction = SubscriptionSetMessagesAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SubscriptionSetMessagesActionBuilder implements Builder<SubscriptionSetMessagesAction> {

    @Nullable
    private java.util.List<com.commercetools.api.models.subscription.MessageSubscription> messages;

    /**
     *  <p>Value to set. Can only be unset if <code>changes</code> is set.</p>
     */

    public SubscriptionSetMessagesActionBuilder messages(
            @Nullable final com.commercetools.api.models.subscription.MessageSubscription... messages) {
        this.messages = new ArrayList<>(Arrays.asList(messages));
        return this;
    }

    /**
     *  <p>Value to set. Can only be unset if <code>changes</code> is set.</p>
     */

    public SubscriptionSetMessagesActionBuilder messages(
            @Nullable final java.util.List<com.commercetools.api.models.subscription.MessageSubscription> messages) {
        this.messages = messages;
        return this;
    }

    /**
     *  <p>Value to set. Can only be unset if <code>changes</code> is set.</p>
     */

    public SubscriptionSetMessagesActionBuilder plusMessages(
            @Nullable final com.commercetools.api.models.subscription.MessageSubscription... messages) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages.addAll(Arrays.asList(messages));
        return this;
    }

    /**
     *  <p>Value to set. Can only be unset if <code>changes</code> is set.</p>
     */

    public SubscriptionSetMessagesActionBuilder plusMessages(
            Function<com.commercetools.api.models.subscription.MessageSubscriptionBuilder, com.commercetools.api.models.subscription.MessageSubscriptionBuilder> builder) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages
                .add(builder.apply(com.commercetools.api.models.subscription.MessageSubscriptionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value to set. Can only be unset if <code>changes</code> is set.</p>
     */

    public SubscriptionSetMessagesActionBuilder withMessages(
            Function<com.commercetools.api.models.subscription.MessageSubscriptionBuilder, com.commercetools.api.models.subscription.MessageSubscriptionBuilder> builder) {
        this.messages = new ArrayList<>();
        this.messages
                .add(builder.apply(com.commercetools.api.models.subscription.MessageSubscriptionBuilder.of()).build());
        return this;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.subscription.MessageSubscription> getMessages() {
        return this.messages;
    }

    public SubscriptionSetMessagesAction build() {
        return new SubscriptionSetMessagesActionImpl(messages);
    }

    /**
     * builds SubscriptionSetMessagesAction without checking for non null required values
     */
    public SubscriptionSetMessagesAction buildUnchecked() {
        return new SubscriptionSetMessagesActionImpl(messages);
    }

    public static SubscriptionSetMessagesActionBuilder of() {
        return new SubscriptionSetMessagesActionBuilder();
    }

    public static SubscriptionSetMessagesActionBuilder of(final SubscriptionSetMessagesAction template) {
        SubscriptionSetMessagesActionBuilder builder = new SubscriptionSetMessagesActionBuilder();
        builder.messages = template.getMessages();
        return builder;
    }

}
