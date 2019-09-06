package com.commercetools.models.Payment;

import com.commercetools.models.State.StateReference;
import java.lang.String;
import com.commercetools.models.Payment.PaymentStatus;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentStatusBuilder {
   
   @Nullable
   private java.lang.String interfaceText;
   
   @Nullable
   private com.commercetools.models.State.StateReference state;
   
   @Nullable
   private java.lang.String interfaceCode;
   
   public PaymentStatusBuilder interfaceText(@Nullable final java.lang.String interfaceText) {
      this.interfaceText = interfaceText;
      return this;
   }
   
   public PaymentStatusBuilder state(@Nullable final com.commercetools.models.State.StateReference state) {
      this.state = state;
      return this;
   }
   
   public PaymentStatusBuilder interfaceCode(@Nullable final java.lang.String interfaceCode) {
      this.interfaceCode = interfaceCode;
      return this;
   }
   
   @Nullable
   public java.lang.String getInterfaceText(){
      return this.interfaceText;
   }
   
   @Nullable
   public com.commercetools.models.State.StateReference getState(){
      return this.state;
   }
   
   @Nullable
   public java.lang.String getInterfaceCode(){
      return this.interfaceCode;
   }

   public PaymentStatus build() {
       return new PaymentStatusImpl(interfaceText, state, interfaceCode);
   }
   
   public static PaymentStatusBuilder of() {
      return new PaymentStatusBuilder();
   }
   
   public static PaymentStatusBuilder of(final PaymentStatus template) {
      PaymentStatusBuilder builder = new PaymentStatusBuilder();
      builder.interfaceText = template.getInterfaceText();
      builder.state = template.getState();
      builder.interfaceCode = template.getInterfaceCode();
      return builder;
   }
   
}