
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after adding a Custom Type to a Delivery using the Set Custom Type update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryCustomTypeSetMessagePayload deliveryCustomTypeSetMessagePayload = DeliveryCustomTypeSetMessagePayload.builder()
 *             .customFields(customFieldsBuilder -> customFieldsBuilder)
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DeliveryCustomTypeSetMessagePayloadImpl.class)
public interface DeliveryCustomTypeSetMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for DeliveryCustomTypeSetMessagePayload
     */
    String DELIVERY_CUSTOM_TYPE_SET = "DeliveryCustomTypeSet";

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @return customFields
     */
    @NotNull
    @Valid
    @JsonProperty("customFields")
    public CustomFields getCustomFields();

    /**
     *  <p><code>id</code> of the previous Custom Type. Absent if there was no previous Custom Type present.</p>
     * @return previousTypeId
     */

    @JsonProperty("previousTypeId")
    public String getPreviousTypeId();

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @param customFields value to be set
     */

    public void setCustomFields(final CustomFields customFields);

    /**
     *  <p><code>id</code> of the previous Custom Type. Absent if there was no previous Custom Type present.</p>
     * @param previousTypeId value to be set
     */

    public void setPreviousTypeId(final String previousTypeId);

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     * factory method
     * @return instance of DeliveryCustomTypeSetMessagePayload
     */
    public static DeliveryCustomTypeSetMessagePayload of() {
        return new DeliveryCustomTypeSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy DeliveryCustomTypeSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static DeliveryCustomTypeSetMessagePayload of(final DeliveryCustomTypeSetMessagePayload template) {
        DeliveryCustomTypeSetMessagePayloadImpl instance = new DeliveryCustomTypeSetMessagePayloadImpl();
        instance.setCustomFields(template.getCustomFields());
        instance.setPreviousTypeId(template.getPreviousTypeId());
        instance.setDeliveryId(template.getDeliveryId());
        return instance;
    }

    /**
     * factory method to create a deep copy of DeliveryCustomTypeSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DeliveryCustomTypeSetMessagePayload deepCopy(
            @Nullable final DeliveryCustomTypeSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        DeliveryCustomTypeSetMessagePayloadImpl instance = new DeliveryCustomTypeSetMessagePayloadImpl();
        instance.setCustomFields(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustomFields()));
        instance.setPreviousTypeId(template.getPreviousTypeId());
        instance.setDeliveryId(template.getDeliveryId());
        return instance;
    }

    /**
     * builder factory method for DeliveryCustomTypeSetMessagePayload
     * @return builder
     */
    public static DeliveryCustomTypeSetMessagePayloadBuilder builder() {
        return DeliveryCustomTypeSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for DeliveryCustomTypeSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryCustomTypeSetMessagePayloadBuilder builder(
            final DeliveryCustomTypeSetMessagePayload template) {
        return DeliveryCustomTypeSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDeliveryCustomTypeSetMessagePayload(Function<DeliveryCustomTypeSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryCustomTypeSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryCustomTypeSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryCustomTypeSetMessagePayload>";
            }
        };
    }
}
