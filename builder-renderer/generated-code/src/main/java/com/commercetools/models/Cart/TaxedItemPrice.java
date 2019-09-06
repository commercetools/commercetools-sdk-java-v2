package com.commercetools.models.Cart;

import com.commercetools.models.Common.TypedMoney;
import com.commercetools.models.Cart.TaxedItemPriceImpl;

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
@JsonDeserialize(as = TaxedItemPriceImpl.class)
public interface TaxedItemPrice  {

   
   @NotNull
   @Valid
   @JsonProperty("totalNet")
   public TypedMoney getTotalNet();
   
   @NotNull
   @Valid
   @JsonProperty("totalGross")
   public TypedMoney getTotalGross();

   public void setTotalNet(final TypedMoney totalNet);
   
   public void setTotalGross(final TypedMoney totalGross);
   
   public static TaxedItemPriceImpl of(){
      return new TaxedItemPriceImpl();
   }
   

   public static TaxedItemPriceImpl of(final TaxedItemPrice template) {
      TaxedItemPriceImpl instance = new TaxedItemPriceImpl();
      instance.setTotalGross(template.getTotalGross());
      instance.setTotalNet(template.getTotalNet());
      return instance;
   }

}