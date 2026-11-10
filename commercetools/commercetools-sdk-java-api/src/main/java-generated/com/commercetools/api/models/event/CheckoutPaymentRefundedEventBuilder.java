
package com.commercetools.api.models.event;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CheckoutPaymentRefundedEventBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CheckoutPaymentRefundedEvent checkoutPaymentRefundedEvent = CheckoutPaymentRefundedEvent.builder()
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
public class CheckoutPaymentRefundedEventBuilder implements Builder<CheckoutPaymentRefundedEvent> {

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

    public CheckoutPaymentRefundedEventBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     * set the value to the notificationType
     * @param notificationType value to be set
     * @return Builder
     */

    public CheckoutPaymentRefundedEventBuilder notificationType(final String notificationType) {
        this.notificationType = notificationType;
        return this;
    }

    /**
     * set the value to the resourceType
     * @param resourceType value to be set
     * @return Builder
     */

    public CheckoutPaymentRefundedEventBuilder resourceType(
            final com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Event was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public CheckoutPaymentRefundedEventBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>An object containing details of the successful payment refund.</p>
     * @param builder function to build the data value
     * @return Builder
     */

    public CheckoutPaymentRefundedEventBuilder data(
            Function<com.commercetools.api.models.event.CheckoutMessagePaymentsPayloadBaseDataBuilder, com.commercetools.api.models.event.CheckoutMessagePaymentsPayloadBaseDataBuilder> builder) {
        this.data = builder.apply(com.commercetools.api.models.event.CheckoutMessagePaymentsPayloadBaseDataBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>An object containing details of the successful payment refund.</p>
     * @param builder function to build the data value
     * @return Builder
     */

    public CheckoutPaymentRefundedEventBuilder withData(
            Function<com.commercetools.api.models.event.CheckoutMessagePaymentsPayloadBaseDataBuilder, com.commercetools.api.models.event.CheckoutMessagePaymentsPayloadBaseData> builder) {
        this.data = builder
                .apply(com.commercetools.api.models.event.CheckoutMessagePaymentsPayloadBaseDataBuilder.of());
        return this;
    }

    /**
     *  <p>An object containing details of the successful payment refund.</p>
     * @param data value to be set
     * @return Builder
     */

    public CheckoutPaymentRefundedEventBuilder data(
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
     *  <p>An object containing details of the successful payment refund.</p>
     * @return data
     */

    public com.commercetools.api.models.event.CheckoutMessagePaymentsPayloadBaseData getData() {
        return this.data;
    }

    /**
     * builds CheckoutPaymentRefundedEvent with checking for non-null required values
     * @return CheckoutPaymentRefundedEvent
     */
    public CheckoutPaymentRefundedEvent build() {
        Objects.requireNonNull(id, CheckoutPaymentRefundedEvent.class + ": id is missing");
        Objects.requireNonNull(notificationType, CheckoutPaymentRefundedEvent.class + ": notificationType is missing");
        Objects.requireNonNull(resourceType, CheckoutPaymentRefundedEvent.class + ": resourceType is missing");
        Objects.requireNonNull(createdAt, CheckoutPaymentRefundedEvent.class + ": createdAt is missing");
        Objects.requireNonNull(data, CheckoutPaymentRefundedEvent.class + ": data is missing");
        return new CheckoutPaymentRefundedEventImpl(id, notificationType, resourceType, createdAt, data);
    }

    /**
     * builds CheckoutPaymentRefundedEvent without checking for non-null required values
     * @return CheckoutPaymentRefundedEvent
     */
    public CheckoutPaymentRefundedEvent buildUnchecked() {
        return new CheckoutPaymentRefundedEventImpl(id, notificationType, resourceType, createdAt, data);
    }

    /**
     * factory method for an instance of CheckoutPaymentRefundedEventBuilder
     * @return builder
     */
    public static CheckoutPaymentRefundedEventBuilder of() {
        return new CheckoutPaymentRefundedEventBuilder();
    }

    /**
     * create builder for CheckoutPaymentRefundedEvent instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CheckoutPaymentRefundedEventBuilder of(final CheckoutPaymentRefundedEvent template) {
        CheckoutPaymentRefundedEventBuilder builder = new CheckoutPaymentRefundedEventBuilder();
        builder.id = template.getId();
        builder.notificationType = template.getNotificationType();
        builder.resourceType = template.getResourceType();
        builder.createdAt = template.getCreatedAt();
        builder.data = template.getData();
        return builder;
    }

}
