package com.commercetools.models.customer_group;

import com.commercetools.models.common.Reference;
import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.customer_group.CustomerGroup;
import com.commercetools.models.customer_group.CustomerGroupReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerGroupReferenceBuilder {
   
   
   private java.lang.String id;
   
   @Nullable
   private com.commercetools.models.customer_group.CustomerGroup obj;
   
   public CustomerGroupReferenceBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public CustomerGroupReferenceBuilder obj(@Nullable final com.commercetools.models.customer_group.CustomerGroup obj) {
      this.obj = obj;
      return this;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.customer_group.CustomerGroup getObj(){
      return this.obj;
   }

   public CustomerGroupReference build() {
       return new CustomerGroupReferenceImpl(id, obj);
   }
   
   public static CustomerGroupReferenceBuilder of() {
      return new CustomerGroupReferenceBuilder();
   }
   
   public static CustomerGroupReferenceBuilder of(final CustomerGroupReference template) {
      CustomerGroupReferenceBuilder builder = new CustomerGroupReferenceBuilder();
      builder.id = template.getId();
      builder.obj = template.getObj();
      return builder;
   }
   
}