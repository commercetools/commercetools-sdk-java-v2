
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.Delivery;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Add Delivery update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryAddedMessage deliveryAddedMessage = DeliveryAddedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .delivery(deliveryBuilder -> deliveryBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DeliveryAddedMessageImpl.class)
public interface DeliveryAddedMessage extends OrderMessage {

    /**
     * discriminator value for DeliveryAddedMessage
     */
    String DELIVERY_ADDED = "DeliveryAdded";

    /**
     *  <p>Delivery that was added to the Order. The Delivery in the Message body does not contain Parcels if those were part of the initial Add Delivery update action. In that case, the update action produces an additional Parcel Added To Delivery Message containing information about the Parcels.</p>
     * @return delivery
     */
    @NotNull
    @Valid
    @JsonProperty("delivery")
    public Delivery getDelivery();

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @return shippingKey
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>Delivery that was added to the Order. The Delivery in the Message body does not contain Parcels if those were part of the initial Add Delivery update action. In that case, the update action produces an additional Parcel Added To Delivery Message containing information about the Parcels.</p>
     * @param delivery value to be set
     */

    public void setDelivery(final Delivery delivery);

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     * factory method
     * @return instance of DeliveryAddedMessage
     */
    public static DeliveryAddedMessage of() {
        return new DeliveryAddedMessageImpl();
    }

    /**
     * factory method to create a shallow copy DeliveryAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static DeliveryAddedMessage of(final DeliveryAddedMessage template) {
        DeliveryAddedMessageImpl instance = new DeliveryAddedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setDelivery(template.getDelivery());
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of DeliveryAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DeliveryAddedMessage deepCopy(@Nullable final DeliveryAddedMessage template) {
        if (template == null) {
            return null;
        }
        DeliveryAddedMessageImpl instance = new DeliveryAddedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setDelivery(com.commercetools.api.models.order.Delivery.deepCopy(template.getDelivery()));
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * builder factory method for DeliveryAddedMessage
     * @return builder
     */
    public static DeliveryAddedMessageBuilder builder() {
        return DeliveryAddedMessageBuilder.of();
    }

    /**
     * create builder for DeliveryAddedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryAddedMessageBuilder builder(final DeliveryAddedMessage template) {
        return DeliveryAddedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDeliveryAddedMessage(Function<DeliveryAddedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryAddedMessage>";
            }
        };
    }
}
