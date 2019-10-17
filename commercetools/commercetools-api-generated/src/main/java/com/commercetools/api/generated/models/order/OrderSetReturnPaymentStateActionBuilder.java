package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.OrderUpdateAction;
import com.commercetools.api.generated.models.order.ReturnPaymentState;
import com.commercetools.api.generated.models.order.OrderSetReturnPaymentStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderSetReturnPaymentStateActionBuilder {
   
   
   private String returnItemId;
   
   
   private com.commercetools.api.generated.models.order.ReturnPaymentState paymentState;
   
   public OrderSetReturnPaymentStateActionBuilder returnItemId( final String returnItemId) {
      this.returnItemId = returnItemId;
      return this;
   }
   
   public OrderSetReturnPaymentStateActionBuilder paymentState( final com.commercetools.api.generated.models.order.ReturnPaymentState paymentState) {
      this.paymentState = paymentState;
      return this;
   }
   
   
   public String getReturnItemId(){
      return this.returnItemId;
   }
   
   
   public com.commercetools.api.generated.models.order.ReturnPaymentState getPaymentState(){
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