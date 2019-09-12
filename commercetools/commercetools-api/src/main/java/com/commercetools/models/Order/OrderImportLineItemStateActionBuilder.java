package com.commercetools.models.Order;

import com.commercetools.models.Order.ItemState;
import com.commercetools.models.Order.OrderUpdateAction;
import java.lang.String;
import com.commercetools.models.Order.OrderImportLineItemStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderImportLineItemStateActionBuilder {
   
   
   private java.lang.String lineItemId;
   
   
   private java.util.List<com.commercetools.models.Order.ItemState> state;
   
   public OrderImportLineItemStateActionBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public OrderImportLineItemStateActionBuilder state( final java.util.List<com.commercetools.models.Order.ItemState> state) {
      this.state = state;
      return this;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public java.util.List<com.commercetools.models.Order.ItemState> getState(){
      return this.state;
   }

   public OrderImportLineItemStateAction build() {
       return new OrderImportLineItemStateActionImpl(lineItemId, state);
   }
   
   public static OrderImportLineItemStateActionBuilder of() {
      return new OrderImportLineItemStateActionBuilder();
   }
   
   public static OrderImportLineItemStateActionBuilder of(final OrderImportLineItemStateAction template) {
      OrderImportLineItemStateActionBuilder builder = new OrderImportLineItemStateActionBuilder();
      builder.lineItemId = template.getLineItemId();
      builder.state = template.getState();
      return builder;
   }
   
}