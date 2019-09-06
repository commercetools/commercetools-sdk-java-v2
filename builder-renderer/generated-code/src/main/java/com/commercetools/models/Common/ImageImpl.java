package com.commercetools.models.Common;

import com.commercetools.models.Common.ImageDimensions;
import java.lang.String;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ImageImpl implements Image {

   private java.lang.String label;
   
   private java.lang.String url;
   
   private com.commercetools.models.Common.ImageDimensions dimensions;

   @JsonCreator
   ImageImpl(@JsonProperty("label") final java.lang.String label, @JsonProperty("url") final java.lang.String url, @JsonProperty("dimensions") final com.commercetools.models.Common.ImageDimensions dimensions) {
      this.label = label;
      this.url = url;
      this.dimensions = dimensions;
   }
   public ImageImpl() {
      
   }
   
   
   public java.lang.String getLabel(){
      return this.label;
   }
   
   
   public java.lang.String getUrl(){
      return this.url;
   }
   
   
   public com.commercetools.models.Common.ImageDimensions getDimensions(){
      return this.dimensions;
   }

   public void setLabel(final java.lang.String label){
      this.label = label;
   }
   
   public void setUrl(final java.lang.String url){
      this.url = url;
   }
   
   public void setDimensions(final com.commercetools.models.Common.ImageDimensions dimensions){
      this.dimensions = dimensions;
   }

}