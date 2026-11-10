
package com.commercetools.api.models.event;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BaseEventBuilder
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
public class BaseEventBuilder implements Builder<BaseEvent> {

    private String id;

    private String notificationType;

    private com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId resourceType;

    private com.commercetools.api.models.subscription.EventType type;

    private java.lang.Object data;

    private java.time.ZonedDateTime createdAt;

    /**
     *  <p>Unique identifier of the Event.</p>
     * @param id value to be set
     * @return Builder
     */

    public BaseEventBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     * set the value to the notificationType
     * @param notificationType value to be set
     * @return Builder
     */

    public BaseEventBuilder notificationType(final String notificationType) {
        this.notificationType = notificationType;
        return this;
    }

    /**
     *  <p>The type of resource targeted by the Event.</p>
     * @param resourceType value to be set
     * @return Builder
     */

    public BaseEventBuilder resourceType(
            final com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     *  <p>The type of Event that has occurred.</p>
     * @param type value to be set
     * @return Builder
     */

    public BaseEventBuilder type(final com.commercetools.api.models.subscription.EventType type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>An object containing details related to the Event.</p>
     * @param data value to be set
     * @return Builder
     */

    public BaseEventBuilder data(final java.lang.Object data) {
        this.data = data;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Event was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public BaseEventBuilder createdAt(final java.time.ZonedDateTime createdAt) {
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
     * value of notificationType}
     * @return notificationType
     */

    public String getNotificationType() {
        return this.notificationType;
    }

    /**
     *  <p>The type of resource targeted by the Event.</p>
     * @return resourceType
     */

    public com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId getResourceType() {
        return this.resourceType;
    }

    /**
     *  <p>The type of Event that has occurred.</p>
     * @return type
     */

    public com.commercetools.api.models.subscription.EventType getType() {
        return this.type;
    }

    /**
     *  <p>An object containing details related to the Event.</p>
     * @return data
     */

    public java.lang.Object getData() {
        return this.data;
    }

    /**
     *  <p>Date and time (UTC) the Event was generated.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * builds BaseEvent with checking for non-null required values
     * @return BaseEvent
     */
    public BaseEvent build() {
        Objects.requireNonNull(id, BaseEvent.class + ": id is missing");
        Objects.requireNonNull(notificationType, BaseEvent.class + ": notificationType is missing");
        Objects.requireNonNull(resourceType, BaseEvent.class + ": resourceType is missing");
        Objects.requireNonNull(type, BaseEvent.class + ": type is missing");
        Objects.requireNonNull(data, BaseEvent.class + ": data is missing");
        Objects.requireNonNull(createdAt, BaseEvent.class + ": createdAt is missing");
        return new BaseEventImpl(id, notificationType, resourceType, type, data, createdAt);
    }

    /**
     * builds BaseEvent without checking for non-null required values
     * @return BaseEvent
     */
    public BaseEvent buildUnchecked() {
        return new BaseEventImpl(id, notificationType, resourceType, type, data, createdAt);
    }

    /**
     * factory method for an instance of BaseEventBuilder
     * @return builder
     */
    public static BaseEventBuilder of() {
        return new BaseEventBuilder();
    }

    /**
     * create builder for BaseEvent instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BaseEventBuilder of(final BaseEvent template) {
        BaseEventBuilder builder = new BaseEventBuilder();
        builder.id = template.getId();
        builder.notificationType = template.getNotificationType();
        builder.resourceType = template.getResourceType();
        builder.type = template.getType();
        builder.data = template.getData();
        builder.createdAt = template.getCreatedAt();
        return builder;
    }

}
