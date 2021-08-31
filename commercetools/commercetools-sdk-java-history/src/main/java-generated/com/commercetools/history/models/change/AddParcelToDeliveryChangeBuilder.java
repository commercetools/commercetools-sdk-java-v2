
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddParcelToDeliveryChangeBuilder implements Builder<AddParcelToDeliveryChange> {

    private String change;

    private String deliveryId;

    private com.commercetools.history.models.common.Parcel nextValue;

    public AddParcelToDeliveryChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddParcelToDeliveryChangeBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public AddParcelToDeliveryChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ParcelBuilder, com.commercetools.history.models.common.ParcelBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ParcelBuilder.of()).build();
        return this;
    }

    public AddParcelToDeliveryChangeBuilder nextValue(final com.commercetools.history.models.common.Parcel nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public com.commercetools.history.models.common.Parcel getNextValue() {
        return this.nextValue;
    }

    public AddParcelToDeliveryChange build() {
        Objects.requireNonNull(change, AddParcelToDeliveryChange.class + ": change is missing");
        Objects.requireNonNull(deliveryId, AddParcelToDeliveryChange.class + ": deliveryId is missing");
        Objects.requireNonNull(nextValue, AddParcelToDeliveryChange.class + ": nextValue is missing");
        return new AddParcelToDeliveryChangeImpl(change, deliveryId, nextValue);
    }

    /**
     * builds AddParcelToDeliveryChange without checking for non null required values
     */
    public AddParcelToDeliveryChange buildUnchecked() {
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
