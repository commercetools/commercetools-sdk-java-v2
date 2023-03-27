
package com.commercetools.api.models.subscription;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
 *             .plusChanges(changesBuilder -> changesBuilder)
 *             .destination(destinationBuilder -> destinationBuilder)
 *             .plusMessages(messagesBuilder -> messagesBuilder)
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
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>Change notifications subscribed to.</p>
     * @return changes
     */
    @NotNull
    @Valid
    @JsonProperty("changes")
    public List<ChangeSubscription> getChanges();

    /**
     *  <p>Messaging service to which the messages are to be sent.</p>
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
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>Change notifications subscribed to.</p>
     * @param changes values to be set
     */

    @JsonIgnore
    public void setChanges(final ChangeSubscription... changes);

    /**
     *  <p>Change notifications subscribed to.</p>
     * @param changes values to be set
     */

    public void setChanges(final List<ChangeSubscription> changes);

    /**
     *  <p>Messaging service to which the messages are to be sent.</p>
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
     * factory method to copy an instance of Subscription
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
        instance.setChanges(template.getChanges());
        instance.setDestination(template.getDestination());
        instance.setKey(template.getKey());
        instance.setMessages(template.getMessages());
        instance.setFormat(template.getFormat());
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
