package com.commercetools.models.me;

import com.commercetools.models.cart.TaxMode;
import com.commercetools.models.me.MyCartUpdateAction;
import java.lang.String;
import com.commercetools.models.me.MyCartChangeTaxModeActionImpl;

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
@JsonDeserialize(as = MyCartChangeTaxModeActionImpl.class)
public interface MyCartChangeTaxModeAction extends MyCartUpdateAction {

   
   @NotNull
   @JsonProperty("taxMode")
   public TaxMode getTaxMode();

   public void setTaxMode(final TaxMode taxMode);
   
   public static MyCartChangeTaxModeActionImpl of(){
      return new MyCartChangeTaxModeActionImpl();
   }
   

   public static MyCartChangeTaxModeActionImpl of(final MyCartChangeTaxModeAction template) {
      MyCartChangeTaxModeActionImpl instance = new MyCartChangeTaxModeActionImpl();
      instance.setTaxMode(template.getTaxMode());
      return instance;
   }

}