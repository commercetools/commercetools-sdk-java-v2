package com.commercetools.models.customer;

import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.common.ResourceIdentifier;
import com.commercetools.models.customer.CustomerResourceIdentifier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerResourceIdentifierBuilder {
   
   @Nullable
   private String id;
   
   @Nullable
   private String key;
   
   public CustomerResourceIdentifierBuilder id(@Nullable final String id) {
      this.id = id;
      return this;
   }
   
   public CustomerResourceIdentifierBuilder key(@Nullable final String key) {
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