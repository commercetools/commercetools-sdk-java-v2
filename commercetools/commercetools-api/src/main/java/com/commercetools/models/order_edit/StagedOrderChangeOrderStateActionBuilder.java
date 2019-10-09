package com.commercetools.models.order_edit;

import com.commercetools.models.order.OrderState;
import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.order_edit.StagedOrderChangeOrderStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderChangeOrderStateActionBuilder {
   
   
   private com.commercetools.models.order.OrderState orderState;
   
   public StagedOrderChangeOrderStateActionBuilder orderState( final com.commercetools.models.order.OrderState orderState) {
      this.orderState = orderState;
      return this;
   }
   
   
   public com.commercetools.models.order.OrderState getOrderState(){
      return this.orderState;
   }

   public StagedOrderChangeOrderStateAction build() {
       return new StagedOrderChangeOrderStateActionImpl(orderState);
   }
   
   public static StagedOrderChangeOrderStateActionBuilder of() {
      return new StagedOrderChangeOrderStateActionBuilder();
   }
   
   public static StagedOrderChangeOrderStateActionBuilder of(final StagedOrderChangeOrderStateAction template) {
      StagedOrderChangeOrderStateActionBuilder builder = new StagedOrderChangeOrderStateActionBuilder();
      builder.orderState = template.getOrderState();
      return builder;
   }
   
}