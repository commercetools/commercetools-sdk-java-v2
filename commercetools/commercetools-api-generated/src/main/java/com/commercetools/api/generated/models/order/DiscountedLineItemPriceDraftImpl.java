package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.cart.DiscountedLineItemPortion;
import com.commercetools.api.generated.models.common.Money;
import io.vrap.rmf.base.client.utils.Generated;
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

   private java.util.List<com.commercetools.api.generated.models.cart.DiscountedLineItemPortion> includedDiscounts;
   
   private com.commercetools.api.generated.models.common.Money value;

   @JsonCreator
   DiscountedLineItemPriceDraftImpl(@JsonProperty("includedDiscounts") final java.util.List<com.commercetools.api.generated.models.cart.DiscountedLineItemPortion> includedDiscounts, @JsonProperty("value") final com.commercetools.api.generated.models.common.Money value) {
      this.includedDiscounts = includedDiscounts;
      this.value = value;
   }
   public DiscountedLineItemPriceDraftImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.cart.DiscountedLineItemPortion> getIncludedDiscounts(){
      return this.includedDiscounts;
   }
   
   
   public com.commercetools.api.generated.models.common.Money getValue(){
      return this.value;
   }

   public void setIncludedDiscounts(final java.util.List<com.commercetools.api.generated.models.cart.DiscountedLineItemPortion> includedDiscounts){
      this.includedDiscounts = includedDiscounts;
   }
   
   public void setValue(final com.commercetools.api.generated.models.common.Money value){
      this.value = value;
   }

}