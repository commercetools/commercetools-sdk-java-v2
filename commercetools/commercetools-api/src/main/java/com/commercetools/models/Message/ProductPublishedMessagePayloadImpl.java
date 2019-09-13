package com.commercetools.models.message;

import com.commercetools.models.cart.ProductPublishScope;
import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.product.ProductProjection;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductPublishedMessagePayloadImpl implements ProductPublishedMessagePayload {

   private java.lang.String type;
   
   private java.util.List<java.lang.Object> removedImageUrls;
   
   private com.commercetools.models.product.ProductProjection productProjection;
   
   private com.commercetools.models.cart.ProductPublishScope scope;

   @JsonCreator
   ProductPublishedMessagePayloadImpl(@JsonProperty("removedImageUrls") final java.util.List<java.lang.Object> removedImageUrls, @JsonProperty("productProjection") final com.commercetools.models.product.ProductProjection productProjection, @JsonProperty("scope") final com.commercetools.models.cart.ProductPublishScope scope) {
      this.removedImageUrls = removedImageUrls;
      this.productProjection = productProjection;
      this.scope = scope;
      this.type = "ProductPublished";
   }
   public ProductPublishedMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.util.List<java.lang.Object> getRemovedImageUrls(){
      return this.removedImageUrls;
   }
   
   
   public com.commercetools.models.product.ProductProjection getProductProjection(){
      return this.productProjection;
   }
   
   
   public com.commercetools.models.cart.ProductPublishScope getScope(){
      return this.scope;
   }

   public void setRemovedImageUrls(final java.util.List<java.lang.Object> removedImageUrls){
      this.removedImageUrls = removedImageUrls;
   }
   
   public void setProductProjection(final com.commercetools.models.product.ProductProjection productProjection){
      this.productProjection = productProjection;
   }
   
   public void setScope(final com.commercetools.models.cart.ProductPublishScope scope){
      this.scope = scope;
   }

}