
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ParcelMeasurementsBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParcelMeasurements parcelMeasurements = ParcelMeasurements.builder()
 *             .heightInMillimeter(1)
 *             .lengthInMillimeter(1)
 *             .widthInMillimeter(1)
 *             .weightInGram(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ParcelMeasurementsBuilder implements Builder<ParcelMeasurements> {

    private Integer heightInMillimeter;

    private Integer lengthInMillimeter;

    private Integer widthInMillimeter;

    private Integer weightInGram;

    /**
     *
     */

    public ParcelMeasurementsBuilder heightInMillimeter(final Integer heightInMillimeter) {
        this.heightInMillimeter = heightInMillimeter;
        return this;
    }

    /**
     *
     */

    public ParcelMeasurementsBuilder lengthInMillimeter(final Integer lengthInMillimeter) {
        this.lengthInMillimeter = lengthInMillimeter;
        return this;
    }

    /**
     *
     */

    public ParcelMeasurementsBuilder widthInMillimeter(final Integer widthInMillimeter) {
        this.widthInMillimeter = widthInMillimeter;
        return this;
    }

    /**
     *
     */

    public ParcelMeasurementsBuilder weightInGram(final Integer weightInGram) {
        this.weightInGram = weightInGram;
        return this;
    }

    public Integer getHeightInMillimeter() {
        return this.heightInMillimeter;
    }

    public Integer getLengthInMillimeter() {
        return this.lengthInMillimeter;
    }

    public Integer getWidthInMillimeter() {
        return this.widthInMillimeter;
    }

    public Integer getWeightInGram() {
        return this.weightInGram;
    }

    public ParcelMeasurements build() {
        Objects.requireNonNull(heightInMillimeter, ParcelMeasurements.class + ": heightInMillimeter is missing");
        Objects.requireNonNull(lengthInMillimeter, ParcelMeasurements.class + ": lengthInMillimeter is missing");
        Objects.requireNonNull(widthInMillimeter, ParcelMeasurements.class + ": widthInMillimeter is missing");
        Objects.requireNonNull(weightInGram, ParcelMeasurements.class + ": weightInGram is missing");
        return new ParcelMeasurementsImpl(heightInMillimeter, lengthInMillimeter, widthInMillimeter, weightInGram);
    }

    /**
     * builds ParcelMeasurements without checking for non null required values
     */
    public ParcelMeasurements buildUnchecked() {
        return new ParcelMeasurementsImpl(heightInMillimeter, lengthInMillimeter, widthInMillimeter, weightInGram);
    }

    public static ParcelMeasurementsBuilder of() {
        return new ParcelMeasurementsBuilder();
    }

    public static ParcelMeasurementsBuilder of(final ParcelMeasurements template) {
        ParcelMeasurementsBuilder builder = new ParcelMeasurementsBuilder();
        builder.heightInMillimeter = template.getHeightInMillimeter();
        builder.lengthInMillimeter = template.getLengthInMillimeter();
        builder.widthInMillimeter = template.getWidthInMillimeter();
        builder.weightInGram = template.getWeightInGram();
        return builder;
    }

}
