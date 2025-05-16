
package com.commercetools.api.models.event;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated when an Import Container is deleted.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("ImportContainerDeleted")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImportContainerDeletedEventImpl.class)
public interface ImportContainerDeletedEvent extends Event {

    /**
     * discriminator value for ImportContainerDeletedEvent
     */
    String IMPORT_CONTAINER_DELETED = "ImportContainerDeleted";

    /**
     *
     * @return resourceType
     */
    @NotNull
    @JsonProperty("resourceType")
    public EventSubscriptionResourceTypeId getResourceType();

    /**
     *  <p>An object containing details of the deleted Import Container.</p>
     * @return data
     */
    @NotNull
    @Valid
    @JsonProperty("data")
    public ImportContainerDeletedEventData getData();

    /**
     * set resourceType
     * @param resourceType value to be set
     */

    public void setResourceType(final EventSubscriptionResourceTypeId resourceType);

    /**
     *  <p>An object containing details of the deleted Import Container.</p>
     * @param data value to be set
     */

    public void setData(final ImportContainerDeletedEventData data);

    /**
     * factory method
     * @return instance of ImportContainerDeletedEvent
     */
    public static ImportContainerDeletedEvent of() {
        return new ImportContainerDeletedEventImpl();
    }

    /**
     * factory method to create a shallow copy ImportContainerDeletedEvent
     * @param template instance to be copied
     * @return copy instance
     */
    public static ImportContainerDeletedEvent of(final ImportContainerDeletedEvent template) {
        ImportContainerDeletedEventImpl instance = new ImportContainerDeletedEventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setData(template.getData());
        return instance;
    }

    public ImportContainerDeletedEvent copyDeep();

    /**
     * factory method to create a deep copy of ImportContainerDeletedEvent
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ImportContainerDeletedEvent deepCopy(@Nullable final ImportContainerDeletedEvent template) {
        if (template == null) {
            return null;
        }
        ImportContainerDeletedEventImpl instance = new ImportContainerDeletedEventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setData(
            com.commercetools.api.models.event.ImportContainerDeletedEventData.deepCopy(template.getData()));
        return instance;
    }

    /**
     * builder factory method for ImportContainerDeletedEvent
     * @return builder
     */
    public static ImportContainerDeletedEventBuilder builder() {
        return ImportContainerDeletedEventBuilder.of();
    }

    /**
     * create builder for ImportContainerDeletedEvent instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportContainerDeletedEventBuilder builder(final ImportContainerDeletedEvent template) {
        return ImportContainerDeletedEventBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withImportContainerDeletedEvent(Function<ImportContainerDeletedEvent, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ImportContainerDeletedEvent> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportContainerDeletedEvent>() {
            @Override
            public String toString() {
                return "TypeReference<ImportContainerDeletedEvent>";
            }
        };
    }
}
