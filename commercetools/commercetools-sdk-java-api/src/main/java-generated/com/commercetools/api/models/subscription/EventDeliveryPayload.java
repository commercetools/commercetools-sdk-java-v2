
package com.commercetools.api.models.subscription;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>This payload is sent for an EventSubscription.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EventDeliveryPayload eventDeliveryPayload = EventDeliveryPayload.builder()
 *             .id("{id}")
 *             .type(EventType.IMPORT_CONTAINER_CREATED)
 *             .resourceType("{resourceType}")
 *             .data(dataBuilder -> dataBuilder)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("Event")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = EventDeliveryPayloadImpl.class)
public interface EventDeliveryPayload extends SubscriptionNotification {

    /**
     * discriminator value for EventDeliveryPayload
     */
    String EVENT = "Event";

    /**
     *  <p>Unique identifier of the Event.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>The type of Event that has occurred.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public EventType getType();

    /**
     *  <p>The type of resource targeted by the Event.</p>
     * @return resourceType
     */
    @NotNull
    @JsonProperty("resourceType")
    public String getResourceType();

    /**
     *  <p>The data describing the event that has taken place.</p>
     * @return data
     */
    @NotNull
    @Valid
    @JsonProperty("data")
    public Object getData();

    /**
     *  <p>Date and time (UTC) the resource was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Unique identifier of the Event.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>The type of Event that has occurred.</p>
     * @param type value to be set
     */

    public void setType(final EventType type);

    /**
     *  <p>The type of resource targeted by the Event.</p>
     * @param resourceType value to be set
     */

    public void setResourceType(final String resourceType);

    /**
     *  <p>The data describing the event that has taken place.</p>
     * @param data value to be set
     */

    public void setData(final Object data);

    /**
     *  <p>Date and time (UTC) the resource was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     * factory method
     * @return instance of EventDeliveryPayload
     */
    public static EventDeliveryPayload of() {
        return new EventDeliveryPayloadImpl();
    }

    /**
     * factory method to create a shallow copy EventDeliveryPayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static EventDeliveryPayload of(final EventDeliveryPayload template) {
        EventDeliveryPayloadImpl instance = new EventDeliveryPayloadImpl();
        instance.setId(template.getId());
        instance.setType(template.getType());
        instance.setResourceType(template.getResourceType());
        instance.setData(template.getData());
        instance.setCreatedAt(template.getCreatedAt());
        return instance;
    }

    public EventDeliveryPayload copyDeep();

    /**
     * factory method to create a deep copy of EventDeliveryPayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static EventDeliveryPayload deepCopy(@Nullable final EventDeliveryPayload template) {
        if (template == null) {
            return null;
        }
        EventDeliveryPayloadImpl instance = new EventDeliveryPayloadImpl();
        instance.setId(template.getId());
        instance.setType(template.getType());
        instance.setResourceType(template.getResourceType());
        instance.setData(template.getData());
        instance.setCreatedAt(template.getCreatedAt());
        return instance;
    }

    /**
     * builder factory method for EventDeliveryPayload
     * @return builder
     */
    public static EventDeliveryPayloadBuilder builder() {
        return EventDeliveryPayloadBuilder.of();
    }

    /**
     * create builder for EventDeliveryPayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static EventDeliveryPayloadBuilder builder(final EventDeliveryPayload template) {
        return EventDeliveryPayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withEventDeliveryPayload(Function<EventDeliveryPayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<EventDeliveryPayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<EventDeliveryPayload>() {
            @Override
            public String toString() {
                return "TypeReference<EventDeliveryPayload>";
            }
        };
    }
}
