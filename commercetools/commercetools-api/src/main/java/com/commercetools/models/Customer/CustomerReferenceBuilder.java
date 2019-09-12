package com.commercetools.models.Customer;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Customer.Customer;
import com.commercetools.models.Customer.CustomerReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerReferenceBuilder {
   
   
   private java.lang.String id;
   
   @Nullable
   private com.commercetools.models.Customer.Customer obj;
   
   public CustomerReferenceBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public CustomerReferenceBuilder obj(@Nullable final com.commercetools.models.Customer.Customer obj) {
      this.obj = obj;
      return this;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.Customer.Customer getObj(){
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