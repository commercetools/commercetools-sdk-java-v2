package com.commercetools.models.Product;

import com.commercetools.models.Common.PriceDraft;
import com.commercetools.models.Product.ProductUpdateAction;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductChangePriceActionImpl implements ProductChangePriceAction {

   private java.lang.String action;
   
   private com.commercetools.models.Common.PriceDraft price;
   
   private java.lang.Boolean staged;
   
   private java.lang.String priceId;

   @JsonCreator
   ProductChangePriceActionImpl(@JsonProperty("price") final com.commercetools.models.Common.PriceDraft price, @JsonProperty("staged") final java.lang.Boolean staged, @JsonProperty("priceId") final java.lang.String priceId) {
      this.price = price;
      this.staged = staged;
      this.priceId = priceId;
      this.action = "changePrice";
   }
   public ProductChangePriceActionImpl() {
      
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
   
   
   public java.lang.String getPriceId(){
      return this.priceId;
   }

   public void setPrice(final com.commercetools.models.Common.PriceDraft price){
      this.price = price;
   }
   
   public void setStaged(final java.lang.Boolean staged){
      this.staged = staged;
   }
   
   public void setPriceId(final java.lang.String priceId){
      this.priceId = priceId;
   }

}