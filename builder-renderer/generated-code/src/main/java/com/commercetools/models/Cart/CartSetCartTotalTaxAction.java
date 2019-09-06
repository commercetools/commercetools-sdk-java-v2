package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Cart.TaxPortion;
import com.commercetools.models.Common.Money;
import java.lang.String;
import com.commercetools.models.Cart.CartSetCartTotalTaxActionImpl;

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
@JsonDeserialize(as = CartSetCartTotalTaxActionImpl.class)
public interface CartSetCartTotalTaxAction extends CartUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("externalTotalGross")
   public Money getExternalTotalGross();
   
   @Valid
   @JsonProperty("externalTaxPortions")
   public List<TaxPortion> getExternalTaxPortions();

   public void setExternalTotalGross(final Money externalTotalGross);
   
   public void setExternalTaxPortions(final List<TaxPortion> externalTaxPortions);
   
   public static CartSetCartTotalTaxActionImpl of(){
      return new CartSetCartTotalTaxActionImpl();
   }
   

   public static CartSetCartTotalTaxActionImpl of(final CartSetCartTotalTaxAction template) {
      CartSetCartTotalTaxActionImpl instance = new CartSetCartTotalTaxActionImpl();
      instance.setExternalTaxPortions(template.getExternalTaxPortions());
      instance.setExternalTotalGross(template.getExternalTotalGross());
      return instance;
   }

}