package com.commercetools.models.Customer;

import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Common.ResourceIdentifier;
import com.commercetools.models.Customer.CustomerResourceIdentifier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerResourceIdentifierBuilder {
   
   @Nullable
   private java.lang.String id;
   
   @Nullable
   private java.lang.String key;
   
   public CustomerResourceIdentifierBuilder id(@Nullable final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public CustomerResourceIdentifierBuilder key(@Nullable final java.lang.String key) {
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

   public CustomerResourceIdentifier build() {
       return new CustomerResourceIdentifierImpl(id, key);
   }
   
   public static CustomerResourceIdentifierBuilder of() {
      return new CustomerResourceIdentifierBuilder();
   }
   
   public static CustomerResourceIdentifierBuilder of(final CustomerResourceIdentifier template) {
      CustomerResourceIdentifierBuilder builder = new CustomerResourceIdentifierBuilder();
      builder.id = template.getId();
      builder.key = template.getKey();
      return builder;
   }
   
}