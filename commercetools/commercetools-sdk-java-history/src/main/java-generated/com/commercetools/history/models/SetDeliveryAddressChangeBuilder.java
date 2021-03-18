
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetDeliveryAddressChangeBuilder {

    private String change;

    private String deliveryId;

    private com.commercetools.history.models.Address nextValue;

    private com.commercetools.history.models.Address previousValue;

    public SetDeliveryAddressChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetDeliveryAddressChangeBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public SetDeliveryAddressChangeBuilder nextValue(final com.commercetools.history.models.Address nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetDeliveryAddressChangeBuilder previousValue(final com.commercetools.history.models.Address previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public com.commercetools.history.models.Address getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.Address getPreviousValue() {
        return this.previousValue;
    }

    public SetDeliveryAddressChange build() {
        return new SetDeliveryAddressChangeImpl(change, deliveryId, nextValue, previousValue);
    }

    public static SetDeliveryAddressChangeBuilder of() {
        return new SetDeliveryAddressChangeBuilder();
    }

    public static SetDeliveryAddressChangeBuilder of(final SetDeliveryAddressChange template) {
        SetDeliveryAddressChangeBuilder builder = new SetDeliveryAddressChangeBuilder();
        builder.change = template.getChange();
        builder.deliveryId = template.getDeliveryId();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
