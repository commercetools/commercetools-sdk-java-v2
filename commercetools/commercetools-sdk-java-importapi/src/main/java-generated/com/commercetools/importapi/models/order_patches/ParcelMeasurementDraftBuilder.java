
package com.commercetools.importapi.models.order_patches;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ParcelMeasurementDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParcelMeasurementDraft parcelMeasurementDraft = ParcelMeasurementDraft.builder()
 *             .parcelId("{parcelId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ParcelMeasurementDraftBuilder implements Builder<ParcelMeasurementDraft> {

    private String parcelId;

    @Nullable
    private com.commercetools.importapi.models.orders.ParcelMeasurements measurements;

    /**
     * set the value to the parcelId
     * @param parcelId value to be set
     * @return Builder
     */

    public ParcelMeasurementDraftBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    /**
     * set the value to the measurements using the builder function
     * @param builder function to build the measurements value
     * @return Builder
     */

    public ParcelMeasurementDraftBuilder measurements(
            Function<com.commercetools.importapi.models.orders.ParcelMeasurementsBuilder, com.commercetools.importapi.models.orders.ParcelMeasurementsBuilder> builder) {
        this.measurements = builder.apply(com.commercetools.importapi.models.orders.ParcelMeasurementsBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the measurements
     * @param measurements value to be set
     * @return Builder
     */

    public ParcelMeasurementDraftBuilder measurements(
            @Nullable final com.commercetools.importapi.models.orders.ParcelMeasurements measurements) {
        this.measurements = measurements;
        return this;
    }

    /**
     * value of parcelId}
     * @return parcelId
     */

    public String getParcelId() {
        return this.parcelId;
    }

    /**
     * value of measurements}
     * @return measurements
     */

    @Nullable
    public com.commercetools.importapi.models.orders.ParcelMeasurements getMeasurements() {
        return this.measurements;
    }

    /**
     * builds ParcelMeasurementDraft with checking for non-null required values
     * @return ParcelMeasurementDraft
     */
    public ParcelMeasurementDraft build() {
        Objects.requireNonNull(parcelId, ParcelMeasurementDraft.class + ": parcelId is missing");
        return new ParcelMeasurementDraftImpl(parcelId, measurements);
    }

    /**
     * builds ParcelMeasurementDraft without checking for non-null required values
     * @return ParcelMeasurementDraft
     */
    public ParcelMeasurementDraft buildUnchecked() {
        return new ParcelMeasurementDraftImpl(parcelId, measurements);
    }

    /**
     * factory method for an instance of ParcelMeasurementDraftBuilder
     * @return builder
     */
    public static ParcelMeasurementDraftBuilder of() {
        return new ParcelMeasurementDraftBuilder();
    }

    /**
     * create builder for ParcelMeasurementDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ParcelMeasurementDraftBuilder of(final ParcelMeasurementDraft template) {
        ParcelMeasurementDraftBuilder builder = new ParcelMeasurementDraftBuilder();
        builder.parcelId = template.getParcelId();
        builder.measurements = template.getMeasurements();
        return builder;
    }

}
