
package com.commercetools.api.models.subscription;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SubscriptionDraftBuilder {

    @Nullable
    private java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> changes;

    private com.commercetools.api.models.subscription.Destination destination;

    @Nullable
    private String key;

    @Nullable
    private java.util.List<com.commercetools.api.models.subscription.MessageSubscription> messages;

    @Nullable
    private com.commercetools.api.models.subscription.DeliveryFormat format;

    public SubscriptionDraftBuilder changes(
            @Nullable final com.commercetools.api.models.subscription.ChangeSubscription... changes) {
        this.changes = new ArrayList<>(Arrays.asList(changes));
        return this;
    }

    public SubscriptionDraftBuilder changes(
            @Nullable final java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> changes) {
        this.changes = changes;
        return this;
    }

    public SubscriptionDraftBuilder destination(
            final com.commercetools.api.models.subscription.Destination destination) {
        this.destination = destination;
        return this;
    }

    public SubscriptionDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public SubscriptionDraftBuilder messages(
            @Nullable final com.commercetools.api.models.subscription.MessageSubscription... messages) {
        this.messages = new ArrayList<>(Arrays.asList(messages));
        return this;
    }

    public SubscriptionDraftBuilder messages(
            @Nullable final java.util.List<com.commercetools.api.models.subscription.MessageSubscription> messages) {
        this.messages = messages;
        return this;
    }

    public SubscriptionDraftBuilder format(
            @Nullable final com.commercetools.api.models.subscription.DeliveryFormat format) {
        this.format = format;
        return this;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> getChanges() {
        return this.changes;
    }

    public com.commercetools.api.models.subscription.Destination getDestination() {
        return this.destination;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.subscription.MessageSubscription> getMessages() {
        return this.messages;
    }

    @Nullable
    public com.commercetools.api.models.subscription.DeliveryFormat getFormat() {
        return this.format;
    }

    public SubscriptionDraft build() {
        return new SubscriptionDraftImpl(changes, destination, key, messages, format);
    }

    public static SubscriptionDraftBuilder of() {
        return new SubscriptionDraftBuilder();
    }

    public static SubscriptionDraftBuilder of(final SubscriptionDraft template) {
        SubscriptionDraftBuilder builder = new SubscriptionDraftBuilder();
        builder.changes = template.getChanges();
        builder.destination = template.getDestination();
        builder.key = template.getKey();
        builder.messages = template.getMessages();
        builder.format = template.getFormat();
        return builder;
    }

}
