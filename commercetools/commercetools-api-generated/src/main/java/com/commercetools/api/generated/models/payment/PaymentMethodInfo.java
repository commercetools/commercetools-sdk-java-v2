package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.payment.PaymentMethodInfoImpl;

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
@JsonDeserialize(as = PaymentMethodInfoImpl.class)
public interface PaymentMethodInfo  {

   /**
   *  <p>The interface that handles the payment (usually a PSP).
   *  Cannot be changed once it has been set.
   *  The combination of Payment<code>interfaceId</code> and this field must be unique.</p>
   */
   
   @JsonProperty("paymentInterface")
   public String getPaymentInterface();
   /**
   *  <p>The payment method that is used, e.g.
   *  e.g.
   *  a conventional string representing Credit Card, Cash Advance etc.</p>
   */
   
   @JsonProperty("method")
   public String getMethod();
   /**
   *  <p>A human-readable, localized name for the payment method, e.g.
   *  'Credit Card'.</p>
   */
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