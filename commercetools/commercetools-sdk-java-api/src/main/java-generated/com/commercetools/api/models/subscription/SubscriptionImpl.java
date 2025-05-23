
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Subscription
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SubscriptionImpl implements Subscription, ModelBase {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.common.CreatedBy createdBy;

    private com.commercetools.api.models.subscription.Destination destination;

    private String key;

    private java.util.List<com.commercetools.api.models.subscription.MessageSubscription> messages;

    private java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> changes;

    private java.util.List<com.commercetools.api.models.subscription.EventSubscription> events;

    private com.commercetools.api.models.subscription.DeliveryFormat format;

    private com.commercetools.api.models.subscription.SubscriptionHealthStatus status;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SubscriptionImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy,
            @JsonProperty("destination") final com.commercetools.api.models.subscription.Destination destination,
            @JsonProperty("key") final String key,
            @JsonProperty("messages") final java.util.List<com.commercetools.api.models.subscription.MessageSubscription> messages,
            @JsonProperty("changes") final java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> changes,
            @JsonProperty("events") final java.util.List<com.commercetools.api.models.subscription.EventSubscription> events,
            @JsonProperty("format") final com.commercetools.api.models.subscription.DeliveryFormat format,
            @JsonProperty("status") final com.commercetools.api.models.subscription.SubscriptionHealthStatus status) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.destination = destination;
        this.key = key;
        this.messages = messages;
        this.changes = changes;
        this.events = events;
        this.format = format;
        this.status = status;
    }

    /**
     * create empty instance
     */
    public SubscriptionImpl() {
    }

    /**
     *  <p>Unique identifier of the Subscription.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Subscription.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Subscription was initially created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the Subscription was last modified.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that last modified the Subscription.</p>
     */

    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the Subscription.</p>
     */

    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>Messaging service to which the notifications are sent.</p>
     */

    public com.commercetools.api.models.subscription.Destination getDestination() {
        return this.destination;
    }

    /**
     *  <p>User-defined unique identifier of the Subscription.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Messages subscribed to.</p>
     */

    public java.util.List<com.commercetools.api.models.subscription.MessageSubscription> getMessages() {
        return this.messages;
    }

    /**
     *  <p>Changes subscribed to.</p>
     */

    public java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> getChanges() {
        return this.changes;
    }

    /**
     *  <p>Events subscribed to.</p>
     */

    public java.util.List<com.commercetools.api.models.subscription.EventSubscription> getEvents() {
        return this.events;
    }

    /**
     *  <p>Format in which the payload is delivered.</p>
     */

    public com.commercetools.api.models.subscription.DeliveryFormat getFormat() {
        return this.format;
    }

    /**
     *  <p>Status of the Subscription.</p>
     */

    public com.commercetools.api.models.subscription.SubscriptionHealthStatus getStatus() {
        return this.status;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    public void setDestination(final com.commercetools.api.models.subscription.Destination destination) {
        this.destination = destination;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setMessages(final com.commercetools.api.models.subscription.MessageSubscription... messages) {
        this.messages = new ArrayList<>(Arrays.asList(messages));
    }

    public void setMessages(
            final java.util.List<com.commercetools.api.models.subscription.MessageSubscription> messages) {
        this.messages = messages;
    }

    public void setChanges(final com.commercetools.api.models.subscription.ChangeSubscription... changes) {
        this.changes = new ArrayList<>(Arrays.asList(changes));
    }

    public void setChanges(final java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> changes) {
        this.changes = changes;
    }

    public void setEvents(final com.commercetools.api.models.subscription.EventSubscription... events) {
        this.events = new ArrayList<>(Arrays.asList(events));
    }

    public void setEvents(final java.util.List<com.commercetools.api.models.subscription.EventSubscription> events) {
        this.events = events;
    }

    public void setFormat(final com.commercetools.api.models.subscription.DeliveryFormat format) {
        this.format = format;
    }

    public void setStatus(final com.commercetools.api.models.subscription.SubscriptionHealthStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SubscriptionImpl that = (SubscriptionImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(destination, that.destination)
                .append(key, that.key)
                .append(messages, that.messages)
                .append(changes, that.changes)
                .append(events, that.events)
                .append(format, that.format)
                .append(status, that.status)
                .append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(destination, that.destination)
                .append(key, that.key)
                .append(messages, that.messages)
                .append(changes, that.changes)
                .append(events, that.events)
                .append(format, that.format)
                .append(status, that.status)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(version)
                .append(createdAt)
                .append(lastModifiedAt)
                .append(lastModifiedBy)
                .append(createdBy)
                .append(destination)
                .append(key)
                .append(messages)
                .append(changes)
                .append(events)
                .append(format)
                .append(status)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("version", version)
                .append("createdAt", createdAt)
                .append("lastModifiedAt", lastModifiedAt)
                .append("lastModifiedBy", lastModifiedBy)
                .append("createdBy", createdBy)
                .append("destination", destination)
                .append("key", key)
                .append("messages", messages)
                .append("changes", changes)
                .append("events", events)
                .append("format", format)
                .append("status", status)
                .build();
    }

    @Override
    public Subscription copyDeep() {
        return Subscription.deepCopy(this);
    }
}
