
package com.commercetools.api.models.subscription;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SubscriptionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Subscription subscription = Subscription.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .destination(destinationBuilder -> destinationBuilder)
 *             .plusMessages(messagesBuilder -> messagesBuilder)
 *             .plusChanges(changesBuilder -> changesBuilder)
 *             .plusEvents(eventsBuilder -> eventsBuilder)
 *             .format(formatBuilder -> formatBuilder)
 *             .status(SubscriptionHealthStatus.HEALTHY)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SubscriptionBuilder implements Builder<Subscription> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private com.commercetools.api.models.subscription.Destination destination;

    @Nullable
    private String key;

    private java.util.List<com.commercetools.api.models.subscription.MessageSubscription> messages;

    private java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> changes;

    private java.util.List<com.commercetools.api.models.subscription.EventSubscription> events;

    private com.commercetools.api.models.subscription.DeliveryFormat format;

    private com.commercetools.api.models.subscription.SubscriptionHealthStatus status;

    /**
     *  <p>Unique identifier of the Subscription.</p>
     * @param id value to be set
     * @return Builder
     */

    public SubscriptionBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the Subscription.</p>
     * @param version value to be set
     * @return Builder
     */

    public SubscriptionBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Subscription was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public SubscriptionBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Subscription was last modified.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public SubscriptionBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Subscription.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public SubscriptionBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Subscription.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public SubscriptionBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Subscription.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public SubscriptionBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the Subscription.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public SubscriptionBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the Subscription.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public SubscriptionBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the Subscription.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public SubscriptionBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Messaging service to which the notifications are sent.</p>
     * @param destination value to be set
     * @return Builder
     */

    public SubscriptionBuilder destination(final com.commercetools.api.models.subscription.Destination destination) {
        this.destination = destination;
        return this;
    }

    /**
     *  <p>Messaging service to which the notifications are sent.</p>
     * @param builder function to build the destination value
     * @return Builder
     */

    public SubscriptionBuilder destination(
            Function<com.commercetools.api.models.subscription.DestinationBuilder, Builder<? extends com.commercetools.api.models.subscription.Destination>> builder) {
        this.destination = builder.apply(com.commercetools.api.models.subscription.DestinationBuilder.of()).build();
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Subscription.</p>
     * @param key value to be set
     * @return Builder
     */

    public SubscriptionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Messages subscribed to.</p>
     * @param messages value to be set
     * @return Builder
     */

    public SubscriptionBuilder messages(
            final com.commercetools.api.models.subscription.MessageSubscription... messages) {
        this.messages = new ArrayList<>(Arrays.asList(messages));
        return this;
    }

    /**
     *  <p>Messages subscribed to.</p>
     * @param messages value to be set
     * @return Builder
     */

    public SubscriptionBuilder messages(
            final java.util.List<com.commercetools.api.models.subscription.MessageSubscription> messages) {
        this.messages = messages;
        return this;
    }

    /**
     *  <p>Messages subscribed to.</p>
     * @param messages value to be set
     * @return Builder
     */

    public SubscriptionBuilder plusMessages(
            final com.commercetools.api.models.subscription.MessageSubscription... messages) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages.addAll(Arrays.asList(messages));
        return this;
    }

    /**
     *  <p>Messages subscribed to.</p>
     * @param builder function to build the messages value
     * @return Builder
     */

    public SubscriptionBuilder plusMessages(
            Function<com.commercetools.api.models.subscription.MessageSubscriptionBuilder, com.commercetools.api.models.subscription.MessageSubscriptionBuilder> builder) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages
                .add(builder.apply(com.commercetools.api.models.subscription.MessageSubscriptionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Messages subscribed to.</p>
     * @param builder function to build the messages value
     * @return Builder
     */

    public SubscriptionBuilder withMessages(
            Function<com.commercetools.api.models.subscription.MessageSubscriptionBuilder, com.commercetools.api.models.subscription.MessageSubscriptionBuilder> builder) {
        this.messages = new ArrayList<>();
        this.messages
                .add(builder.apply(com.commercetools.api.models.subscription.MessageSubscriptionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Messages subscribed to.</p>
     * @param builder function to build the messages value
     * @return Builder
     */

    public SubscriptionBuilder addMessages(
            Function<com.commercetools.api.models.subscription.MessageSubscriptionBuilder, com.commercetools.api.models.subscription.MessageSubscription> builder) {
        return plusMessages(builder.apply(com.commercetools.api.models.subscription.MessageSubscriptionBuilder.of()));
    }

    /**
     *  <p>Messages subscribed to.</p>
     * @param builder function to build the messages value
     * @return Builder
     */

    public SubscriptionBuilder setMessages(
            Function<com.commercetools.api.models.subscription.MessageSubscriptionBuilder, com.commercetools.api.models.subscription.MessageSubscription> builder) {
        return messages(builder.apply(com.commercetools.api.models.subscription.MessageSubscriptionBuilder.of()));
    }

    /**
     *  <p>Changes subscribed to.</p>
     * @param changes value to be set
     * @return Builder
     */

    public SubscriptionBuilder changes(final com.commercetools.api.models.subscription.ChangeSubscription... changes) {
        this.changes = new ArrayList<>(Arrays.asList(changes));
        return this;
    }

    /**
     *  <p>Changes subscribed to.</p>
     * @param changes value to be set
     * @return Builder
     */

    public SubscriptionBuilder changes(
            final java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> changes) {
        this.changes = changes;
        return this;
    }

    /**
     *  <p>Changes subscribed to.</p>
     * @param changes value to be set
     * @return Builder
     */

    public SubscriptionBuilder plusChanges(
            final com.commercetools.api.models.subscription.ChangeSubscription... changes) {
        if (this.changes == null) {
            this.changes = new ArrayList<>();
        }
        this.changes.addAll(Arrays.asList(changes));
        return this;
    }

    /**
     *  <p>Changes subscribed to.</p>
     * @param builder function to build the changes value
     * @return Builder
     */

    public SubscriptionBuilder plusChanges(
            Function<com.commercetools.api.models.subscription.ChangeSubscriptionBuilder, com.commercetools.api.models.subscription.ChangeSubscriptionBuilder> builder) {
        if (this.changes == null) {
            this.changes = new ArrayList<>();
        }
        this.changes
                .add(builder.apply(com.commercetools.api.models.subscription.ChangeSubscriptionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Changes subscribed to.</p>
     * @param builder function to build the changes value
     * @return Builder
     */

    public SubscriptionBuilder withChanges(
            Function<com.commercetools.api.models.subscription.ChangeSubscriptionBuilder, com.commercetools.api.models.subscription.ChangeSubscriptionBuilder> builder) {
        this.changes = new ArrayList<>();
        this.changes
                .add(builder.apply(com.commercetools.api.models.subscription.ChangeSubscriptionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Changes subscribed to.</p>
     * @param builder function to build the changes value
     * @return Builder
     */

    public SubscriptionBuilder addChanges(
            Function<com.commercetools.api.models.subscription.ChangeSubscriptionBuilder, com.commercetools.api.models.subscription.ChangeSubscription> builder) {
        return plusChanges(builder.apply(com.commercetools.api.models.subscription.ChangeSubscriptionBuilder.of()));
    }

    /**
     *  <p>Changes subscribed to.</p>
     * @param builder function to build the changes value
     * @return Builder
     */

    public SubscriptionBuilder setChanges(
            Function<com.commercetools.api.models.subscription.ChangeSubscriptionBuilder, com.commercetools.api.models.subscription.ChangeSubscription> builder) {
        return changes(builder.apply(com.commercetools.api.models.subscription.ChangeSubscriptionBuilder.of()));
    }

    /**
     *  <p>Events subscribed to.</p>
     * @param events value to be set
     * @return Builder
     */

    public SubscriptionBuilder events(final com.commercetools.api.models.subscription.EventSubscription... events) {
        this.events = new ArrayList<>(Arrays.asList(events));
        return this;
    }

    /**
     *  <p>Events subscribed to.</p>
     * @param events value to be set
     * @return Builder
     */

    public SubscriptionBuilder events(
            final java.util.List<com.commercetools.api.models.subscription.EventSubscription> events) {
        this.events = events;
        return this;
    }

    /**
     *  <p>Events subscribed to.</p>
     * @param events value to be set
     * @return Builder
     */

    public SubscriptionBuilder plusEvents(final com.commercetools.api.models.subscription.EventSubscription... events) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.addAll(Arrays.asList(events));
        return this;
    }

    /**
     *  <p>Events subscribed to.</p>
     * @param builder function to build the events value
     * @return Builder
     */

    public SubscriptionBuilder plusEvents(
            Function<com.commercetools.api.models.subscription.EventSubscriptionBuilder, com.commercetools.api.models.subscription.EventSubscriptionBuilder> builder) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(builder.apply(com.commercetools.api.models.subscription.EventSubscriptionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Events subscribed to.</p>
     * @param builder function to build the events value
     * @return Builder
     */

    public SubscriptionBuilder withEvents(
            Function<com.commercetools.api.models.subscription.EventSubscriptionBuilder, com.commercetools.api.models.subscription.EventSubscriptionBuilder> builder) {
        this.events = new ArrayList<>();
        this.events.add(builder.apply(com.commercetools.api.models.subscription.EventSubscriptionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Events subscribed to.</p>
     * @param builder function to build the events value
     * @return Builder
     */

    public SubscriptionBuilder addEvents(
            Function<com.commercetools.api.models.subscription.EventSubscriptionBuilder, com.commercetools.api.models.subscription.EventSubscription> builder) {
        return plusEvents(builder.apply(com.commercetools.api.models.subscription.EventSubscriptionBuilder.of()));
    }

    /**
     *  <p>Events subscribed to.</p>
     * @param builder function to build the events value
     * @return Builder
     */

    public SubscriptionBuilder setEvents(
            Function<com.commercetools.api.models.subscription.EventSubscriptionBuilder, com.commercetools.api.models.subscription.EventSubscription> builder) {
        return events(builder.apply(com.commercetools.api.models.subscription.EventSubscriptionBuilder.of()));
    }

    /**
     *  <p>Format in which the payload is delivered.</p>
     * @param format value to be set
     * @return Builder
     */

    public SubscriptionBuilder format(final com.commercetools.api.models.subscription.DeliveryFormat format) {
        this.format = format;
        return this;
    }

    /**
     *  <p>Format in which the payload is delivered.</p>
     * @param builder function to build the format value
     * @return Builder
     */

    public SubscriptionBuilder format(
            Function<com.commercetools.api.models.subscription.DeliveryFormatBuilder, Builder<? extends com.commercetools.api.models.subscription.DeliveryFormat>> builder) {
        this.format = builder.apply(com.commercetools.api.models.subscription.DeliveryFormatBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Status of the Subscription.</p>
     * @param status value to be set
     * @return Builder
     */

    public SubscriptionBuilder status(final com.commercetools.api.models.subscription.SubscriptionHealthStatus status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>Unique identifier of the Subscription.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Subscription.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Subscription was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the Subscription was last modified.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that last modified the Subscription.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the Subscription.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>Messaging service to which the notifications are sent.</p>
     * @return destination
     */

    public com.commercetools.api.models.subscription.Destination getDestination() {
        return this.destination;
    }

    /**
     *  <p>User-defined unique identifier of the Subscription.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Messages subscribed to.</p>
     * @return messages
     */

    public java.util.List<com.commercetools.api.models.subscription.MessageSubscription> getMessages() {
        return this.messages;
    }

    /**
     *  <p>Changes subscribed to.</p>
     * @return changes
     */

    public java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> getChanges() {
        return this.changes;
    }

    /**
     *  <p>Events subscribed to.</p>
     * @return events
     */

    public java.util.List<com.commercetools.api.models.subscription.EventSubscription> getEvents() {
        return this.events;
    }

    /**
     *  <p>Format in which the payload is delivered.</p>
     * @return format
     */

    public com.commercetools.api.models.subscription.DeliveryFormat getFormat() {
        return this.format;
    }

    /**
     *  <p>Status of the Subscription.</p>
     * @return status
     */

    public com.commercetools.api.models.subscription.SubscriptionHealthStatus getStatus() {
        return this.status;
    }

    /**
     * builds Subscription with checking for non-null required values
     * @return Subscription
     */
    public Subscription build() {
        Objects.requireNonNull(id, Subscription.class + ": id is missing");
        Objects.requireNonNull(version, Subscription.class + ": version is missing");
        Objects.requireNonNull(createdAt, Subscription.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, Subscription.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(destination, Subscription.class + ": destination is missing");
        Objects.requireNonNull(messages, Subscription.class + ": messages is missing");
        Objects.requireNonNull(changes, Subscription.class + ": changes is missing");
        Objects.requireNonNull(events, Subscription.class + ": events is missing");
        Objects.requireNonNull(format, Subscription.class + ": format is missing");
        Objects.requireNonNull(status, Subscription.class + ": status is missing");
        return new SubscriptionImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, destination, key,
            messages, changes, events, format, status);
    }

    /**
     * builds Subscription without checking for non-null required values
     * @return Subscription
     */
    public Subscription buildUnchecked() {
        return new SubscriptionImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, destination, key,
            messages, changes, events, format, status);
    }

    /**
     * factory method for an instance of SubscriptionBuilder
     * @return builder
     */
    public static SubscriptionBuilder of() {
        return new SubscriptionBuilder();
    }

    /**
     * create builder for Subscription instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SubscriptionBuilder of(final Subscription template) {
        SubscriptionBuilder builder = new SubscriptionBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.destination = template.getDestination();
        builder.key = template.getKey();
        builder.messages = template.getMessages();
        builder.changes = template.getChanges();
        builder.events = template.getEvents();
        builder.format = template.getFormat();
        builder.status = template.getStatus();
        return builder;
    }

}
