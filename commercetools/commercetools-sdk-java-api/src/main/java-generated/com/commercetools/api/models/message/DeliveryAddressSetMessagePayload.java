
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Delivery Address update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryAddressSetMessagePayload deliveryAddressSetMessagePayload = DeliveryAddressSetMessagePayload.builder()
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DeliveryAddressSetMessagePayloadImpl.class)
public interface DeliveryAddressSetMessagePayload extends OrderMessagePayload {

    String DELIVERY_ADDRESS_SET = "DeliveryAddressSet";

    /**
     *  <p>Unique identifier of the Parcel.</p>
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>Address after the Set Delivery Address update action.</p>
     */
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>Address before the Set Delivery Address update action.</p>
     */
    @Valid
    @JsonProperty("oldAddress")
    public Address getOldAddress();

    public void setDeliveryId(final String deliveryId);

    public void setAddress(final Address address);

    public void setOldAddress(final Address oldAddress);

    public static DeliveryAddressSetMessagePayload of() {
        return new DeliveryAddressSetMessagePayloadImpl();
    }

    public static DeliveryAddressSetMessagePayload of(final DeliveryAddressSetMessagePayload template) {
        DeliveryAddressSetMessagePayloadImpl instance = new DeliveryAddressSetMessagePayloadImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setAddress(template.getAddress());
        instance.setOldAddress(template.getOldAddress());
        return instance;
    }

    public static DeliveryAddressSetMessagePayloadBuilder builder() {
        return DeliveryAddressSetMessagePayloadBuilder.of();
    }

    public static DeliveryAddressSetMessagePayloadBuilder builder(final DeliveryAddressSetMessagePayload template) {
        return DeliveryAddressSetMessagePayloadBuilder.of(template);
    }

    default <T> T withDeliveryAddressSetMessagePayload(Function<DeliveryAddressSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryAddressSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryAddressSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryAddressSetMessagePayload>";
            }
        };
    }
}
