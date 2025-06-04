
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
 *  <p>Generated when an Import Container is created.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("ImportContainerCreated")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImportContainerCreatedEventImpl.class)
public interface ImportContainerCreatedEvent extends Event {

    /**
     * discriminator value for ImportContainerCreatedEvent
     */
    String IMPORT_CONTAINER_CREATED = "ImportContainerCreated";

    /**
     *
     * @return resourceType
     */
    @NotNull
    @JsonProperty("resourceType")
    public EventSubscriptionResourceTypeId getResourceType();

    /**
     *  <p>An object containing details of the created Import Container.</p>
     * @return data
     */
    @NotNull
    @Valid
    @JsonProperty("data")
    public ImportContainerCreatedEventData getData();

    /**
     * set resourceType
     * @param resourceType value to be set
     */

    public void setResourceType(final EventSubscriptionResourceTypeId resourceType);

    /**
     *  <p>An object containing details of the created Import Container.</p>
     * @param data value to be set
     */

    public void setData(final ImportContainerCreatedEventData data);

    /**
     * factory method
     * @return instance of ImportContainerCreatedEvent
     */
    public static ImportContainerCreatedEvent of() {
        return new ImportContainerCreatedEventImpl();
    }

    /**
     * factory method to create a shallow copy ImportContainerCreatedEvent
     * @param template instance to be copied
     * @return copy instance
     */
    public static ImportContainerCreatedEvent of(final ImportContainerCreatedEvent template) {
        ImportContainerCreatedEventImpl instance = new ImportContainerCreatedEventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setData(template.getData());
        return instance;
    }

    public ImportContainerCreatedEvent copyDeep();

    /**
     * factory method to create a deep copy of ImportContainerCreatedEvent
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ImportContainerCreatedEvent deepCopy(@Nullable final ImportContainerCreatedEvent template) {
        if (template == null) {
            return null;
        }
        ImportContainerCreatedEventImpl instance = new ImportContainerCreatedEventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setData(
            com.commercetools.api.models.event.ImportContainerCreatedEventData.deepCopy(template.getData()));
        return instance;
    }

    /**
     * builder factory method for ImportContainerCreatedEvent
     * @return builder
     */
    public static ImportContainerCreatedEventBuilder builder() {
        return ImportContainerCreatedEventBuilder.of();
    }

    /**
     * create builder for ImportContainerCreatedEvent instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportContainerCreatedEventBuilder builder(final ImportContainerCreatedEvent template) {
        return ImportContainerCreatedEventBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withImportContainerCreatedEvent(Function<ImportContainerCreatedEvent, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ImportContainerCreatedEvent> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportContainerCreatedEvent>() {
            @Override
            public String toString() {
                return "TypeReference<ImportContainerCreatedEvent>";
            }
        };
    }
}
