package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.state.StateReference;
import com.commercetools.api.generated.models.payment.PaymentStatus;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentStatusBuilder {
   
   @Nullable
   private String interfaceText;
   
   @Nullable
   private com.commercetools.api.generated.models.state.StateReference state;
   
   @Nullable
   private String interfaceCode;
   
   public PaymentStatusBuilder interfaceText(@Nullable final String interfaceText) {
      this.interfaceText = interfaceText;
      return this;
   }
   
   public PaymentStatusBuilder state(@Nullable final com.commercetools.api.generated.models.state.StateReference state) {
      this.state = state;
      return this;
   }
   
   public PaymentStatusBuilder interfaceCode(@Nullable final String interfaceCode) {
      this.interfaceCode = interfaceCode;
      return this;
   }
   
   @Nullable
   public String getInterfaceText(){
      return this.interfaceText;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.state.StateReference getState(){
      return this.state;
   }
   
   @Nullable
   public String getInterfaceCode(){
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