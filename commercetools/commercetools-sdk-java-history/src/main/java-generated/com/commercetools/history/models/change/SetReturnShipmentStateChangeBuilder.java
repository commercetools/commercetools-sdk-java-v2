
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetReturnShipmentStateChangeBuilder implements Builder<SetReturnShipmentStateChange> {

    private String change;

    private com.commercetools.history.models.common.ReturnShipmentState nextValue;

    private com.commercetools.history.models.common.ReturnShipmentState previousValue;

    public SetReturnShipmentStateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetReturnShipmentStateChangeBuilder nextValue(
            final com.commercetools.history.models.common.ReturnShipmentState nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetReturnShipmentStateChangeBuilder previousValue(
            final com.commercetools.history.models.common.ReturnShipmentState previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.ReturnShipmentState getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.ReturnShipmentState getPreviousValue() {
        return this.previousValue;
    }

    public SetReturnShipmentStateChange build() {
        Objects.requireNonNull(change, SetReturnShipmentStateChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, SetReturnShipmentStateChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetReturnShipmentStateChange.class + ": previousValue is missing");
        return new SetReturnShipmentStateChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds SetReturnShipmentStateChange without checking for non null required values
     */
    public SetReturnShipmentStateChange buildUnchecked() {
        return new SetReturnShipmentStateChangeImpl(change, nextValue, previousValue);
    }

    public static SetReturnShipmentStateChangeBuilder of() {
        return new SetReturnShipmentStateChangeBuilder();
    }

    public static SetReturnShipmentStateChangeBuilder of(final SetReturnShipmentStateChange template) {
        SetReturnShipmentStateChangeBuilder builder = new SetReturnShipmentStateChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
