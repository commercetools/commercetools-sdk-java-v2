
package com.commercetools.api.models.event;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImportContainerCreatedEventBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportContainerCreatedEvent importContainerCreatedEvent = ImportContainerCreatedEvent.builder()
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
public class ImportContainerCreatedEventBuilder implements Builder<ImportContainerCreatedEvent> {

    private String id;

    private String notificationType;

    private com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId resourceType;

    private java.time.ZonedDateTime createdAt;

    private com.commercetools.api.models.event.ImportContainerCreatedEventData data;

    /**
     *  <p>Unique identifier of the Event.</p>
     * @param id value to be set
     * @return Builder
     */

    public ImportContainerCreatedEventBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     * set the value to the notificationType
     * @param notificationType value to be set
     * @return Builder
     */

    public ImportContainerCreatedEventBuilder notificationType(final String notificationType) {
        this.notificationType = notificationType;
        return this;
    }

    /**
     * set the value to the resourceType
     * @param resourceType value to be set
     * @return Builder
     */

    public ImportContainerCreatedEventBuilder resourceType(
            final com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Event was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public ImportContainerCreatedEventBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>An object containing details of the created Import Container.</p>
     * @param builder function to build the data value
     * @return Builder
     */

    public ImportContainerCreatedEventBuilder data(
            Function<com.commercetools.api.models.event.ImportContainerCreatedEventDataBuilder, com.commercetools.api.models.event.ImportContainerCreatedEventDataBuilder> builder) {
        this.data = builder.apply(com.commercetools.api.models.event.ImportContainerCreatedEventDataBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>An object containing details of the created Import Container.</p>
     * @param builder function to build the data value
     * @return Builder
     */

    public ImportContainerCreatedEventBuilder withData(
            Function<com.commercetools.api.models.event.ImportContainerCreatedEventDataBuilder, com.commercetools.api.models.event.ImportContainerCreatedEventData> builder) {
        this.data = builder.apply(com.commercetools.api.models.event.ImportContainerCreatedEventDataBuilder.of());
        return this;
    }

    /**
     *  <p>An object containing details of the created Import Container.</p>
     * @param data value to be set
     * @return Builder
     */

    public ImportContainerCreatedEventBuilder data(
            final com.commercetools.api.models.event.ImportContainerCreatedEventData data) {
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
     *  <p>An object containing details of the created Import Container.</p>
     * @return data
     */

    public com.commercetools.api.models.event.ImportContainerCreatedEventData getData() {
        return this.data;
    }

    /**
     * builds ImportContainerCreatedEvent with checking for non-null required values
     * @return ImportContainerCreatedEvent
     */
    public ImportContainerCreatedEvent build() {
        Objects.requireNonNull(id, ImportContainerCreatedEvent.class + ": id is missing");
        Objects.requireNonNull(notificationType, ImportContainerCreatedEvent.class + ": notificationType is missing");
        Objects.requireNonNull(resourceType, ImportContainerCreatedEvent.class + ": resourceType is missing");
        Objects.requireNonNull(createdAt, ImportContainerCreatedEvent.class + ": createdAt is missing");
        Objects.requireNonNull(data, ImportContainerCreatedEvent.class + ": data is missing");
        return new ImportContainerCreatedEventImpl(id, notificationType, resourceType, createdAt, data);
    }

    /**
     * builds ImportContainerCreatedEvent without checking for non-null required values
     * @return ImportContainerCreatedEvent
     */
    public ImportContainerCreatedEvent buildUnchecked() {
        return new ImportContainerCreatedEventImpl(id, notificationType, resourceType, createdAt, data);
    }

    /**
     * factory method for an instance of ImportContainerCreatedEventBuilder
     * @return builder
     */
    public static ImportContainerCreatedEventBuilder of() {
        return new ImportContainerCreatedEventBuilder();
    }

    /**
     * create builder for ImportContainerCreatedEvent instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportContainerCreatedEventBuilder of(final ImportContainerCreatedEvent template) {
        ImportContainerCreatedEventBuilder builder = new ImportContainerCreatedEventBuilder();
        builder.id = template.getId();
        builder.notificationType = template.getNotificationType();
        builder.resourceType = template.getResourceType();
        builder.createdAt = template.getCreatedAt();
        builder.data = template.getData();
        return builder;
    }

}
