package com.commercetools.models.order;

import com.commercetools.models.order.OrderUpdateAction;
import java.lang.Long;
import com.commercetools.models.order.OrderUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderUpdateBuilder {
   
   
   private java.util.List<com.commercetools.models.order.OrderUpdateAction> actions;
   
   
   private java.lang.Long version;
   
   public OrderUpdateBuilder actions( final java.util.List<com.commercetools.models.order.OrderUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public OrderUpdateBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.order.OrderUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public java.lang.Long getVersion(){
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