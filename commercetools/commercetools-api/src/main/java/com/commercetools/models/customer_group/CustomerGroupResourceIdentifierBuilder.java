package com.commercetools.models.customer_group;

import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.common.ResourceIdentifier;
import com.commercetools.models.customer_group.CustomerGroupResourceIdentifier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerGroupResourceIdentifierBuilder {
   
   @Nullable
   private String id;
   
   @Nullable
   private String key;
   
   public CustomerGroupResourceIdentifierBuilder id(@Nullable final String id) {
      this.id = id;
      return this;
   }
   
   public CustomerGroupResourceIdentifierBuilder key(@Nullable final String key) {
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

   public CustomerGroupResourceIdentifier build() {
       return new CustomerGroupResourceIdentifierImpl(id, key);
   }
   
   public static CustomerGroupResourceIdentifierBuilder of() {
      return new CustomerGroupResourceIdentifierBuilder();
   }
   
   public static CustomerGroupResourceIdentifierBuilder of(final CustomerGroupResourceIdentifier template) {
      CustomerGroupResourceIdentifierBuilder builder = new CustomerGroupResourceIdentifierBuilder();
      builder.id = template.getId();
      builder.key = template.getKey();
      return builder;
   }
   
}