
package com.commercetools.api.models.subscription;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SubscriptionSetMessagesActionBuilder {

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

    @Nullable
    public java.util.List<com.commercetools.api.models.subscription.MessageSubscription> getMessages() {
        return this.messages;
    }

    public SubscriptionSetMessagesAction build() {
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
