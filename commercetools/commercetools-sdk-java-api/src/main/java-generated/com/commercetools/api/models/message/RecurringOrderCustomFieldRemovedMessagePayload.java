
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated when a Custom Field has been removed from the Order using the Set CustomField action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderCustomFieldRemovedMessagePayload recurringOrderCustomFieldRemovedMessagePayload = RecurringOrderCustomFieldRemovedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RecurringOrderCustomFieldRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderCustomFieldRemovedMessagePayloadImpl.class)
public interface RecurringOrderCustomFieldRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for RecurringOrderCustomFieldRemovedMessagePayload
     */
    String RECURRING_ORDER_CUSTOM_FIELD_REMOVED = "RecurringOrderCustomFieldRemoved";

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of RecurringOrderCustomFieldRemovedMessagePayload
     */
    public static RecurringOrderCustomFieldRemovedMessagePayload of() {
        return new RecurringOrderCustomFieldRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderCustomFieldRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderCustomFieldRemovedMessagePayload of(
            final RecurringOrderCustomFieldRemovedMessagePayload template) {
        RecurringOrderCustomFieldRemovedMessagePayloadImpl instance = new RecurringOrderCustomFieldRemovedMessagePayloadImpl();
        instance.setName(template.getName());
        return instance;
    }

    public RecurringOrderCustomFieldRemovedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderCustomFieldRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderCustomFieldRemovedMessagePayload deepCopy(
            @Nullable final RecurringOrderCustomFieldRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        RecurringOrderCustomFieldRemovedMessagePayloadImpl instance = new RecurringOrderCustomFieldRemovedMessagePayloadImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for RecurringOrderCustomFieldRemovedMessagePayload
     * @return builder
     */
    public static RecurringOrderCustomFieldRemovedMessagePayloadBuilder builder() {
        return RecurringOrderCustomFieldRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for RecurringOrderCustomFieldRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderCustomFieldRemovedMessagePayloadBuilder builder(
            final RecurringOrderCustomFieldRemovedMessagePayload template) {
        return RecurringOrderCustomFieldRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderCustomFieldRemovedMessagePayload(
            Function<RecurringOrderCustomFieldRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderCustomFieldRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderCustomFieldRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderCustomFieldRemovedMessagePayload>";
            }
        };
    }
}
