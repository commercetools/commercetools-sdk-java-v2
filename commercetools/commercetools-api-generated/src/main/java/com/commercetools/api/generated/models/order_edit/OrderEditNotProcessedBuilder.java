package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order_edit.OrderEditResult;
import com.commercetools.api.generated.models.order_edit.OrderEditNotProcessed;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
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