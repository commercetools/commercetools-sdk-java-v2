package com.commercetools.models.Message;

import com.commercetools.models.Common.DiscountedPrice;
import java.lang.Boolean;
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
public final class ProductPriceDiscountsSetUpdatedPriceImpl implements ProductPriceDiscountsSetUpdatedPrice {

   private com.commercetools.models.Common.DiscountedPrice discounted;
   
   private java.lang.Boolean staged;
   
   private java.lang.Integer variantId;
   
   private java.lang.String priceId;
   
   private java.lang.String sku;
   
   private java.lang.String variantKey;

   @JsonCreator
   ProductPriceDiscountsSetUpdatedPriceImpl(@JsonProperty("discounted") final com.commercetools.models.Common.DiscountedPrice discounted, @JsonProperty("staged") final java.lang.Boolean staged, @JsonProperty("variantId") final java.lang.Integer variantId, @JsonProperty("priceId") final java.lang.String priceId, @JsonProperty("sku") final java.lang.String sku, @JsonProperty("variantKey") final java.lang.String variantKey) {
      this.discounted = discounted;
      this.staged = staged;
      this.variantId = variantId;
      this.priceId = priceId;
      this.sku = sku;
      this.variantKey = variantKey;
   }
   public ProductPriceDiscountsSetUpdatedPriceImpl() {
      
   }
   
   
   public com.commercetools.models.Common.DiscountedPrice getDiscounted(){
      return this.discounted;
   }
   
   
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   
   public java.lang.Integer getVariantId(){
      return this.variantId;
   }
   
   
   public java.lang.String getPriceId(){
      return this.priceId;
   }
   
   
   public java.lang.String getSku(){
      return this.sku;
   }
   
   
   public java.lang.String getVariantKey(){
      return this.variantKey;
   }

   public void setDiscounted(final com.commercetools.models.Common.DiscountedPrice discounted){
      this.discounted = discounted;
   }
   
   public void setStaged(final java.lang.Boolean staged){
      this.staged = staged;
   }
   
   public void setVariantId(final java.lang.Integer variantId){
      this.variantId = variantId;
   }
   
   public void setPriceId(final java.lang.String priceId){
      this.priceId = priceId;
   }
   
   public void setSku(final java.lang.String sku){
      this.sku = sku;
   }
   
   public void setVariantKey(final java.lang.String variantKey){
      this.variantKey = variantKey;
   }

}