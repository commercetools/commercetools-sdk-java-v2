
package com.commercetools.api.models.event;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CheckoutPaymentAuthorizationFailedEventBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CheckoutPaymentAuthorizationFailedEvent checkoutPaymentAuthorizationFailedEvent = CheckoutPaymentAuthorizationFailedEvent.builder()
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
public class CheckoutPaymentAuthorizationFailedEventBuilder
        implements Builder<CheckoutPaymentAuthorizationFailedEvent> {

    private String id;

    private String notificationType;

    private com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId resourceType;

    private java.time.ZonedDateTime createdAt;

    private com.commercetools.api.models.event.CheckoutMessagePaymentsPayloadBaseData data;

    /**
     *  <p>Unique identifier of the Event.</p>
     * @param id value to be set
     * @return Builder
     */

    public CheckoutPaymentAuthorizationFailedEventBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     * set the value to the notificationType
     * @param notificationType value to be set
     * @return Builder
     */

    public CheckoutPaymentAuthorizationFailedEventBuilder notificationType(final String notificationType) {
        this.notificationType = notificationType;
        return this;
    }

    /**
     * set the value to the resourceType
     * @param resourceType value to be set
     * @return Builder
     */

    public CheckoutPaymentAuthorizationFailedEventBuilder resourceType(
            final com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Event was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public CheckoutPaymentAuthorizationFailedEventBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>An object containing details of the payment authorization that failed.</p>
     * @param builder function to build the data value
     * @return Builder
     */

    public CheckoutPaymentAuthorizationFailedEventBuilder data(
            Function<com.commercetools.api.models.event.CheckoutMessagePaymentsPayloadBaseDataBuilder, com.commercetools.api.models.event.CheckoutMessagePaymentsPayloadBaseDataBuilder> builder) {
        this.data = builder.apply(com.commercetools.api.models.event.CheckoutMessagePaymentsPayloadBaseDataBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>An object containing details of the payment authorization that failed.</p>
     * @param builder function to build the data value
     * @return Builder
     */

    public CheckoutPaymentAuthorizationFailedEventBuilder withData(
            Function<com.commercetools.api.models.event.CheckoutMessagePaymentsPayloadBaseDataBuilder, com.commercetools.api.models.event.CheckoutMessagePaymentsPayloadBaseData> builder) {
        this.data = builder
                .apply(com.commercetools.api.models.event.CheckoutMessagePaymentsPayloadBaseDataBuilder.of());
        return this;
    }

    /**
     *  <p>An object containing details of the payment authorization that failed.</p>
     * @param data value to be set
     * @return Builder
     */

    public CheckoutPaymentAuthorizationFailedEventBuilder data(
            final com.commercetools.api.models.event.CheckoutMessagePaymentsPayloadBaseData data) {
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
     *  <p>An object containing details of the payment authorization that failed.</p>
     * @return data
     */

    public com.commercetools.api.models.event.CheckoutMessagePaymentsPayloadBaseData getData() {
        return this.data;
    }

    /**
     * builds CheckoutPaymentAuthorizationFailedEvent with checking for non-null required values
     * @return CheckoutPaymentAuthorizationFailedEvent
     */
    public CheckoutPaymentAuthorizationFailedEvent build() {
        Objects.requireNonNull(id, CheckoutPaymentAuthorizationFailedEvent.class + ": id is missing");
        Objects.requireNonNull(notificationType,
            CheckoutPaymentAuthorizationFailedEvent.class + ": notificationType is missing");
        Objects.requireNonNull(resourceType,
            CheckoutPaymentAuthorizationFailedEvent.class + ": resourceType is missing");
        Objects.requireNonNull(createdAt, CheckoutPaymentAuthorizationFailedEvent.class + ": createdAt is missing");
        Objects.requireNonNull(data, CheckoutPaymentAuthorizationFailedEvent.class + ": data is missing");
        return new CheckoutPaymentAuthorizationFailedEventImpl(id, notificationType, resourceType, createdAt, data);
    }

    /**
     * builds CheckoutPaymentAuthorizationFailedEvent without checking for non-null required values
     * @return CheckoutPaymentAuthorizationFailedEvent
     */
    public CheckoutPaymentAuthorizationFailedEvent buildUnchecked() {
        return new CheckoutPaymentAuthorizationFailedEventImpl(id, notificationType, resourceType, createdAt, data);
    }

    /**
     * factory method for an instance of CheckoutPaymentAuthorizationFailedEventBuilder
     * @return builder
     */
    public static CheckoutPaymentAuthorizationFailedEventBuilder of() {
        return new CheckoutPaymentAuthorizationFailedEventBuilder();
    }

    /**
     * create builder for CheckoutPaymentAuthorizationFailedEvent instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CheckoutPaymentAuthorizationFailedEventBuilder of(
            final CheckoutPaymentAuthorizationFailedEvent template) {
        CheckoutPaymentAuthorizationFailedEventBuilder builder = new CheckoutPaymentAuthorizationFailedEventBuilder();
        builder.id = template.getId();
        builder.notificationType = template.getNotificationType();
        builder.resourceType = template.getResourceType();
        builder.createdAt = template.getCreatedAt();
        builder.data = template.getData();
        return builder;
    }

}
