
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.Parcel;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Remove Parcel from Delivery update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParcelRemovedFromDeliveryMessage parcelRemovedFromDeliveryMessage = ParcelRemovedFromDeliveryMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .deliveryId("{deliveryId}")
 *             .parcel(parcelBuilder -> parcelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ParcelRemovedFromDelivery")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ParcelRemovedFromDeliveryMessageImpl.class)
public interface ParcelRemovedFromDeliveryMessage extends OrderMessage {

    /**
     * discriminator value for ParcelRemovedFromDeliveryMessage
     */
    String PARCEL_REMOVED_FROM_DELIVERY = "ParcelRemovedFromDelivery";

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>Parcel that was removed from the Delivery.</p>
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
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     *  <p>Parcel that was removed from the Delivery.</p>
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
     * @return instance of ParcelRemovedFromDeliveryMessage
     */
    public static ParcelRemovedFromDeliveryMessage of() {
        return new ParcelRemovedFromDeliveryMessageImpl();
    }

    /**
     * factory method to create a shallow copy ParcelRemovedFromDeliveryMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ParcelRemovedFromDeliveryMessage of(final ParcelRemovedFromDeliveryMessage template) {
        ParcelRemovedFromDeliveryMessageImpl instance = new ParcelRemovedFromDeliveryMessageImpl();
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
        instance.setParcel(template.getParcel());
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    public ParcelRemovedFromDeliveryMessage copyDeep();

    /**
     * factory method to create a deep copy of ParcelRemovedFromDeliveryMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ParcelRemovedFromDeliveryMessage deepCopy(@Nullable final ParcelRemovedFromDeliveryMessage template) {
        if (template == null) {
            return null;
        }
        ParcelRemovedFromDeliveryMessageImpl instance = new ParcelRemovedFromDeliveryMessageImpl();
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
        instance.setParcel(com.commercetools.api.models.order.Parcel.deepCopy(template.getParcel()));
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * builder factory method for ParcelRemovedFromDeliveryMessage
     * @return builder
     */
    public static ParcelRemovedFromDeliveryMessageBuilder builder() {
        return ParcelRemovedFromDeliveryMessageBuilder.of();
    }

    /**
     * create builder for ParcelRemovedFromDeliveryMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ParcelRemovedFromDeliveryMessageBuilder builder(final ParcelRemovedFromDeliveryMessage template) {
        return ParcelRemovedFromDeliveryMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withParcelRemovedFromDeliveryMessage(Function<ParcelRemovedFromDeliveryMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ParcelRemovedFromDeliveryMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ParcelRemovedFromDeliveryMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ParcelRemovedFromDeliveryMessage>";
            }
        };
    }
}
