
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetParcelMeasurementsChangeBuilder {

    private String change;

    private com.commercetools.history.models.ParcelChangeValue parcel;

    private com.commercetools.history.models.ParcelMeasurements nextValue;

    private com.commercetools.history.models.ParcelMeasurements previousValue;

    public SetParcelMeasurementsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetParcelMeasurementsChangeBuilder parcel(final com.commercetools.history.models.ParcelChangeValue parcel) {
        this.parcel = parcel;
        return this;
    }

    public SetParcelMeasurementsChangeBuilder nextValue(
            final com.commercetools.history.models.ParcelMeasurements nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetParcelMeasurementsChangeBuilder previousValue(
            final com.commercetools.history.models.ParcelMeasurements previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.ParcelChangeValue getParcel() {
        return this.parcel;
    }

    public com.commercetools.history.models.ParcelMeasurements getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.ParcelMeasurements getPreviousValue() {
        return this.previousValue;
    }

    public SetParcelMeasurementsChange build() {
        return new SetParcelMeasurementsChangeImpl(change, parcel, nextValue, previousValue);
    }

    public static SetParcelMeasurementsChangeBuilder of() {
        return new SetParcelMeasurementsChangeBuilder();
    }

    public static SetParcelMeasurementsChangeBuilder of(final SetParcelMeasurementsChange template) {
        SetParcelMeasurementsChangeBuilder builder = new SetParcelMeasurementsChangeBuilder();
        builder.change = template.getChange();
        builder.parcel = template.getParcel();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
