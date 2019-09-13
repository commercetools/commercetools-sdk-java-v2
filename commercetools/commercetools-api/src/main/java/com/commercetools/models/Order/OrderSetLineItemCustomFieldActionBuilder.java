package com.commercetools.models.order;

import com.commercetools.models.order.OrderUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.order.OrderSetLineItemCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderSetLineItemCustomFieldActionBuilder {
   
   
   private java.lang.String lineItemId;
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.Object value;
   
   public OrderSetLineItemCustomFieldActionBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public OrderSetLineItemCustomFieldActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public OrderSetLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
      this.value = value;
      return this;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   @Nullable
   public java.lang.Object getValue(){
      return this.value;
   }

   public OrderSetLineItemCustomFieldAction build() {
       return new OrderSetLineItemCustomFieldActionImpl(lineItemId, name, value);
   }
   
   public static OrderSetLineItemCustomFieldActionBuilder of() {
      return new OrderSetLineItemCustomFieldActionBuilder();
   }
   
   public static OrderSetLineItemCustomFieldActionBuilder of(final OrderSetLineItemCustomFieldAction template) {
      OrderSetLineItemCustomFieldActionBuilder builder = new OrderSetLineItemCustomFieldActionBuilder();
      builder.lineItemId = template.getLineItemId();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}