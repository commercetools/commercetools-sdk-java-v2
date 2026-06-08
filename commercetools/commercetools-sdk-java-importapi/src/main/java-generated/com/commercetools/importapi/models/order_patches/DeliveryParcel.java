
package com.commercetools.importapi.models.order_patches;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.orders.DeliveryItem;
import com.commercetools.importapi.models.orders.ParcelMeasurements;
import com.commercetools.importapi.models.orders.TrackingData;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * DeliveryParcel
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryParcel deliveryParcel = DeliveryParcel.builder()
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DeliveryParcelImpl.class)
public interface DeliveryParcel {

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>Information about the dimensions of the Parcel.</p>
     * @return measurements
     */
    @Valid
    @JsonProperty("measurements")
    public ParcelMeasurements getMeasurements();

    /**
     *  <p>Shipment tracking information of the Parcel.</p>
     * @return trackingData
     */
    @Valid
    @JsonProperty("trackingData")
    public TrackingData getTrackingData();

    /**
     *  <p>Line Items or Custom Line Items delivered in this Parcel.</p>
     * @return items
     */
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     *  <p>Information about the dimensions of the Parcel.</p>
     * @param measurements value to be set
     */

    public void setMeasurements(final ParcelMeasurements measurements);

    /**
     *  <p>Shipment tracking information of the Parcel.</p>
     * @param trackingData value to be set
     */

    public void setTrackingData(final TrackingData trackingData);

    /**
     *  <p>Line Items or Custom Line Items delivered in this Parcel.</p>
     * @param items values to be set
     */

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    /**
     *  <p>Line Items or Custom Line Items delivered in this Parcel.</p>
     * @param items values to be set
     */

    public void setItems(final List<DeliveryItem> items);

    /**
     * factory method
     * @return instance of DeliveryParcel
     */
    public static DeliveryParcel of() {
        return new DeliveryParcelImpl();
    }

    /**
     * factory method to create a shallow copy DeliveryParcel
     * @param template instance to be copied
     * @return copy instance
     */
    public static DeliveryParcel of(final DeliveryParcel template) {
        DeliveryParcelImpl instance = new DeliveryParcelImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setMeasurements(template.getMeasurements());
        instance.setTrackingData(template.getTrackingData());
        instance.setItems(template.getItems());
        return instance;
    }

    public DeliveryParcel copyDeep();

    /**
     * factory method to create a deep copy of DeliveryParcel
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DeliveryParcel deepCopy(@Nullable final DeliveryParcel template) {
        if (template == null) {
            return null;
        }
        DeliveryParcelImpl instance = new DeliveryParcelImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setMeasurements(
            com.commercetools.importapi.models.orders.ParcelMeasurements.deepCopy(template.getMeasurements()));
        instance.setTrackingData(
            com.commercetools.importapi.models.orders.TrackingData.deepCopy(template.getTrackingData()));
        instance.setItems(Optional.ofNullable(template.getItems())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.orders.DeliveryItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for DeliveryParcel
     * @return builder
     */
    public static DeliveryParcelBuilder builder() {
        return DeliveryParcelBuilder.of();
    }

    /**
     * create builder for DeliveryParcel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryParcelBuilder builder(final DeliveryParcel template) {
        return DeliveryParcelBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDeliveryParcel(Function<DeliveryParcel, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryParcel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryParcel>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryParcel>";
            }
        };
    }
}
