
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ParcelMeasurementsBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParcelMeasurements parcelMeasurements = ParcelMeasurements.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ParcelMeasurementsBuilder implements Builder<ParcelMeasurements> {

    @Nullable
    private Integer heightInMillimeter;

    @Nullable
    private Integer lengthInMillimeter;

    @Nullable
    private Integer widthInMillimeter;

    @Nullable
    private Integer weightInGram;

    /**
     *  <p>Height of the Parcel.</p>
     * @param heightInMillimeter value to be set
     * @return Builder
     */

    public ParcelMeasurementsBuilder heightInMillimeter(@Nullable final Integer heightInMillimeter) {
        this.heightInMillimeter = heightInMillimeter;
        return this;
    }

    /**
     *  <p>Length of the Parcel.</p>
     * @param lengthInMillimeter value to be set
     * @return Builder
     */

    public ParcelMeasurementsBuilder lengthInMillimeter(@Nullable final Integer lengthInMillimeter) {
        this.lengthInMillimeter = lengthInMillimeter;
        return this;
    }

    /**
     *  <p>Width of the Parcel.</p>
     * @param widthInMillimeter value to be set
     * @return Builder
     */

    public ParcelMeasurementsBuilder widthInMillimeter(@Nullable final Integer widthInMillimeter) {
        this.widthInMillimeter = widthInMillimeter;
        return this;
    }

    /**
     *  <p>Weight of the Parcel.</p>
     * @param weightInGram value to be set
     * @return Builder
     */

    public ParcelMeasurementsBuilder weightInGram(@Nullable final Integer weightInGram) {
        this.weightInGram = weightInGram;
        return this;
    }

    /**
     *  <p>Height of the Parcel.</p>
     * @return heightInMillimeter
     */

    @Nullable
    public Integer getHeightInMillimeter() {
        return this.heightInMillimeter;
    }

    /**
     *  <p>Length of the Parcel.</p>
     * @return lengthInMillimeter
     */

    @Nullable
    public Integer getLengthInMillimeter() {
        return this.lengthInMillimeter;
    }

    /**
     *  <p>Width of the Parcel.</p>
     * @return widthInMillimeter
     */

    @Nullable
    public Integer getWidthInMillimeter() {
        return this.widthInMillimeter;
    }

    /**
     *  <p>Weight of the Parcel.</p>
     * @return weightInGram
     */

    @Nullable
    public Integer getWeightInGram() {
        return this.weightInGram;
    }

    /**
     * builds ParcelMeasurements with checking for non-null required values
     * @return ParcelMeasurements
     */
    public ParcelMeasurements build() {
        return new ParcelMeasurementsImpl(heightInMillimeter, lengthInMillimeter, widthInMillimeter, weightInGram);
    }

    /**
     * builds ParcelMeasurements without checking for non-null required values
     * @return ParcelMeasurements
     */
    public ParcelMeasurements buildUnchecked() {
        return new ParcelMeasurementsImpl(heightInMillimeter, lengthInMillimeter, widthInMillimeter, weightInGram);
    }

    /**
     * factory method for an instance of ParcelMeasurementsBuilder
     * @return builder
     */
    public static ParcelMeasurementsBuilder of() {
        return new ParcelMeasurementsBuilder();
    }

    /**
     * create builder for ParcelMeasurements instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ParcelMeasurementsBuilder of(final ParcelMeasurements template) {
        ParcelMeasurementsBuilder builder = new ParcelMeasurementsBuilder();
        builder.heightInMillimeter = template.getHeightInMillimeter();
        builder.lengthInMillimeter = template.getLengthInMillimeter();
        builder.widthInMillimeter = template.getWidthInMillimeter();
        builder.weightInGram = template.getWeightInGram();
        return builder;
    }

}
