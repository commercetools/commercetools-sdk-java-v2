
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ParcelMeasurementsImpl implements ParcelMeasurements {

    private Double heightInMillimeter;

    private Double lengthInMillimeter;

    private Double widthInMillimeter;

    private Double weightInGram;

    @JsonCreator
    ParcelMeasurementsImpl(@JsonProperty("heightInMillimeter") final Double heightInMillimeter,
            @JsonProperty("lengthInMillimeter") final Double lengthInMillimeter,
            @JsonProperty("widthInMillimeter") final Double widthInMillimeter,
            @JsonProperty("weightInGram") final Double weightInGram) {
        this.heightInMillimeter = heightInMillimeter;
        this.lengthInMillimeter = lengthInMillimeter;
        this.widthInMillimeter = widthInMillimeter;
        this.weightInGram = weightInGram;
    }

    public ParcelMeasurementsImpl() {
    }

    public Double getHeightInMillimeter() {
        return this.heightInMillimeter;
    }

    public Double getLengthInMillimeter() {
        return this.lengthInMillimeter;
    }

    public Double getWidthInMillimeter() {
        return this.widthInMillimeter;
    }

    public Double getWeightInGram() {
        return this.weightInGram;
    }

    public void setHeightInMillimeter(final Double heightInMillimeter) {
        this.heightInMillimeter = heightInMillimeter;
    }

    public void setLengthInMillimeter(final Double lengthInMillimeter) {
        this.lengthInMillimeter = lengthInMillimeter;
    }

    public void setWidthInMillimeter(final Double widthInMillimeter) {
        this.widthInMillimeter = widthInMillimeter;
    }

    public void setWeightInGram(final Double weightInGram) {
        this.weightInGram = weightInGram;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ParcelMeasurementsImpl that = (ParcelMeasurementsImpl) o;

        return new EqualsBuilder().append(heightInMillimeter, that.heightInMillimeter)
                .append(lengthInMillimeter, that.lengthInMillimeter)
                .append(widthInMillimeter, that.widthInMillimeter)
                .append(weightInGram, that.weightInGram)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(heightInMillimeter)
                .append(lengthInMillimeter)
                .append(widthInMillimeter)
                .append(weightInGram)
                .toHashCode();
    }

}
