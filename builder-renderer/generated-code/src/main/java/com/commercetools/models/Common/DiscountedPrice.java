package com.commercetools.models.Common;

import com.commercetools.models.Common.Money;
import com.commercetools.models.ProductDiscount.ProductDiscountReference;
import com.commercetools.models.Common.DiscountedPriceImpl;

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
@JsonDeserialize(as = DiscountedPriceImpl.class)
public interface DiscountedPrice  {

   
   @NotNull
   @Valid
   @JsonProperty("value")
   public Money getValue();
   
   @NotNull
   @Valid
   @JsonProperty("discount")
   public ProductDiscountReference getDiscount();

   public void setValue(final Money value);
   
   public void setDiscount(final ProductDiscountReference discount);
   
   public static DiscountedPriceImpl of(){
      return new DiscountedPriceImpl();
   }
   

   public static DiscountedPriceImpl of(final DiscountedPrice template) {
      DiscountedPriceImpl instance = new DiscountedPriceImpl();
      instance.setDiscount(template.getDiscount());
      instance.setValue(template.getValue());
      return instance;
   }

}