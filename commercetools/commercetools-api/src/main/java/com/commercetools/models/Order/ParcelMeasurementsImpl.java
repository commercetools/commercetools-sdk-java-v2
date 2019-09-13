package com.commercetools.models.order;

import java.lang.Integer;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ParcelMeasurementsImpl implements ParcelMeasurements {

   private java.lang.Integer weightInGram;
   
   private java.lang.Integer lengthInMillimeter;
   
   private java.lang.Integer heightInMillimeter;
   
   private java.lang.Integer widthInMillimeter;

   @JsonCreator
   ParcelMeasurementsImpl(@JsonProperty("weightInGram") final java.lang.Integer weightInGram, @JsonProperty("lengthInMillimeter") final java.lang.Integer lengthInMillimeter, @JsonProperty("heightInMillimeter") final java.lang.Integer heightInMillimeter, @JsonProperty("widthInMillimeter") final java.lang.Integer widthInMillimeter) {
      this.weightInGram = weightInGram;
      this.lengthInMillimeter = lengthInMillimeter;
      this.heightInMillimeter = heightInMillimeter;
      this.widthInMillimeter = widthInMillimeter;
   }
   public ParcelMeasurementsImpl() {
      
   }
   
   
   public java.lang.Integer getWeightInGram(){
      return this.weightInGram;
   }
   
   
   public java.lang.Integer getLengthInMillimeter(){
      return this.lengthInMillimeter;
   }
   
   
   public java.lang.Integer getHeightInMillimeter(){
      return this.heightInMillimeter;
   }
   
   
   public java.lang.Integer getWidthInMillimeter(){
      return this.widthInMillimeter;
   }

   public void setWeightInGram(final java.lang.Integer weightInGram){
      this.weightInGram = weightInGram;
   }
   
   public void setLengthInMillimeter(final java.lang.Integer lengthInMillimeter){
      this.lengthInMillimeter = lengthInMillimeter;
   }
   
   public void setHeightInMillimeter(final java.lang.Integer heightInMillimeter){
      this.heightInMillimeter = heightInMillimeter;
   }
   
   public void setWidthInMillimeter(final java.lang.Integer widthInMillimeter){
      this.widthInMillimeter = widthInMillimeter;
   }

}