package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Product.ProductVariant;
import java.lang.Object;
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
public final class ProductVariantDeletedMessagePayloadImpl implements ProductVariantDeletedMessagePayload {

   private java.lang.String type;
   
   private java.util.List<java.lang.Object> removedImageUrls;
   
   private com.commercetools.models.Product.ProductVariant variant;

   @JsonCreator
   ProductVariantDeletedMessagePayloadImpl(@JsonProperty("removedImageUrls") final java.util.List<java.lang.Object> removedImageUrls, @JsonProperty("variant") final com.commercetools.models.Product.ProductVariant variant) {
      this.removedImageUrls = removedImageUrls;
      this.variant = variant;
      this.type = "ProductVariantDeleted";
   }
   public ProductVariantDeletedMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.util.List<java.lang.Object> getRemovedImageUrls(){
      return this.removedImageUrls;
   }
   
   
   public com.commercetools.models.Product.ProductVariant getVariant(){
      return this.variant;
   }

   public void setRemovedImageUrls(final java.util.List<java.lang.Object> removedImageUrls){
      this.removedImageUrls = removedImageUrls;
   }
   
   public void setVariant(final com.commercetools.models.Product.ProductVariant variant){
      this.variant = variant;
   }

}