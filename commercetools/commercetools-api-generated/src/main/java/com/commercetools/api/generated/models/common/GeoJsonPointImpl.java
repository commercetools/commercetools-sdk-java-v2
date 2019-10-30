package com.commercetools.api.generated.models.common;

import com.commercetools.api.generated.models.common.GeoJson;
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
public final class GeoJsonPointImpl implements GeoJsonPoint {

   private String type;
   
   private java.util.List<Integer> coordinates;

   @JsonCreator
   GeoJsonPointImpl(@JsonProperty("coordinates") final java.util.List<Integer> coordinates) {
      this.coordinates = coordinates;
      this.type = "Point";
   }
   public GeoJsonPointImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public java.util.List<Integer> getCoordinates(){
      return this.coordinates;
   }

   public void setCoordinates(final java.util.List<Integer> coordinates){
      this.coordinates = coordinates;
   }

}