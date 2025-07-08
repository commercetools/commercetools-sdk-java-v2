
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
 *  <p>Generated after adding a Custom Field using the Set CustomField.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderCustomFieldAddedMessagePayload recurringOrderCustomFieldAddedMessagePayload = RecurringOrderCustomFieldAddedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RecurringOrderCustomFieldAdded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderCustomFieldAddedMessagePayloadImpl.class)
public interface RecurringOrderCustomFieldAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for RecurringOrderCustomFieldAddedMessagePayload
     */
    String RECURRING_ORDER_CUSTOM_FIELD_ADDED = "RecurringOrderCustomFieldAdded";

    /**
     *  <p>Name of the Custom Field that was added.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>The added CustomFieldValue based on the FieldType.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>Name of the Custom Field that was added.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>The added CustomFieldValue based on the FieldType.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of RecurringOrderCustomFieldAddedMessagePayload
     */
    public static RecurringOrderCustomFieldAddedMessagePayload of() {
        return new RecurringOrderCustomFieldAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderCustomFieldAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderCustomFieldAddedMessagePayload of(
            final RecurringOrderCustomFieldAddedMessagePayload template) {
        RecurringOrderCustomFieldAddedMessagePayloadImpl instance = new RecurringOrderCustomFieldAddedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public RecurringOrderCustomFieldAddedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderCustomFieldAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderCustomFieldAddedMessagePayload deepCopy(
            @Nullable final RecurringOrderCustomFieldAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        RecurringOrderCustomFieldAddedMessagePayloadImpl instance = new RecurringOrderCustomFieldAddedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for RecurringOrderCustomFieldAddedMessagePayload
     * @return builder
     */
    public static RecurringOrderCustomFieldAddedMessagePayloadBuilder builder() {
        return RecurringOrderCustomFieldAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for RecurringOrderCustomFieldAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderCustomFieldAddedMessagePayloadBuilder builder(
            final RecurringOrderCustomFieldAddedMessagePayload template) {
        return RecurringOrderCustomFieldAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderCustomFieldAddedMessagePayload(
            Function<RecurringOrderCustomFieldAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderCustomFieldAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderCustomFieldAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderCustomFieldAddedMessagePayload>";
            }
        };
    }
}
