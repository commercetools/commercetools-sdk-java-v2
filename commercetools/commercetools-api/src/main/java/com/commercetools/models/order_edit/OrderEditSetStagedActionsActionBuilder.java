package com.commercetools.models.order_edit;

import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.order_edit.OrderEditUpdateAction;
import java.lang.String;
import com.commercetools.models.order_edit.OrderEditSetStagedActionsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderEditSetStagedActionsActionBuilder {
   
   
   private java.util.List<com.commercetools.models.order.StagedOrderUpdateAction> stagedActions;
   
   public OrderEditSetStagedActionsActionBuilder stagedActions( final java.util.List<com.commercetools.models.order.StagedOrderUpdateAction> stagedActions) {
      this.stagedActions = stagedActions;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.order.StagedOrderUpdateAction> getStagedActions(){
      return this.stagedActions;
   }

   public OrderEditSetStagedActionsAction build() {
       return new OrderEditSetStagedActionsActionImpl(stagedActions);
   }
   
   public static OrderEditSetStagedActionsActionBuilder of() {
      return new OrderEditSetStagedActionsActionBuilder();
   }
   
   public static OrderEditSetStagedActionsActionBuilder of(final OrderEditSetStagedActionsAction template) {
      OrderEditSetStagedActionsActionBuilder builder = new OrderEditSetStagedActionsActionBuilder();
      builder.stagedActions = template.getStagedActions();
      return builder;
   }
   
}