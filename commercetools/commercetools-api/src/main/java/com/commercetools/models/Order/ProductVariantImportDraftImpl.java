package com.commercetools.models.Order;

import com.commercetools.models.Common.Image;
import com.commercetools.models.Common.PriceDraft;
import com.commercetools.models.Product.Attribute;
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
public final class ProductVariantImportDraftImpl implements ProductVariantImportDraft {

   private java.util.List<com.commercetools.models.Common.Image> images;
   
   private java.util.List<com.commercetools.models.Product.Attribute> attributes;
   
   private java.lang.Long id;
   
   private java.util.List<com.commercetools.models.Common.PriceDraft> prices;
   
   private java.lang.String sku;

   @JsonCreator
   ProductVariantImportDraftImpl(@JsonProperty("images") final java.util.List<com.commercetools.models.Common.Image> images, @JsonProperty("attributes") final java.util.List<com.commercetools.models.Product.Attribute> attributes, @JsonProperty("id") final java.lang.Long id, @JsonProperty("prices") final java.util.List<com.commercetools.models.Common.PriceDraft> prices, @JsonProperty("sku") final java.lang.String sku) {
      this.images = images;
      this.attributes = attributes;
      this.id = id;
      this.prices = prices;
      this.sku = sku;
   }
   public ProductVariantImportDraftImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.models.Common.Image> getImages(){
      return this.images;
   }
   
   
   public java.util.List<com.commercetools.models.Product.Attribute> getAttributes(){
      return this.attributes;
   }
   
   
   public java.lang.Long getId(){
      return this.id;
   }
   
   
   public java.util.List<com.commercetools.models.Common.PriceDraft> getPrices(){
      return this.prices;
   }
   
   
   public java.lang.String getSku(){
      return this.sku;
   }

   public void setImages(final java.util.List<com.commercetools.models.Common.Image> images){
      this.images = images;
   }
   
   public void setAttributes(final java.util.List<com.commercetools.models.Product.Attribute> attributes){
      this.attributes = attributes;
   }
   
   public void setId(final java.lang.Long id){
      this.id = id;
   }
   
   public void setPrices(final java.util.List<com.commercetools.models.Common.PriceDraft> prices){
      this.prices = prices;
   }
   
   public void setSku(final java.lang.String sku){
      this.sku = sku;
   }

}