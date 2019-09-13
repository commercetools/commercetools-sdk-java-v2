package com.commercetools.models.order_edit;

import com.commercetools.models.order_edit.OrderEditResult;
import java.lang.String;
import com.commercetools.models.order_edit.OrderEditNotProcessed;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderEditNotProcessedBuilder {
   
   
   

   public OrderEditNotProcessed build() {
       return new OrderEditNotProcessedImpl();
   }
   
   public static OrderEditNotProcessedBuilder of() {
      return new OrderEditNotProcessedBuilder();
   }
   
   public static OrderEditNotProcessedBuilder of(final OrderEditNotProcessed template) {
      OrderEditNotProcessedBuilder builder = new OrderEditNotProcessedBuilder();
      return builder;
   }
   
}