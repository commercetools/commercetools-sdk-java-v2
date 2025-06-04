
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

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Base representation of an Event containing common fields to all Event Types.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BaseEvent baseEvent = BaseEvent.builder()
 *             .id("{id}")
 *             .notificationType("{notificationType}")
 *             .resourceType(EventSubscriptionResourceTypeId.CHECKOUT)
 *             .type(EventType.CHECKOUT_ORDER_CREATION_FAILED)
 *             .data(dataBuilder -> dataBuilder)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BaseEventImpl.class)
public interface BaseEvent {

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
     *  <p>An object containing details related to the Event.</p>
     * @return data
     */
    @NotNull
    @Valid
    @JsonProperty("data")
    public Object getData();

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
     *  <p>The type of Event that has occurred.</p>
     * @param type value to be set
     */

    public void setType(final EventType type);

    /**
     *  <p>An object containing details related to the Event.</p>
     * @param data value to be set
     */

    public void setData(final Object data);

    /**
     *  <p>Date and time (UTC) the Event was generated.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     * factory method
     * @return instance of BaseEvent
     */
    public static BaseEvent of() {
        return new BaseEventImpl();
    }

    /**
     * factory method to create a shallow copy BaseEvent
     * @param template instance to be copied
     * @return copy instance
     */
    public static BaseEvent of(final BaseEvent template) {
        BaseEventImpl instance = new BaseEventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setType(template.getType());
        instance.setData(template.getData());
        instance.setCreatedAt(template.getCreatedAt());
        return instance;
    }

    public BaseEvent copyDeep();

    /**
     * factory method to create a deep copy of BaseEvent
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BaseEvent deepCopy(@Nullable final BaseEvent template) {
        if (template == null) {
            return null;
        }
        BaseEventImpl instance = new BaseEventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setType(template.getType());
        instance.setData(template.getData());
        instance.setCreatedAt(template.getCreatedAt());
        return instance;
    }

    /**
     * builder factory method for BaseEvent
     * @return builder
     */
    public static BaseEventBuilder builder() {
        return BaseEventBuilder.of();
    }

    /**
     * create builder for BaseEvent instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BaseEventBuilder builder(final BaseEvent template) {
        return BaseEventBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBaseEvent(Function<BaseEvent, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BaseEvent> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BaseEvent>() {
            @Override
            public String toString() {
                return "TypeReference<BaseEvent>";
            }
        };
    }
}
