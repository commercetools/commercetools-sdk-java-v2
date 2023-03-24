
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetParcelMeasurementsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetParcelMeasurementsAction stagedOrderSetParcelMeasurementsAction = StagedOrderSetParcelMeasurementsAction.builder()
 *             .parcelId("{parcelId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetParcelMeasurementsActionBuilder implements Builder<StagedOrderSetParcelMeasurementsAction> {

    private String parcelId;

    @Nullable
    private com.commercetools.api.models.order.ParcelMeasurements measurements;

    /**
     *
     * @param parcelId value to be set
     * @return Builder
     */

    public StagedOrderSetParcelMeasurementsActionBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    /**
     *
     * @param builder function to build the measurements value
     * @return Builder
     */

    public StagedOrderSetParcelMeasurementsActionBuilder measurements(
            Function<com.commercetools.api.models.order.ParcelMeasurementsBuilder, com.commercetools.api.models.order.ParcelMeasurementsBuilder> builder) {
        this.measurements = builder.apply(com.commercetools.api.models.order.ParcelMeasurementsBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param measurements value to be set
     * @return Builder
     */

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

    /**
     * builds StagedOrderSetParcelMeasurementsAction with checking for non-null required values
     * @return StagedOrderSetParcelMeasurementsAction
     */
    public StagedOrderSetParcelMeasurementsAction build() {
        Objects.requireNonNull(parcelId, StagedOrderSetParcelMeasurementsAction.class + ": parcelId is missing");
        return new StagedOrderSetParcelMeasurementsActionImpl(parcelId, measurements);
    }

    /**
     * builds StagedOrderSetParcelMeasurementsAction without checking for non-null required values
     * @return StagedOrderSetParcelMeasurementsAction
     */
    public StagedOrderSetParcelMeasurementsAction buildUnchecked() {
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
