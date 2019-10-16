package com.commercetools.api.generated.models.common;

import com.commercetools.api.generated.models.common.AssetDimensions;
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

   private String contentType;
   
   private String uri;
   
   private String key;
   
   private com.commercetools.api.generated.models.common.AssetDimensions dimensions;

   @JsonCreator
   AssetSourceImpl(@JsonProperty("contentType") final String contentType, @JsonProperty("uri") final String uri, @JsonProperty("key") final String key, @JsonProperty("dimensions") final com.commercetools.api.generated.models.common.AssetDimensions dimensions) {
      this.contentType = contentType;
      this.uri = uri;
      this.key = key;
      this.dimensions = dimensions;
   }
   public AssetSourceImpl() {
      
   }
   
   
   public String getContentType(){
      return this.contentType;
   }
   
   
   public String getUri(){
      return this.uri;
   }
   
   
   public String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.api.generated.models.common.AssetDimensions getDimensions(){
      return this.dimensions;
   }

   public void setContentType(final String contentType){
      this.contentType = contentType;
   }
   
   public void setUri(final String uri){
      this.uri = uri;
   }
   
   public void setKey(final String key){
      this.key = key;
   }
   
   public void setDimensions(final com.commercetools.api.generated.models.common.AssetDimensions dimensions){
      this.dimensions = dimensions;
   }

}