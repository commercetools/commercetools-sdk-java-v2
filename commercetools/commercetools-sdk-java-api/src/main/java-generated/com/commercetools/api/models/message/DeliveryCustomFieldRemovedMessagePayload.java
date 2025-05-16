
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
 *  <p>Generated when a Custom Field has been removed from the Delivery using the Set CustomField update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryCustomFieldRemovedMessagePayload deliveryCustomFieldRemovedMessagePayload = DeliveryCustomFieldRemovedMessagePayload.builder()
 *             .name("{name}")
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("DeliveryCustomFieldRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DeliveryCustomFieldRemovedMessagePayloadImpl.class)
public interface DeliveryCustomFieldRemovedMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for DeliveryCustomFieldRemovedMessagePayload
     */
    String DELIVERY_CUSTOM_FIELD_REMOVED = "DeliveryCustomFieldRemoved";

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     * factory method
     * @return instance of DeliveryCustomFieldRemovedMessagePayload
     */
    public static DeliveryCustomFieldRemovedMessagePayload of() {
        return new DeliveryCustomFieldRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy DeliveryCustomFieldRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static DeliveryCustomFieldRemovedMessagePayload of(final DeliveryCustomFieldRemovedMessagePayload template) {
        DeliveryCustomFieldRemovedMessagePayloadImpl instance = new DeliveryCustomFieldRemovedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setDeliveryId(template.getDeliveryId());
        return instance;
    }

    public DeliveryCustomFieldRemovedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of DeliveryCustomFieldRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DeliveryCustomFieldRemovedMessagePayload deepCopy(
            @Nullable final DeliveryCustomFieldRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        DeliveryCustomFieldRemovedMessagePayloadImpl instance = new DeliveryCustomFieldRemovedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setDeliveryId(template.getDeliveryId());
        return instance;
    }

    /**
     * builder factory method for DeliveryCustomFieldRemovedMessagePayload
     * @return builder
     */
    public static DeliveryCustomFieldRemovedMessagePayloadBuilder builder() {
        return DeliveryCustomFieldRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for DeliveryCustomFieldRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryCustomFieldRemovedMessagePayloadBuilder builder(
            final DeliveryCustomFieldRemovedMessagePayload template) {
        return DeliveryCustomFieldRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDeliveryCustomFieldRemovedMessagePayload(
            Function<DeliveryCustomFieldRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryCustomFieldRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryCustomFieldRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryCustomFieldRemovedMessagePayload>";
            }
        };
    }
}
