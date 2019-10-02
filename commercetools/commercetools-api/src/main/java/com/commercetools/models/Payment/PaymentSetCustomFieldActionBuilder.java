package com.commercetools.models.payment;

import com.commercetools.models.payment.PaymentUpdateAction;
import com.commercetools.models.payment.PaymentSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentSetCustomFieldActionBuilder {
   
   
   private String name;
   
   @Nullable
   private Object value;
   
   public PaymentSetCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public PaymentSetCustomFieldActionBuilder value(@Nullable final Object value) {
      this.value = value;
      return this;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public Object getValue(){
      return this.value;
   }

   public PaymentSetCustomFieldAction build() {
       return new PaymentSetCustomFieldActionImpl(name, value);
   }
   
   public static PaymentSetCustomFieldActionBuilder of() {
      return new PaymentSetCustomFieldActionBuilder();
   }
   
   public static PaymentSetCustomFieldActionBuilder of(final PaymentSetCustomFieldAction template) {
      PaymentSetCustomFieldActionBuilder builder = new PaymentSetCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}