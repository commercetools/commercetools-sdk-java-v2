
package com.commercetools.api.models.order;

import java.util.List;

import com.commercetools.api.models.type.CustomFields;

public interface ParcelMixin {
    public ParcelMeasurements getMeasurements();

    public TrackingData getTrackingData();

    public List<DeliveryItem> getItems();

    public CustomFields getCustom();

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
