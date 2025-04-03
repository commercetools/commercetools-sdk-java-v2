
package com.commercetools.api.models.event;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImportUnresolvedEventBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportUnresolvedEvent importUnresolvedEvent = ImportUnresolvedEvent.builder()
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
public class ImportUnresolvedEventBuilder implements Builder<ImportUnresolvedEvent> {

    private String id;

    private String notificationType;

    private com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId resourceType;

    private java.time.ZonedDateTime createdAt;

    private com.commercetools.api.models.event.ImportUnresolvedEventData data;

    /**
     *  <p>Unique identifier of the Event.</p>
     * @param id value to be set
     * @return Builder
     */

    public ImportUnresolvedEventBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     * set the value to the notificationType
     * @param notificationType value to be set
     * @return Builder
     */

    public ImportUnresolvedEventBuilder notificationType(final String notificationType) {
        this.notificationType = notificationType;
        return this;
    }

    /**
     * set the value to the resourceType
     * @param resourceType value to be set
     * @return Builder
     */

    public ImportUnresolvedEventBuilder resourceType(
            final com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Event was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public ImportUnresolvedEventBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>An object containing details of the Import Operation with the <code>unresolved</code> state.</p>
     * @param builder function to build the data value
     * @return Builder
     */

    public ImportUnresolvedEventBuilder data(
            Function<com.commercetools.api.models.event.ImportUnresolvedEventDataBuilder, com.commercetools.api.models.event.ImportUnresolvedEventDataBuilder> builder) {
        this.data = builder.apply(com.commercetools.api.models.event.ImportUnresolvedEventDataBuilder.of()).build();
        return this;
    }

    /**
     *  <p>An object containing details of the Import Operation with the <code>unresolved</code> state.</p>
     * @param builder function to build the data value
     * @return Builder
     */

    public ImportUnresolvedEventBuilder withData(
            Function<com.commercetools.api.models.event.ImportUnresolvedEventDataBuilder, com.commercetools.api.models.event.ImportUnresolvedEventData> builder) {
        this.data = builder.apply(com.commercetools.api.models.event.ImportUnresolvedEventDataBuilder.of());
        return this;
    }

    /**
     *  <p>An object containing details of the Import Operation with the <code>unresolved</code> state.</p>
     * @param data value to be set
     * @return Builder
     */

    public ImportUnresolvedEventBuilder data(final com.commercetools.api.models.event.ImportUnresolvedEventData data) {
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
     *  <p>An object containing details of the Import Operation with the <code>unresolved</code> state.</p>
     * @return data
     */

    public com.commercetools.api.models.event.ImportUnresolvedEventData getData() {
        return this.data;
    }

    /**
     * builds ImportUnresolvedEvent with checking for non-null required values
     * @return ImportUnresolvedEvent
     */
    public ImportUnresolvedEvent build() {
        Objects.requireNonNull(id, ImportUnresolvedEvent.class + ": id is missing");
        Objects.requireNonNull(notificationType, ImportUnresolvedEvent.class + ": notificationType is missing");
        Objects.requireNonNull(resourceType, ImportUnresolvedEvent.class + ": resourceType is missing");
        Objects.requireNonNull(createdAt, ImportUnresolvedEvent.class + ": createdAt is missing");
        Objects.requireNonNull(data, ImportUnresolvedEvent.class + ": data is missing");
        return new ImportUnresolvedEventImpl(id, notificationType, resourceType, createdAt, data);
    }

    /**
     * builds ImportUnresolvedEvent without checking for non-null required values
     * @return ImportUnresolvedEvent
     */
    public ImportUnresolvedEvent buildUnchecked() {
        return new ImportUnresolvedEventImpl(id, notificationType, resourceType, createdAt, data);
    }

    /**
     * factory method for an instance of ImportUnresolvedEventBuilder
     * @return builder
     */
    public static ImportUnresolvedEventBuilder of() {
        return new ImportUnresolvedEventBuilder();
    }

    /**
     * create builder for ImportUnresolvedEvent instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportUnresolvedEventBuilder of(final ImportUnresolvedEvent template) {
        ImportUnresolvedEventBuilder builder = new ImportUnresolvedEventBuilder();
        builder.id = template.getId();
        builder.notificationType = template.getNotificationType();
        builder.resourceType = template.getResourceType();
        builder.createdAt = template.getCreatedAt();
        builder.data = template.getData();
        return builder;
    }

}
