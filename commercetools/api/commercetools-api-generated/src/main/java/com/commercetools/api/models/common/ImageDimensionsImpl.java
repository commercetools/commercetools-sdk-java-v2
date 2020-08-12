package com.commercetools.api.models.common;


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
public final class ImageDimensionsImpl implements ImageDimensions {

   private Integer w;
   
   private Integer h;

   @JsonCreator
   ImageDimensionsImpl(@JsonProperty("w") final Integer w, @JsonProperty("h") final Integer h) {
      this.w = w;
      this.h = h;
   }
   public ImageDimensionsImpl() {
      
   }
   
   
   public Integer getW(){
      return this.w;
   }
   
   
   public Integer getH(){
      return this.h;
   }

   public void setW(final Integer w){
      this.w = w;
   }
   
   public void setH(final Integer h){
      this.h = h;
   }

}
