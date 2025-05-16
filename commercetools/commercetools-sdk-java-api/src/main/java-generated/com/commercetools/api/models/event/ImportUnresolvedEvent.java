
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
 *  <p>Generated when an Import Operation has the <code>unresolved</code> ProcessingState.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("ImportUnresolved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImportUnresolvedEventImpl.class)
public interface ImportUnresolvedEvent extends Event {

    /**
     * discriminator value for ImportUnresolvedEvent
     */
    String IMPORT_UNRESOLVED = "ImportUnresolved";

    /**
     *
     * @return resourceType
     */
    @NotNull
    @JsonProperty("resourceType")
    public EventSubscriptionResourceTypeId getResourceType();

    /**
     *  <p>An object containing details of the Import Operation with the <code>unresolved</code> state.</p>
     * @return data
     */
    @NotNull
    @Valid
    @JsonProperty("data")
    public ImportUnresolvedEventData getData();

    /**
     * set resourceType
     * @param resourceType value to be set
     */

    public void setResourceType(final EventSubscriptionResourceTypeId resourceType);

    /**
     *  <p>An object containing details of the Import Operation with the <code>unresolved</code> state.</p>
     * @param data value to be set
     */

    public void setData(final ImportUnresolvedEventData data);

    /**
     * factory method
     * @return instance of ImportUnresolvedEvent
     */
    public static ImportUnresolvedEvent of() {
        return new ImportUnresolvedEventImpl();
    }

    /**
     * factory method to create a shallow copy ImportUnresolvedEvent
     * @param template instance to be copied
     * @return copy instance
     */
    public static ImportUnresolvedEvent of(final ImportUnresolvedEvent template) {
        ImportUnresolvedEventImpl instance = new ImportUnresolvedEventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setData(template.getData());
        return instance;
    }

    public ImportUnresolvedEvent copyDeep();

    /**
     * factory method to create a deep copy of ImportUnresolvedEvent
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ImportUnresolvedEvent deepCopy(@Nullable final ImportUnresolvedEvent template) {
        if (template == null) {
            return null;
        }
        ImportUnresolvedEventImpl instance = new ImportUnresolvedEventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setData(com.commercetools.api.models.event.ImportUnresolvedEventData.deepCopy(template.getData()));
        return instance;
    }

    /**
     * builder factory method for ImportUnresolvedEvent
     * @return builder
     */
    public static ImportUnresolvedEventBuilder builder() {
        return ImportUnresolvedEventBuilder.of();
    }

    /**
     * create builder for ImportUnresolvedEvent instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportUnresolvedEventBuilder builder(final ImportUnresolvedEvent template) {
        return ImportUnresolvedEventBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withImportUnresolvedEvent(Function<ImportUnresolvedEvent, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ImportUnresolvedEvent> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportUnresolvedEvent>() {
            @Override
            public String toString() {
                return "TypeReference<ImportUnresolvedEvent>";
            }
        };
    }
}
