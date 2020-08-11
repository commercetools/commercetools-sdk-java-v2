package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.payment.PaymentSetCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentSetCustomTypeActionBuilder {

   @Nullable
   private com.commercetools.api.models.type.FieldContainer fields;

   @Nullable
   private com.commercetools.api.models.type.TypeResourceIdentifier type;

   public PaymentSetCustomTypeActionBuilder fields(@Nullable final com.commercetools.api.models.type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }

   public PaymentSetCustomTypeActionBuilder type(@Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }

   @Nullable
   public com.commercetools.api.models.type.FieldContainer getFields(){
      return this.fields;
   }

   @Nullable
   public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
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
