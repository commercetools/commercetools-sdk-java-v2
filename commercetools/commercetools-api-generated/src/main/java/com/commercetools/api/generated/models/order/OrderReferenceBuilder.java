package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.order.Order;
import com.commercetools.api.generated.models.order.OrderReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderReferenceBuilder {
   
   
   private String id;
   
   @Nullable
   private com.commercetools.api.generated.models.order.Order obj;
   
   public OrderReferenceBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public OrderReferenceBuilder obj(@Nullable final com.commercetools.api.generated.models.order.Order obj) {
      this.obj = obj;
      return this;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.order.Order getObj(){
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