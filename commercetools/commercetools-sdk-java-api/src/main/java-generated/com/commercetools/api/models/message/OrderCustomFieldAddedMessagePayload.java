
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
 *     OrderCustomFieldAddedMessagePayload orderCustomFieldAddedMessagePayload = OrderCustomFieldAddedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCustomFieldAddedMessagePayloadImpl.class)
public interface OrderCustomFieldAddedMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderCustomFieldAddedMessagePayload
     */
    String ORDER_CUSTOM_FIELD_ADDED = "OrderCustomFieldAdded";

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
     * @return instance of OrderCustomFieldAddedMessagePayload
     */
    public static OrderCustomFieldAddedMessagePayload of() {
        return new OrderCustomFieldAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy OrderCustomFieldAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderCustomFieldAddedMessagePayload of(final OrderCustomFieldAddedMessagePayload template) {
        OrderCustomFieldAddedMessagePayloadImpl instance = new OrderCustomFieldAddedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderCustomFieldAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderCustomFieldAddedMessagePayload deepCopy(
            @Nullable final OrderCustomFieldAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderCustomFieldAddedMessagePayloadImpl instance = new OrderCustomFieldAddedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for OrderCustomFieldAddedMessagePayload
     * @return builder
     */
    public static OrderCustomFieldAddedMessagePayloadBuilder builder() {
        return OrderCustomFieldAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderCustomFieldAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomFieldAddedMessagePayloadBuilder builder(
            final OrderCustomFieldAddedMessagePayload template) {
        return OrderCustomFieldAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderCustomFieldAddedMessagePayload(Function<OrderCustomFieldAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomFieldAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomFieldAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomFieldAddedMessagePayload>";
            }
        };
    }
}
