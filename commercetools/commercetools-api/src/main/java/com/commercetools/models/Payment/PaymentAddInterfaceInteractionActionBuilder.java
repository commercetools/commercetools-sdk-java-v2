package com.commercetools.models.Payment;

import com.commercetools.models.Payment.PaymentUpdateAction;
import com.commercetools.models.Type.FieldContainer;
import com.commercetools.models.Type.TypeResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Payment.PaymentAddInterfaceInteractionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentAddInterfaceInteractionActionBuilder {
   
   @Nullable
   private com.commercetools.models.Type.FieldContainer fields;
   
   
   private com.commercetools.models.Type.TypeResourceIdentifier type;
   
   public PaymentAddInterfaceInteractionActionBuilder fields(@Nullable final com.commercetools.models.Type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public PaymentAddInterfaceInteractionActionBuilder type( final com.commercetools.models.Type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Type.FieldContainer getFields(){
      return this.fields;
   }
   
   
   public com.commercetools.models.Type.TypeResourceIdentifier getType(){
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