package com.commercetools.models.Product;

import com.commercetools.models.Common.PriceDraft;
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
public final class ProductAddPriceActionImpl implements ProductAddPriceAction {

   private java.lang.String action;
   
   private com.commercetools.models.Common.PriceDraft price;
   
   private java.lang.Boolean staged;
   
   private java.lang.Long variantId;
   
   private java.lang.String sku;

   @JsonCreator
   ProductAddPriceActionImpl(@JsonProperty("price") final com.commercetools.models.Common.PriceDraft price, @JsonProperty("staged") final java.lang.Boolean staged, @JsonProperty("variantId") final java.lang.Long variantId, @JsonProperty("sku") final java.lang.String sku) {
      this.price = price;
      this.staged = staged;
      this.variantId = variantId;
      this.sku = sku;
      this.action = "addPrice";
   }
   public ProductAddPriceActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.Common.PriceDraft getPrice(){
      return this.price;
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

   public void setPrice(final com.commercetools.models.Common.PriceDraft price){
      this.price = price;
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

}