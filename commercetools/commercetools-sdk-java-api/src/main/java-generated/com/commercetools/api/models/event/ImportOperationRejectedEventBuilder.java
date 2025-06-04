
package com.commercetools.api.models.event;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImportOperationRejectedEventBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportOperationRejectedEvent importOperationRejectedEvent = ImportOperationRejectedEvent.builder()
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
public class ImportOperationRejectedEventBuilder implements Builder<ImportOperationRejectedEvent> {

    private String id;

    private String notificationType;

    private com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId resourceType;

    private java.time.ZonedDateTime createdAt;

    private com.commercetools.api.models.event.ImportOperationRejectedEventData data;

    /**
     *  <p>Unique identifier of the Event.</p>
     * @param id value to be set
     * @return Builder
     */

    public ImportOperationRejectedEventBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     * set the value to the notificationType
     * @param notificationType value to be set
     * @return Builder
     */

    public ImportOperationRejectedEventBuilder notificationType(final String notificationType) {
        this.notificationType = notificationType;
        return this;
    }

    /**
     * set the value to the resourceType
     * @param resourceType value to be set
     * @return Builder
     */

    public ImportOperationRejectedEventBuilder resourceType(
            final com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Event was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public ImportOperationRejectedEventBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>An object containing details of the Import Operation with the <code>rejected</code> state.</p>
     * @param builder function to build the data value
     * @return Builder
     */

    public ImportOperationRejectedEventBuilder data(
            Function<com.commercetools.api.models.event.ImportOperationRejectedEventDataBuilder, com.commercetools.api.models.event.ImportOperationRejectedEventDataBuilder> builder) {
        this.data = builder.apply(com.commercetools.api.models.event.ImportOperationRejectedEventDataBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>An object containing details of the Import Operation with the <code>rejected</code> state.</p>
     * @param builder function to build the data value
     * @return Builder
     */

    public ImportOperationRejectedEventBuilder withData(
            Function<com.commercetools.api.models.event.ImportOperationRejectedEventDataBuilder, com.commercetools.api.models.event.ImportOperationRejectedEventData> builder) {
        this.data = builder.apply(com.commercetools.api.models.event.ImportOperationRejectedEventDataBuilder.of());
        return this;
    }

    /**
     *  <p>An object containing details of the Import Operation with the <code>rejected</code> state.</p>
     * @param data value to be set
     * @return Builder
     */

    public ImportOperationRejectedEventBuilder data(
            final com.commercetools.api.models.event.ImportOperationRejectedEventData data) {
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
     *  <p>An object containing details of the Import Operation with the <code>rejected</code> state.</p>
     * @return data
     */

    public com.commercetools.api.models.event.ImportOperationRejectedEventData getData() {
        return this.data;
    }

    /**
     * builds ImportOperationRejectedEvent with checking for non-null required values
     * @return ImportOperationRejectedEvent
     */
    public ImportOperationRejectedEvent build() {
        Objects.requireNonNull(id, ImportOperationRejectedEvent.class + ": id is missing");
        Objects.requireNonNull(notificationType, ImportOperationRejectedEvent.class + ": notificationType is missing");
        Objects.requireNonNull(resourceType, ImportOperationRejectedEvent.class + ": resourceType is missing");
        Objects.requireNonNull(createdAt, ImportOperationRejectedEvent.class + ": createdAt is missing");
        Objects.requireNonNull(data, ImportOperationRejectedEvent.class + ": data is missing");
        return new ImportOperationRejectedEventImpl(id, notificationType, resourceType, createdAt, data);
    }

    /**
     * builds ImportOperationRejectedEvent without checking for non-null required values
     * @return ImportOperationRejectedEvent
     */
    public ImportOperationRejectedEvent buildUnchecked() {
        return new ImportOperationRejectedEventImpl(id, notificationType, resourceType, createdAt, data);
    }

    /**
     * factory method for an instance of ImportOperationRejectedEventBuilder
     * @return builder
     */
    public static ImportOperationRejectedEventBuilder of() {
        return new ImportOperationRejectedEventBuilder();
    }

    /**
     * create builder for ImportOperationRejectedEvent instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportOperationRejectedEventBuilder of(final ImportOperationRejectedEvent template) {
        ImportOperationRejectedEventBuilder builder = new ImportOperationRejectedEventBuilder();
        builder.id = template.getId();
        builder.notificationType = template.getNotificationType();
        builder.resourceType = template.getResourceType();
        builder.createdAt = template.getCreatedAt();
        builder.data = template.getData();
        return builder;
    }

}
