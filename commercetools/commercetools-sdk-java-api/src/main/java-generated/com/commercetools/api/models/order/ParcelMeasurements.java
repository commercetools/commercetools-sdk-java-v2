
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ParcelMeasurementsImpl.class)
public interface ParcelMeasurements {

    @JsonProperty("heightInMillimeter")
    public Double getHeightInMillimeter();

    @JsonProperty("lengthInMillimeter")
    public Double getLengthInMillimeter();

    @JsonProperty("widthInMillimeter")
    public Double getWidthInMillimeter();

    @JsonProperty("weightInGram")
    public Double getWeightInGram();

    public void setHeightInMillimeter(final Double heightInMillimeter);

    public void setLengthInMillimeter(final Double lengthInMillimeter);

    public void setWidthInMillimeter(final Double widthInMillimeter);

    public void setWeightInGram(final Double weightInGram);

    public static ParcelMeasurements of() {
        return new ParcelMeasurementsImpl();
    }

    public static ParcelMeasurements of(final ParcelMeasurements template) {
        ParcelMeasurementsImpl instance = new ParcelMeasurementsImpl();
        instance.setHeightInMillimeter(template.getHeightInMillimeter());
        instance.setLengthInMillimeter(template.getLengthInMillimeter());
        instance.setWidthInMillimeter(template.getWidthInMillimeter());
        instance.setWeightInGram(template.getWeightInGram());
        return instance;
    }

    public static ParcelMeasurementsBuilder builder() {
        return ParcelMeasurementsBuilder.of();
    }

    public static ParcelMeasurementsBuilder builder(final ParcelMeasurements template) {
        return ParcelMeasurementsBuilder.of(template);
    }

    default <T> T withParcelMeasurements(Function<ParcelMeasurements, T> helper) {
        return helper.apply(this);
    }
}
