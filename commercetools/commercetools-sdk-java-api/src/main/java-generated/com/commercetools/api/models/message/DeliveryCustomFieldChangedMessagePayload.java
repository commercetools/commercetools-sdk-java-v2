
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
 *  <p>Generated when an existing Custom Field on a Delivery has been changed using the Set CustomField update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryCustomFieldChangedMessagePayload deliveryCustomFieldChangedMessagePayload = DeliveryCustomFieldChangedMessagePayload.builder()
 *             .name("{name}")
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("DeliveryCustomFieldChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DeliveryCustomFieldChangedMessagePayloadImpl.class)
public interface DeliveryCustomFieldChangedMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for DeliveryCustomFieldChangedMessagePayload
     */
    String DELIVERY_CUSTOM_FIELD_CHANGED = "DeliveryCustomFieldChanged";

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>CustomFieldValue based on the FieldType after the Set CustomField update action.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action. When there has not been a Custom Field with the <code>name</code> on the Delivery before, a Delivery Custom Field Added Message is generated instead.</p>
     * @return previousValue
     */

    @JsonProperty("previousValue")
    public Object getPreviousValue();

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>CustomFieldValue based on the FieldType after the Set CustomField update action.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action. When there has not been a Custom Field with the <code>name</code> on the Delivery before, a Delivery Custom Field Added Message is generated instead.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Object previousValue);

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     * factory method
     * @return instance of DeliveryCustomFieldChangedMessagePayload
     */
    public static DeliveryCustomFieldChangedMessagePayload of() {
        return new DeliveryCustomFieldChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy DeliveryCustomFieldChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static DeliveryCustomFieldChangedMessagePayload of(final DeliveryCustomFieldChangedMessagePayload template) {
        DeliveryCustomFieldChangedMessagePayloadImpl instance = new DeliveryCustomFieldChangedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setDeliveryId(template.getDeliveryId());
        return instance;
    }

    public DeliveryCustomFieldChangedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of DeliveryCustomFieldChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DeliveryCustomFieldChangedMessagePayload deepCopy(
            @Nullable final DeliveryCustomFieldChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        DeliveryCustomFieldChangedMessagePayloadImpl instance = new DeliveryCustomFieldChangedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setDeliveryId(template.getDeliveryId());
        return instance;
    }

    /**
     * builder factory method for DeliveryCustomFieldChangedMessagePayload
     * @return builder
     */
    public static DeliveryCustomFieldChangedMessagePayloadBuilder builder() {
        return DeliveryCustomFieldChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for DeliveryCustomFieldChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryCustomFieldChangedMessagePayloadBuilder builder(
            final DeliveryCustomFieldChangedMessagePayload template) {
        return DeliveryCustomFieldChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDeliveryCustomFieldChangedMessagePayload(
            Function<DeliveryCustomFieldChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryCustomFieldChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryCustomFieldChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryCustomFieldChangedMessagePayload>";
            }
        };
    }
}
