package com.commercetools.api.models.product;

import com.commercetools.api.models.common.Asset;
import com.commercetools.api.models.common.Image;
import com.commercetools.api.models.common.PriceDraft;
import com.commercetools.api.models.product.Attribute;
import com.commercetools.api.models.product.ProductUpdateAction;
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
public final class ProductAddVariantActionImpl implements ProductAddVariantAction {

   private String action;

   private java.util.List<com.commercetools.api.models.common.Image> images;

   private java.util.List<com.commercetools.api.models.common.Asset> assets;

   private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

   private Boolean staged;

   private java.util.List<com.commercetools.api.models.common.PriceDraft> prices;

   private String sku;

   private String key;

   @JsonCreator
   ProductAddVariantActionImpl(@JsonProperty("images") final java.util.List<com.commercetools.api.models.common.Image> images, @JsonProperty("assets") final java.util.List<com.commercetools.api.models.common.Asset> assets, @JsonProperty("attributes") final java.util.List<com.commercetools.api.models.product.Attribute> attributes, @JsonProperty("staged") final Boolean staged, @JsonProperty("prices") final java.util.List<com.commercetools.api.models.common.PriceDraft> prices, @JsonProperty("sku") final String sku, @JsonProperty("key") final String key) {
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


   public String getAction(){
      return this.action;
   }


   public java.util.List<com.commercetools.api.models.common.Image> getImages(){
      return this.images;
   }


   public java.util.List<com.commercetools.api.models.common.Asset> getAssets(){
      return this.assets;
   }


   public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes(){
      return this.attributes;
   }


   public Boolean getStaged(){
      return this.staged;
   }


   public java.util.List<com.commercetools.api.models.common.PriceDraft> getPrices(){
      return this.prices;
   }


   public String getSku(){
      return this.sku;
   }


   public String getKey(){
      return this.key;
   }

   public void setImages(final java.util.List<com.commercetools.api.models.common.Image> images){
      this.images = images;
   }

   public void setAssets(final java.util.List<com.commercetools.api.models.common.Asset> assets){
      this.assets = assets;
   }

   public void setAttributes(final java.util.List<com.commercetools.api.models.product.Attribute> attributes){
      this.attributes = attributes;
   }

   public void setStaged(final Boolean staged){
      this.staged = staged;
   }

   public void setPrices(final java.util.List<com.commercetools.api.models.common.PriceDraft> prices){
      this.prices = prices;
   }

   public void setSku(final String sku){
      this.sku = sku;
   }

   public void setKey(final String key){
      this.key = key;
   }

}
