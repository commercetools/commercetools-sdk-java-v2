
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
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetParcelMeasurementsActionBuilder implements Builder<StagedOrderSetParcelMeasurementsAction> {

    @Nullable
    private String parcelId;

    @Nullable
    private String parcelKey;

    @Nullable
    private com.commercetools.api.models.order.ParcelMeasurements measurements;

    /**
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> is required for this update action.</p>
     * @param parcelId value to be set
     * @return Builder
     */

    public StagedOrderSetParcelMeasurementsActionBuilder parcelId(@Nullable final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    /**
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> is required for this update action.</p>
     * @param parcelKey value to be set
     * @return Builder
     */

    public StagedOrderSetParcelMeasurementsActionBuilder parcelKey(@Nullable final String parcelKey) {
        this.parcelKey = parcelKey;
        return this;
    }

    /**
     * set the value to the measurements using the builder function
     * @param builder function to build the measurements value
     * @return Builder
     */

    public StagedOrderSetParcelMeasurementsActionBuilder measurements(
            Function<com.commercetools.api.models.order.ParcelMeasurementsBuilder, com.commercetools.api.models.order.ParcelMeasurementsBuilder> builder) {
        this.measurements = builder.apply(com.commercetools.api.models.order.ParcelMeasurementsBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the measurements
     * @param measurements value to be set
     * @return Builder
     */

    public StagedOrderSetParcelMeasurementsActionBuilder measurements(
            @Nullable final com.commercetools.api.models.order.ParcelMeasurements measurements) {
        this.measurements = measurements;
        return this;
    }

    /**
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> is required for this update action.</p>
     * @return parcelId
     */

    @Nullable
    public String getParcelId() {
        return this.parcelId;
    }

    /**
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> is required for this update action.</p>
     * @return parcelKey
     */

    @Nullable
    public String getParcelKey() {
        return this.parcelKey;
    }

    /**
     * value of measurements}
     * @return measurements
     */

    @Nullable
    public com.commercetools.api.models.order.ParcelMeasurements getMeasurements() {
        return this.measurements;
    }

    /**
     * builds StagedOrderSetParcelMeasurementsAction with checking for non-null required values
     * @return StagedOrderSetParcelMeasurementsAction
     */
    public StagedOrderSetParcelMeasurementsAction build() {
        return new StagedOrderSetParcelMeasurementsActionImpl(parcelId, parcelKey, measurements);
    }

    /**
     * builds StagedOrderSetParcelMeasurementsAction without checking for non-null required values
     * @return StagedOrderSetParcelMeasurementsAction
     */
    public StagedOrderSetParcelMeasurementsAction buildUnchecked() {
        return new StagedOrderSetParcelMeasurementsActionImpl(parcelId, parcelKey, measurements);
    }

    /**
     * factory method for an instance of StagedOrderSetParcelMeasurementsActionBuilder
     * @return builder
     */
    public static StagedOrderSetParcelMeasurementsActionBuilder of() {
        return new StagedOrderSetParcelMeasurementsActionBuilder();
    }

    /**
     * create builder for StagedOrderSetParcelMeasurementsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetParcelMeasurementsActionBuilder of(
            final StagedOrderSetParcelMeasurementsAction template) {
        StagedOrderSetParcelMeasurementsActionBuilder builder = new StagedOrderSetParcelMeasurementsActionBuilder();
        builder.parcelId = template.getParcelId();
        builder.parcelKey = template.getParcelKey();
        builder.measurements = template.getMeasurements();
        return builder;
    }

}
