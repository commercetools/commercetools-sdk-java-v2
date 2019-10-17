package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.cart.RoundingMode;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangeTaxRoundingModeActionImpl;

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
@JsonDeserialize(as = StagedOrderChangeTaxRoundingModeActionImpl.class)
public interface StagedOrderChangeTaxRoundingModeAction extends StagedOrderUpdateAction {

   
   @NotNull
   @JsonProperty("taxRoundingMode")
   public RoundingMode getTaxRoundingMode();

   public void setTaxRoundingMode(final RoundingMode taxRoundingMode);
   
   public static StagedOrderChangeTaxRoundingModeActionImpl of(){
      return new StagedOrderChangeTaxRoundingModeActionImpl();
   }
   

   public static StagedOrderChangeTaxRoundingModeActionImpl of(final StagedOrderChangeTaxRoundingModeAction template) {
      StagedOrderChangeTaxRoundingModeActionImpl instance = new StagedOrderChangeTaxRoundingModeActionImpl();
      instance.setTaxRoundingMode(template.getTaxRoundingMode());
      return instance;
   }

}