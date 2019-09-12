package com.commercetools.models.Product;

import com.commercetools.models.Common.AssetSource;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductSetAssetSourcesActionImpl implements ProductSetAssetSourcesAction {

   private java.lang.String action;
   
   private java.util.List<com.commercetools.models.Common.AssetSource> sources;
   
   private java.lang.String assetId;
   
   private java.lang.Boolean staged;
   
   private java.lang.Long variantId;
   
   private java.lang.String sku;
   
   private java.lang.String assetKey;

   @JsonCreator
   ProductSetAssetSourcesActionImpl(@JsonProperty("sources") final java.util.List<com.commercetools.models.Common.AssetSource> sources, @JsonProperty("assetId") final java.lang.String assetId, @JsonProperty("staged") final java.lang.Boolean staged, @JsonProperty("variantId") final java.lang.Long variantId, @JsonProperty("sku") final java.lang.String sku, @JsonProperty("assetKey") final java.lang.String assetKey) {
      this.sources = sources;
      this.assetId = assetId;
      this.staged = staged;
      this.variantId = variantId;
      this.sku = sku;
      this.assetKey = assetKey;
      this.action = "setAssetSources";
   }
   public ProductSetAssetSourcesActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.util.List<com.commercetools.models.Common.AssetSource> getSources(){
      return this.sources;
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

   public void setSources(final java.util.List<com.commercetools.models.Common.AssetSource> sources){
      this.sources = sources;
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

}