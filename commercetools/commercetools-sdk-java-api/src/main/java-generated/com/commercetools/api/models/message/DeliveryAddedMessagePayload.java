
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
 *     DeliveryAddedMessagePayload deliveryAddedMessagePayload = DeliveryAddedMessagePayload.builder()
 *             .delivery(deliveryBuilder -> deliveryBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DeliveryAddedMessagePayloadImpl.class)
public interface DeliveryAddedMessagePayload extends OrderMessagePayload {

    String DELIVERY_ADDED = "DeliveryAdded";

    /**
     *  <p>Delivery that was added to the Order. The Delivery in the Message body does not contain Parcels if those were part of the initial Add Delivery update action. In that case, the update action produces an additional ParcelAddedToDelivery Message containing information about the Parcels.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("delivery")
    public Delivery getDelivery();

    public void setDelivery(final Delivery delivery);

    public static DeliveryAddedMessagePayload of() {
        return new DeliveryAddedMessagePayloadImpl();
    }

    public static DeliveryAddedMessagePayload of(final DeliveryAddedMessagePayload template) {
        DeliveryAddedMessagePayloadImpl instance = new DeliveryAddedMessagePayloadImpl();
        instance.setDelivery(template.getDelivery());
        return instance;
    }

    public static DeliveryAddedMessagePayloadBuilder builder() {
        return DeliveryAddedMessagePayloadBuilder.of();
    }

    public static DeliveryAddedMessagePayloadBuilder builder(final DeliveryAddedMessagePayload template) {
        return DeliveryAddedMessagePayloadBuilder.of(template);
    }

    default <T> T withDeliveryAddedMessagePayload(Function<DeliveryAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryAddedMessagePayload>";
            }
        };
    }
}
