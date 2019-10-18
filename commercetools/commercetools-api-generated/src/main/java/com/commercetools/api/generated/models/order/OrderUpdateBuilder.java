package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.OrderUpdateAction;
import com.commercetools.api.generated.models.order.OrderUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderUpdateBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.order.OrderUpdateAction> actions;
   
   
   private Long version;
   
   public OrderUpdateBuilder actions( final java.util.List<com.commercetools.api.generated.models.order.OrderUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public OrderUpdateBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.order.OrderUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public Long getVersion(){
      return this.version;
   }

   public OrderUpdate build() {
       return new OrderUpdateImpl(actions, version);
   }
   
   public static OrderUpdateBuilder of() {
      return new OrderUpdateBuilder();
   }
   
   public static OrderUpdateBuilder of(final OrderUpdate template) {
      OrderUpdateBuilder builder = new OrderUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}