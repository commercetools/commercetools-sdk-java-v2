package com.commercetools.models.Order;

import com.commercetools.models.Cart.DiscountedLineItemPortion;
import com.commercetools.models.Common.Money;
import com.commercetools.models.Order.DiscountedLineItemPriceDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = DiscountedLineItemPriceDraftImpl.class)
public interface DiscountedLineItemPriceDraft  {

   
   @NotNull
   @Valid
   @JsonProperty("value")
   public Money getValue();
   
   @NotNull
   @Valid
   @JsonProperty("includedDiscounts")
   public List<DiscountedLineItemPortion> getIncludedDiscounts();

   public void setValue(final Money value);
   
   public void setIncludedDiscounts(final List<DiscountedLineItemPortion> includedDiscounts);
   
   public static DiscountedLineItemPriceDraftImpl of(){
      return new DiscountedLineItemPriceDraftImpl();
   }
   

   public static DiscountedLineItemPriceDraftImpl of(final DiscountedLineItemPriceDraft template) {
      DiscountedLineItemPriceDraftImpl instance = new DiscountedLineItemPriceDraftImpl();
      instance.setIncludedDiscounts(template.getIncludedDiscounts());
      instance.setValue(template.getValue());
      return instance;
   }

}