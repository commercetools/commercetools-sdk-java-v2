package com.commercetools.models.Product;

import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.Long;
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
public final class ProductMoveImageToPositionActionImpl implements ProductMoveImageToPositionAction {

   private java.lang.String action;
   
   private java.lang.String imageUrl;
   
   private java.lang.Boolean staged;
   
   private java.lang.Long position;
   
   private java.lang.Long variantId;
   
   private java.lang.String sku;

   @JsonCreator
   ProductMoveImageToPositionActionImpl(@JsonProperty("imageUrl") final java.lang.String imageUrl, @JsonProperty("staged") final java.lang.Boolean staged, @JsonProperty("position") final java.lang.Long position, @JsonProperty("variantId") final java.lang.Long variantId, @JsonProperty("sku") final java.lang.String sku) {
      this.imageUrl = imageUrl;
      this.staged = staged;
      this.position = position;
      this.variantId = variantId;
      this.sku = sku;
      this.action = "moveImageToPosition";
   }
   public ProductMoveImageToPositionActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getImageUrl(){
      return this.imageUrl;
   }
   
   
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   
   public java.lang.Long getPosition(){
      return this.position;
   }
   
   
   public java.lang.Long getVariantId(){
      return this.variantId;
   }
   
   
   public java.lang.String getSku(){
      return this.sku;
   }

   public void setImageUrl(final java.lang.String imageUrl){
      this.imageUrl = imageUrl;
   }
   
   public void setStaged(final java.lang.Boolean staged){
      this.staged = staged;
   }
   
   public void setPosition(final java.lang.Long position){
      this.position = position;
   }
   
   public void setVariantId(final java.lang.Long variantId){
      this.variantId = variantId;
   }
   
   public void setSku(final java.lang.String sku){
      this.sku = sku;
   }

}