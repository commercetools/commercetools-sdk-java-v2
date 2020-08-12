package com.commercetools.api.models.product;

import com.commercetools.api.models.common.DiscountedPrice;
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
public final class ProductSetDiscountedPriceActionImpl implements ProductSetDiscountedPriceAction {

   private String action;
   
   private String priceId;
   
   private Boolean staged;
   
   private com.commercetools.api.models.common.DiscountedPrice discounted;

   @JsonCreator
   ProductSetDiscountedPriceActionImpl(@JsonProperty("priceId") final String priceId, @JsonProperty("staged") final Boolean staged, @JsonProperty("discounted") final com.commercetools.api.models.common.DiscountedPrice discounted) {
      this.priceId = priceId;
      this.staged = staged;
      this.discounted = discounted;
      this.action = "setDiscountedPrice";
   }
   public ProductSetDiscountedPriceActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getPriceId(){
      return this.priceId;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public com.commercetools.api.models.common.DiscountedPrice getDiscounted(){
      return this.discounted;
   }

   public void setPriceId(final String priceId){
      this.priceId = priceId;
   }
   
   public void setStaged(final Boolean staged){
      this.staged = staged;
   }
   
   public void setDiscounted(final com.commercetools.api.models.common.DiscountedPrice discounted){
      this.discounted = discounted;
   }

}
