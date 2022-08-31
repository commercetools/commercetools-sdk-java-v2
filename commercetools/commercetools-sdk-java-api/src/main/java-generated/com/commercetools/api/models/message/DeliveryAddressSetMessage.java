
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
 *     DeliveryAddressSetMessage deliveryAddressSetMessage = DeliveryAddressSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DeliveryAddressSetMessageImpl.class)
public interface DeliveryAddressSetMessage extends OrderMessage {

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

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    public void setDeliveryId(final String deliveryId);

    public void setAddress(final Address address);

    public void setOldAddress(final Address oldAddress);

    public void setShippingKey(final String shippingKey);

    public static DeliveryAddressSetMessage of() {
        return new DeliveryAddressSetMessageImpl();
    }

    public static DeliveryAddressSetMessage of(final DeliveryAddressSetMessage template) {
        DeliveryAddressSetMessageImpl instance = new DeliveryAddressSetMessageImpl();
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
        instance.setDeliveryId(template.getDeliveryId());
        instance.setAddress(template.getAddress());
        instance.setOldAddress(template.getOldAddress());
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    public static DeliveryAddressSetMessageBuilder builder() {
        return DeliveryAddressSetMessageBuilder.of();
    }

    public static DeliveryAddressSetMessageBuilder builder(final DeliveryAddressSetMessage template) {
        return DeliveryAddressSetMessageBuilder.of(template);
    }

    default <T> T withDeliveryAddressSetMessage(Function<DeliveryAddressSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryAddressSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryAddressSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryAddressSetMessage>";
            }
        };
    }
}
