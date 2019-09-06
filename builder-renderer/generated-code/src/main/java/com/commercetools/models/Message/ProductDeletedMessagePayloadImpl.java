package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Product.ProductProjection;
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
public final class ProductDeletedMessagePayloadImpl implements ProductDeletedMessagePayload {

   private java.lang.String type;
   
   private java.util.List<java.lang.String> removedImageUrls;
   
   private com.commercetools.models.Product.ProductProjection currentProjection;

   @JsonCreator
   ProductDeletedMessagePayloadImpl(@JsonProperty("removedImageUrls") final java.util.List<java.lang.String> removedImageUrls, @JsonProperty("currentProjection") final com.commercetools.models.Product.ProductProjection currentProjection) {
      this.removedImageUrls = removedImageUrls;
      this.currentProjection = currentProjection;
      this.type = "ProductDeleted";
   }
   public ProductDeletedMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.util.List<java.lang.String> getRemovedImageUrls(){
      return this.removedImageUrls;
   }
   
   
   public com.commercetools.models.Product.ProductProjection getCurrentProjection(){
      return this.currentProjection;
   }

   public void setRemovedImageUrls(final java.util.List<java.lang.String> removedImageUrls){
      this.removedImageUrls = removedImageUrls;
   }
   
   public void setCurrentProjection(final com.commercetools.models.Product.ProductProjection currentProjection){
      this.currentProjection = currentProjection;
   }

}