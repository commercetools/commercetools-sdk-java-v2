
package com.commercetools.api.models.subscription;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * EventDeliveryPayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EventDeliveryPayload eventDeliveryPayload = EventDeliveryPayload.builder()
 *             .id("{id}")
 *             .type(EventType.CHECKOUT_ORDER_CREATION_FAILED)
 *             .resourceType("{resourceType}")
 *             .data(dataBuilder -> dataBuilder)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class EventDeliveryPayloadBuilder implements Builder<EventDeliveryPayload> {

    private String id;

    private com.commercetools.api.models.subscription.EventType type;

    private String resourceType;

    private java.lang.Object data;

    private java.time.ZonedDateTime createdAt;

    /**
     *  <p>Unique identifier of the Event.</p>
     * @param id value to be set
     * @return Builder
     */

    public EventDeliveryPayloadBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>The type of Event that has occurred.</p>
     * @param type value to be set
     * @return Builder
     */

    public EventDeliveryPayloadBuilder type(final com.commercetools.api.models.subscription.EventType type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>The type of resource targeted by the Event.</p>
     * @param resourceType value to be set
     * @return Builder
     */

    public EventDeliveryPayloadBuilder resourceType(final String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     *  <p>The data describing the event that has taken place.</p>
     * @param data value to be set
     * @return Builder
     */

    public EventDeliveryPayloadBuilder data(final java.lang.Object data) {
        this.data = data;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the resource was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public EventDeliveryPayloadBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Unique identifier of the Event.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>The type of Event that has occurred.</p>
     * @return type
     */

    public com.commercetools.api.models.subscription.EventType getType() {
        return this.type;
    }

    /**
     *  <p>The type of resource targeted by the Event.</p>
     * @return resourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     *  <p>The data describing the event that has taken place.</p>
     * @return data
     */

    public java.lang.Object getData() {
        return this.data;
    }

    /**
     *  <p>Date and time (UTC) the resource was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * builds EventDeliveryPayload with checking for non-null required values
     * @return EventDeliveryPayload
     */
    public EventDeliveryPayload build() {
        Objects.requireNonNull(id, EventDeliveryPayload.class + ": id is missing");
        Objects.requireNonNull(type, EventDeliveryPayload.class + ": type is missing");
        Objects.requireNonNull(resourceType, EventDeliveryPayload.class + ": resourceType is missing");
        Objects.requireNonNull(data, EventDeliveryPayload.class + ": data is missing");
        Objects.requireNonNull(createdAt, EventDeliveryPayload.class + ": createdAt is missing");
        return new EventDeliveryPayloadImpl(id, type, resourceType, data, createdAt);
    }

    /**
     * builds EventDeliveryPayload without checking for non-null required values
     * @return EventDeliveryPayload
     */
    public EventDeliveryPayload buildUnchecked() {
        return new EventDeliveryPayloadImpl(id, type, resourceType, data, createdAt);
    }

    /**
     * factory method for an instance of EventDeliveryPayloadBuilder
     * @return builder
     */
    public static EventDeliveryPayloadBuilder of() {
        return new EventDeliveryPayloadBuilder();
    }

    /**
     * create builder for EventDeliveryPayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static EventDeliveryPayloadBuilder of(final EventDeliveryPayload template) {
        EventDeliveryPayloadBuilder builder = new EventDeliveryPayloadBuilder();
        builder.id = template.getId();
        builder.type = template.getType();
        builder.resourceType = template.getResourceType();
        builder.data = template.getData();
        builder.createdAt = template.getCreatedAt();
        return builder;
    }

}
