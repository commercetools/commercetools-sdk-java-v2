package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangeCustomLineItemQuantityAction;
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
public final class StagedOrderChangeCustomLineItemQuantityActionBuilder {
   
   
   private String customLineItemId;
   
   
   private Integer quantity;
   
   public StagedOrderChangeCustomLineItemQuantityActionBuilder customLineItemId( final String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public StagedOrderChangeCustomLineItemQuantityActionBuilder quantity( final Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public Integer getQuantity(){
      return this.quantity;
   }

   public StagedOrderChangeCustomLineItemQuantityAction build() {
       return new StagedOrderChangeCustomLineItemQuantityActionImpl(customLineItemId, quantity);
   }
   
   public static StagedOrderChangeCustomLineItemQuantityActionBuilder of() {
      return new StagedOrderChangeCustomLineItemQuantityActionBuilder();
   }
   
   public static StagedOrderChangeCustomLineItemQuantityActionBuilder of(final StagedOrderChangeCustomLineItemQuantityAction template) {
      StagedOrderChangeCustomLineItemQuantityActionBuilder builder = new StagedOrderChangeCustomLineItemQuantityActionBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.quantity = template.getQuantity();
      return builder;
   }
   
}