package com.commercetools.models.product;

import com.commercetools.models.common.DiscountedPrice;
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
public final class ProductSetDiscountedPriceActionImpl implements ProductSetDiscountedPriceAction {

   private String action;
   
   private com.commercetools.models.common.DiscountedPrice discounted;
   
   private Boolean staged;
   
   private String priceId;

   @JsonCreator
   ProductSetDiscountedPriceActionImpl(@JsonProperty("discounted") final com.commercetools.models.common.DiscountedPrice discounted, @JsonProperty("staged") final Boolean staged, @JsonProperty("priceId") final String priceId) {
      this.discounted = discounted;
      this.staged = staged;
      this.priceId = priceId;
      this.action = "setDiscountedPrice";
   }
   public ProductSetDiscountedPriceActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.common.DiscountedPrice getDiscounted(){
      return this.discounted;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public String getPriceId(){
      return this.priceId;
   }

   public void setDiscounted(final com.commercetools.models.common.DiscountedPrice discounted){
      this.discounted = discounted;
   }
   
   public void setStaged(final Boolean staged){
      this.staged = staged;
   }
   
   public void setPriceId(final String priceId){
      this.priceId = priceId;
   }

}