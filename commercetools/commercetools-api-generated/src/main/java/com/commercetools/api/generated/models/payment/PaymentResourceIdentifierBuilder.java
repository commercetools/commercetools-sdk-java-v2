package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.common.ResourceIdentifier;
import com.commercetools.api.generated.models.payment.PaymentResourceIdentifier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentResourceIdentifierBuilder {
   
   @Nullable
   private String id;
   
   @Nullable
   private String key;
   
   public PaymentResourceIdentifierBuilder id(@Nullable final String id) {
      this.id = id;
      return this;
   }
   
   public PaymentResourceIdentifierBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public String getKey(){
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