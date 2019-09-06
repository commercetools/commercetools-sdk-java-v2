package com.commercetools.models.Order;

import com.commercetools.models.Cart.DiscountedLineItemPortion;
import com.commercetools.models.Common.Money;
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
public final class DiscountedLineItemPriceDraftImpl implements DiscountedLineItemPriceDraft {

   private java.util.List<com.commercetools.models.Cart.DiscountedLineItemPortion> includedDiscounts;
   
   private com.commercetools.models.Common.Money value;

   @JsonCreator
   DiscountedLineItemPriceDraftImpl(@JsonProperty("includedDiscounts") final java.util.List<com.commercetools.models.Cart.DiscountedLineItemPortion> includedDiscounts, @JsonProperty("value") final com.commercetools.models.Common.Money value) {
      this.includedDiscounts = includedDiscounts;
      this.value = value;
   }
   public DiscountedLineItemPriceDraftImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.models.Cart.DiscountedLineItemPortion> getIncludedDiscounts(){
      return this.includedDiscounts;
   }
   
   
   public com.commercetools.models.Common.Money getValue(){
      return this.value;
   }

   public void setIncludedDiscounts(final java.util.List<com.commercetools.models.Cart.DiscountedLineItemPortion> includedDiscounts){
      this.includedDiscounts = includedDiscounts;
   }
   
   public void setValue(final com.commercetools.models.Common.Money value){
      this.value = value;
   }

}