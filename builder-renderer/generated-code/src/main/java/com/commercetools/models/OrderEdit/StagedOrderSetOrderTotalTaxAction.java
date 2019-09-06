package com.commercetools.models.OrderEdit;

import com.commercetools.models.Cart.TaxPortion;
import com.commercetools.models.Common.Money;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderSetOrderTotalTaxActionImpl;

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
@JsonDeserialize(as = StagedOrderSetOrderTotalTaxActionImpl.class)
public interface StagedOrderSetOrderTotalTaxAction extends StagedOrderUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("externalTotalGross")
   public Money getExternalTotalGross();
   
   @Valid
   @JsonProperty("externalTaxPortions")
   public List<TaxPortion> getExternalTaxPortions();

   public void setExternalTotalGross(final Money externalTotalGross);
   
   public void setExternalTaxPortions(final List<TaxPortion> externalTaxPortions);
   
   public static StagedOrderSetOrderTotalTaxActionImpl of(){
      return new StagedOrderSetOrderTotalTaxActionImpl();
   }
   

   public static StagedOrderSetOrderTotalTaxActionImpl of(final StagedOrderSetOrderTotalTaxAction template) {
      StagedOrderSetOrderTotalTaxActionImpl instance = new StagedOrderSetOrderTotalTaxActionImpl();
      instance.setExternalTaxPortions(template.getExternalTaxPortions());
      instance.setExternalTotalGross(template.getExternalTotalGross());
      return instance;
   }

}