package com.commercetools.importapi.models.orders;


import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ParcelMeasurementsImpl implements ParcelMeasurements {

    private Double heightInMillimeter;

    private Double lengthInMillimeter;

    private Double widthInMillimeter;

    private Double weightInGram;

    @JsonCreator
    ParcelMeasurementsImpl(@JsonProperty("heightInMillimeter") final Double heightInMillimeter, @JsonProperty("lengthInMillimeter") final Double lengthInMillimeter, @JsonProperty("widthInMillimeter") final Double widthInMillimeter, @JsonProperty("weightInGram") final Double weightInGram) {
        this.heightInMillimeter = heightInMillimeter;
        this.lengthInMillimeter = lengthInMillimeter;
        this.widthInMillimeter = widthInMillimeter;
        this.weightInGram = weightInGram;
    }
    public ParcelMeasurementsImpl() {

    }


    public Double getHeightInMillimeter(){
        return this.heightInMillimeter;
    }


    public Double getLengthInMillimeter(){
        return this.lengthInMillimeter;
    }


    public Double getWidthInMillimeter(){
        return this.widthInMillimeter;
    }


    public Double getWeightInGram(){
        return this.weightInGram;
    }

    public void setHeightInMillimeter(final Double heightInMillimeter){
        this.heightInMillimeter = heightInMillimeter;
    }

    public void setLengthInMillimeter(final Double lengthInMillimeter){
        this.lengthInMillimeter = lengthInMillimeter;
    }

    public void setWidthInMillimeter(final Double widthInMillimeter){
        this.widthInMillimeter = widthInMillimeter;
    }

    public void setWeightInGram(final Double weightInGram){
        this.weightInGram = weightInGram;
    }

}
