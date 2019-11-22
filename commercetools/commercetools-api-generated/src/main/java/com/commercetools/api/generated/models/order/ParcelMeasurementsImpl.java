package com.commercetools.api.generated.models.order;


import io.vrap.rmf.base.client.utils.Generated;
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

   private Integer weightInGram;
   
   private Integer lengthInMillimeter;
   
   private Integer heightInMillimeter;
   
   private Integer widthInMillimeter;

   @JsonCreator
   ParcelMeasurementsImpl(@JsonProperty("weightInGram") final Integer weightInGram, @JsonProperty("lengthInMillimeter") final Integer lengthInMillimeter, @JsonProperty("heightInMillimeter") final Integer heightInMillimeter, @JsonProperty("widthInMillimeter") final Integer widthInMillimeter) {
      this.weightInGram = weightInGram;
      this.lengthInMillimeter = lengthInMillimeter;
      this.heightInMillimeter = heightInMillimeter;
      this.widthInMillimeter = widthInMillimeter;
   }
   public ParcelMeasurementsImpl() {
      
   }
   
   /**
   	
   */
   public Integer getWeightInGram(){
      return this.weightInGram;
   }
   
   /**
   	
   */
   public Integer getLengthInMillimeter(){
      return this.lengthInMillimeter;
   }
   
   /**
   	
   */
   public Integer getHeightInMillimeter(){
      return this.heightInMillimeter;
   }
   
   /**
   	
   */
   public Integer getWidthInMillimeter(){
      return this.widthInMillimeter;
   }

   public void setWeightInGram(final Integer weightInGram){
      this.weightInGram = weightInGram;
   }
   
   public void setLengthInMillimeter(final Integer lengthInMillimeter){
      this.lengthInMillimeter = lengthInMillimeter;
   }
   
   public void setHeightInMillimeter(final Integer heightInMillimeter){
      this.heightInMillimeter = heightInMillimeter;
   }
   
   public void setWidthInMillimeter(final Integer widthInMillimeter){
      this.widthInMillimeter = widthInMillimeter;
   }

}