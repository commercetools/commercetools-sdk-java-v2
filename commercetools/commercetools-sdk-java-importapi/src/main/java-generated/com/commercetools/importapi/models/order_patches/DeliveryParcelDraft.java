
package com.commercetools.importapi.models.order_patches;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.importapi.models.orders.DeliveryItem;
import com.commercetools.importapi.models.orders.ParcelMeasurements;
import com.commercetools.importapi.models.orders.TrackingData;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DeliveryParcelDraftImpl.class)
public interface DeliveryParcelDraft {

    @Valid
    @JsonProperty("measurements")
    public ParcelMeasurements getMeasurements();

    @Valid
    @JsonProperty("trackingData")
    public TrackingData getTrackingData();

    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    public void setMeasurements(final ParcelMeasurements measurements);

    public void setTrackingData(final TrackingData trackingData);

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    public void setItems(final List<DeliveryItem> items);

    public static DeliveryParcelDraft of() {
        return new DeliveryParcelDraftImpl();
    }

    public static DeliveryParcelDraft of(final DeliveryParcelDraft template) {
        DeliveryParcelDraftImpl instance = new DeliveryParcelDraftImpl();
        instance.setMeasurements(template.getMeasurements());
        instance.setTrackingData(template.getTrackingData());
        instance.setItems(template.getItems());
        return instance;
    }

    public static DeliveryParcelDraftBuilder builder() {
        return DeliveryParcelDraftBuilder.of();
    }

    public static DeliveryParcelDraftBuilder builder(final DeliveryParcelDraft template) {
        return DeliveryParcelDraftBuilder.of(template);
    }

    default <T> T withDeliveryParcelDraft(Function<DeliveryParcelDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryParcelDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryParcelDraft>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryParcelDraft>";
            }
        };
    }
}
