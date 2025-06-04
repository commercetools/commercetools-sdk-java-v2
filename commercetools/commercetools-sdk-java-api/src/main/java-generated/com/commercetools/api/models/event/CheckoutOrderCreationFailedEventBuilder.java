
package com.commercetools.api.models.event;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CheckoutOrderCreationFailedEventBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CheckoutOrderCreationFailedEvent checkoutOrderCreationFailedEvent = CheckoutOrderCreationFailedEvent.builder()
 *             .id("{id}")
 *             .notificationType("{notificationType}")
 *             .resourceType(EventSubscriptionResourceTypeId.CHECKOUT)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .data(dataBuilder -> dataBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CheckoutOrderCreationFailedEventBuilder implements Builder<CheckoutOrderCreationFailedEvent> {

    private String id;

    private String notificationType;

    private com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId resourceType;

    private java.time.ZonedDateTime createdAt;

    private com.commercetools.api.models.event.CheckoutMessageOrderPayloadBaseData data;

    /**
     *  <p>Unique identifier of the Event.</p>
     * @param id value to be set
     * @return Builder
     */

    public CheckoutOrderCreationFailedEventBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     * set the value to the notificationType
     * @param notificationType value to be set
     * @return Builder
     */

    public CheckoutOrderCreationFailedEventBuilder notificationType(final String notificationType) {
        this.notificationType = notificationType;
        return this;
    }

    /**
     * set the value to the resourceType
     * @param resourceType value to be set
     * @return Builder
     */

    public CheckoutOrderCreationFailedEventBuilder resourceType(
            final com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Event was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public CheckoutOrderCreationFailedEventBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>An object containing details of the order which could not be created.</p>
     * @param builder function to build the data value
     * @return Builder
     */

    public CheckoutOrderCreationFailedEventBuilder data(
            Function<com.commercetools.api.models.event.CheckoutMessageOrderPayloadBaseDataBuilder, com.commercetools.api.models.event.CheckoutMessageOrderPayloadBaseDataBuilder> builder) {
        this.data = builder.apply(com.commercetools.api.models.event.CheckoutMessageOrderPayloadBaseDataBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>An object containing details of the order which could not be created.</p>
     * @param builder function to build the data value
     * @return Builder
     */

    public CheckoutOrderCreationFailedEventBuilder withData(
            Function<com.commercetools.api.models.event.CheckoutMessageOrderPayloadBaseDataBuilder, com.commercetools.api.models.event.CheckoutMessageOrderPayloadBaseData> builder) {
        this.data = builder.apply(com.commercetools.api.models.event.CheckoutMessageOrderPayloadBaseDataBuilder.of());
        return this;
    }

    /**
     *  <p>An object containing details of the order which could not be created.</p>
     * @param data value to be set
     * @return Builder
     */

    public CheckoutOrderCreationFailedEventBuilder data(
            final com.commercetools.api.models.event.CheckoutMessageOrderPayloadBaseData data) {
        this.data = data;
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
     * value of resourceType}
     * @return resourceType
     */

    public com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId getResourceType() {
        return this.resourceType;
    }

    /**
     *  <p>Date and time (UTC) the Event was generated.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>An object containing details of the order which could not be created.</p>
     * @return data
     */

    public com.commercetools.api.models.event.CheckoutMessageOrderPayloadBaseData getData() {
        return this.data;
    }

    /**
     * builds CheckoutOrderCreationFailedEvent with checking for non-null required values
     * @return CheckoutOrderCreationFailedEvent
     */
    public CheckoutOrderCreationFailedEvent build() {
        Objects.requireNonNull(id, CheckoutOrderCreationFailedEvent.class + ": id is missing");
        Objects.requireNonNull(notificationType,
            CheckoutOrderCreationFailedEvent.class + ": notificationType is missing");
        Objects.requireNonNull(resourceType, CheckoutOrderCreationFailedEvent.class + ": resourceType is missing");
        Objects.requireNonNull(createdAt, CheckoutOrderCreationFailedEvent.class + ": createdAt is missing");
        Objects.requireNonNull(data, CheckoutOrderCreationFailedEvent.class + ": data is missing");
        return new CheckoutOrderCreationFailedEventImpl(id, notificationType, resourceType, createdAt, data);
    }

    /**
     * builds CheckoutOrderCreationFailedEvent without checking for non-null required values
     * @return CheckoutOrderCreationFailedEvent
     */
    public CheckoutOrderCreationFailedEvent buildUnchecked() {
        return new CheckoutOrderCreationFailedEventImpl(id, notificationType, resourceType, createdAt, data);
    }

    /**
     * factory method for an instance of CheckoutOrderCreationFailedEventBuilder
     * @return builder
     */
    public static CheckoutOrderCreationFailedEventBuilder of() {
        return new CheckoutOrderCreationFailedEventBuilder();
    }

    /**
     * create builder for CheckoutOrderCreationFailedEvent instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CheckoutOrderCreationFailedEventBuilder of(final CheckoutOrderCreationFailedEvent template) {
        CheckoutOrderCreationFailedEventBuilder builder = new CheckoutOrderCreationFailedEventBuilder();
        builder.id = template.getId();
        builder.notificationType = template.getNotificationType();
        builder.resourceType = template.getResourceType();
        builder.createdAt = template.getCreatedAt();
        builder.data = template.getData();
        return builder;
    }

}
