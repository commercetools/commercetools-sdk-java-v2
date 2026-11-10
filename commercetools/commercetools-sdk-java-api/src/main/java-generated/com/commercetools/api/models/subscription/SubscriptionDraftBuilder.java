
package com.commercetools.api.models.subscription;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SubscriptionDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SubscriptionDraft subscriptionDraft = SubscriptionDraft.builder()
 *             .destination(destinationBuilder -> destinationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SubscriptionDraftBuilder implements Builder<SubscriptionDraft> {

    private com.commercetools.api.models.subscription.Destination destination;

    @Nullable
    private String key;

    @Nullable
    private java.util.List<com.commercetools.api.models.subscription.MessageSubscription> messages;

    @Nullable
    private java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> changes;

    @Nullable
    private java.util.List<com.commercetools.api.models.subscription.EventSubscription> events;

    @Nullable
    private com.commercetools.api.models.subscription.DeliveryFormat format;

    /**
     *  <p>Messaging service to which the notifications are sent.</p>
     * @param destination value to be set
     * @return Builder
     */

    public SubscriptionDraftBuilder destination(
            final com.commercetools.api.models.subscription.Destination destination) {
        this.destination = destination;
        return this;
    }

    /**
     *  <p>Messaging service to which the notifications are sent.</p>
     * @param builder function to build the destination value
     * @return Builder
     */

    public SubscriptionDraftBuilder destination(
            Function<com.commercetools.api.models.subscription.DestinationBuilder, Builder<? extends com.commercetools.api.models.subscription.Destination>> builder) {
        this.destination = builder.apply(com.commercetools.api.models.subscription.DestinationBuilder.of()).build();
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the Subscription.</p>
     * @param key value to be set
     * @return Builder
     */

    public SubscriptionDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Messages to be subscribed to.</p>
     * @param messages value to be set
     * @return Builder
     */

    public SubscriptionDraftBuilder messages(
            @Nullable final com.commercetools.api.models.subscription.MessageSubscription... messages) {
        this.messages = new ArrayList<>(Arrays.asList(messages));
        return this;
    }

    /**
     *  <p>Messages to be subscribed to.</p>
     * @param messages value to be set
     * @return Builder
     */

    public SubscriptionDraftBuilder messages(
            @Nullable final java.util.List<com.commercetools.api.models.subscription.MessageSubscription> messages) {
        this.messages = messages;
        return this;
    }

    /**
     *  <p>Messages to be subscribed to.</p>
     * @param messages value to be set
     * @return Builder
     */

    public SubscriptionDraftBuilder plusMessages(
            @Nullable final com.commercetools.api.models.subscription.MessageSubscription... messages) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages.addAll(Arrays.asList(messages));
        return this;
    }

    /**
     *  <p>Messages to be subscribed to.</p>
     * @param builder function to build the messages value
     * @return Builder
     */

    public SubscriptionDraftBuilder plusMessages(
            Function<com.commercetools.api.models.subscription.MessageSubscriptionBuilder, com.commercetools.api.models.subscription.MessageSubscriptionBuilder> builder) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages
                .add(builder.apply(com.commercetools.api.models.subscription.MessageSubscriptionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Messages to be subscribed to.</p>
     * @param builder function to build the messages value
     * @return Builder
     */

    public SubscriptionDraftBuilder withMessages(
            Function<com.commercetools.api.models.subscription.MessageSubscriptionBuilder, com.commercetools.api.models.subscription.MessageSubscriptionBuilder> builder) {
        this.messages = new ArrayList<>();
        this.messages
                .add(builder.apply(com.commercetools.api.models.subscription.MessageSubscriptionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Messages to be subscribed to.</p>
     * @param builder function to build the messages value
     * @return Builder
     */

    public SubscriptionDraftBuilder addMessages(
            Function<com.commercetools.api.models.subscription.MessageSubscriptionBuilder, com.commercetools.api.models.subscription.MessageSubscription> builder) {
        return plusMessages(builder.apply(com.commercetools.api.models.subscription.MessageSubscriptionBuilder.of()));
    }

    /**
     *  <p>Messages to be subscribed to.</p>
     * @param builder function to build the messages value
     * @return Builder
     */

    public SubscriptionDraftBuilder setMessages(
            Function<com.commercetools.api.models.subscription.MessageSubscriptionBuilder, com.commercetools.api.models.subscription.MessageSubscription> builder) {
        return messages(builder.apply(com.commercetools.api.models.subscription.MessageSubscriptionBuilder.of()));
    }

    /**
     *  <p>Changes to be subscribed to.</p>
     * @param changes value to be set
     * @return Builder
     */

    public SubscriptionDraftBuilder changes(
            @Nullable final com.commercetools.api.models.subscription.ChangeSubscription... changes) {
        this.changes = new ArrayList<>(Arrays.asList(changes));
        return this;
    }

    /**
     *  <p>Changes to be subscribed to.</p>
     * @param changes value to be set
     * @return Builder
     */

    public SubscriptionDraftBuilder changes(
            @Nullable final java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> changes) {
        this.changes = changes;
        return this;
    }

    /**
     *  <p>Changes to be subscribed to.</p>
     * @param changes value to be set
     * @return Builder
     */

    public SubscriptionDraftBuilder plusChanges(
            @Nullable final com.commercetools.api.models.subscription.ChangeSubscription... changes) {
        if (this.changes == null) {
            this.changes = new ArrayList<>();
        }
        this.changes.addAll(Arrays.asList(changes));
        return this;
    }

    /**
     *  <p>Changes to be subscribed to.</p>
     * @param builder function to build the changes value
     * @return Builder
     */

    public SubscriptionDraftBuilder plusChanges(
            Function<com.commercetools.api.models.subscription.ChangeSubscriptionBuilder, com.commercetools.api.models.subscription.ChangeSubscriptionBuilder> builder) {
        if (this.changes == null) {
            this.changes = new ArrayList<>();
        }
        this.changes
                .add(builder.apply(com.commercetools.api.models.subscription.ChangeSubscriptionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Changes to be subscribed to.</p>
     * @param builder function to build the changes value
     * @return Builder
     */

    public SubscriptionDraftBuilder withChanges(
            Function<com.commercetools.api.models.subscription.ChangeSubscriptionBuilder, com.commercetools.api.models.subscription.ChangeSubscriptionBuilder> builder) {
        this.changes = new ArrayList<>();
        this.changes
                .add(builder.apply(com.commercetools.api.models.subscription.ChangeSubscriptionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Changes to be subscribed to.</p>
     * @param builder function to build the changes value
     * @return Builder
     */

    public SubscriptionDraftBuilder addChanges(
            Function<com.commercetools.api.models.subscription.ChangeSubscriptionBuilder, com.commercetools.api.models.subscription.ChangeSubscription> builder) {
        return plusChanges(builder.apply(com.commercetools.api.models.subscription.ChangeSubscriptionBuilder.of()));
    }

    /**
     *  <p>Changes to be subscribed to.</p>
     * @param builder function to build the changes value
     * @return Builder
     */

    public SubscriptionDraftBuilder setChanges(
            Function<com.commercetools.api.models.subscription.ChangeSubscriptionBuilder, com.commercetools.api.models.subscription.ChangeSubscription> builder) {
        return changes(builder.apply(com.commercetools.api.models.subscription.ChangeSubscriptionBuilder.of()));
    }

    /**
     *  <p>Events to be subscribed to.</p>
     * @param events value to be set
     * @return Builder
     */

    public SubscriptionDraftBuilder events(
            @Nullable final com.commercetools.api.models.subscription.EventSubscription... events) {
        this.events = new ArrayList<>(Arrays.asList(events));
        return this;
    }

    /**
     *  <p>Events to be subscribed to.</p>
     * @param events value to be set
     * @return Builder
     */

    public SubscriptionDraftBuilder events(
            @Nullable final java.util.List<com.commercetools.api.models.subscription.EventSubscription> events) {
        this.events = events;
        return this;
    }

    /**
     *  <p>Events to be subscribed to.</p>
     * @param events value to be set
     * @return Builder
     */

    public SubscriptionDraftBuilder plusEvents(
            @Nullable final com.commercetools.api.models.subscription.EventSubscription... events) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.addAll(Arrays.asList(events));
        return this;
    }

    /**
     *  <p>Events to be subscribed to.</p>
     * @param builder function to build the events value
     * @return Builder
     */

    public SubscriptionDraftBuilder plusEvents(
            Function<com.commercetools.api.models.subscription.EventSubscriptionBuilder, com.commercetools.api.models.subscription.EventSubscriptionBuilder> builder) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(builder.apply(com.commercetools.api.models.subscription.EventSubscriptionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Events to be subscribed to.</p>
     * @param builder function to build the events value
     * @return Builder
     */

    public SubscriptionDraftBuilder withEvents(
            Function<com.commercetools.api.models.subscription.EventSubscriptionBuilder, com.commercetools.api.models.subscription.EventSubscriptionBuilder> builder) {
        this.events = new ArrayList<>();
        this.events.add(builder.apply(com.commercetools.api.models.subscription.EventSubscriptionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Events to be subscribed to.</p>
     * @param builder function to build the events value
     * @return Builder
     */

    public SubscriptionDraftBuilder addEvents(
            Function<com.commercetools.api.models.subscription.EventSubscriptionBuilder, com.commercetools.api.models.subscription.EventSubscription> builder) {
        return plusEvents(builder.apply(com.commercetools.api.models.subscription.EventSubscriptionBuilder.of()));
    }

    /**
     *  <p>Events to be subscribed to.</p>
     * @param builder function to build the events value
     * @return Builder
     */

    public SubscriptionDraftBuilder setEvents(
            Function<com.commercetools.api.models.subscription.EventSubscriptionBuilder, com.commercetools.api.models.subscription.EventSubscription> builder) {
        return events(builder.apply(com.commercetools.api.models.subscription.EventSubscriptionBuilder.of()));
    }

    /**
     *  <p>Format in which the payload is delivered. When not provided, the <a href="https://docs.commercetools.com/apis/ctp:api:type:PlatformFormat" rel="nofollow">PlatformFormat</a> is selected by default.</p>
     * @param format value to be set
     * @return Builder
     */

    public SubscriptionDraftBuilder format(
            @Nullable final com.commercetools.api.models.subscription.DeliveryFormat format) {
        this.format = format;
        return this;
    }

    /**
     *  <p>Format in which the payload is delivered. When not provided, the <a href="https://docs.commercetools.com/apis/ctp:api:type:PlatformFormat" rel="nofollow">PlatformFormat</a> is selected by default.</p>
     * @param builder function to build the format value
     * @return Builder
     */

    public SubscriptionDraftBuilder format(
            Function<com.commercetools.api.models.subscription.DeliveryFormatBuilder, Builder<? extends com.commercetools.api.models.subscription.DeliveryFormat>> builder) {
        this.format = builder.apply(com.commercetools.api.models.subscription.DeliveryFormatBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Messaging service to which the notifications are sent.</p>
     * @return destination
     */

    public com.commercetools.api.models.subscription.Destination getDestination() {
        return this.destination;
    }

    /**
     *  <p>User-defined unique identifier for the Subscription.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Messages to be subscribed to.</p>
     * @return messages
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.subscription.MessageSubscription> getMessages() {
        return this.messages;
    }

    /**
     *  <p>Changes to be subscribed to.</p>
     * @return changes
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> getChanges() {
        return this.changes;
    }

    /**
     *  <p>Events to be subscribed to.</p>
     * @return events
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.subscription.EventSubscription> getEvents() {
        return this.events;
    }

    /**
     *  <p>Format in which the payload is delivered. When not provided, the <a href="https://docs.commercetools.com/apis/ctp:api:type:PlatformFormat" rel="nofollow">PlatformFormat</a> is selected by default.</p>
     * @return format
     */

    @Nullable
    public com.commercetools.api.models.subscription.DeliveryFormat getFormat() {
        return this.format;
    }

    /**
     * builds SubscriptionDraft with checking for non-null required values
     * @return SubscriptionDraft
     */
    public SubscriptionDraft build() {
        Objects.requireNonNull(destination, SubscriptionDraft.class + ": destination is missing");
        return new SubscriptionDraftImpl(destination, key, messages, changes, events, format);
    }

    /**
     * builds SubscriptionDraft without checking for non-null required values
     * @return SubscriptionDraft
     */
    public SubscriptionDraft buildUnchecked() {
        return new SubscriptionDraftImpl(destination, key, messages, changes, events, format);
    }

    /**
     * factory method for an instance of SubscriptionDraftBuilder
     * @return builder
     */
    public static SubscriptionDraftBuilder of() {
        return new SubscriptionDraftBuilder();
    }

    /**
     * create builder for SubscriptionDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SubscriptionDraftBuilder of(final SubscriptionDraft template) {
        SubscriptionDraftBuilder builder = new SubscriptionDraftBuilder();
        builder.destination = template.getDestination();
        builder.key = template.getKey();
        builder.messages = template.getMessages();
        builder.changes = template.getChanges();
        builder.events = template.getEvents();
        builder.format = template.getFormat();
        return builder;
    }

}
