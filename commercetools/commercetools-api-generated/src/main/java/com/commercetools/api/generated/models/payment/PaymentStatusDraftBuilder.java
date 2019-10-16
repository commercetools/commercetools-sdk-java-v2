package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.state.StateResourceIdentifier;
import com.commercetools.api.generated.models.payment.PaymentStatusDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentStatusDraftBuilder {
   
   @Nullable
   private String interfaceText;
   
   @Nullable
   private com.commercetools.api.generated.models.state.StateResourceIdentifier state;
   
   @Nullable
   private String interfaceCode;
   
   public PaymentStatusDraftBuilder interfaceText(@Nullable final String interfaceText) {
      this.interfaceText = interfaceText;
      return this;
   }
   
   public PaymentStatusDraftBuilder state(@Nullable final com.commercetools.api.generated.models.state.StateResourceIdentifier state) {
      this.state = state;
      return this;
   }
   
   public PaymentStatusDraftBuilder interfaceCode(@Nullable final String interfaceCode) {
      this.interfaceCode = interfaceCode;
      return this;
   }
   
   @Nullable
   public String getInterfaceText(){
      return this.interfaceText;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.state.StateResourceIdentifier getState(){
      return this.state;
   }
   
   @Nullable
   public String getInterfaceCode(){
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