package com.commercetools.models.Order;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Order.Order;
import com.commercetools.models.Order.OrderReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderReferenceBuilder {
   
   
   private java.lang.String id;
   
   @Nullable
   private com.commercetools.models.Order.Order obj;
   
   public OrderReferenceBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public OrderReferenceBuilder obj(@Nullable final com.commercetools.models.Order.Order obj) {
      this.obj = obj;
      return this;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.models.Order.Order getObj(){
      return this.obj;
   }

   public OrderReference build() {
       return new OrderReferenceImpl(id, obj);
   }
   
   public static OrderReferenceBuilder of() {
      return new OrderReferenceBuilder();
   }
   
   public static OrderReferenceBuilder of(final OrderReference template) {
      OrderReferenceBuilder builder = new OrderReferenceBuilder();
      builder.id = template.getId();
      builder.obj = template.getObj();
      return builder;
   }
   
}