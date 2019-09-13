package com.commercetools.models.order;

import com.commercetools.models.order.OrderUpdateAction;
import com.commercetools.models.order.ReturnPaymentState;
import java.lang.String;
import com.commercetools.models.order.OrderSetReturnPaymentStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderSetReturnPaymentStateActionBuilder {
   
   
   private java.lang.String returnItemId;
   
   
   private com.commercetools.models.order.ReturnPaymentState paymentState;
   
   public OrderSetReturnPaymentStateActionBuilder returnItemId( final java.lang.String returnItemId) {
      this.returnItemId = returnItemId;
      return this;
   }
   
   public OrderSetReturnPaymentStateActionBuilder paymentState( final com.commercetools.models.order.ReturnPaymentState paymentState) {
      this.paymentState = paymentState;
      return this;
   }
   
   
   public java.lang.String getReturnItemId(){
      return this.returnItemId;
   }
   
   
   public com.commercetools.models.order.ReturnPaymentState getPaymentState(){
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