package com.commercetools.models.order;

import com.commercetools.models.order.OrderUpdateAction;
import com.commercetools.models.order.OrderSetLineItemCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderSetLineItemCustomFieldActionBuilder {
   
   
   private String lineItemId;
   
   
   private String name;
   
   @Nullable
   private Object value;
   
   public OrderSetLineItemCustomFieldActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public OrderSetLineItemCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public OrderSetLineItemCustomFieldActionBuilder value(@Nullable final Object value) {
      this.value = value;
      return this;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public Object getValue(){
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