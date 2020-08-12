package com.commercetools.api.models.message;

import com.commercetools.api.models.cart.ProductPublishScope;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.product.ProductProjection;
import com.fasterxml.jackson.databind.JsonNode;
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
public final class ProductPublishedMessagePayloadImpl implements ProductPublishedMessagePayload {

   private String type;
   
   private java.util.List<com.fasterxml.jackson.databind.JsonNode> removedImageUrls;
   
   private com.commercetools.api.models.product.ProductProjection productProjection;
   
   private com.commercetools.api.models.cart.ProductPublishScope scope;

   @JsonCreator
   ProductPublishedMessagePayloadImpl(@JsonProperty("removedImageUrls") final java.util.List<com.fasterxml.jackson.databind.JsonNode> removedImageUrls, @JsonProperty("productProjection") final com.commercetools.api.models.product.ProductProjection productProjection, @JsonProperty("scope") final com.commercetools.api.models.cart.ProductPublishScope scope) {
      this.removedImageUrls = removedImageUrls;
      this.productProjection = productProjection;
      this.scope = scope;
      this.type = "ProductPublished";
   }
   public ProductPublishedMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public java.util.List<com.fasterxml.jackson.databind.JsonNode> getRemovedImageUrls(){
      return this.removedImageUrls;
   }
   
   
   public com.commercetools.api.models.product.ProductProjection getProductProjection(){
      return this.productProjection;
   }
   
   
   public com.commercetools.api.models.cart.ProductPublishScope getScope(){
      return this.scope;
   }

   public void setRemovedImageUrls(final java.util.List<com.fasterxml.jackson.databind.JsonNode> removedImageUrls){
      this.removedImageUrls = removedImageUrls;
   }
   
   public void setProductProjection(final com.commercetools.api.models.product.ProductProjection productProjection){
      this.productProjection = productProjection;
   }
   
   public void setScope(final com.commercetools.api.models.cart.ProductPublishScope scope){
      this.scope = scope;
   }

}
