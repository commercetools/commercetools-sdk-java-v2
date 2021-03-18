
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ParcelMeasurementsBuilder {

    private Integer heightInMillimeter;

    private Integer lengthInMillimeter;

    private Integer widthInMillimeter;

    private Integer weightInGram;

    public ParcelMeasurementsBuilder heightInMillimeter(final Integer heightInMillimeter) {
        this.heightInMillimeter = heightInMillimeter;
        return this;
    }

    public ParcelMeasurementsBuilder lengthInMillimeter(final Integer lengthInMillimeter) {
        this.lengthInMillimeter = lengthInMillimeter;
        return this;
    }

    public ParcelMeasurementsBuilder widthInMillimeter(final Integer widthInMillimeter) {
        this.widthInMillimeter = widthInMillimeter;
        return this;
    }

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
