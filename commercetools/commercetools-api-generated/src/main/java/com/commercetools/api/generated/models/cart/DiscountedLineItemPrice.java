package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.DiscountedLineItemPortion;
import com.commercetools.api.generated.models.common.TypedMoney;
import com.commercetools.api.generated.models.cart.DiscountedLineItemPriceImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = DiscountedLineItemPriceImpl.class)
public interface DiscountedLineItemPrice  {

   /**
   	
   */
   @NotNull
   @Valid
   @JsonProperty("value")
   public TypedMoney getValue();
   /**
   	
   */
   @NotNull
   @Valid
   @JsonProperty("includedDiscounts")
   public List<DiscountedLineItemPortion> getIncludedDiscounts();

   public void setValue(final TypedMoney value);
   
   public void setIncludedDiscounts(final List<DiscountedLineItemPortion> includedDiscounts);
   
   public static DiscountedLineItemPriceImpl of(){
      return new DiscountedLineItemPriceImpl();
   }
   

   public static DiscountedLineItemPriceImpl of(final DiscountedLineItemPrice template) {
      DiscountedLineItemPriceImpl instance = new DiscountedLineItemPriceImpl();
      instance.setIncludedDiscounts(template.getIncludedDiscounts());
      instance.setValue(template.getValue());
      return instance;
   }

}