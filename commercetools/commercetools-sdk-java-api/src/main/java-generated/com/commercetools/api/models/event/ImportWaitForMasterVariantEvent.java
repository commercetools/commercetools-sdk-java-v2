
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
 *  <p>Generated when an Import Operation has the <code>waitForMasterVariant</code> ProcessingState.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportWaitForMasterVariantEvent importWaitForMasterVariantEvent = ImportWaitForMasterVariantEvent.builder()
 *             .id("{id}")
 *             .notificationType("{notificationType}")
 *             .resourceType(EventSubscriptionResourceTypeId.CHECKOUT)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .data(dataBuilder -> dataBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ImportWaitForMasterVariant")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImportWaitForMasterVariantEventImpl.class)
public interface ImportWaitForMasterVariantEvent extends Event {

    /**
     * discriminator value for ImportWaitForMasterVariantEvent
     */
    String IMPORT_WAIT_FOR_MASTER_VARIANT = "ImportWaitForMasterVariant";

    /**
     *
     * @return resourceType
     */
    @NotNull
    @JsonProperty("resourceType")
    public EventSubscriptionResourceTypeId getResourceType();

    /**
     *  <p>An object containing details of the Import Operation with the <code>waitForMasterVariant</code> state.</p>
     * @return data
     */
    @NotNull
    @Valid
    @JsonProperty("data")
    public ImportWaitForMasterVariantEventData getData();

    /**
     * set resourceType
     * @param resourceType value to be set
     */

    public void setResourceType(final EventSubscriptionResourceTypeId resourceType);

    /**
     *  <p>An object containing details of the Import Operation with the <code>waitForMasterVariant</code> state.</p>
     * @param data value to be set
     */

    public void setData(final ImportWaitForMasterVariantEventData data);

    /**
     * factory method
     * @return instance of ImportWaitForMasterVariantEvent
     */
    public static ImportWaitForMasterVariantEvent of() {
        return new ImportWaitForMasterVariantEventImpl();
    }

    /**
     * factory method to create a shallow copy ImportWaitForMasterVariantEvent
     * @param template instance to be copied
     * @return copy instance
     */
    public static ImportWaitForMasterVariantEvent of(final ImportWaitForMasterVariantEvent template) {
        ImportWaitForMasterVariantEventImpl instance = new ImportWaitForMasterVariantEventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setData(template.getData());
        return instance;
    }

    public ImportWaitForMasterVariantEvent copyDeep();

    /**
     * factory method to create a deep copy of ImportWaitForMasterVariantEvent
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ImportWaitForMasterVariantEvent deepCopy(@Nullable final ImportWaitForMasterVariantEvent template) {
        if (template == null) {
            return null;
        }
        ImportWaitForMasterVariantEventImpl instance = new ImportWaitForMasterVariantEventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setData(
            com.commercetools.api.models.event.ImportWaitForMasterVariantEventData.deepCopy(template.getData()));
        return instance;
    }

    /**
     * builder factory method for ImportWaitForMasterVariantEvent
     * @return builder
     */
    public static ImportWaitForMasterVariantEventBuilder builder() {
        return ImportWaitForMasterVariantEventBuilder.of();
    }

    /**
     * create builder for ImportWaitForMasterVariantEvent instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportWaitForMasterVariantEventBuilder builder(final ImportWaitForMasterVariantEvent template) {
        return ImportWaitForMasterVariantEventBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withImportWaitForMasterVariantEvent(Function<ImportWaitForMasterVariantEvent, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ImportWaitForMasterVariantEvent> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportWaitForMasterVariantEvent>() {
            @Override
            public String toString() {
                return "TypeReference<ImportWaitForMasterVariantEvent>";
            }
        };
    }
}
