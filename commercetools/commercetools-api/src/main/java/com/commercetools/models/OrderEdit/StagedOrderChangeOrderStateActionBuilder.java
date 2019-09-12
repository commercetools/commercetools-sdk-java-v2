package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.OrderState;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderChangeOrderStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderChangeOrderStateActionBuilder {
   
   
   private com.commercetools.models.Order.OrderState orderState;
   
   public StagedOrderChangeOrderStateActionBuilder orderState( final com.commercetools.models.Order.OrderState orderState) {
      this.orderState = orderState;
      return this;
   }
   
   
   public com.commercetools.models.Order.OrderState getOrderState(){
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