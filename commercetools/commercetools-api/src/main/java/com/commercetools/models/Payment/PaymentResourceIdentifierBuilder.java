package com.commercetools.models.Payment;

import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Common.ResourceIdentifier;
import com.commercetools.models.Payment.PaymentResourceIdentifier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentResourceIdentifierBuilder {
   
   @Nullable
   private java.lang.String id;
   
   @Nullable
   private java.lang.String key;
   
   public PaymentResourceIdentifierBuilder id(@Nullable final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public PaymentResourceIdentifierBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public PaymentResourceIdentifier build() {
       return new PaymentResourceIdentifierImpl(id, key);
   }
   
   public static PaymentResourceIdentifierBuilder of() {
      return new PaymentResourceIdentifierBuilder();
   }
   
   public static PaymentResourceIdentifierBuilder of(final PaymentResourceIdentifier template) {
      PaymentResourceIdentifierBuilder builder = new PaymentResourceIdentifierBuilder();
      builder.id = template.getId();
      builder.key = template.getKey();
      return builder;
   }
   
}