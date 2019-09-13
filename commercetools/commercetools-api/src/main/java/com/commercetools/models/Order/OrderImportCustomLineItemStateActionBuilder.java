package com.commercetools.models.order;

import com.commercetools.models.order.ItemState;
import com.commercetools.models.order.OrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order.OrderImportCustomLineItemStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderImportCustomLineItemStateActionBuilder {
   
   
   private java.lang.String customLineItemId;
   
   
   private java.util.List<com.commercetools.models.order.ItemState> state;
   
   public OrderImportCustomLineItemStateActionBuilder customLineItemId( final java.lang.String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public OrderImportCustomLineItemStateActionBuilder state( final java.util.List<com.commercetools.models.order.ItemState> state) {
      this.state = state;
      return this;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public java.util.List<com.commercetools.models.order.ItemState> getState(){
      return this.state;
   }

   public OrderImportCustomLineItemStateAction build() {
       return new OrderImportCustomLineItemStateActionImpl(customLineItemId, state);
   }
   
   public static OrderImportCustomLineItemStateActionBuilder of() {
      return new OrderImportCustomLineItemStateActionBuilder();
   }
   
   public static OrderImportCustomLineItemStateActionBuilder of(final OrderImportCustomLineItemStateAction template) {
      OrderImportCustomLineItemStateActionBuilder builder = new OrderImportCustomLineItemStateActionBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.state = template.getState();
      return builder;
   }
   
}