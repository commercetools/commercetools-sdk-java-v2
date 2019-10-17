package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.common.PriceDraft;
import com.commercetools.api.generated.models.product.ProductUpdateAction;
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
public final class ProductSetPricesActionImpl implements ProductSetPricesAction {

   private String action;
   
   private Boolean staged;
   
   private Long variantId;
   
   private java.util.List<com.commercetools.api.generated.models.common.PriceDraft> prices;
   
   private String sku;

   @JsonCreator
   ProductSetPricesActionImpl(@JsonProperty("staged") final Boolean staged, @JsonProperty("variantId") final Long variantId, @JsonProperty("prices") final java.util.List<com.commercetools.api.generated.models.common.PriceDraft> prices, @JsonProperty("sku") final String sku) {
      this.staged = staged;
      this.variantId = variantId;
      this.prices = prices;
      this.sku = sku;
      this.action = "setPrices";
   }
   public ProductSetPricesActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public Long getVariantId(){
      return this.variantId;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.common.PriceDraft> getPrices(){
      return this.prices;
   }
   
   
   public String getSku(){
      return this.sku;
   }

   public void setStaged(final Boolean staged){
      this.staged = staged;
   }
   
   public void setVariantId(final Long variantId){
      this.variantId = variantId;
   }
   
   public void setPrices(final java.util.List<com.commercetools.api.generated.models.common.PriceDraft> prices){
      this.prices = prices;
   }
   
   public void setSku(final String sku){
      this.sku = sku;
   }

}