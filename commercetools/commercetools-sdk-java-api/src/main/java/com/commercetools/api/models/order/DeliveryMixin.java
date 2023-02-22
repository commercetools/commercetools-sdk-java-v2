
package com.commercetools.api.models.order;

import java.util.List;

import com.commercetools.api.models.common.Address;

public interface DeliveryMixin extends com.commercetools.api.models.Customizable<Delivery> {
    public Address getAddress();

    public List<DeliveryItem> getItems();

    public List<Parcel> getParcels();

    public default DeliveryDraftBuilder toDraftBuilder() {
        return DeliveryDraft.builder()
                .address(this.getAddress().toDraft())
                .items(this.getItems())
                .parcels(this.getParcels().stream().map(Parcel::toDraft).collect(java.util.stream.Collectors.toList()))
                .custom(this.getCustom().toDraft());
    }

    public default DeliveryDraft toDraft() {
        return toDraftBuilder().build();
    }
}
