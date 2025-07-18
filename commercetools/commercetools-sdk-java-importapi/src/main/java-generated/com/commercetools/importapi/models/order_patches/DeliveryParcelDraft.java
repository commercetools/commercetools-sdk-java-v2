
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

/**
 * DeliveryParcelDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryParcelDraft deliveryParcelDraft = DeliveryParcelDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DeliveryParcelDraftImpl.class)
public interface DeliveryParcelDraft extends io.vrap.rmf.base.client.Draft<DeliveryParcelDraft> {

    /**
     *  <p>Information about the dimensions for the Parcel.</p>
     * @return measurements
     */
    @Valid
    @JsonProperty("measurements")
    public ParcelMeasurements getMeasurements();

    /**
     *  <p>Shipment tracking information for the Parcel.</p>
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
     *  <p>Information about the dimensions for the Parcel.</p>
     * @param measurements value to be set
     */

    public void setMeasurements(final ParcelMeasurements measurements);

    /**
     *  <p>Shipment tracking information for the Parcel.</p>
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
     * @return instance of DeliveryParcelDraft
     */
    public static DeliveryParcelDraft of() {
        return new DeliveryParcelDraftImpl();
    }

    /**
     * factory method to create a shallow copy DeliveryParcelDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static DeliveryParcelDraft of(final DeliveryParcelDraft template) {
        DeliveryParcelDraftImpl instance = new DeliveryParcelDraftImpl();
        instance.setMeasurements(template.getMeasurements());
        instance.setTrackingData(template.getTrackingData());
        instance.setItems(template.getItems());
        return instance;
    }

    public DeliveryParcelDraft copyDeep();

    /**
     * factory method to create a deep copy of DeliveryParcelDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DeliveryParcelDraft deepCopy(@Nullable final DeliveryParcelDraft template) {
        if (template == null) {
            return null;
        }
        DeliveryParcelDraftImpl instance = new DeliveryParcelDraftImpl();
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
     * builder factory method for DeliveryParcelDraft
     * @return builder
     */
    public static DeliveryParcelDraftBuilder builder() {
        return DeliveryParcelDraftBuilder.of();
    }

    /**
     * create builder for DeliveryParcelDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryParcelDraftBuilder builder(final DeliveryParcelDraft template) {
        return DeliveryParcelDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDeliveryParcelDraft(Function<DeliveryParcelDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryParcelDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryParcelDraft>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryParcelDraft>";
            }
        };
    }
}
