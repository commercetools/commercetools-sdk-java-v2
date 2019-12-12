package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.payment.PaymentUpdateAction;
import com.commercetools.api.generated.models.type.FieldContainer;
import com.commercetools.api.generated.models.type.TypeResourceIdentifier;
import com.commercetools.api.generated.models.payment.PaymentAddInterfaceInteractionAction;
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
public final class PaymentAddInterfaceInteractionActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.type.FieldContainer fields;
   
   
   private com.commercetools.api.generated.models.type.TypeResourceIdentifier type;
   
   public PaymentAddInterfaceInteractionActionBuilder fields(@Nullable final com.commercetools.api.generated.models.type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public PaymentAddInterfaceInteractionActionBuilder type( final com.commercetools.api.generated.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.FieldContainer getFields(){
      return this.fields;
   }
   
   
   public com.commercetools.api.generated.models.type.TypeResourceIdentifier getType(){
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