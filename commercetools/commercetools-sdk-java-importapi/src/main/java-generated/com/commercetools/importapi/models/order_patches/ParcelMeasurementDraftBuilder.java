
package com.commercetools.importapi.models.order_patches;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ParcelMeasurementDraftBuilder {

    private String parcelId;

    @Nullable
    private com.commercetools.importapi.models.orders.ParcelMeasurements measurements;

    public ParcelMeasurementDraftBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    public ParcelMeasurementDraftBuilder measurements(
            @Nullable final com.commercetools.importapi.models.orders.ParcelMeasurements measurements) {
        this.measurements = measurements;
        return this;
    }

    public String getParcelId() {
        return this.parcelId;
    }

    @Nullable
    public com.commercetools.importapi.models.orders.ParcelMeasurements getMeasurements() {
        return this.measurements;
    }

    public ParcelMeasurementDraft build() {
        return new ParcelMeasurementDraftImpl(parcelId, measurements);
    }

    public static ParcelMeasurementDraftBuilder of() {
        return new ParcelMeasurementDraftBuilder();
    }

    public static ParcelMeasurementDraftBuilder of(final ParcelMeasurementDraft template) {
        ParcelMeasurementDraftBuilder builder = new ParcelMeasurementDraftBuilder();
        builder.parcelId = template.getParcelId();
        builder.measurements = template.getMeasurements();
        return builder;
    }

}
