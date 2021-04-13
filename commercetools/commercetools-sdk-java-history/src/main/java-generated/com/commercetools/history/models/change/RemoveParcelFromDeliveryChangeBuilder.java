
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveParcelFromDeliveryChangeBuilder {

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
