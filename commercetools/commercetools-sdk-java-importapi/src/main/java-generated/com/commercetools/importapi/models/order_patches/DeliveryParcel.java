
package com.commercetools.importapi.models.order_patches;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.orders.DeliveryItem;
import com.commercetools.importapi.models.orders.ParcelMeasurements;
import com.commercetools.importapi.models.orders.TrackingData;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
     *
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *
     * @return measurements
     */
    @Valid
    @JsonProperty("measurements")
    public ParcelMeasurements getMeasurements();

    /**
     *
     * @return trackingData
     */
    @Valid
    @JsonProperty("trackingData")
    public TrackingData getTrackingData();

    /**
     *
     * @return items
     */
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    public void setDeliveryId(final String deliveryId);

    public void setMeasurements(final ParcelMeasurements measurements);

    public void setTrackingData(final TrackingData trackingData);

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    public void setItems(final List<DeliveryItem> items);

    public static DeliveryParcel of() {
        return new DeliveryParcelImpl();
    }

    public static DeliveryParcel of(final DeliveryParcel template) {
        DeliveryParcelImpl instance = new DeliveryParcelImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setMeasurements(template.getMeasurements());
        instance.setTrackingData(template.getTrackingData());
        instance.setItems(template.getItems());
        return instance;
    }

    public static DeliveryParcelBuilder builder() {
        return DeliveryParcelBuilder.of();
    }

    public static DeliveryParcelBuilder builder(final DeliveryParcel template) {
        return DeliveryParcelBuilder.of(template);
    }

    default <T> T withDeliveryParcel(Function<DeliveryParcel, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryParcel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryParcel>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryParcel>";
            }
        };
    }
}
