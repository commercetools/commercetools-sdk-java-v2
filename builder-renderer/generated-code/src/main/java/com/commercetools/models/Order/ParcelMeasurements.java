package com.commercetools.models.Order;

import java.lang.Integer;
import com.commercetools.models.Order.ParcelMeasurementsImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ParcelMeasurementsImpl.class)
public interface ParcelMeasurements  {

   
   
   @JsonProperty("heightInMillimeter")
   public Integer getHeightInMillimeter();
   
   
   @JsonProperty("lengthInMillimeter")
   public Integer getLengthInMillimeter();
   
   
   @JsonProperty("widthInMillimeter")
   public Integer getWidthInMillimeter();
   
   
   @JsonProperty("weightInGram")
   public Integer getWeightInGram();

   public void setHeightInMillimeter(final Integer heightInMillimeter);
   
   public void setLengthInMillimeter(final Integer lengthInMillimeter);
   
   public void setWidthInMillimeter(final Integer widthInMillimeter);
   
   public void setWeightInGram(final Integer weightInGram);
   
   public static ParcelMeasurementsImpl of(){
      return new ParcelMeasurementsImpl();
   }
   

   public static ParcelMeasurementsImpl of(final ParcelMeasurements template) {
      ParcelMeasurementsImpl instance = new ParcelMeasurementsImpl();
      instance.setWeightInGram(template.getWeightInGram());
      instance.setLengthInMillimeter(template.getLengthInMillimeter());
      instance.setHeightInMillimeter(template.getHeightInMillimeter());
      instance.setWidthInMillimeter(template.getWidthInMillimeter());
      return instance;
   }

}