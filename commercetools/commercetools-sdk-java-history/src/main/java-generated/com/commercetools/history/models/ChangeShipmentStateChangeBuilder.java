
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeShipmentStateChangeBuilder {

    private String change;

    private com.commercetools.history.models.ShipmentState nextValue;

    private com.commercetools.history.models.ShipmentState previousValue;

    public ChangeShipmentStateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeShipmentStateChangeBuilder nextValue(final com.commercetools.history.models.ShipmentState nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public ChangeShipmentStateChangeBuilder previousValue(
            final com.commercetools.history.models.ShipmentState previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.ShipmentState getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.ShipmentState getPreviousValue() {
        return this.previousValue;
    }

    public ChangeShipmentStateChange build() {
        return new ChangeShipmentStateChangeImpl(change, nextValue, previousValue);
    }

    public static ChangeShipmentStateChangeBuilder of() {
        return new ChangeShipmentStateChangeBuilder();
    }

    public static ChangeShipmentStateChangeBuilder of(final ChangeShipmentStateChange template) {
        ChangeShipmentStateChangeBuilder builder = new ChangeShipmentStateChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
