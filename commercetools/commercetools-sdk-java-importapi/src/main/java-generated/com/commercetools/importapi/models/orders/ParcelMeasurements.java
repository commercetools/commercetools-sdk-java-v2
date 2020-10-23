package com.commercetools.importapi.models.orders;


import com.commercetools.importapi.models.orders.ParcelMeasurementsImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ParcelMeasurementsImpl.class)
public interface ParcelMeasurements  {

    
    
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

    public static ParcelMeasurementsImpl of(){
        return new ParcelMeasurementsImpl();
    }
    

    public static ParcelMeasurementsImpl of(final ParcelMeasurements template) {
        ParcelMeasurementsImpl instance = new ParcelMeasurementsImpl();
        instance.setHeightInMillimeter(template.getHeightInMillimeter());
        instance.setLengthInMillimeter(template.getLengthInMillimeter());
        instance.setWidthInMillimeter(template.getWidthInMillimeter());
        instance.setWeightInGram(template.getWeightInGram());
        return instance;
    }

    default <T> T withParcelMeasurements(Function<ParcelMeasurements, T> helper) {
        return helper.apply(this);
    }
}
