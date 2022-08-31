
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.TrackingData;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Parcel TrackingData update action.</p>
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ParcelTrackingDataUpdatedMessageImpl.class)
public interface ParcelTrackingDataUpdatedMessage extends OrderMessage {

    String PARCEL_TRACKING_DATA_UPDATED = "ParcelTrackingDataUpdated";

    /**
     *  <p>Unique identifier of the Delivery.</p>
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>Unique identifier of the Parcel.</p>
     */
    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    /**
     *  <p>The Tracking Data that was added to the Parcel.</p>
     */
    @Valid
    @JsonProperty("trackingData")
    public TrackingData getTrackingData();

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    public void setDeliveryId(final String deliveryId);

    public void setParcelId(final String parcelId);

    public void setTrackingData(final TrackingData trackingData);

    public void setShippingKey(final String shippingKey);

    public static ParcelTrackingDataUpdatedMessage of() {
        return new ParcelTrackingDataUpdatedMessageImpl();
    }

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

    public static ParcelTrackingDataUpdatedMessageBuilder builder() {
        return ParcelTrackingDataUpdatedMessageBuilder.of();
    }

    public static ParcelTrackingDataUpdatedMessageBuilder builder(final ParcelTrackingDataUpdatedMessage template) {
        return ParcelTrackingDataUpdatedMessageBuilder.of(template);
    }

    default <T> T withParcelTrackingDataUpdatedMessage(Function<ParcelTrackingDataUpdatedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ParcelTrackingDataUpdatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ParcelTrackingDataUpdatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ParcelTrackingDataUpdatedMessage>";
            }
        };
    }
}
