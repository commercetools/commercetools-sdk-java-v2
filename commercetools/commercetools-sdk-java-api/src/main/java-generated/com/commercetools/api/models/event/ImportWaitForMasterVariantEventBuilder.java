
package com.commercetools.api.models.event;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImportWaitForMasterVariantEventBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportWaitForMasterVariantEvent importWaitForMasterVariantEvent = ImportWaitForMasterVariantEvent.builder()
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
public class ImportWaitForMasterVariantEventBuilder implements Builder<ImportWaitForMasterVariantEvent> {

    private String id;

    private String notificationType;

    private com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId resourceType;

    private java.time.ZonedDateTime createdAt;

    private com.commercetools.api.models.event.ImportWaitForMasterVariantEventData data;

    /**
     *  <p>Unique identifier of the Event.</p>
     * @param id value to be set
     * @return Builder
     */

    public ImportWaitForMasterVariantEventBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     * set the value to the notificationType
     * @param notificationType value to be set
     * @return Builder
     */

    public ImportWaitForMasterVariantEventBuilder notificationType(final String notificationType) {
        this.notificationType = notificationType;
        return this;
    }

    /**
     * set the value to the resourceType
     * @param resourceType value to be set
     * @return Builder
     */

    public ImportWaitForMasterVariantEventBuilder resourceType(
            final com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Event was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public ImportWaitForMasterVariantEventBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>An object containing details of the Import Operation with the <code>waitForMasterVariant</code> state.</p>
     * @param builder function to build the data value
     * @return Builder
     */

    public ImportWaitForMasterVariantEventBuilder data(
            Function<com.commercetools.api.models.event.ImportWaitForMasterVariantEventDataBuilder, com.commercetools.api.models.event.ImportWaitForMasterVariantEventDataBuilder> builder) {
        this.data = builder.apply(com.commercetools.api.models.event.ImportWaitForMasterVariantEventDataBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>An object containing details of the Import Operation with the <code>waitForMasterVariant</code> state.</p>
     * @param builder function to build the data value
     * @return Builder
     */

    public ImportWaitForMasterVariantEventBuilder withData(
            Function<com.commercetools.api.models.event.ImportWaitForMasterVariantEventDataBuilder, com.commercetools.api.models.event.ImportWaitForMasterVariantEventData> builder) {
        this.data = builder.apply(com.commercetools.api.models.event.ImportWaitForMasterVariantEventDataBuilder.of());
        return this;
    }

    /**
     *  <p>An object containing details of the Import Operation with the <code>waitForMasterVariant</code> state.</p>
     * @param data value to be set
     * @return Builder
     */

    public ImportWaitForMasterVariantEventBuilder data(
            final com.commercetools.api.models.event.ImportWaitForMasterVariantEventData data) {
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
     *  <p>An object containing details of the Import Operation with the <code>waitForMasterVariant</code> state.</p>
     * @return data
     */

    public com.commercetools.api.models.event.ImportWaitForMasterVariantEventData getData() {
        return this.data;
    }

    /**
     * builds ImportWaitForMasterVariantEvent with checking for non-null required values
     * @return ImportWaitForMasterVariantEvent
     */
    public ImportWaitForMasterVariantEvent build() {
        Objects.requireNonNull(id, ImportWaitForMasterVariantEvent.class + ": id is missing");
        Objects.requireNonNull(notificationType,
            ImportWaitForMasterVariantEvent.class + ": notificationType is missing");
        Objects.requireNonNull(resourceType, ImportWaitForMasterVariantEvent.class + ": resourceType is missing");
        Objects.requireNonNull(createdAt, ImportWaitForMasterVariantEvent.class + ": createdAt is missing");
        Objects.requireNonNull(data, ImportWaitForMasterVariantEvent.class + ": data is missing");
        return new ImportWaitForMasterVariantEventImpl(id, notificationType, resourceType, createdAt, data);
    }

    /**
     * builds ImportWaitForMasterVariantEvent without checking for non-null required values
     * @return ImportWaitForMasterVariantEvent
     */
    public ImportWaitForMasterVariantEvent buildUnchecked() {
        return new ImportWaitForMasterVariantEventImpl(id, notificationType, resourceType, createdAt, data);
    }

    /**
     * factory method for an instance of ImportWaitForMasterVariantEventBuilder
     * @return builder
     */
    public static ImportWaitForMasterVariantEventBuilder of() {
        return new ImportWaitForMasterVariantEventBuilder();
    }

    /**
     * create builder for ImportWaitForMasterVariantEvent instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportWaitForMasterVariantEventBuilder of(final ImportWaitForMasterVariantEvent template) {
        ImportWaitForMasterVariantEventBuilder builder = new ImportWaitForMasterVariantEventBuilder();
        builder.id = template.getId();
        builder.notificationType = template.getNotificationType();
        builder.resourceType = template.getResourceType();
        builder.createdAt = template.getCreatedAt();
        builder.data = template.getData();
        return builder;
    }

}
