
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveParcelFromDeliveryChangeBuilder implements Builder<RemoveParcelFromDeliveryChange> {

    private String change;

    private String deliveryId;

    private com.commercetools.history.models.common.Parcel previousValue;

    public RemoveParcelFromDeliveryChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemoveParcelFromDeliveryChangeBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public RemoveParcelFromDeliveryChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ParcelBuilder, com.commercetools.history.models.common.ParcelBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ParcelBuilder.of()).build();
        return this;
    }

    public RemoveParcelFromDeliveryChangeBuilder previousValue(
            final com.commercetools.history.models.common.Parcel previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public com.commercetools.history.models.common.Parcel getPreviousValue() {
        return this.previousValue;
    }

    public RemoveParcelFromDeliveryChange build() {
        Objects.requireNonNull(change, RemoveParcelFromDeliveryChange.class + ": change is missing");
        Objects.requireNonNull(deliveryId, RemoveParcelFromDeliveryChange.class + ": deliveryId is missing");
        Objects.requireNonNull(previousValue, RemoveParcelFromDeliveryChange.class + ": previousValue is missing");
        return new RemoveParcelFromDeliveryChangeImpl(change, deliveryId, previousValue);
    }

    /**
     * builds RemoveParcelFromDeliveryChange without checking for non null required values
     */
    public RemoveParcelFromDeliveryChange buildUnchecked() {
        return new RemoveParcelFromDeliveryChangeImpl(change, deliveryId, previousValue);
    }

    public static RemoveParcelFromDeliveryChangeBuilder of() {
        return new RemoveParcelFromDeliveryChangeBuilder();
    }

    public static RemoveParcelFromDeliveryChangeBuilder of(final RemoveParcelFromDeliveryChange template) {
        RemoveParcelFromDeliveryChangeBuilder builder = new RemoveParcelFromDeliveryChangeBuilder();
        builder.change = template.getChange();
        builder.deliveryId = template.getDeliveryId();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
