package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.cart.TaxPortionDraft;
import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetOrderTotalTaxActionImpl;

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
@JsonDeserialize(as = StagedOrderSetOrderTotalTaxActionImpl.class)
public interface StagedOrderSetOrderTotalTaxAction extends StagedOrderUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("externalTotalGross")
   public Money getExternalTotalGross();
   
   @Valid
   @JsonProperty("externalTaxPortions")
   public List<TaxPortionDraft> getExternalTaxPortions();

   public void setExternalTotalGross(final Money externalTotalGross);
   
   public void setExternalTaxPortions(final List<TaxPortionDraft> externalTaxPortions);
   
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