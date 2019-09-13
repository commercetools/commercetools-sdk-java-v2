package com.commercetools.models.order;

import com.commercetools.models.order.OrderUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.order.OrderSetCustomLineItemCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderSetCustomLineItemCustomFieldActionBuilder {
   
   
   private java.lang.String customLineItemId;
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.Object value;
   
   public OrderSetCustomLineItemCustomFieldActionBuilder customLineItemId( final java.lang.String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public OrderSetCustomLineItemCustomFieldActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public OrderSetCustomLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
      this.value = value;
      return this;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   @Nullable
   public java.lang.Object getValue(){
      return this.value;
   }

   public OrderSetCustomLineItemCustomFieldAction build() {
       return new OrderSetCustomLineItemCustomFieldActionImpl(customLineItemId, name, value);
   }
   
   public static OrderSetCustomLineItemCustomFieldActionBuilder of() {
      return new OrderSetCustomLineItemCustomFieldActionBuilder();
   }
   
   public static OrderSetCustomLineItemCustomFieldActionBuilder of(final OrderSetCustomLineItemCustomFieldAction template) {
      OrderSetCustomLineItemCustomFieldActionBuilder builder = new OrderSetCustomLineItemCustomFieldActionBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}