package com.commercetools.models.product;

import com.commercetools.models.product.ProductUpdateAction;
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
public final class ProductChangeAssetOrderActionImpl implements ProductChangeAssetOrderAction {

   private java.lang.String action;
   
   private java.util.List<java.lang.String> assetOrder;
   
   private java.lang.Boolean staged;
   
   private java.lang.Long variantId;
   
   private java.lang.String sku;

   @JsonCreator
   ProductChangeAssetOrderActionImpl(@JsonProperty("assetOrder") final java.util.List<java.lang.String> assetOrder, @JsonProperty("staged") final java.lang.Boolean staged, @JsonProperty("variantId") final java.lang.Long variantId, @JsonProperty("sku") final java.lang.String sku) {
      this.assetOrder = assetOrder;
      this.staged = staged;
      this.variantId = variantId;
      this.sku = sku;
      this.action = "changeAssetOrder";
   }
   public ProductChangeAssetOrderActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.util.List<java.lang.String> getAssetOrder(){
      return this.assetOrder;
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

   public void setAssetOrder(final java.util.List<java.lang.String> assetOrder){
      this.assetOrder = assetOrder;
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