package com.commercetools.models.customer;

import com.commercetools.models.common.Reference;
import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.customer.Customer;
import com.commercetools.models.customer.CustomerReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerReferenceBuilder {
   
   
   private String id;
   
   @Nullable
   private com.commercetools.models.customer.Customer obj;
   
   public CustomerReferenceBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public CustomerReferenceBuilder obj(@Nullable final com.commercetools.models.customer.Customer obj) {
      this.obj = obj;
      return this;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.customer.Customer getObj(){
      return this.obj;
   }

   public CustomerReference build() {
       return new CustomerReferenceImpl(id, obj);
   }
   
   public static CustomerReferenceBuilder of() {
      return new CustomerReferenceBuilder();
   }
   
   public static CustomerReferenceBuilder of(final CustomerReference template) {
      CustomerReferenceBuilder builder = new CustomerReferenceBuilder();
      builder.id = template.getId();
      builder.obj = template.getObj();
      return builder;
   }
   
}