package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.PaymentStatusInterfaceCodeSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentStatusInterfaceCodeSetMessagePayloadBuilder {
   
   
   private java.lang.String paymentId;
   
   
   private java.lang.String interfaceCode;
   
   public PaymentStatusInterfaceCodeSetMessagePayloadBuilder paymentId( final java.lang.String paymentId) {
      this.paymentId = paymentId;
      return this;
   }
   
   public PaymentStatusInterfaceCodeSetMessagePayloadBuilder interfaceCode( final java.lang.String interfaceCode) {
      this.interfaceCode = interfaceCode;
      return this;
   }
   
   
   public java.lang.String getPaymentId(){
      return this.paymentId;
   }
   
   
   public java.lang.String getInterfaceCode(){
      return this.interfaceCode;
   }

   public PaymentStatusInterfaceCodeSetMessagePayload build() {
       return new PaymentStatusInterfaceCodeSetMessagePayloadImpl(paymentId, interfaceCode);
   }
   
   public static PaymentStatusInterfaceCodeSetMessagePayloadBuilder of() {
      return new PaymentStatusInterfaceCodeSetMessagePayloadBuilder();
   }
   
   public static PaymentStatusInterfaceCodeSetMessagePayloadBuilder of(final PaymentStatusInterfaceCodeSetMessagePayload template) {
      PaymentStatusInterfaceCodeSetMessagePayloadBuilder builder = new PaymentStatusInterfaceCodeSetMessagePayloadBuilder();
      builder.paymentId = template.getPaymentId();
      builder.interfaceCode = template.getInterfaceCode();
      return builder;
   }
   
}