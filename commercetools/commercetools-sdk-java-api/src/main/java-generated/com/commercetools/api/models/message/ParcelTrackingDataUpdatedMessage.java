
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.TrackingData;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetParcelTrackingDataAction" rel="nofollow">Set Parcel Tracking Data</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParcelTrackingDataUpdatedMessage parcelTrackingDataUpdatedMessage = ParcelTrackingDataUpdatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .deliveryId("{deliveryId}")
 *             .parcelId("{parcelId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ParcelTrackingDataUpdated")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ParcelTrackingDataUpdatedMessageImpl.class)
public interface ParcelTrackingDataUpdatedMessage extends OrderMessage {

    /**
     * discriminator value for ParcelTrackingDataUpdatedMessage
     */
    String PARCEL_TRACKING_DATA_UPDATED = "ParcelTrackingDataUpdated";

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcel</a>.</p>
     * @return parcelId
     */
    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:TrackingData" rel="nofollow">Tracking Data</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcel</a>.</p>
     * @return trackingData
     */
    @Valid
    @JsonProperty("trackingData")
    public TrackingData getTrackingData();

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @return shippingKey
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcel</a>.</p>
     * @param parcelId value to be set
     */

    public void setParcelId(final String parcelId);

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:TrackingData" rel="nofollow">Tracking Data</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcel</a>.</p>
     * @param trackingData value to be set
     */

    public void setTrackingData(final TrackingData trackingData);

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     * factory method
     * @return instance of ParcelTrackingDataUpdatedMessage
     */
    public static ParcelTrackingDataUpdatedMessage of() {
        return new ParcelTrackingDataUpdatedMessageImpl();
    }

    /**
     * factory method to create a shallow copy ParcelTrackingDataUpdatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ParcelTrackingDataUpdatedMessage of(final ParcelTrackingDataUpdatedMessage template) {
        ParcelTrackingDataUpdatedMessageImpl instance = new ParcelTrackingDataUpdatedMessageImpl();
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
        instance.setParcelId(template.getParcelId());
        instance.setTrackingData(template.getTrackingData());
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    public ParcelTrackingDataUpdatedMessage copyDeep();

    /**
     * factory method to create a deep copy of ParcelTrackingDataUpdatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ParcelTrackingDataUpdatedMessage deepCopy(@Nullable final ParcelTrackingDataUpdatedMessage template) {
        if (template == null) {
            return null;
        }
        ParcelTrackingDataUpdatedMessageImpl instance = new ParcelTrackingDataUpdatedMessageImpl();
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
        instance.setParcelId(template.getParcelId());
        instance.setTrackingData(com.commercetools.api.models.order.TrackingData.deepCopy(template.getTrackingData()));
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * builder factory method for ParcelTrackingDataUpdatedMessage
     * @return builder
     */
    public static ParcelTrackingDataUpdatedMessageBuilder builder() {
        return ParcelTrackingDataUpdatedMessageBuilder.of();
    }

    /**
     * create builder for ParcelTrackingDataUpdatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ParcelTrackingDataUpdatedMessageBuilder builder(final ParcelTrackingDataUpdatedMessage template) {
        return ParcelTrackingDataUpdatedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withParcelTrackingDataUpdatedMessage(Function<ParcelTrackingDataUpdatedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ParcelTrackingDataUpdatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ParcelTrackingDataUpdatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ParcelTrackingDataUpdatedMessage>";
            }
        };
    }
}
