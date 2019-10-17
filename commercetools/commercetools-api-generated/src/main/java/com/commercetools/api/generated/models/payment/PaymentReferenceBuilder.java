package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.payment.Payment;
import com.commercetools.api.generated.models.payment.PaymentReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentReferenceBuilder {
   
   
   private String id;
   
   @Nullable
   private com.commercetools.api.generated.models.payment.Payment obj;
   
   public PaymentReferenceBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public PaymentReferenceBuilder obj(@Nullable final com.commercetools.api.generated.models.payment.Payment obj) {
      this.obj = obj;
      return this;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.payment.Payment getObj(){
      return this.obj;
   }

   public PaymentReference build() {
       return new PaymentReferenceImpl(id, obj);
   }
   
   public static PaymentReferenceBuilder of() {
      return new PaymentReferenceBuilder();
   }
   
   public static PaymentReferenceBuilder of(final PaymentReference template) {
      PaymentReferenceBuilder builder = new PaymentReferenceBuilder();
      builder.id = template.getId();
      builder.obj = template.getObj();
      return builder;
   }
   
}