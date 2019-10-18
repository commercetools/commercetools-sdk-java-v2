package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.payment.PaymentUpdateAction;
import com.commercetools.api.generated.models.payment.PaymentSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
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