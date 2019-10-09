package com.commercetools.models.payment;

import com.commercetools.models.payment.PaymentUpdateAction;
import com.commercetools.models.type.FieldContainer;
import com.commercetools.models.type.TypeResourceIdentifier;
import com.commercetools.models.payment.PaymentAddInterfaceInteractionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentAddInterfaceInteractionActionBuilder {
   
   @Nullable
   private com.commercetools.models.type.FieldContainer fields;
   
   
   private com.commercetools.models.type.TypeResourceIdentifier type;
   
   public PaymentAddInterfaceInteractionActionBuilder fields(@Nullable final com.commercetools.models.type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public PaymentAddInterfaceInteractionActionBuilder type( final com.commercetools.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.type.FieldContainer getFields(){
      return this.fields;
   }
   
   
   public com.commercetools.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public PaymentAddInterfaceInteractionAction build() {
       return new PaymentAddInterfaceInteractionActionImpl(fields, type);
   }
   
   public static PaymentAddInterfaceInteractionActionBuilder of() {
      return new PaymentAddInterfaceInteractionActionBuilder();
   }
   
   public static PaymentAddInterfaceInteractionActionBuilder of(final PaymentAddInterfaceInteractionAction template) {
      PaymentAddInterfaceInteractionActionBuilder builder = new PaymentAddInterfaceInteractionActionBuilder();
      builder.fields = template.getFields();
      builder.type = template.getType();
      return builder;
   }
   
}