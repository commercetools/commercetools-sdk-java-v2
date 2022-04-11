
package com.commercetools.api.models.subscription;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class SubscriptionDraftBuilder implements Builder<SubscriptionDraft> {

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

    public SubscriptionDraftBuilder plusChanges(
            @Nullable final com.commercetools.api.models.subscription.ChangeSubscription... changes) {
        if (this.changes == null) {
            this.changes = new ArrayList<>();
        }
        this.changes.addAll(Arrays.asList(changes));
        return this;
    }

    public SubscriptionDraftBuilder plusChanges(
            Function<com.commercetools.api.models.subscription.ChangeSubscriptionBuilder, com.commercetools.api.models.subscription.ChangeSubscriptionBuilder> builder) {
        if (this.changes == null) {
            this.changes = new ArrayList<>();
        }
        this.changes
                .add(builder.apply(com.commercetools.api.models.subscription.ChangeSubscriptionBuilder.of()).build());
        return this;
    }

    public SubscriptionDraftBuilder withChanges(
            Function<com.commercetools.api.models.subscription.ChangeSubscriptionBuilder, com.commercetools.api.models.subscription.ChangeSubscriptionBuilder> builder) {
        this.changes = new ArrayList<>();
        this.changes
                .add(builder.apply(com.commercetools.api.models.subscription.ChangeSubscriptionBuilder.of()).build());
        return this;
    }

    public SubscriptionDraftBuilder destination(
            final com.commercetools.api.models.subscription.Destination destination) {
        this.destination = destination;
        return this;
    }

    public SubscriptionDraftBuilder destination(
            Function<com.commercetools.api.models.subscription.DestinationBuilder, Builder<? extends com.commercetools.api.models.subscription.Destination>> builder) {
        this.destination = builder.apply(com.commercetools.api.models.subscription.DestinationBuilder.of()).build();
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

    public SubscriptionDraftBuilder plusMessages(
            @Nullable final com.commercetools.api.models.subscription.MessageSubscription... messages) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages.addAll(Arrays.asList(messages));
        return this;
    }

    public SubscriptionDraftBuilder plusMessages(
            Function<com.commercetools.api.models.subscription.MessageSubscriptionBuilder, com.commercetools.api.models.subscription.MessageSubscriptionBuilder> builder) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages
                .add(builder.apply(com.commercetools.api.models.subscription.MessageSubscriptionBuilder.of()).build());
        return this;
    }

    public SubscriptionDraftBuilder withMessages(
            Function<com.commercetools.api.models.subscription.MessageSubscriptionBuilder, com.commercetools.api.models.subscription.MessageSubscriptionBuilder> builder) {
        this.messages = new ArrayList<>();
        this.messages
                .add(builder.apply(com.commercetools.api.models.subscription.MessageSubscriptionBuilder.of()).build());
        return this;
    }

    public SubscriptionDraftBuilder format(
            @Nullable final com.commercetools.api.models.subscription.DeliveryFormat format) {
        this.format = format;
        return this;
    }

    public SubscriptionDraftBuilder format(
            Function<com.commercetools.api.models.subscription.DeliveryFormatBuilder, Builder<? extends com.commercetools.api.models.subscription.DeliveryFormat>> builder) {
        this.format = builder.apply(com.commercetools.api.models.subscription.DeliveryFormatBuilder.of()).build();
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
        Objects.requireNonNull(destination, SubscriptionDraft.class + ": destination is missing");
        return new SubscriptionDraftImpl(changes, destination, key, messages, format);
    }

    /**
     * builds SubscriptionDraft without checking for non null required values
     */
    public SubscriptionDraft buildUnchecked() {
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
