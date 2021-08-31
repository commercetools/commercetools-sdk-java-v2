
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderSetParcelMeasurementsActionBuilder implements Builder<OrderSetParcelMeasurementsAction> {

    private String parcelId;

    @Nullable
    private com.commercetools.api.models.order.ParcelMeasurements measurements;

    public OrderSetParcelMeasurementsActionBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    public OrderSetParcelMeasurementsActionBuilder measurements(
            Function<com.commercetools.api.models.order.ParcelMeasurementsBuilder, com.commercetools.api.models.order.ParcelMeasurementsBuilder> builder) {
        this.measurements = builder.apply(com.commercetools.api.models.order.ParcelMeasurementsBuilder.of()).build();
        return this;
    }

    public OrderSetParcelMeasurementsActionBuilder measurements(
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

    public OrderSetParcelMeasurementsAction build() {
        Objects.requireNonNull(parcelId, OrderSetParcelMeasurementsAction.class + ": parcelId is missing");
        return new OrderSetParcelMeasurementsActionImpl(parcelId, measurements);
    }

    /**
     * builds OrderSetParcelMeasurementsAction without checking for non null required values
     */
    public OrderSetParcelMeasurementsAction buildUnchecked() {
        return new OrderSetParcelMeasurementsActionImpl(parcelId, measurements);
    }

    public static OrderSetParcelMeasurementsActionBuilder of() {
        return new OrderSetParcelMeasurementsActionBuilder();
    }

    public static OrderSetParcelMeasurementsActionBuilder of(final OrderSetParcelMeasurementsAction template) {
        OrderSetParcelMeasurementsActionBuilder builder = new OrderSetParcelMeasurementsActionBuilder();
        builder.parcelId = template.getParcelId();
        builder.measurements = template.getMeasurements();
        return builder;
    }

}
