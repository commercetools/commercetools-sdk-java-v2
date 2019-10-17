package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.ReturnPaymentState;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetReturnPaymentStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetReturnPaymentStateActionBuilder {
   
   
   private String returnItemId;
   
   
   private com.commercetools.api.generated.models.order.ReturnPaymentState paymentState;
   
   public StagedOrderSetReturnPaymentStateActionBuilder returnItemId( final String returnItemId) {
      this.returnItemId = returnItemId;
      return this;
   }
   
   public StagedOrderSetReturnPaymentStateActionBuilder paymentState( final com.commercetools.api.generated.models.order.ReturnPaymentState paymentState) {
      this.paymentState = paymentState;
      return this;
   }
   
   
   public String getReturnItemId(){
      return this.returnItemId;
   }
   
   
   public com.commercetools.api.generated.models.order.ReturnPaymentState getPaymentState(){
      return this.paymentState;
   }

   public StagedOrderSetReturnPaymentStateAction build() {
       return new StagedOrderSetReturnPaymentStateActionImpl(returnItemId, paymentState);
   }
   
   public static StagedOrderSetReturnPaymentStateActionBuilder of() {
      return new StagedOrderSetReturnPaymentStateActionBuilder();
   }
   
   public static StagedOrderSetReturnPaymentStateActionBuilder of(final StagedOrderSetReturnPaymentStateAction template) {
      StagedOrderSetReturnPaymentStateActionBuilder builder = new StagedOrderSetReturnPaymentStateActionBuilder();
      builder.returnItemId = template.getReturnItemId();
      builder.paymentState = template.getPaymentState();
      return builder;
   }
   
}