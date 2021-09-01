
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetParcelMeasurementsChangeBuilder implements Builder<SetParcelMeasurementsChange> {

    private String change;

    private com.commercetools.history.models.change_value.ParcelChangeValue parcel;

    private com.commercetools.history.models.common.ParcelMeasurements nextValue;

    private com.commercetools.history.models.common.ParcelMeasurements previousValue;

    public SetParcelMeasurementsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetParcelMeasurementsChangeBuilder parcel(
            Function<com.commercetools.history.models.change_value.ParcelChangeValueBuilder, com.commercetools.history.models.change_value.ParcelChangeValueBuilder> builder) {
        this.parcel = builder.apply(com.commercetools.history.models.change_value.ParcelChangeValueBuilder.of())
                .build();
        return this;
    }

    public SetParcelMeasurementsChangeBuilder parcel(
            final com.commercetools.history.models.change_value.ParcelChangeValue parcel) {
        this.parcel = parcel;
        return this;
    }

    public SetParcelMeasurementsChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ParcelMeasurementsBuilder, com.commercetools.history.models.common.ParcelMeasurementsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ParcelMeasurementsBuilder.of()).build();
        return this;
    }

    public SetParcelMeasurementsChangeBuilder nextValue(
            final com.commercetools.history.models.common.ParcelMeasurements nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetParcelMeasurementsChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ParcelMeasurementsBuilder, com.commercetools.history.models.common.ParcelMeasurementsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ParcelMeasurementsBuilder.of())
                .build();
        return this;
    }

    public SetParcelMeasurementsChangeBuilder previousValue(
            final com.commercetools.history.models.common.ParcelMeasurements previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.ParcelChangeValue getParcel() {
        return this.parcel;
    }

    public com.commercetools.history.models.common.ParcelMeasurements getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.ParcelMeasurements getPreviousValue() {
        return this.previousValue;
    }

    public SetParcelMeasurementsChange build() {
        Objects.requireNonNull(change, SetParcelMeasurementsChange.class + ": change is missing");
        Objects.requireNonNull(parcel, SetParcelMeasurementsChange.class + ": parcel is missing");
        Objects.requireNonNull(nextValue, SetParcelMeasurementsChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetParcelMeasurementsChange.class + ": previousValue is missing");
        return new SetParcelMeasurementsChangeImpl(change, parcel, nextValue, previousValue);
    }

    /**
     * builds SetParcelMeasurementsChange without checking for non null required values
     */
    public SetParcelMeasurementsChange buildUnchecked() {
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
