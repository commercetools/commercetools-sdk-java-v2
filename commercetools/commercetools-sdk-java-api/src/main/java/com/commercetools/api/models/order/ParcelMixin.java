
package com.commercetools.api.models.order;

import java.util.List;

public interface ParcelMixin extends com.commercetools.api.models.Customizable<Parcel> {
    public ParcelMeasurements getMeasurements();

    public TrackingData getTrackingData();

    public List<DeliveryItem> getItems();

    public default ParcelDraftBuilder toDraftBuilder() {
        return ParcelDraft.builder()
                .measurements(this.getMeasurements())
                .trackingData(this.getTrackingData())
                .items(this.getItems())
                .custom(this.getCustom().toDraft());
    }

    public default ParcelDraft toDraft() {
        return toDraftBuilder().build();
    }
}
