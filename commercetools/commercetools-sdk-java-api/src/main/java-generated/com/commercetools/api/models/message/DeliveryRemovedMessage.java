
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.Delivery;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Remove Delivery update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryRemovedMessage deliveryRemovedMessage = DeliveryRemovedMessage.builder()
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
@JsonDeserialize(as = DeliveryRemovedMessageImpl.class)
public interface DeliveryRemovedMessage extends OrderMessage {

    /**
     * discriminator value for DeliveryRemovedMessage
     */
    String DELIVERY_REMOVED = "DeliveryRemoved";

    /**
     *  <p>The Delivery that was removed from the Order.</p>
     * @return delivery
     */
    @NotNull
    @Valid
    @JsonProperty("delivery")
    public Delivery getDelivery();

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     * @return shippingKey
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>The Delivery that was removed from the Order.</p>
     * @param delivery value to be set
     */

    public void setDelivery(final Delivery delivery);

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     * factory method
     * @return instance of DeliveryRemovedMessage
     */
    public static DeliveryRemovedMessage of() {
        return new DeliveryRemovedMessageImpl();
    }

    /**
     * factory method to copy an instance of DeliveryRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static DeliveryRemovedMessage of(final DeliveryRemovedMessage template) {
        DeliveryRemovedMessageImpl instance = new DeliveryRemovedMessageImpl();
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
     * builder factory method for DeliveryRemovedMessage
     * @return builder
     */
    public static DeliveryRemovedMessageBuilder builder() {
        return DeliveryRemovedMessageBuilder.of();
    }

    /**
     * create builder for DeliveryRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryRemovedMessageBuilder builder(final DeliveryRemovedMessage template) {
        return DeliveryRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDeliveryRemovedMessage(Function<DeliveryRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryRemovedMessage>";
            }
        };
    }
}
