package com.commercetools.models.order;

import com.commercetools.models.order.OrderUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.order.OrderSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderSetCustomFieldActionBuilder {
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.Object value;
   
   public OrderSetCustomFieldActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public OrderSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
      this.value = value;
      return this;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   @Nullable
   public java.lang.Object getValue(){
      return this.value;
   }

   public OrderSetCustomFieldAction build() {
       return new OrderSetCustomFieldActionImpl(name, value);
   }
   
   public static OrderSetCustomFieldActionBuilder of() {
      return new OrderSetCustomFieldActionBuilder();
   }
   
   public static OrderSetCustomFieldActionBuilder of(final OrderSetCustomFieldAction template) {
      OrderSetCustomFieldActionBuilder builder = new OrderSetCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}