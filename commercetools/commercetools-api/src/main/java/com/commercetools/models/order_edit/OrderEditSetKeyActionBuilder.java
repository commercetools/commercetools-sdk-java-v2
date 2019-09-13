package com.commercetools.models.order_edit;

import com.commercetools.models.order_edit.OrderEditUpdateAction;
import java.lang.String;
import com.commercetools.models.order_edit.OrderEditSetKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderEditSetKeyActionBuilder {
   
   @Nullable
   private java.lang.String key;
   
   public OrderEditSetKeyActionBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public OrderEditSetKeyAction build() {
       return new OrderEditSetKeyActionImpl(key);
   }
   
   public static OrderEditSetKeyActionBuilder of() {
      return new OrderEditSetKeyActionBuilder();
   }
   
   public static OrderEditSetKeyActionBuilder of(final OrderEditSetKeyAction template) {
      OrderEditSetKeyActionBuilder builder = new OrderEditSetKeyActionBuilder();
      builder.key = template.getKey();
      return builder;
   }
   
}