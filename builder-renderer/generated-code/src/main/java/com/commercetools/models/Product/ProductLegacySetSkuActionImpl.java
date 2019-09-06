package com.commercetools.models.Product;

import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Integer;
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
public final class ProductLegacySetSkuActionImpl implements ProductLegacySetSkuAction {

   private java.lang.String action;
   
   private java.lang.Integer variantId;
   
   private java.lang.String sku;

   @JsonCreator
   ProductLegacySetSkuActionImpl(@JsonProperty("variantId") final java.lang.Integer variantId, @JsonProperty("sku") final java.lang.String sku) {
      this.variantId = variantId;
      this.sku = sku;
      this.action = "legacySetSku";
   }
   public ProductLegacySetSkuActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.Integer getVariantId(){
      return this.variantId;
   }
   
   
   public java.lang.String getSku(){
      return this.sku;
   }

   public void setVariantId(final java.lang.Integer variantId){
      this.variantId = variantId;
   }
   
   public void setSku(final java.lang.String sku){
      this.sku = sku;
   }

}