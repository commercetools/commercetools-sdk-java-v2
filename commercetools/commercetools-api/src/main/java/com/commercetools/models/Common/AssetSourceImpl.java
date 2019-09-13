package com.commercetools.models.common;

import com.commercetools.models.common.AssetDimensions;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AssetSourceImpl implements AssetSource {

   private java.lang.String contentType;
   
   private java.lang.String uri;
   
   private java.lang.String key;
   
   private com.commercetools.models.common.AssetDimensions dimensions;

   @JsonCreator
   AssetSourceImpl(@JsonProperty("contentType") final java.lang.String contentType, @JsonProperty("uri") final java.lang.String uri, @JsonProperty("key") final java.lang.String key, @JsonProperty("dimensions") final com.commercetools.models.common.AssetDimensions dimensions) {
      this.contentType = contentType;
      this.uri = uri;
      this.key = key;
      this.dimensions = dimensions;
   }
   public AssetSourceImpl() {
      
   }
   
   
   public java.lang.String getContentType(){
      return this.contentType;
   }
   
   
   public java.lang.String getUri(){
      return this.uri;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.models.common.AssetDimensions getDimensions(){
      return this.dimensions;
   }

   public void setContentType(final java.lang.String contentType){
      this.contentType = contentType;
   }
   
   public void setUri(final java.lang.String uri){
      this.uri = uri;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }
   
   public void setDimensions(final com.commercetools.models.common.AssetDimensions dimensions){
      this.dimensions = dimensions;
   }

}