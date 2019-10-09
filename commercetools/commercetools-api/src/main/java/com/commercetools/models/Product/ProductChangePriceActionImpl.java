package com.commercetools.models.product;

import com.commercetools.models.common.PriceDraft;
import com.commercetools.models.product.ProductUpdateAction;
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
public final class ProductChangePriceActionImpl implements ProductChangePriceAction {

   private String action;
   
   private com.commercetools.models.common.PriceDraft price;
   
   private Boolean staged;
   
   private String priceId;

   @JsonCreator
   ProductChangePriceActionImpl(@JsonProperty("price") final com.commercetools.models.common.PriceDraft price, @JsonProperty("staged") final Boolean staged, @JsonProperty("priceId") final String priceId) {
      this.price = price;
      this.staged = staged;
      this.priceId = priceId;
      this.action = "changePrice";
   }
   public ProductChangePriceActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.common.PriceDraft getPrice(){
      return this.price;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public String getPriceId(){
      return this.priceId;
   }

   public void setPrice(final com.commercetools.models.common.PriceDraft price){
      this.price = price;
   }
   
   public void setStaged(final Boolean staged){
      this.staged = staged;
   }
   
   public void setPriceId(final String priceId){
      this.priceId = priceId;
   }

}