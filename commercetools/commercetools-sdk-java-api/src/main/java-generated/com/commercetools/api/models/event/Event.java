
package com.commercetools.api.models.event;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId;
import com.commercetools.api.models.subscription.EventType;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Base representation of an Event containing common fields to all Event Types.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Event event = Event.importContainerCreatedBuilder()
 *             id("{id}")
 *             notificationType("{notificationType}")
 *             resourceType(EventSubscriptionResourceTypeId.IMPORT_API)
 *             createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             data(dataBuilder -> dataBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = EventImpl.class, visible = true)
@JsonDeserialize(as = EventImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface Event {

    /**
     *  <p>Unique identifier of the Event.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *
     * @return notificationType
     */
    @NotNull
    @JsonProperty("notificationType")
    public String getNotificationType();

    /**
     *  <p>The type of resource targeted by the Event.</p>
     * @return resourceType
     */
    @NotNull
    @JsonProperty("resourceType")
    public EventSubscriptionResourceTypeId getResourceType();

    /**
     *  <p>The type of Event that has occurred.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public EventType getType();

    /**
     *  <p>Date and time (UTC) the Event was generated.</p>
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
     * set notificationType
     * @param notificationType value to be set
     */

    public void setNotificationType(final String notificationType);

    /**
     *  <p>The type of resource targeted by the Event.</p>
     * @param resourceType value to be set
     */

    public void setResourceType(final EventSubscriptionResourceTypeId resourceType);

    /**
     *  <p>Date and time (UTC) the Event was generated.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    public Event copyDeep();

    /**
     * factory method to create a deep copy of Event
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Event deepCopy(@Nullable final Event template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof EventImpl)) {
            return template.copyDeep();
        }
        EventImpl instance = new EventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setCreatedAt(template.getCreatedAt());
        return instance;
    }

    /**
     * builder for importContainerCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.event.ImportContainerCreatedEventBuilder importContainerCreatedBuilder() {
        return com.commercetools.api.models.event.ImportContainerCreatedEventBuilder.of();
    }

    /**
     * builder for importContainerDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.event.ImportContainerDeletedEventBuilder importContainerDeletedBuilder() {
        return com.commercetools.api.models.event.ImportContainerDeletedEventBuilder.of();
    }

    /**
     * builder for importOperationRejected subtype
     * @return builder
     */
    public static com.commercetools.api.models.event.ImportOperationRejectedEventBuilder importOperationRejectedBuilder() {
        return com.commercetools.api.models.event.ImportOperationRejectedEventBuilder.of();
    }

    /**
     * builder for importUnresolved subtype
     * @return builder
     */
    public static com.commercetools.api.models.event.ImportUnresolvedEventBuilder importUnresolvedBuilder() {
        return com.commercetools.api.models.event.ImportUnresolvedEventBuilder.of();
    }

    /**
     * builder for importValidationFailed subtype
     * @return builder
     */
    public static com.commercetools.api.models.event.ImportValidationFailedEventBuilder importValidationFailedBuilder() {
        return com.commercetools.api.models.event.ImportValidationFailedEventBuilder.of();
    }

    /**
     * builder for importWaitForMasterVariant subtype
     * @return builder
     */
    public static com.commercetools.api.models.event.ImportWaitForMasterVariantEventBuilder importWaitForMasterVariantBuilder() {
        return com.commercetools.api.models.event.ImportWaitForMasterVariantEventBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withEvent(Function<Event, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Event> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Event>() {
            @Override
            public String toString() {
                return "TypeReference<Event>";
            }
        };
    }
}
