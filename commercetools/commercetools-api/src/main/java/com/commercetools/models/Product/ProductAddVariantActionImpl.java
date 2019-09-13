package com.commercetools.models.product;

import com.commercetools.models.common.Asset;
import com.commercetools.models.common.Image;
import com.commercetools.models.common.PriceDraft;
import com.commercetools.models.product.Attribute;
import com.commercetools.models.product.ProductUpdateAction;
import java.lang.Boolean;
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
public final class ProductAddVariantActionImpl implements ProductAddVariantAction {

   private java.lang.String action;
   
   private java.util.List<com.commercetools.models.common.Image> images;
   
   private java.util.List<com.commercetools.models.common.Asset> assets;
   
   private java.util.List<com.commercetools.models.product.Attribute> attributes;
   
   private java.lang.Boolean staged;
   
   private java.util.List<com.commercetools.models.common.PriceDraft> prices;
   
   private java.lang.String sku;
   
   private java.lang.String key;

   @JsonCreator
   ProductAddVariantActionImpl(@JsonProperty("images") final java.util.List<com.commercetools.models.common.Image> images, @JsonProperty("assets") final java.util.List<com.commercetools.models.common.Asset> assets, @JsonProperty("attributes") final java.util.List<com.commercetools.models.product.Attribute> attributes, @JsonProperty("staged") final java.lang.Boolean staged, @JsonProperty("prices") final java.util.List<com.commercetools.models.common.PriceDraft> prices, @JsonProperty("sku") final java.lang.String sku, @JsonProperty("key") final java.lang.String key) {
      this.images = images;
      this.assets = assets;
      this.attributes = attributes;
      this.staged = staged;
      this.prices = prices;
      this.sku = sku;
      this.key = key;
      this.action = "addVariant";
   }
   public ProductAddVariantActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.util.List<com.commercetools.models.common.Image> getImages(){
      return this.images;
   }
   
   
   public java.util.List<com.commercetools.models.common.Asset> getAssets(){
      return this.assets;
   }
   
   
   public java.util.List<com.commercetools.models.product.Attribute> getAttributes(){
      return this.attributes;
   }
   
   
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   
   public java.util.List<com.commercetools.models.common.PriceDraft> getPrices(){
      return this.prices;
   }
   
   
   public java.lang.String getSku(){
      return this.sku;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public void setImages(final java.util.List<com.commercetools.models.common.Image> images){
      this.images = images;
   }
   
   public void setAssets(final java.util.List<com.commercetools.models.common.Asset> assets){
      this.assets = assets;
   }
   
   public void setAttributes(final java.util.List<com.commercetools.models.product.Attribute> attributes){
      this.attributes = attributes;
   }
   
   public void setStaged(final java.lang.Boolean staged){
      this.staged = staged;
   }
   
   public void setPrices(final java.util.List<com.commercetools.models.common.PriceDraft> prices){
      this.prices = prices;
   }
   
   public void setSku(final java.lang.String sku){
      this.sku = sku;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}