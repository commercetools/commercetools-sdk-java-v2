package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.product.ProductProjection;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductDeletedMessagePayloadImpl implements ProductDeletedMessagePayload {

   private String type;
   
   private java.util.List<String> removedImageUrls;
   
   private com.commercetools.api.generated.models.product.ProductProjection currentProjection;

   @JsonCreator
   ProductDeletedMessagePayloadImpl(@JsonProperty("removedImageUrls") final java.util.List<String> removedImageUrls, @JsonProperty("currentProjection") final com.commercetools.api.generated.models.product.ProductProjection currentProjection) {
      this.removedImageUrls = removedImageUrls;
      this.currentProjection = currentProjection;
      this.type = "ProductDeleted";
   }
   public ProductDeletedMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public java.util.List<String> getRemovedImageUrls(){
      return this.removedImageUrls;
   }
   
   
   public com.commercetools.api.generated.models.product.ProductProjection getCurrentProjection(){
      return this.currentProjection;
   }

   public void setRemovedImageUrls(final java.util.List<String> removedImageUrls){
      this.removedImageUrls = removedImageUrls;
   }
   
   public void setCurrentProjection(final com.commercetools.api.generated.models.product.ProductProjection currentProjection){
      this.currentProjection = currentProjection;
   }

}