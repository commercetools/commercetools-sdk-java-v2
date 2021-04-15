
package com.commercetools.api.models.subscription;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SubscriptionBuilder {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> changes;

    private com.commercetools.api.models.subscription.Destination destination;

    @Nullable
    private String key;

    private java.util.List<com.commercetools.api.models.subscription.MessageSubscription> messages;

    private com.commercetools.api.models.subscription.DeliveryFormat format;

    private com.commercetools.api.models.subscription.SubscriptionHealthStatus status;

    public SubscriptionBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public SubscriptionBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public SubscriptionBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public SubscriptionBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public SubscriptionBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public SubscriptionBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public SubscriptionBuilder changes(final com.commercetools.api.models.subscription.ChangeSubscription... changes) {
        this.changes = new ArrayList<>(Arrays.asList(changes));
        return this;
    }

    public SubscriptionBuilder changes(
            final java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> changes) {
        this.changes = changes;
        return this;
    }

    public SubscriptionBuilder destination(final com.commercetools.api.models.subscription.Destination destination) {
        this.destination = destination;
        return this;
    }

    public SubscriptionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public SubscriptionBuilder messages(
            final com.commercetools.api.models.subscription.MessageSubscription... messages) {
        this.messages = new ArrayList<>(Arrays.asList(messages));
        return this;
    }

    public SubscriptionBuilder messages(
            final java.util.List<com.commercetools.api.models.subscription.MessageSubscription> messages) {
        this.messages = messages;
        return this;
    }

    public SubscriptionBuilder format(final com.commercetools.api.models.subscription.DeliveryFormat format) {
        this.format = format;
        return this;
    }

    public SubscriptionBuilder status(final com.commercetools.api.models.subscription.SubscriptionHealthStatus status) {
        this.status = status;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

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

    public java.util.List<com.commercetools.api.models.subscription.MessageSubscription> getMessages() {
        return this.messages;
    }

    public com.commercetools.api.models.subscription.DeliveryFormat getFormat() {
        return this.format;
    }

    public com.commercetools.api.models.subscription.SubscriptionHealthStatus getStatus() {
        return this.status;
    }

    public Subscription build() {
        return new SubscriptionImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, changes,
            destination, key, messages, format, status);
    }

    public static SubscriptionBuilder of() {
        return new SubscriptionBuilder();
    }

    public static SubscriptionBuilder of(final Subscription template) {
        SubscriptionBuilder builder = new SubscriptionBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.changes = template.getChanges();
        builder.destination = template.getDestination();
        builder.key = template.getKey();
        builder.messages = template.getMessages();
        builder.format = template.getFormat();
        builder.status = template.getStatus();
        return builder;
    }

}
