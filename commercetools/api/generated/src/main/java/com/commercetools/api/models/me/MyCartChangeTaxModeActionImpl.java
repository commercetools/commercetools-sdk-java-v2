package com.commercetools.api.models.me;

import com.commercetools.api.models.cart.TaxMode;
import com.commercetools.api.models.me.MyCartUpdateAction;
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
public final class MyCartChangeTaxModeActionImpl implements MyCartChangeTaxModeAction {

   private String action;

   private com.commercetools.api.models.cart.TaxMode taxMode;

   @JsonCreator
   MyCartChangeTaxModeActionImpl(@JsonProperty("taxMode") final com.commercetools.api.models.cart.TaxMode taxMode) {
      this.taxMode = taxMode;
      this.action = "changeTaxMode";
   }
   public MyCartChangeTaxModeActionImpl() {

   }


   public String getAction(){
      return this.action;
   }


   public com.commercetools.api.models.cart.TaxMode getTaxMode(){
      return this.taxMode;
   }

   public void setTaxMode(final com.commercetools.api.models.cart.TaxMode taxMode){
      this.taxMode = taxMode;
   }

}
