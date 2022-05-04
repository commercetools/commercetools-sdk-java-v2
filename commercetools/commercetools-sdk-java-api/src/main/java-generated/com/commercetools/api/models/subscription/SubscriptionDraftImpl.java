
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class SubscriptionDraftImpl implements SubscriptionDraft, ModelBase {

    private java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> changes;

    private com.commercetools.api.models.subscription.Destination destination;

    private String key;

    private java.util.List<com.commercetools.api.models.subscription.MessageSubscription> messages;

    private com.commercetools.api.models.subscription.DeliveryFormat format;

    @JsonCreator
    SubscriptionDraftImpl(
            @JsonProperty("changes") final java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> changes,
            @JsonProperty("destination") final com.commercetools.api.models.subscription.Destination destination,
            @JsonProperty("key") final String key,
            @JsonProperty("messages") final java.util.List<com.commercetools.api.models.subscription.MessageSubscription> messages,
            @JsonProperty("format") final com.commercetools.api.models.subscription.DeliveryFormat format) {
        this.changes = changes;
        this.destination = destination;
        this.key = key;
        this.messages = messages;
        this.format = format;
    }

    public SubscriptionDraftImpl() {
    }

    public java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> getChanges() {
        return this.changes;
    }

    public com.commercetools.api.models.subscription.Destination getDestination() {
        return this.destination;
    }

    /**
    *  <p>User-defined unique identifier for the Subscription.</p>
    */
    public String getKey() {
        return this.key;
    }

    public java.util.List<com.commercetools.api.models.subscription.MessageSubscription> getMessages() {
        return this.messages;
    }

    public com.commercetools.api.models.subscription.DeliveryFormat getFormat() {
        return this.format;
    }

    public void setChanges(final com.commercetools.api.models.subscription.ChangeSubscription... changes) {
        this.changes = new ArrayList<>(Arrays.asList(changes));
    }

    public void setChanges(final java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> changes) {
        this.changes = changes;
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

        return new EqualsBuilder().append(changes, that.changes)
                .append(destination, that.destination)
                .append(key, that.key)
                .append(messages, that.messages)
                .append(format, that.format)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(changes)
                .append(destination)
                .append(key)
                .append(messages)
                .append(format)
                .toHashCode();
    }

}
