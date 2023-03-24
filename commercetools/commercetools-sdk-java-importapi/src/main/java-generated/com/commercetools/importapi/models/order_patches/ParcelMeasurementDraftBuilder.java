
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
     *
     * @param parcelId value to be set
     * @return Builder
     */

    public ParcelMeasurementDraftBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    /**
     *
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
     *
     * @param measurements value to be set
     * @return Builder
     */

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
