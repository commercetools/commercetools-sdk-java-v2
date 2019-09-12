package com.commercetools.models.Cart;

import com.commercetools.models.Cart.TaxPortion;
import com.commercetools.models.Common.Money;
import com.commercetools.models.Cart.TaxedPriceImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = TaxedPriceImpl.class)
public interface TaxedPrice  {

   
   @NotNull
   @Valid
   @JsonProperty("totalNet")
   public Money getTotalNet();
   
   @NotNull
   @Valid
   @JsonProperty("totalGross")
   public Money getTotalGross();
   
   @NotNull
   @Valid
   @JsonProperty("taxPortions")
   public List<TaxPortion> getTaxPortions();

   public void setTotalNet(final Money totalNet);
   
   public void setTotalGross(final Money totalGross);
   
   public void setTaxPortions(final List<TaxPortion> taxPortions);
   
   public static TaxedPriceImpl of(){
      return new TaxedPriceImpl();
   }
   

   public static TaxedPriceImpl of(final TaxedPrice template) {
      TaxedPriceImpl instance = new TaxedPriceImpl();
      instance.setTaxPortions(template.getTaxPortions());
      instance.setTotalGross(template.getTotalGross());
      instance.setTotalNet(template.getTotalNet());
      return instance;
   }

}