package com.commercetools.models.Payment;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Payment.Payment;
import com.commercetools.models.Payment.PaymentReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentReferenceBuilder {
   
   
   private java.lang.String id;
   
   @Nullable
   private com.commercetools.models.Payment.Payment obj;
   
   public PaymentReferenceBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public PaymentReferenceBuilder obj(@Nullable final com.commercetools.models.Payment.Payment obj) {
      this.obj = obj;
      return this;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.Payment.Payment getObj(){
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