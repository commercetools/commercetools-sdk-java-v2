package com.commercetools.models.Product;

import com.commercetools.models.Common.AssetDraft;
import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.Integer;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductAddAssetActionImpl implements ProductAddAssetAction {

   private java.lang.String action;
   
   private java.lang.Integer position;
   
   private java.lang.Boolean staged;
   
   private java.lang.Long variantId;
   
   private com.commercetools.models.Common.AssetDraft asset;
   
   private java.lang.String sku;

   @JsonCreator
   ProductAddAssetActionImpl(@JsonProperty("position") final java.lang.Integer position, @JsonProperty("staged") final java.lang.Boolean staged, @JsonProperty("variantId") final java.lang.Long variantId, @JsonProperty("asset") final com.commercetools.models.Common.AssetDraft asset, @JsonProperty("sku") final java.lang.String sku) {
      this.position = position;
      this.staged = staged;
      this.variantId = variantId;
      this.asset = asset;
      this.sku = sku;
      this.action = "addAsset";
   }
   public ProductAddAssetActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.Integer getPosition(){
      return this.position;
   }
   
   
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   
   public java.lang.Long getVariantId(){
      return this.variantId;
   }
   
   
   public com.commercetools.models.Common.AssetDraft getAsset(){
      return this.asset;
   }
   
   
   public java.lang.String getSku(){
      return this.sku;
   }

   public void setPosition(final java.lang.Integer position){
      this.position = position;
   }
   
   public void setStaged(final java.lang.Boolean staged){
      this.staged = staged;
   }
   
   public void setVariantId(final java.lang.Long variantId){
      this.variantId = variantId;
   }
   
   public void setAsset(final com.commercetools.models.Common.AssetDraft asset){
      this.asset = asset;
   }
   
   public void setSku(final java.lang.String sku){
      this.sku = sku;
   }

}