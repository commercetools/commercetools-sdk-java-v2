package com.commercetools.api.models.product;

import com.commercetools.api.models.common.PriceDraft;
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
public final class ProductChangePriceActionImpl implements ProductChangePriceAction {

   private String action;
   
   private String priceId;
   
   private com.commercetools.api.models.common.PriceDraft price;
   
   private Boolean staged;

   @JsonCreator
   ProductChangePriceActionImpl(@JsonProperty("priceId") final String priceId, @JsonProperty("price") final com.commercetools.api.models.common.PriceDraft price, @JsonProperty("staged") final Boolean staged) {
      this.priceId = priceId;
      this.price = price;
      this.staged = staged;
      this.action = "changePrice";
   }
   public ProductChangePriceActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   /**
   *  <p>ID of the <a href="#price">Price</a></p>
   */
   public String getPriceId(){
      return this.priceId;
   }
   
   
   public com.commercetools.api.models.common.PriceDraft getPrice(){
      return this.price;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }

   public void setPriceId(final String priceId){
      this.priceId = priceId;
   }
   
   public void setPrice(final com.commercetools.api.models.common.PriceDraft price){
      this.price = price;
   }
   
   public void setStaged(final Boolean staged){
      this.staged = staged;
   }

}
