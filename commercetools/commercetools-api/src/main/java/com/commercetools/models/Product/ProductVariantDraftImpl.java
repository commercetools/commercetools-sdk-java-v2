package com.commercetools.models.Product;

import com.commercetools.models.Common.AssetDraft;
import com.commercetools.models.Common.Image;
import com.commercetools.models.Common.PriceDraft;
import com.commercetools.models.Product.Attribute;
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
public final class ProductVariantDraftImpl implements ProductVariantDraft {

   private java.util.List<com.commercetools.models.Common.Image> images;
   
   private java.util.List<com.commercetools.models.Common.AssetDraft> assets;
   
   private java.util.List<com.commercetools.models.Product.Attribute> attributes;
   
   private java.util.List<com.commercetools.models.Common.PriceDraft> prices;
   
   private java.lang.String sku;
   
   private java.lang.String key;

   @JsonCreator
   ProductVariantDraftImpl(@JsonProperty("images") final java.util.List<com.commercetools.models.Common.Image> images, @JsonProperty("assets") final java.util.List<com.commercetools.models.Common.AssetDraft> assets, @JsonProperty("attributes") final java.util.List<com.commercetools.models.Product.Attribute> attributes, @JsonProperty("prices") final java.util.List<com.commercetools.models.Common.PriceDraft> prices, @JsonProperty("sku") final java.lang.String sku, @JsonProperty("key") final java.lang.String key) {
      this.images = images;
      this.assets = assets;
      this.attributes = attributes;
      this.prices = prices;
      this.sku = sku;
      this.key = key;
   }
   public ProductVariantDraftImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.models.Common.Image> getImages(){
      return this.images;
   }
   
   
   public java.util.List<com.commercetools.models.Common.AssetDraft> getAssets(){
      return this.assets;
   }
   
   
   public java.util.List<com.commercetools.models.Product.Attribute> getAttributes(){
      return this.attributes;
   }
   
   
   public java.util.List<com.commercetools.models.Common.PriceDraft> getPrices(){
      return this.prices;
   }
   
   
   public java.lang.String getSku(){
      return this.sku;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public void setImages(final java.util.List<com.commercetools.models.Common.Image> images){
      this.images = images;
   }
   
   public void setAssets(final java.util.List<com.commercetools.models.Common.AssetDraft> assets){
      this.assets = assets;
   }
   
   public void setAttributes(final java.util.List<com.commercetools.models.Product.Attribute> attributes){
      this.attributes = attributes;
   }
   
   public void setPrices(final java.util.List<com.commercetools.models.Common.PriceDraft> prices){
      this.prices = prices;
   }
   
   public void setSku(final java.lang.String sku){
      this.sku = sku;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}