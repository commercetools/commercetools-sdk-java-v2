package com.commercetools.models.order;

import com.commercetools.models.cart.DiscountedLineItemPortion;
import com.commercetools.models.common.Money;
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
public final class DiscountedLineItemPriceDraftImpl implements DiscountedLineItemPriceDraft {

   private java.util.List<com.commercetools.models.cart.DiscountedLineItemPortion> includedDiscounts;
   
   private com.commercetools.models.common.Money value;

   @JsonCreator
   DiscountedLineItemPriceDraftImpl(@JsonProperty("includedDiscounts") final java.util.List<com.commercetools.models.cart.DiscountedLineItemPortion> includedDiscounts, @JsonProperty("value") final com.commercetools.models.common.Money value) {
      this.includedDiscounts = includedDiscounts;
      this.value = value;
   }
   public DiscountedLineItemPriceDraftImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.models.cart.DiscountedLineItemPortion> getIncludedDiscounts(){
      return this.includedDiscounts;
   }
   
   
   public com.commercetools.models.common.Money getValue(){
      return this.value;
   }

   public void setIncludedDiscounts(final java.util.List<com.commercetools.models.cart.DiscountedLineItemPortion> includedDiscounts){
      this.includedDiscounts = includedDiscounts;
   }
   
   public void setValue(final com.commercetools.models.common.Money value){
      this.value = value;
   }

}