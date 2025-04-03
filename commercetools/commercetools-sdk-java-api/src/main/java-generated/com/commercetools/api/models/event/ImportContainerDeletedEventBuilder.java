
package com.commercetools.api.models.event;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImportContainerDeletedEventBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportContainerDeletedEvent importContainerDeletedEvent = ImportContainerDeletedEvent.builder()
 *             .id("{id}")
 *             .notificationType("{notificationType}")
 *             .resourceType(EventSubscriptionResourceTypeId.IMPORT_API)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .data(dataBuilder -> dataBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImportContainerDeletedEventBuilder implements Builder<ImportContainerDeletedEvent> {

    private String id;

    private String notificationType;

    private com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId resourceType;

    private java.time.ZonedDateTime createdAt;

    private com.commercetools.api.models.event.ImportContainerDeletedEventData data;

    /**
     *  <p>Unique identifier of the Event.</p>
     * @param id value to be set
     * @return Builder
     */

    public ImportContainerDeletedEventBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     * set the value to the notificationType
     * @param notificationType value to be set
     * @return Builder
     */

    public ImportContainerDeletedEventBuilder notificationType(final String notificationType) {
        this.notificationType = notificationType;
        return this;
    }

    /**
     * set the value to the resourceType
     * @param resourceType value to be set
     * @return Builder
     */

    public ImportContainerDeletedEventBuilder resourceType(
            final com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Event was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public ImportContainerDeletedEventBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>An object containing details of the deleted Import Container.</p>
     * @param builder function to build the data value
     * @return Builder
     */

    public ImportContainerDeletedEventBuilder data(
            Function<com.commercetools.api.models.event.ImportContainerDeletedEventDataBuilder, com.commercetools.api.models.event.ImportContainerDeletedEventDataBuilder> builder) {
        this.data = builder.apply(com.commercetools.api.models.event.ImportContainerDeletedEventDataBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>An object containing details of the deleted Import Container.</p>
     * @param builder function to build the data value
     * @return Builder
     */

    public ImportContainerDeletedEventBuilder withData(
            Function<com.commercetools.api.models.event.ImportContainerDeletedEventDataBuilder, com.commercetools.api.models.event.ImportContainerDeletedEventData> builder) {
        this.data = builder.apply(com.commercetools.api.models.event.ImportContainerDeletedEventDataBuilder.of());
        return this;
    }

    /**
     *  <p>An object containing details of the deleted Import Container.</p>
     * @param data value to be set
     * @return Builder
     */

    public ImportContainerDeletedEventBuilder data(
            final com.commercetools.api.models.event.ImportContainerDeletedEventData data) {
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
     *  <p>An object containing details of the deleted Import Container.</p>
     * @return data
     */

    public com.commercetools.api.models.event.ImportContainerDeletedEventData getData() {
        return this.data;
    }

    /**
     * builds ImportContainerDeletedEvent with checking for non-null required values
     * @return ImportContainerDeletedEvent
     */
    public ImportContainerDeletedEvent build() {
        Objects.requireNonNull(id, ImportContainerDeletedEvent.class + ": id is missing");
        Objects.requireNonNull(notificationType, ImportContainerDeletedEvent.class + ": notificationType is missing");
        Objects.requireNonNull(resourceType, ImportContainerDeletedEvent.class + ": resourceType is missing");
        Objects.requireNonNull(createdAt, ImportContainerDeletedEvent.class + ": createdAt is missing");
        Objects.requireNonNull(data, ImportContainerDeletedEvent.class + ": data is missing");
        return new ImportContainerDeletedEventImpl(id, notificationType, resourceType, createdAt, data);
    }

    /**
     * builds ImportContainerDeletedEvent without checking for non-null required values
     * @return ImportContainerDeletedEvent
     */
    public ImportContainerDeletedEvent buildUnchecked() {
        return new ImportContainerDeletedEventImpl(id, notificationType, resourceType, createdAt, data);
    }

    /**
     * factory method for an instance of ImportContainerDeletedEventBuilder
     * @return builder
     */
    public static ImportContainerDeletedEventBuilder of() {
        return new ImportContainerDeletedEventBuilder();
    }

    /**
     * create builder for ImportContainerDeletedEvent instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportContainerDeletedEventBuilder of(final ImportContainerDeletedEvent template) {
        ImportContainerDeletedEventBuilder builder = new ImportContainerDeletedEventBuilder();
        builder.id = template.getId();
        builder.notificationType = template.getNotificationType();
        builder.resourceType = template.getResourceType();
        builder.createdAt = template.getCreatedAt();
        builder.data = template.getData();
        return builder;
    }

}
