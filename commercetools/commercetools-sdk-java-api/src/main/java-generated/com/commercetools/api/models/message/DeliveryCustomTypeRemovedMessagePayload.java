
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
 *  <p>Generated after removing a Custom Type from a Delivery using the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetDeliveryCustomTypeAction" rel="nofollow">Set Custom Type</a> update action with empty parameters.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryCustomTypeRemovedMessagePayload deliveryCustomTypeRemovedMessagePayload = DeliveryCustomTypeRemovedMessagePayload.builder()
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("DeliveryCustomTypeRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DeliveryCustomTypeRemovedMessagePayloadImpl.class)
public interface DeliveryCustomTypeRemovedMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for DeliveryCustomTypeRemovedMessagePayload
     */
    String DELIVERY_CUSTOM_TYPE_REMOVED = "DeliveryCustomTypeRemoved";

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a> that was removed. Absent if there was no previous Custom Type present.</p>
     * @return previousTypeId
     */

    @JsonProperty("previousTypeId")
    public String getPreviousTypeId();

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a> that was removed. Absent if there was no previous Custom Type present.</p>
     * @param previousTypeId value to be set
     */

    public void setPreviousTypeId(final String previousTypeId);

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     * factory method
     * @return instance of DeliveryCustomTypeRemovedMessagePayload
     */
    public static DeliveryCustomTypeRemovedMessagePayload of() {
        return new DeliveryCustomTypeRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy DeliveryCustomTypeRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static DeliveryCustomTypeRemovedMessagePayload of(final DeliveryCustomTypeRemovedMessagePayload template) {
        DeliveryCustomTypeRemovedMessagePayloadImpl instance = new DeliveryCustomTypeRemovedMessagePayloadImpl();
        instance.setPreviousTypeId(template.getPreviousTypeId());
        instance.setDeliveryId(template.getDeliveryId());
        return instance;
    }

    public DeliveryCustomTypeRemovedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of DeliveryCustomTypeRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DeliveryCustomTypeRemovedMessagePayload deepCopy(
            @Nullable final DeliveryCustomTypeRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        DeliveryCustomTypeRemovedMessagePayloadImpl instance = new DeliveryCustomTypeRemovedMessagePayloadImpl();
        instance.setPreviousTypeId(template.getPreviousTypeId());
        instance.setDeliveryId(template.getDeliveryId());
        return instance;
    }

    /**
     * builder factory method for DeliveryCustomTypeRemovedMessagePayload
     * @return builder
     */
    public static DeliveryCustomTypeRemovedMessagePayloadBuilder builder() {
        return DeliveryCustomTypeRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for DeliveryCustomTypeRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryCustomTypeRemovedMessagePayloadBuilder builder(
            final DeliveryCustomTypeRemovedMessagePayload template) {
        return DeliveryCustomTypeRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDeliveryCustomTypeRemovedMessagePayload(
            Function<DeliveryCustomTypeRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryCustomTypeRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryCustomTypeRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryCustomTypeRemovedMessagePayload>";
            }
        };
    }
}
