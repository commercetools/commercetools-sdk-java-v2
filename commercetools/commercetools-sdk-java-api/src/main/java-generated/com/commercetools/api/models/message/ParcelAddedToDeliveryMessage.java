
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.Delivery;
import com.commercetools.api.models.order.Parcel;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Add Parcel to Delivery update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParcelAddedToDeliveryMessage parcelAddedToDeliveryMessage = ParcelAddedToDeliveryMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .delivery(deliveryBuilder -> deliveryBuilder)
 *             .parcel(parcelBuilder -> parcelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ParcelAddedToDelivery")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ParcelAddedToDeliveryMessageImpl.class)
public interface ParcelAddedToDeliveryMessage extends OrderMessage {

    /**
     * discriminator value for ParcelAddedToDeliveryMessage
     */
    String PARCEL_ADDED_TO_DELIVERY = "ParcelAddedToDelivery";

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @return delivery
     */
    @NotNull
    @Valid
    @JsonProperty("delivery")
    public Delivery getDelivery();

    /**
     *  <p>Parcel that was added to the Delivery.</p>
     * @return parcel
     */
    @NotNull
    @Valid
    @JsonProperty("parcel")
    public Parcel getParcel();

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @return shippingKey
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @param delivery value to be set
     */

    public void setDelivery(final Delivery delivery);

    /**
     *  <p>Parcel that was added to the Delivery.</p>
     * @param parcel value to be set
     */

    public void setParcel(final Parcel parcel);

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     * factory method
     * @return instance of ParcelAddedToDeliveryMessage
     */
    public static ParcelAddedToDeliveryMessage of() {
        return new ParcelAddedToDeliveryMessageImpl();
    }

    /**
     * factory method to create a shallow copy ParcelAddedToDeliveryMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ParcelAddedToDeliveryMessage of(final ParcelAddedToDeliveryMessage template) {
        ParcelAddedToDeliveryMessageImpl instance = new ParcelAddedToDeliveryMessageImpl();
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
        instance.setParcel(template.getParcel());
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    public ParcelAddedToDeliveryMessage copyDeep();

    /**
     * factory method to create a deep copy of ParcelAddedToDeliveryMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ParcelAddedToDeliveryMessage deepCopy(@Nullable final ParcelAddedToDeliveryMessage template) {
        if (template == null) {
            return null;
        }
        ParcelAddedToDeliveryMessageImpl instance = new ParcelAddedToDeliveryMessageImpl();
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
        instance.setParcel(com.commercetools.api.models.order.Parcel.deepCopy(template.getParcel()));
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * builder factory method for ParcelAddedToDeliveryMessage
     * @return builder
     */
    public static ParcelAddedToDeliveryMessageBuilder builder() {
        return ParcelAddedToDeliveryMessageBuilder.of();
    }

    /**
     * create builder for ParcelAddedToDeliveryMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ParcelAddedToDeliveryMessageBuilder builder(final ParcelAddedToDeliveryMessage template) {
        return ParcelAddedToDeliveryMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withParcelAddedToDeliveryMessage(Function<ParcelAddedToDeliveryMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ParcelAddedToDeliveryMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ParcelAddedToDeliveryMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ParcelAddedToDeliveryMessage>";
            }
        };
    }
}
