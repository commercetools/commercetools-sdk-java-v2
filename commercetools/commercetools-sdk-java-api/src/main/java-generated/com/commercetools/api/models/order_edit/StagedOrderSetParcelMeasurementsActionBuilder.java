
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetParcelMeasurementsActionBuilder {

    private String parcelId;

    @Nullable
    private com.commercetools.api.models.order.ParcelMeasurements measurements;

    public StagedOrderSetParcelMeasurementsActionBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    public StagedOrderSetParcelMeasurementsActionBuilder measurements(
            @Nullable final com.commercetools.api.models.order.ParcelMeasurements measurements) {
        this.measurements = measurements;
        return this;
    }

    public String getParcelId() {
        return this.parcelId;
    }

    @Nullable
    public com.commercetools.api.models.order.ParcelMeasurements getMeasurements() {
        return this.measurements;
    }

    public StagedOrderSetParcelMeasurementsAction build() {
        return new StagedOrderSetParcelMeasurementsActionImpl(parcelId, measurements);
    }

    public static StagedOrderSetParcelMeasurementsActionBuilder of() {
        return new StagedOrderSetParcelMeasurementsActionBuilder();
    }

    public static StagedOrderSetParcelMeasurementsActionBuilder of(
            final StagedOrderSetParcelMeasurementsAction template) {
        StagedOrderSetParcelMeasurementsActionBuilder builder = new StagedOrderSetParcelMeasurementsActionBuilder();
        builder.parcelId = template.getParcelId();
        builder.measurements = template.getMeasurements();
        return builder;
    }

}
