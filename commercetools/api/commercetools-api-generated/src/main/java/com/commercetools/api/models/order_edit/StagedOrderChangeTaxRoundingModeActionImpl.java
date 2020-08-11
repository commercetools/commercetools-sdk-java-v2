package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.RoundingMode;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderChangeTaxRoundingModeActionImpl implements StagedOrderChangeTaxRoundingModeAction {

   private String action;
   
   private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;

   @JsonCreator
   StagedOrderChangeTaxRoundingModeActionImpl(@JsonProperty("taxRoundingMode") final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
      this.taxRoundingMode = taxRoundingMode;
      this.action = "changeTaxRoundingMode";
   }
   public StagedOrderChangeTaxRoundingModeActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode(){
      return this.taxRoundingMode;
   }

   public void setTaxRoundingMode(final com.commercetools.api.models.cart.RoundingMode taxRoundingMode){
      this.taxRoundingMode = taxRoundingMode;
   }

}
