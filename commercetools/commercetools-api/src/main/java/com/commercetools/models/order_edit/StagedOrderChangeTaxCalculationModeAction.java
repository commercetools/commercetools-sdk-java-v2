package com.commercetools.models.order_edit;

import com.commercetools.models.cart.TaxCalculationMode;
import com.commercetools.models.order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderChangeTaxCalculationModeActionImpl;

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
@JsonDeserialize(as = StagedOrderChangeTaxCalculationModeActionImpl.class)
public interface StagedOrderChangeTaxCalculationModeAction extends StagedOrderUpdateAction {

   
   @NotNull
   @JsonProperty("taxCalculationMode")
   public TaxCalculationMode getTaxCalculationMode();

   public void setTaxCalculationMode(final TaxCalculationMode taxCalculationMode);
   
   public static StagedOrderChangeTaxCalculationModeActionImpl of(){
      return new StagedOrderChangeTaxCalculationModeActionImpl();
   }
   

   public static StagedOrderChangeTaxCalculationModeActionImpl of(final StagedOrderChangeTaxCalculationModeAction template) {
      StagedOrderChangeTaxCalculationModeActionImpl instance = new StagedOrderChangeTaxCalculationModeActionImpl();
      instance.setTaxCalculationMode(template.getTaxCalculationMode());
      return instance;
   }

}