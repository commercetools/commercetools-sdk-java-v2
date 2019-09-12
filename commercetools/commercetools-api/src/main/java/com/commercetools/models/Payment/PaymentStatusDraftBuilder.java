package com.commercetools.models.Payment;

import com.commercetools.models.State.StateResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Payment.PaymentStatusDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentStatusDraftBuilder {
   
   @Nullable
   private java.lang.String interfaceText;
   
   @Nullable
   private com.commercetools.models.State.StateResourceIdentifier state;
   
   @Nullable
   private java.lang.String interfaceCode;
   
   public PaymentStatusDraftBuilder interfaceText(@Nullable final java.lang.String interfaceText) {
      this.interfaceText = interfaceText;
      return this;
   }
   
   public PaymentStatusDraftBuilder state(@Nullable final com.commercetools.models.State.StateResourceIdentifier state) {
      this.state = state;
      return this;
   }
   
   public PaymentStatusDraftBuilder interfaceCode(@Nullable final java.lang.String interfaceCode) {
      this.interfaceCode = interfaceCode;
      return this;
   }
   
   @Nullable
   public java.lang.String getInterfaceText(){
      return this.interfaceText;
   }
   
   @Nullable
   public com.commercetools.models.State.StateResourceIdentifier getState(){
      return this.state;
   }
   
   @Nullable
   public java.lang.String getInterfaceCode(){
      return this.interfaceCode;
   }

   public PaymentStatusDraft build() {
       return new PaymentStatusDraftImpl(interfaceText, state, interfaceCode);
   }
   
   public static PaymentStatusDraftBuilder of() {
      return new PaymentStatusDraftBuilder();
   }
   
   public static PaymentStatusDraftBuilder of(final PaymentStatusDraft template) {
      PaymentStatusDraftBuilder builder = new PaymentStatusDraftBuilder();
      builder.interfaceText = template.getInterfaceText();
      builder.state = template.getState();
      builder.interfaceCode = template.getInterfaceCode();
      return builder;
   }
   
}