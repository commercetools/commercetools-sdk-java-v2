package com.commercetools.models.Product;

import com.commercetools.models.Common.Asset;
import com.commercetools.models.Common.Image;
import com.commercetools.models.Common.Price;
import com.commercetools.models.Common.ScopedPrice;
import com.commercetools.models.Product.Attribute;
import com.commercetools.models.Product.ProductVariantAvailability;
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
public final class ProductVariantImpl implements ProductVariant {

   private com.commercetools.models.Common.ScopedPrice scopedPrice;
   
   private java.util.List<com.commercetools.models.Common.Image> images;
   
   private java.util.List<com.commercetools.models.Common.Asset> assets;
   
   private java.lang.Boolean isMatchingVariant;
   
   private com.commercetools.models.Common.Price price;
   
   private java.lang.Boolean scopedPriceDiscounted;
   
   private java.util.List<com.commercetools.models.Product.Attribute> attributes;
   
   private com.commercetools.models.Product.ProductVariantAvailability availability;
   
   private java.lang.Long id;
   
   private java.util.List<com.commercetools.models.Common.Price> prices;
   
   private java.lang.String sku;
   
   private java.lang.String key;

   @JsonCreator
   ProductVariantImpl(@JsonProperty("scopedPrice") final com.commercetools.models.Common.ScopedPrice scopedPrice, @JsonProperty("images") final java.util.List<com.commercetools.models.Common.Image> images, @JsonProperty("assets") final java.util.List<com.commercetools.models.Common.Asset> assets, @JsonProperty("isMatchingVariant") final java.lang.Boolean isMatchingVariant, @JsonProperty("price") final com.commercetools.models.Common.Price price, @JsonProperty("scopedPriceDiscounted") final java.lang.Boolean scopedPriceDiscounted, @JsonProperty("attributes") final java.util.List<com.commercetools.models.Product.Attribute> attributes, @JsonProperty("availability") final com.commercetools.models.Product.ProductVariantAvailability availability, @JsonProperty("id") final java.lang.Long id, @JsonProperty("prices") final java.util.List<com.commercetools.models.Common.Price> prices, @JsonProperty("sku") final java.lang.String sku, @JsonProperty("key") final java.lang.String key) {
      this.scopedPrice = scopedPrice;
      this.images = images;
      this.assets = assets;
      this.isMatchingVariant = isMatchingVariant;
      this.price = price;
      this.scopedPriceDiscounted = scopedPriceDiscounted;
      this.attributes = attributes;
      this.availability = availability;
      this.id = id;
      this.prices = prices;
      this.sku = sku;
      this.key = key;
   }
   public ProductVariantImpl() {
      
   }
   
   
   public com.commercetools.models.Common.ScopedPrice getScopedPrice(){
      return this.scopedPrice;
   }
   
   
   public java.util.List<com.commercetools.models.Common.Image> getImages(){
      return this.images;
   }
   
   
   public java.util.List<com.commercetools.models.Common.Asset> getAssets(){
      return this.assets;
   }
   
   
   public java.lang.Boolean getIsMatchingVariant(){
      return this.isMatchingVariant;
   }
   
   
   public com.commercetools.models.Common.Price getPrice(){
      return this.price;
   }
   
   
   public java.lang.Boolean getScopedPriceDiscounted(){
      return this.scopedPriceDiscounted;
   }
   
   
   public java.util.List<com.commercetools.models.Product.Attribute> getAttributes(){
      return this.attributes;
   }
   
   
   public com.commercetools.models.Product.ProductVariantAvailability getAvailability(){
      return this.availability;
   }
   
   
   public java.lang.Long getId(){
      return this.id;
   }
   
   
   public java.util.List<com.commercetools.models.Common.Price> getPrices(){
      return this.prices;
   }
   
   
   public java.lang.String getSku(){
      return this.sku;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public void setScopedPrice(final com.commercetools.models.Common.ScopedPrice scopedPrice){
      this.scopedPrice = scopedPrice;
   }
   
   public void setImages(final java.util.List<com.commercetools.models.Common.Image> images){
      this.images = images;
   }
   
   public void setAssets(final java.util.List<com.commercetools.models.Common.Asset> assets){
      this.assets = assets;
   }
   
   public void setIsMatchingVariant(final java.lang.Boolean isMatchingVariant){
      this.isMatchingVariant = isMatchingVariant;
   }
   
   public void setPrice(final com.commercetools.models.Common.Price price){
      this.price = price;
   }
   
   public void setScopedPriceDiscounted(final java.lang.Boolean scopedPriceDiscounted){
      this.scopedPriceDiscounted = scopedPriceDiscounted;
   }
   
   public void setAttributes(final java.util.List<com.commercetools.models.Product.Attribute> attributes){
      this.attributes = attributes;
   }
   
   public void setAvailability(final com.commercetools.models.Product.ProductVariantAvailability availability){
      this.availability = availability;
   }
   
   public void setId(final java.lang.Long id){
      this.id = id;
   }
   
   public void setPrices(final java.util.List<com.commercetools.models.Common.Price> prices){
      this.prices = prices;
   }
   
   public void setSku(final java.lang.String sku){
      this.sku = sku;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}