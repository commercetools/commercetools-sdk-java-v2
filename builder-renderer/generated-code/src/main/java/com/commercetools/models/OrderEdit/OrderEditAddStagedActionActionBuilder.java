package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.StagedOrderUpdateAction;
import com.commercetools.models.OrderEdit.OrderEditUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.OrderEditAddStagedActionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderEditAddStagedActionActionBuilder {
   
   
   private com.commercetools.models.Order.StagedOrderUpdateAction stagedAction;
   
   public OrderEditAddStagedActionActionBuilder stagedAction( final com.commercetools.models.Order.StagedOrderUpdateAction stagedAction) {
      this.stagedAction = stagedAction;
      return this;
   }
   
   
   public com.commercetools.models.Order.StagedOrderUpdateAction getStagedAction(){
      return this.stagedAction;
   }

   public OrderEditAddStagedActionAction build() {
       return new OrderEditAddStagedActionActionImpl(stagedAction);
   }
   
   public static OrderEditAddStagedActionActionBuilder of() {
      return new OrderEditAddStagedActionActionBuilder();
   }
   
   public static OrderEditAddStagedActionActionBuilder of(final OrderEditAddStagedActionAction template) {
      OrderEditAddStagedActionActionBuilder builder = new OrderEditAddStagedActionActionBuilder();
      builder.stagedAction = template.getStagedAction();
      return builder;
   }
   
}