
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DeliveryParcelImpl.class)
public interface DeliveryParcel {

    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    @Valid
    @JsonProperty("measurements")
    public ParcelMeasurements getMeasurements();

    @Valid
    @JsonProperty("trackingData")
    public TrackingData getTrackingData();

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
