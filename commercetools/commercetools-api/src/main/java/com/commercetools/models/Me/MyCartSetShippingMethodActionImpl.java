package com.commercetools.models.Me;

import com.commercetools.models.Cart.ExternalTaxRateDraft;
import com.commercetools.models.Me.MyCartUpdateAction;
import com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCartSetShippingMethodActionImpl implements MyCartSetShippingMethodAction {

   private java.lang.String action;
   
   private com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRate;
   
   private com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier shippingMethod;

   @JsonCreator
   MyCartSetShippingMethodActionImpl(@JsonProperty("externalTaxRate") final com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRate, @JsonProperty("shippingMethod") final com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier shippingMethod) {
      this.externalTaxRate = externalTaxRate;
      this.shippingMethod = shippingMethod;
      this.action = "setShippingMethod";
   }
   public MyCartSetShippingMethodActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.Cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   
   public com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier getShippingMethod(){
      return this.shippingMethod;
   }

   public void setExternalTaxRate(final com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRate){
      this.externalTaxRate = externalTaxRate;
   }
   
   public void setShippingMethod(final com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier shippingMethod){
      this.shippingMethod = shippingMethod;
   }

}