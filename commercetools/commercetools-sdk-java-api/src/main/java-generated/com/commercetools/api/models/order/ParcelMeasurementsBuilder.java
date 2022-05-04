
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ParcelMeasurementsBuilder implements Builder<ParcelMeasurements> {

    @Nullable
    private Integer heightInMillimeter;

    @Nullable
    private Integer lengthInMillimeter;

    @Nullable
    private Integer widthInMillimeter;

    @Nullable
    private Integer weightInGram;

    public ParcelMeasurementsBuilder heightInMillimeter(@Nullable final Integer heightInMillimeter) {
        this.heightInMillimeter = heightInMillimeter;
        return this;
    }

    public ParcelMeasurementsBuilder lengthInMillimeter(@Nullable final Integer lengthInMillimeter) {
        this.lengthInMillimeter = lengthInMillimeter;
        return this;
    }

    public ParcelMeasurementsBuilder widthInMillimeter(@Nullable final Integer widthInMillimeter) {
        this.widthInMillimeter = widthInMillimeter;
        return this;
    }

    public ParcelMeasurementsBuilder weightInGram(@Nullable final Integer weightInGram) {
        this.weightInGram = weightInGram;
        return this;
    }

    @Nullable
    public Integer getHeightInMillimeter() {
        return this.heightInMillimeter;
    }

    @Nullable
    public Integer getLengthInMillimeter() {
        return this.lengthInMillimeter;
    }

    @Nullable
    public Integer getWidthInMillimeter() {
        return this.widthInMillimeter;
    }

    @Nullable
    public Integer getWeightInGram() {
        return this.weightInGram;
    }

    public ParcelMeasurements build() {
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
