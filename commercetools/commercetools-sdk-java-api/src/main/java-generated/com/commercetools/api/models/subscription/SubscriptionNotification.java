
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>All payloads for the PlatformFormat share these common fields.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SubscriptionNotification subscriptionNotification = SubscriptionNotification.eventBuilder()
 *             id("{id}")
 *             type(EventType.IMPORT_CONTAINER_CREATED)
 *             resourceType("{resourceType}")
 *             data(dataBuilder -> dataBuilder)
 *             createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.EventDeliveryPayloadImpl.class, name = EventDeliveryPayload.EVENT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.MessageDeliveryPayloadImpl.class, name = MessageDeliveryPayload.MESSAGE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.ResourceCreatedDeliveryPayloadImpl.class, name = ResourceCreatedDeliveryPayload.RESOURCE_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.ResourceDeletedDeliveryPayloadImpl.class, name = ResourceDeletedDeliveryPayload.RESOURCE_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.subscription.ResourceUpdatedDeliveryPayloadImpl.class, name = ResourceUpdatedDeliveryPayload.RESOURCE_UPDATED) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "notificationType", defaultImpl = SubscriptionNotificationImpl.class, visible = true)
@JsonDeserialize(as = SubscriptionNotificationImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface SubscriptionNotification {

    /**
     *  <p>Identifies the payload.</p>
     * @return notificationType
     */
    @NotNull
    @JsonProperty("notificationType")
    public String getNotificationType();

    /**
     * factory method to create a deep copy of SubscriptionNotification
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SubscriptionNotification deepCopy(@Nullable final SubscriptionNotification template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.subscription.DeliveryPayload) {
            return com.commercetools.api.models.subscription.DeliveryPayload
                    .deepCopy((com.commercetools.api.models.subscription.DeliveryPayload) template);
        }
        if (template instanceof com.commercetools.api.models.subscription.EventDeliveryPayload) {
            return com.commercetools.api.models.subscription.EventDeliveryPayload
                    .deepCopy((com.commercetools.api.models.subscription.EventDeliveryPayload) template);
        }
        SubscriptionNotificationImpl instance = new SubscriptionNotificationImpl();
        return instance;
    }

    /**
     * builder for event subtype
     * @return builder
     */
    public static com.commercetools.api.models.subscription.EventDeliveryPayloadBuilder eventBuilder() {
        return com.commercetools.api.models.subscription.EventDeliveryPayloadBuilder.of();
    }

    /**
     * builder for message subtype
     * @return builder
     */
    public static com.commercetools.api.models.subscription.MessageDeliveryPayloadBuilder messageBuilder() {
        return com.commercetools.api.models.subscription.MessageDeliveryPayloadBuilder.of();
    }

    /**
     * builder for resourceCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.subscription.ResourceCreatedDeliveryPayloadBuilder resourceCreatedBuilder() {
        return com.commercetools.api.models.subscription.ResourceCreatedDeliveryPayloadBuilder.of();
    }

    /**
     * builder for resourceDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.subscription.ResourceDeletedDeliveryPayloadBuilder resourceDeletedBuilder() {
        return com.commercetools.api.models.subscription.ResourceDeletedDeliveryPayloadBuilder.of();
    }

    /**
     * builder for resourceUpdated subtype
     * @return builder
     */
    public static com.commercetools.api.models.subscription.ResourceUpdatedDeliveryPayloadBuilder resourceUpdatedBuilder() {
        return com.commercetools.api.models.subscription.ResourceUpdatedDeliveryPayloadBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSubscriptionNotification(Function<SubscriptionNotification, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SubscriptionNotification> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SubscriptionNotification>() {
            @Override
            public String toString() {
                return "TypeReference<SubscriptionNotification>";
            }
        };
    }
}
