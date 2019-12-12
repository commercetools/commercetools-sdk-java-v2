package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.cart.TaxMode;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangeTaxModeActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
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
@JsonDeserialize(as = StagedOrderChangeTaxModeActionImpl.class)
public interface StagedOrderChangeTaxModeAction extends StagedOrderUpdateAction {

   
   @NotNull
   @JsonProperty("taxMode")
   public TaxMode getTaxMode();

   public void setTaxMode(final TaxMode taxMode);
   
   public static StagedOrderChangeTaxModeActionImpl of(){
      return new StagedOrderChangeTaxModeActionImpl();
   }
   

   public static StagedOrderChangeTaxModeActionImpl of(final StagedOrderChangeTaxModeAction template) {
      StagedOrderChangeTaxModeActionImpl instance = new StagedOrderChangeTaxModeActionImpl();
      instance.setTaxMode(template.getTaxMode());
      return instance;
   }

}