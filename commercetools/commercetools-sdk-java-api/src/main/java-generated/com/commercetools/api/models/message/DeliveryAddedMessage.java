
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

    String DELIVERY_ADDED = "DeliveryAdded";

    /**
     *  <p>Delivery that was added to the Order. The Delivery in the Message body does not contain Parcels if those were part of the initial Add Delivery update action. In that case, the update action produces an additional ParcelAddedToDelivery Message containing information about the Parcels.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("delivery")
    public Delivery getDelivery();

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    public void setDelivery(final Delivery delivery);

    public void setShippingKey(final String shippingKey);

    public static DeliveryAddedMessage of() {
        return new DeliveryAddedMessageImpl();
    }

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

    public static DeliveryAddedMessageBuilder builder() {
        return DeliveryAddedMessageBuilder.of();
    }

    public static DeliveryAddedMessageBuilder builder(final DeliveryAddedMessage template) {
        return DeliveryAddedMessageBuilder.of(template);
    }

    default <T> T withDeliveryAddedMessage(Function<DeliveryAddedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryAddedMessage>";
            }
        };
    }
}
