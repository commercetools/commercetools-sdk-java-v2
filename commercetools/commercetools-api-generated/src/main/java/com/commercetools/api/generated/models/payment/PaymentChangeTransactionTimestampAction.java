package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.payment.PaymentUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.payment.PaymentChangeTransactionTimestampActionImpl;

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
@JsonDeserialize(as = PaymentChangeTransactionTimestampActionImpl.class)
public interface PaymentChangeTransactionTimestampAction extends PaymentUpdateAction {

   
   @NotNull
   @JsonProperty("transactionId")
   public String getTransactionId();
   
   @NotNull
   @JsonProperty("timestamp")
   public ZonedDateTime getTimestamp();

   public void setTransactionId(final String transactionId);
   
   public void setTimestamp(final ZonedDateTime timestamp);
   
   public static PaymentChangeTransactionTimestampActionImpl of(){
      return new PaymentChangeTransactionTimestampActionImpl();
   }
   

   public static PaymentChangeTransactionTimestampActionImpl of(final PaymentChangeTransactionTimestampAction template) {
      PaymentChangeTransactionTimestampActionImpl instance = new PaymentChangeTransactionTimestampActionImpl();
      instance.setTransactionId(template.getTransactionId());
      instance.setTimestamp(template.getTimestamp());
      return instance;
   }

}