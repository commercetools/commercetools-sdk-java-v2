
package com.commercetools.api.models.subscription;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class SubscriptionSetMessagesActionBuilder implements Builder<SubscriptionSetMessagesAction> {

    @Nullable
    private java.util.List<com.commercetools.api.models.subscription.MessageSubscription> messages;

    public SubscriptionSetMessagesActionBuilder messages(
            @Nullable final com.commercetools.api.models.subscription.MessageSubscription... messages) {
        this.messages = new ArrayList<>(Arrays.asList(messages));
        return this;
    }

    public SubscriptionSetMessagesActionBuilder messages(
            @Nullable final java.util.List<com.commercetools.api.models.subscription.MessageSubscription> messages) {
        this.messages = messages;
        return this;
    }

    public SubscriptionSetMessagesActionBuilder plusMessages(
            @Nullable final com.commercetools.api.models.subscription.MessageSubscription... messages) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages.addAll(Arrays.asList(messages));
        return this;
    }

    public SubscriptionSetMessagesActionBuilder plusMessages(
            Function<com.commercetools.api.models.subscription.MessageSubscriptionBuilder, com.commercetools.api.models.subscription.MessageSubscriptionBuilder> builder) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages
                .add(builder.apply(com.commercetools.api.models.subscription.MessageSubscriptionBuilder.of()).build());
        return this;
    }

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
