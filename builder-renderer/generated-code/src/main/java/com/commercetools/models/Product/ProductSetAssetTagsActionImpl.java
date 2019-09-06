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
public final class ProductSetAssetTagsActionImpl implements ProductSetAssetTagsAction {

   private java.lang.String action;
   
   private java.lang.String assetId;
   
   private java.lang.Boolean staged;
   
   private java.lang.Long variantId;
   
   private java.lang.String sku;
   
   private java.lang.String assetKey;
   
   private java.util.List<java.lang.String> tags;

   @JsonCreator
   ProductSetAssetTagsActionImpl(@JsonProperty("assetId") final java.lang.String assetId, @JsonProperty("staged") final java.lang.Boolean staged, @JsonProperty("variantId") final java.lang.Long variantId, @JsonProperty("sku") final java.lang.String sku, @JsonProperty("assetKey") final java.lang.String assetKey, @JsonProperty("tags") final java.util.List<java.lang.String> tags) {
      this.assetId = assetId;
      this.staged = staged;
      this.variantId = variantId;
      this.sku = sku;
      this.assetKey = assetKey;
      this.tags = tags;
      this.action = "setAssetTags";
   }
   public ProductSetAssetTagsActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getAssetId(){
      return this.assetId;
   }
   
   
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   
   public java.lang.Long getVariantId(){
      return this.variantId;
   }
   
   
   public java.lang.String getSku(){
      return this.sku;
   }
   
   
   public java.lang.String getAssetKey(){
      return this.assetKey;
   }
   
   
   public java.util.List<java.lang.String> getTags(){
      return this.tags;
   }

   public void setAssetId(final java.lang.String assetId){
      this.assetId = assetId;
   }
   
   public void setStaged(final java.lang.Boolean staged){
      this.staged = staged;
   }
   
   public void setVariantId(final java.lang.Long variantId){
      this.variantId = variantId;
   }
   
   public void setSku(final java.lang.String sku){
      this.sku = sku;
   }
   
   public void setAssetKey(final java.lang.String assetKey){
      this.assetKey = assetKey;
   }
   
   public void setTags(final java.util.List<java.lang.String> tags){
      this.tags = tags;
   }

}