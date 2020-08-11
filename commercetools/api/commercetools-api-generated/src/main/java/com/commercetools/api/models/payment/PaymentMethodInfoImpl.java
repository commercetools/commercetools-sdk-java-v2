package com.commercetools.api.models.payment;

import com.commercetools.api.models.common.LocalizedString;
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
public final class PaymentMethodInfoImpl implements PaymentMethodInfo {

   private String method;

   private com.commercetools.api.models.common.LocalizedString name;

   private String paymentInterface;

   @JsonCreator
   PaymentMethodInfoImpl(@JsonProperty("method") final String method, @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name, @JsonProperty("paymentInterface") final String paymentInterface) {
      this.method = method;
      this.name = name;
      this.paymentInterface = paymentInterface;
   }
   public PaymentMethodInfoImpl() {

   }

   /**
   *  <p>The payment method that is used, e.g.
   *  e.g.
   *  a conventional string representing Credit Card, Cash Advance etc.</p>
   */
   public String getMethod(){
      return this.method;
   }

   /**
   *  <p>A human-readable, localized name for the payment method, e.g.
   *  'Credit Card'.</p>
   */
   public com.commercetools.api.models.common.LocalizedString getName(){
      return this.name;
   }

   /**
   *  <p>The interface that handles the payment (usually a PSP).
   *  Cannot be changed once it has been set.
   *  The combination of Payment<code>interfaceId</code> and this field must be unique.</p>
   */
   public String getPaymentInterface(){
      return this.paymentInterface;
   }

   public void setMethod(final String method){
      this.method = method;
   }

   public void setName(final com.commercetools.api.models.common.LocalizedString name){
      this.name = name;
   }

   public void setPaymentInterface(final String paymentInterface){
      this.paymentInterface = paymentInterface;
   }

}
