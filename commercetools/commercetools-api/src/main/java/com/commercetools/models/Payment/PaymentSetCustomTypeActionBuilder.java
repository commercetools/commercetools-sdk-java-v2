package com.commercetools.models.payment;

import com.commercetools.models.payment.PaymentUpdateAction;
import com.commercetools.models.type.FieldContainer;
import com.commercetools.models.type.TypeResourceIdentifier;
import java.lang.String;
import com.commercetools.models.payment.PaymentSetCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentSetCustomTypeActionBuilder {
   
   @Nullable
   private com.commercetools.models.type.FieldContainer fields;
   
   @Nullable
   private com.commercetools.models.type.TypeResourceIdentifier type;
   
   public PaymentSetCustomTypeActionBuilder fields(@Nullable final com.commercetools.models.type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public PaymentSetCustomTypeActionBuilder type(@Nullable final com.commercetools.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.type.FieldContainer getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public PaymentSetCustomTypeAction build() {
       return new PaymentSetCustomTypeActionImpl(fields, type);
   }
   
   public static PaymentSetCustomTypeActionBuilder of() {
      return new PaymentSetCustomTypeActionBuilder();
   }
   
   public static PaymentSetCustomTypeActionBuilder of(final PaymentSetCustomTypeAction template) {
      PaymentSetCustomTypeActionBuilder builder = new PaymentSetCustomTypeActionBuilder();
      builder.fields = template.getFields();
      builder.type = template.getType();
      return builder;
   }
   
}