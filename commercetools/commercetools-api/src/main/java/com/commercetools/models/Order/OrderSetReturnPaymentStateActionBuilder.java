package com.commercetools.models.Order;

import com.commercetools.models.Order.OrderUpdateAction;
import com.commercetools.models.Order.ReturnPaymentState;
import java.lang.String;
import com.commercetools.models.Order.OrderSetReturnPaymentStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderSetReturnPaymentStateActionBuilder {
   
   
   private java.lang.String returnItemId;
   
   
   private com.commercetools.models.Order.ReturnPaymentState paymentState;
   
   public OrderSetReturnPaymentStateActionBuilder returnItemId( final java.lang.String returnItemId) {
      this.returnItemId = returnItemId;
      return this;
   }
   
   public OrderSetReturnPaymentStateActionBuilder paymentState( final com.commercetools.models.Order.ReturnPaymentState paymentState) {
      this.paymentState = paymentState;
      return this;
   }
   
   
   public java.lang.String getReturnItemId(){
      return this.returnItemId;
   }
   
   
   public com.commercetools.models.Order.ReturnPaymentState getPaymentState(){
      return this.paymentState;
   }

   public OrderSetReturnPaymentStateAction build() {
       return new OrderSetReturnPaymentStateActionImpl(returnItemId, paymentState);
   }
   
   public static OrderSetReturnPaymentStateActionBuilder of() {
      return new OrderSetReturnPaymentStateActionBuilder();
   }
   
   public static OrderSetReturnPaymentStateActionBuilder of(final OrderSetReturnPaymentStateAction template) {
      OrderSetReturnPaymentStateActionBuilder builder = new OrderSetReturnPaymentStateActionBuilder();
      builder.returnItemId = template.getReturnItemId();
      builder.paymentState = template.getPaymentState();
      return builder;
   }
   
}