
package com.commercetools.api.models.event;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImportValidationFailedEventBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportValidationFailedEvent importValidationFailedEvent = ImportValidationFailedEvent.builder()
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
public class ImportValidationFailedEventBuilder implements Builder<ImportValidationFailedEvent> {

    private String id;

    private String notificationType;

    private com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId resourceType;

    private java.time.ZonedDateTime createdAt;

    private com.commercetools.api.models.event.ImportValidationFailedEventData data;

    /**
     *  <p>Unique identifier of the Event.</p>
     * @param id value to be set
     * @return Builder
     */

    public ImportValidationFailedEventBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     * set the value to the notificationType
     * @param notificationType value to be set
     * @return Builder
     */

    public ImportValidationFailedEventBuilder notificationType(final String notificationType) {
        this.notificationType = notificationType;
        return this;
    }

    /**
     * set the value to the resourceType
     * @param resourceType value to be set
     * @return Builder
     */

    public ImportValidationFailedEventBuilder resourceType(
            final com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Event was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public ImportValidationFailedEventBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>An object containing details of the Import Operation with the <code>validationFailed</code> state.</p>
     * @param builder function to build the data value
     * @return Builder
     */

    public ImportValidationFailedEventBuilder data(
            Function<com.commercetools.api.models.event.ImportValidationFailedEventDataBuilder, com.commercetools.api.models.event.ImportValidationFailedEventDataBuilder> builder) {
        this.data = builder.apply(com.commercetools.api.models.event.ImportValidationFailedEventDataBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>An object containing details of the Import Operation with the <code>validationFailed</code> state.</p>
     * @param builder function to build the data value
     * @return Builder
     */

    public ImportValidationFailedEventBuilder withData(
            Function<com.commercetools.api.models.event.ImportValidationFailedEventDataBuilder, com.commercetools.api.models.event.ImportValidationFailedEventData> builder) {
        this.data = builder.apply(com.commercetools.api.models.event.ImportValidationFailedEventDataBuilder.of());
        return this;
    }

    /**
     *  <p>An object containing details of the Import Operation with the <code>validationFailed</code> state.</p>
     * @param data value to be set
     * @return Builder
     */

    public ImportValidationFailedEventBuilder data(
            final com.commercetools.api.models.event.ImportValidationFailedEventData data) {
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
     *  <p>An object containing details of the Import Operation with the <code>validationFailed</code> state.</p>
     * @return data
     */

    public com.commercetools.api.models.event.ImportValidationFailedEventData getData() {
        return this.data;
    }

    /**
     * builds ImportValidationFailedEvent with checking for non-null required values
     * @return ImportValidationFailedEvent
     */
    public ImportValidationFailedEvent build() {
        Objects.requireNonNull(id, ImportValidationFailedEvent.class + ": id is missing");
        Objects.requireNonNull(notificationType, ImportValidationFailedEvent.class + ": notificationType is missing");
        Objects.requireNonNull(resourceType, ImportValidationFailedEvent.class + ": resourceType is missing");
        Objects.requireNonNull(createdAt, ImportValidationFailedEvent.class + ": createdAt is missing");
        Objects.requireNonNull(data, ImportValidationFailedEvent.class + ": data is missing");
        return new ImportValidationFailedEventImpl(id, notificationType, resourceType, createdAt, data);
    }

    /**
     * builds ImportValidationFailedEvent without checking for non-null required values
     * @return ImportValidationFailedEvent
     */
    public ImportValidationFailedEvent buildUnchecked() {
        return new ImportValidationFailedEventImpl(id, notificationType, resourceType, createdAt, data);
    }

    /**
     * factory method for an instance of ImportValidationFailedEventBuilder
     * @return builder
     */
    public static ImportValidationFailedEventBuilder of() {
        return new ImportValidationFailedEventBuilder();
    }

    /**
     * create builder for ImportValidationFailedEvent instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportValidationFailedEventBuilder of(final ImportValidationFailedEvent template) {
        ImportValidationFailedEventBuilder builder = new ImportValidationFailedEventBuilder();
        builder.id = template.getId();
        builder.notificationType = template.getNotificationType();
        builder.resourceType = template.getResourceType();
        builder.createdAt = template.getCreatedAt();
        builder.data = template.getData();
        return builder;
    }

}
