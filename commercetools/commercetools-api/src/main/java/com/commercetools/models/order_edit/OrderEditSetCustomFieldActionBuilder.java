package com.commercetools.models.order_edit;

import com.commercetools.models.order_edit.OrderEditUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.order_edit.OrderEditSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderEditSetCustomFieldActionBuilder {
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.Object value;
   
   public OrderEditSetCustomFieldActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public OrderEditSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

   public OrderEditSetCustomFieldAction build() {
       return new OrderEditSetCustomFieldActionImpl(name, value);
   }
   
   public static OrderEditSetCustomFieldActionBuilder of() {
      return new OrderEditSetCustomFieldActionBuilder();
   }
   
   public static OrderEditSetCustomFieldActionBuilder of(final OrderEditSetCustomFieldAction template) {
      OrderEditSetCustomFieldActionBuilder builder = new OrderEditSetCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}