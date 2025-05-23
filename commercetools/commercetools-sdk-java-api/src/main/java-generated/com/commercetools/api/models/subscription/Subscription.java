
package com.commercetools.api.models.subscription;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * Subscription
 *
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
@JsonDeserialize(as = SubscriptionImpl.class)
public interface Subscription extends BaseResource, com.commercetools.api.models.DomainResource<Subscription>,
        com.commercetools.api.models.WithKey {

    /**
     *  <p>Unique identifier of the Subscription.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the Subscription.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the Subscription was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the Subscription was last modified.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>IDs and references that last modified the Subscription.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>IDs and references that created the Subscription.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>Messaging service to which the notifications are sent.</p>
     * @return destination
     */
    @NotNull
    @Valid
    @JsonProperty("destination")
    public Destination getDestination();

    /**
     *  <p>User-defined unique identifier of the Subscription.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Messages subscribed to.</p>
     * @return messages
     */
    @NotNull
    @Valid
    @JsonProperty("messages")
    public List<MessageSubscription> getMessages();

    /**
     *  <p>Changes subscribed to.</p>
     * @return changes
     */
    @NotNull
    @Valid
    @JsonProperty("changes")
    public List<ChangeSubscription> getChanges();

    /**
     *  <p>Events subscribed to.</p>
     * @return events
     */
    @NotNull
    @Valid
    @JsonProperty("events")
    public List<EventSubscription> getEvents();

    /**
     *  <p>Format in which the payload is delivered.</p>
     * @return format
     */
    @NotNull
    @Valid
    @JsonProperty("format")
    public DeliveryFormat getFormat();

    /**
     *  <p>Status of the Subscription.</p>
     * @return status
     */
    @NotNull
    @JsonProperty("status")
    public SubscriptionHealthStatus getStatus();

    /**
     *  <p>Unique identifier of the Subscription.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the Subscription.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the Subscription was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the Subscription was last modified.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>IDs and references that last modified the Subscription.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>IDs and references that created the Subscription.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>Messaging service to which the notifications are sent.</p>
     * @param destination value to be set
     */

    public void setDestination(final Destination destination);

    /**
     *  <p>User-defined unique identifier of the Subscription.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Messages subscribed to.</p>
     * @param messages values to be set
     */

    @JsonIgnore
    public void setMessages(final MessageSubscription... messages);

    /**
     *  <p>Messages subscribed to.</p>
     * @param messages values to be set
     */

    public void setMessages(final List<MessageSubscription> messages);

    /**
     *  <p>Changes subscribed to.</p>
     * @param changes values to be set
     */

    @JsonIgnore
    public void setChanges(final ChangeSubscription... changes);

    /**
     *  <p>Changes subscribed to.</p>
     * @param changes values to be set
     */

    public void setChanges(final List<ChangeSubscription> changes);

    /**
     *  <p>Events subscribed to.</p>
     * @param events values to be set
     */

    @JsonIgnore
    public void setEvents(final EventSubscription... events);

    /**
     *  <p>Events subscribed to.</p>
     * @param events values to be set
     */

    public void setEvents(final List<EventSubscription> events);

    /**
     *  <p>Format in which the payload is delivered.</p>
     * @param format value to be set
     */

    public void setFormat(final DeliveryFormat format);

    /**
     *  <p>Status of the Subscription.</p>
     * @param status value to be set
     */

    public void setStatus(final SubscriptionHealthStatus status);

    /**
     * factory method
     * @return instance of Subscription
     */
    public static Subscription of() {
        return new SubscriptionImpl();
    }

    /**
     * factory method to create a shallow copy Subscription
     * @param template instance to be copied
     * @return copy instance
     */
    public static Subscription of(final Subscription template) {
        SubscriptionImpl instance = new SubscriptionImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setDestination(template.getDestination());
        instance.setKey(template.getKey());
        instance.setMessages(template.getMessages());
        instance.setChanges(template.getChanges());
        instance.setEvents(template.getEvents());
        instance.setFormat(template.getFormat());
        instance.setStatus(template.getStatus());
        return instance;
    }

    public Subscription copyDeep();

    /**
     * factory method to create a deep copy of Subscription
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Subscription deepCopy(@Nullable final Subscription template) {
        if (template == null) {
            return null;
        }
        SubscriptionImpl instance = new SubscriptionImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setDestination(
            com.commercetools.api.models.subscription.Destination.deepCopy(template.getDestination()));
        instance.setKey(template.getKey());
        instance.setMessages(Optional.ofNullable(template.getMessages())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.subscription.MessageSubscription::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setChanges(Optional.ofNullable(template.getChanges())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.subscription.ChangeSubscription::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setEvents(Optional.ofNullable(template.getEvents())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.subscription.EventSubscription::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setFormat(com.commercetools.api.models.subscription.DeliveryFormat.deepCopy(template.getFormat()));
        instance.setStatus(template.getStatus());
        return instance;
    }

    /**
     * builder factory method for Subscription
     * @return builder
     */
    public static SubscriptionBuilder builder() {
        return SubscriptionBuilder.of();
    }

    /**
     * create builder for Subscription instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SubscriptionBuilder builder(final Subscription template) {
        return SubscriptionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSubscription(Function<Subscription, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Subscription> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Subscription>() {
            @Override
            public String toString() {
                return "TypeReference<Subscription>";
            }
        };
    }
}
