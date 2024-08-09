
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
 *  <p>Generated after adding a Custom Field to a Delivery using the Set CustomField update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryCustomFieldAddedMessagePayload deliveryCustomFieldAddedMessagePayload = DeliveryCustomFieldAddedMessagePayload.builder()
 *             .name("{name}")
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DeliveryCustomFieldAddedMessagePayloadImpl.class)
public interface DeliveryCustomFieldAddedMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for DeliveryCustomFieldAddedMessagePayload
     */
    String DELIVERY_CUSTOM_FIELD_ADDED = "DeliveryCustomFieldAdded";

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
     *  <p>Unique identifier of the Delivery.</p>
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

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
     *  <p>Unique identifier of the Delivery.</p>
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     * factory method
     * @return instance of DeliveryCustomFieldAddedMessagePayload
     */
    public static DeliveryCustomFieldAddedMessagePayload of() {
        return new DeliveryCustomFieldAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy DeliveryCustomFieldAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static DeliveryCustomFieldAddedMessagePayload of(final DeliveryCustomFieldAddedMessagePayload template) {
        DeliveryCustomFieldAddedMessagePayloadImpl instance = new DeliveryCustomFieldAddedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setDeliveryId(template.getDeliveryId());
        return instance;
    }

    /**
     * factory method to create a deep copy of DeliveryCustomFieldAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DeliveryCustomFieldAddedMessagePayload deepCopy(
            @Nullable final DeliveryCustomFieldAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        DeliveryCustomFieldAddedMessagePayloadImpl instance = new DeliveryCustomFieldAddedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setDeliveryId(template.getDeliveryId());
        return instance;
    }

    /**
     * builder factory method for DeliveryCustomFieldAddedMessagePayload
     * @return builder
     */
    public static DeliveryCustomFieldAddedMessagePayloadBuilder builder() {
        return DeliveryCustomFieldAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for DeliveryCustomFieldAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryCustomFieldAddedMessagePayloadBuilder builder(
            final DeliveryCustomFieldAddedMessagePayload template) {
        return DeliveryCustomFieldAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDeliveryCustomFieldAddedMessagePayload(
            Function<DeliveryCustomFieldAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryCustomFieldAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryCustomFieldAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryCustomFieldAddedMessagePayload>";
            }
        };
    }
}
