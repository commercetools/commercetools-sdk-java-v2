
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
 *  <p>Generated when an Import Operation has the <code>validationFailed</code> ProcessingState.</p>
 *
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
@JsonDeserialize(as = ImportValidationFailedEventImpl.class)
public interface ImportValidationFailedEvent extends Event {

    /**
     * discriminator value for ImportValidationFailedEvent
     */
    String IMPORT_VALIDATION_FAILED = "ImportValidationFailed";

    /**
     *
     * @return resourceType
     */
    @NotNull
    @JsonProperty("resourceType")
    public EventSubscriptionResourceTypeId getResourceType();

    /**
     *  <p>An object containing details of the Import Operation with the <code>validationFailed</code> state.</p>
     * @return data
     */
    @NotNull
    @Valid
    @JsonProperty("data")
    public ImportValidationFailedEventData getData();

    /**
     * set resourceType
     * @param resourceType value to be set
     */

    public void setResourceType(final EventSubscriptionResourceTypeId resourceType);

    /**
     *  <p>An object containing details of the Import Operation with the <code>validationFailed</code> state.</p>
     * @param data value to be set
     */

    public void setData(final ImportValidationFailedEventData data);

    /**
     * factory method
     * @return instance of ImportValidationFailedEvent
     */
    public static ImportValidationFailedEvent of() {
        return new ImportValidationFailedEventImpl();
    }

    /**
     * factory method to create a shallow copy ImportValidationFailedEvent
     * @param template instance to be copied
     * @return copy instance
     */
    public static ImportValidationFailedEvent of(final ImportValidationFailedEvent template) {
        ImportValidationFailedEventImpl instance = new ImportValidationFailedEventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setData(template.getData());
        return instance;
    }

    /**
     * factory method to create a deep copy of ImportValidationFailedEvent
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ImportValidationFailedEvent deepCopy(@Nullable final ImportValidationFailedEvent template) {
        if (template == null) {
            return null;
        }
        ImportValidationFailedEventImpl instance = new ImportValidationFailedEventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setData(
            com.commercetools.api.models.event.ImportValidationFailedEventData.deepCopy(template.getData()));
        return instance;
    }

    /**
     * builder factory method for ImportValidationFailedEvent
     * @return builder
     */
    public static ImportValidationFailedEventBuilder builder() {
        return ImportValidationFailedEventBuilder.of();
    }

    /**
     * create builder for ImportValidationFailedEvent instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportValidationFailedEventBuilder builder(final ImportValidationFailedEvent template) {
        return ImportValidationFailedEventBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withImportValidationFailedEvent(Function<ImportValidationFailedEvent, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ImportValidationFailedEvent> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportValidationFailedEvent>() {
            @Override
            public String toString() {
                return "TypeReference<ImportValidationFailedEvent>";
            }
        };
    }
}
