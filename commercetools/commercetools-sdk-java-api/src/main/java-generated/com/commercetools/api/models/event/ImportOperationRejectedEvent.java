
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
 *  <p>Generated when an <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">Import Operation</a> has the <code>rejected</code> <a href="https://docs.commercetools.com/apis/ctp:import:type:ProcessingState" rel="nofollow">ProcessingState</a>.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("ImportOperationRejected")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImportOperationRejectedEventImpl.class)
public interface ImportOperationRejectedEvent extends Event {

    /**
     * discriminator value for ImportOperationRejectedEvent
     */
    String IMPORT_OPERATION_REJECTED = "ImportOperationRejected";

    /**
     *
     * @return resourceType
     */
    @NotNull
    @JsonProperty("resourceType")
    public EventSubscriptionResourceTypeId getResourceType();

    /**
     *  <p>An object containing details of the Import Operation with the <code>rejected</code> state.</p>
     * @return data
     */
    @NotNull
    @Valid
    @JsonProperty("data")
    public ImportOperationRejectedEventData getData();

    /**
     * set resourceType
     * @param resourceType value to be set
     */

    public void setResourceType(final EventSubscriptionResourceTypeId resourceType);

    /**
     *  <p>An object containing details of the Import Operation with the <code>rejected</code> state.</p>
     * @param data value to be set
     */

    public void setData(final ImportOperationRejectedEventData data);

    /**
     * factory method
     * @return instance of ImportOperationRejectedEvent
     */
    public static ImportOperationRejectedEvent of() {
        return new ImportOperationRejectedEventImpl();
    }

    /**
     * factory method to create a shallow copy ImportOperationRejectedEvent
     * @param template instance to be copied
     * @return copy instance
     */
    public static ImportOperationRejectedEvent of(final ImportOperationRejectedEvent template) {
        ImportOperationRejectedEventImpl instance = new ImportOperationRejectedEventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setData(template.getData());
        return instance;
    }

    public ImportOperationRejectedEvent copyDeep();

    /**
     * factory method to create a deep copy of ImportOperationRejectedEvent
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ImportOperationRejectedEvent deepCopy(@Nullable final ImportOperationRejectedEvent template) {
        if (template == null) {
            return null;
        }
        ImportOperationRejectedEventImpl instance = new ImportOperationRejectedEventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setData(
            com.commercetools.api.models.event.ImportOperationRejectedEventData.deepCopy(template.getData()));
        return instance;
    }

    /**
     * builder factory method for ImportOperationRejectedEvent
     * @return builder
     */
    public static ImportOperationRejectedEventBuilder builder() {
        return ImportOperationRejectedEventBuilder.of();
    }

    /**
     * create builder for ImportOperationRejectedEvent instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportOperationRejectedEventBuilder builder(final ImportOperationRejectedEvent template) {
        return ImportOperationRejectedEventBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withImportOperationRejectedEvent(Function<ImportOperationRejectedEvent, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ImportOperationRejectedEvent> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportOperationRejectedEvent>() {
            @Override
            public String toString() {
                return "TypeReference<ImportOperationRejectedEvent>";
            }
        };
    }
}
