
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetReservationsChangeBuilder implements Builder<SetReservationsChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.Reservation> nextValue;

    private java.util.List<com.commercetools.history.models.common.Reservation> previousValue;

    public SetReservationsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetReservationsChangeBuilder nextValue(
            final com.commercetools.history.models.common.Reservation... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public SetReservationsChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.Reservation> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetReservationsChangeBuilder previousValue(
            final com.commercetools.history.models.common.Reservation... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public SetReservationsChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.Reservation> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public java.util.List<com.commercetools.history.models.common.Reservation> getNextValue() {
        return this.nextValue;
    }

    public java.util.List<com.commercetools.history.models.common.Reservation> getPreviousValue() {
        return this.previousValue;
    }

    public SetReservationsChange build() {
        Objects.requireNonNull(change);
        Objects.requireNonNull(nextValue);
        Objects.requireNonNull(previousValue);
        return new SetReservationsChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds SetReservationsChange without checking for non null required values
     */
    public SetReservationsChange buildUnchecked() {
        return new SetReservationsChangeImpl(change, nextValue, previousValue);
    }

    public static SetReservationsChangeBuilder of() {
        return new SetReservationsChangeBuilder();
    }

    public static SetReservationsChangeBuilder of(final SetReservationsChange template) {
        SetReservationsChangeBuilder builder = new SetReservationsChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
