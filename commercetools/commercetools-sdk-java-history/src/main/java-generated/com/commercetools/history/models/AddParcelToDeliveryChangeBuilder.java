
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddParcelToDeliveryChangeBuilder {

    private String change;

    private String deliveryId;

    private com.commercetools.history.models.Parcel nextValue;

    public AddParcelToDeliveryChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddParcelToDeliveryChangeBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public AddParcelToDeliveryChangeBuilder nextValue(final com.commercetools.history.models.Parcel nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public com.commercetools.history.models.Parcel getNextValue() {
        return this.nextValue;
    }

    public AddParcelToDeliveryChange build() {
        return new AddParcelToDeliveryChangeImpl(change, deliveryId, nextValue);
    }

    public static AddParcelToDeliveryChangeBuilder of() {
        return new AddParcelToDeliveryChangeBuilder();
    }

    public static AddParcelToDeliveryChangeBuilder of(final AddParcelToDeliveryChange template) {
        AddParcelToDeliveryChangeBuilder builder = new AddParcelToDeliveryChangeBuilder();
        builder.change = template.getChange();
        builder.deliveryId = template.getDeliveryId();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
