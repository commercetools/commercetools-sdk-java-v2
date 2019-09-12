package com.commercetools.models.Me;

import com.commercetools.models.Cart.ExternalTaxRateDraft;
import com.commercetools.models.Me.MyCartUpdateAction;
import com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Me.MyCartSetShippingMethodActionImpl;

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
@JsonDeserialize(as = MyCartSetShippingMethodActionImpl.class)
public interface MyCartSetShippingMethodAction extends MyCartUpdateAction {

   
   @Valid
   @JsonProperty("shippingMethod")
   public ShippingMethodResourceIdentifier getShippingMethod();
   
   @Valid
   @JsonProperty("externalTaxRate")
   public ExternalTaxRateDraft getExternalTaxRate();

   public void setShippingMethod(final ShippingMethodResourceIdentifier shippingMethod);
   
   public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);
   
   public static MyCartSetShippingMethodActionImpl of(){
      return new MyCartSetShippingMethodActionImpl();
   }
   

   public static MyCartSetShippingMethodActionImpl of(final MyCartSetShippingMethodAction template) {
      MyCartSetShippingMethodActionImpl instance = new MyCartSetShippingMethodActionImpl();
      instance.setExternalTaxRate(template.getExternalTaxRate());
      instance.setShippingMethod(template.getShippingMethod());
      return instance;
   }

}