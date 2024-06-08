
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

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

    /**
     * discriminator value for DeliveryAddressSetMessage
     */
    String DELIVERY_ADDRESS_SET = "DeliveryAddressSet";

    /**
     *  <p>Unique identifier of the Parcel.</p>
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>Address after the Set Delivery Address update action.</p>
     * @return address
     */
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>Address before the Set Delivery Address update action.</p>
     * @return oldAddress
     */
    @Valid
    @JsonProperty("oldAddress")
    public Address getOldAddress();

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @return shippingKey
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>Unique identifier of the Parcel.</p>
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     *  <p>Address after the Set Delivery Address update action.</p>
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     *  <p>Address before the Set Delivery Address update action.</p>
     * @param oldAddress value to be set
     */

    public void setOldAddress(final Address oldAddress);

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     * factory method
     * @return instance of DeliveryAddressSetMessage
     */
    public static DeliveryAddressSetMessage of() {
        return new DeliveryAddressSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy DeliveryAddressSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of DeliveryAddressSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DeliveryAddressSetMessage deepCopy(@Nullable final DeliveryAddressSetMessage template) {
        if (template == null) {
            return null;
        }
        DeliveryAddressSetMessageImpl instance = new DeliveryAddressSetMessageImpl();
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
        instance.setDeliveryId(template.getDeliveryId());
        instance.setAddress(com.commercetools.api.models.common.Address.deepCopy(template.getAddress()));
        instance.setOldAddress(com.commercetools.api.models.common.Address.deepCopy(template.getOldAddress()));
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * builder factory method for DeliveryAddressSetMessage
     * @return builder
     */
    public static DeliveryAddressSetMessageBuilder builder() {
        return DeliveryAddressSetMessageBuilder.of();
    }

    /**
     * create builder for DeliveryAddressSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryAddressSetMessageBuilder builder(final DeliveryAddressSetMessage template) {
        return DeliveryAddressSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDeliveryAddressSetMessage(Function<DeliveryAddressSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryAddressSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryAddressSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryAddressSetMessage>";
            }
        };
    }
}
