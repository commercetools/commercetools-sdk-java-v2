
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated when a Custom Field has been removed from the Order using the Set CustomField action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomFieldRemovedMessagePayload orderCustomFieldRemovedMessagePayload = OrderCustomFieldRemovedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCustomFieldRemovedMessagePayloadImpl.class)
public interface OrderCustomFieldRemovedMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderCustomFieldRemovedMessagePayload
     */
    String ORDER_CUSTOM_FIELD_REMOVED = "OrderCustomFieldRemoved";

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
     * @return instance of OrderCustomFieldRemovedMessagePayload
     */
    public static OrderCustomFieldRemovedMessagePayload of() {
        return new OrderCustomFieldRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy OrderCustomFieldRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderCustomFieldRemovedMessagePayload of(final OrderCustomFieldRemovedMessagePayload template) {
        OrderCustomFieldRemovedMessagePayloadImpl instance = new OrderCustomFieldRemovedMessagePayloadImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderCustomFieldRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderCustomFieldRemovedMessagePayload deepCopy(
            @Nullable final OrderCustomFieldRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderCustomFieldRemovedMessagePayloadImpl instance = new OrderCustomFieldRemovedMessagePayloadImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for OrderCustomFieldRemovedMessagePayload
     * @return builder
     */
    public static OrderCustomFieldRemovedMessagePayloadBuilder builder() {
        return OrderCustomFieldRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderCustomFieldRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomFieldRemovedMessagePayloadBuilder builder(
            final OrderCustomFieldRemovedMessagePayload template) {
        return OrderCustomFieldRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderCustomFieldRemovedMessagePayload(Function<OrderCustomFieldRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomFieldRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomFieldRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomFieldRemovedMessagePayload>";
            }
        };
    }
}
