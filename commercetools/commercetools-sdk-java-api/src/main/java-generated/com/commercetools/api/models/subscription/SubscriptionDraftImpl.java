
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
 *  <p>Either <code>messages</code>, <code>changes</code>, or <code>events</code> must be set.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SubscriptionDraftImpl implements SubscriptionDraft, ModelBase {

    private com.commercetools.api.models.subscription.Destination destination;

    private String key;

    private java.util.List<com.commercetools.api.models.subscription.MessageSubscription> messages;

    private java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> changes;

    private java.util.List<com.commercetools.api.models.subscription.EventSubscription> events;

    private com.commercetools.api.models.subscription.DeliveryFormat format;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SubscriptionDraftImpl(
            @JsonProperty("destination") final com.commercetools.api.models.subscription.Destination destination,
            @JsonProperty("key") final String key,
            @JsonProperty("messages") final java.util.List<com.commercetools.api.models.subscription.MessageSubscription> messages,
            @JsonProperty("changes") final java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> changes,
            @JsonProperty("events") final java.util.List<com.commercetools.api.models.subscription.EventSubscription> events,
            @JsonProperty("format") final com.commercetools.api.models.subscription.DeliveryFormat format) {
        this.destination = destination;
        this.key = key;
        this.messages = messages;
        this.changes = changes;
        this.events = events;
        this.format = format;
    }

    /**
     * create empty instance
     */
    public SubscriptionDraftImpl() {
    }

    /**
     *  <p>Messaging service to which the notifications are sent.</p>
     */

    public com.commercetools.api.models.subscription.Destination getDestination() {
        return this.destination;
    }

    /**
     *  <p>User-defined unique identifier for the Subscription.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Messages to be subscribed to.</p>
     */

    public java.util.List<com.commercetools.api.models.subscription.MessageSubscription> getMessages() {
        return this.messages;
    }

    /**
     *  <p>Changes to be subscribed to.</p>
     */

    public java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> getChanges() {
        return this.changes;
    }

    /**
     *  <p>Events to be subscribed to.</p>
     */

    public java.util.List<com.commercetools.api.models.subscription.EventSubscription> getEvents() {
        return this.events;
    }

    /**
     *  <p>Format in which the payload is delivered. When not provided, the <a href="https://docs.commercetools.com/apis/ctp:api:type:PlatformFormat" rel="nofollow">PlatformFormat</a> is selected by default.</p>
     */

    public com.commercetools.api.models.subscription.DeliveryFormat getFormat() {
        return this.format;
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SubscriptionDraftImpl that = (SubscriptionDraftImpl) o;

        return new EqualsBuilder().append(destination, that.destination)
                .append(key, that.key)
                .append(messages, that.messages)
                .append(changes, that.changes)
                .append(events, that.events)
                .append(format, that.format)
                .append(destination, that.destination)
                .append(key, that.key)
                .append(messages, that.messages)
                .append(changes, that.changes)
                .append(events, that.events)
                .append(format, that.format)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(destination)
                .append(key)
                .append(messages)
                .append(changes)
                .append(events)
                .append(format)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("destination", destination)
                .append("key", key)
                .append("messages", messages)
                .append("changes", changes)
                .append("events", events)
                .append("format", format)
                .build();
    }

    @Override
    public SubscriptionDraft copyDeep() {
        return SubscriptionDraft.deepCopy(this);
    }
}
