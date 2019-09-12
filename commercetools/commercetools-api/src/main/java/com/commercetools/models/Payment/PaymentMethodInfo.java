package com.commercetools.models.Payment;

import com.commercetools.models.Common.LocalizedString;
import java.lang.String;
import com.commercetools.models.Payment.PaymentMethodInfoImpl;

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
@JsonDeserialize(as = PaymentMethodInfoImpl.class)
public interface PaymentMethodInfo  {

   
   
   @JsonProperty("paymentInterface")
   public String getPaymentInterface();
   
   
   @JsonProperty("method")
   public String getMethod();
   
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();

   public void setPaymentInterface(final String paymentInterface);
   
   public void setMethod(final String method);
   
   public void setName(final LocalizedString name);
   
   public static PaymentMethodInfoImpl of(){
      return new PaymentMethodInfoImpl();
   }
   

   public static PaymentMethodInfoImpl of(final PaymentMethodInfo template) {
      PaymentMethodInfoImpl instance = new PaymentMethodInfoImpl();
      instance.setMethod(template.getMethod());
      instance.setName(template.getName());
      instance.setPaymentInterface(template.getPaymentInterface());
      return instance;
   }

}