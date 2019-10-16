package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.cart.TaxPortionDraft;
import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.cart.CartSetCartTotalTaxActionImpl;

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
@JsonDeserialize(as = CartSetCartTotalTaxActionImpl.class)
public interface CartSetCartTotalTaxAction extends CartUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("externalTotalGross")
   public Money getExternalTotalGross();
   
   @Valid
   @JsonProperty("externalTaxPortions")
   public List<TaxPortionDraft> getExternalTaxPortions();

   public void setExternalTotalGross(final Money externalTotalGross);
   
   public void setExternalTaxPortions(final List<TaxPortionDraft> externalTaxPortions);
   
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