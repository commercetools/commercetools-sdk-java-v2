package com.commercetools.models.order_edit;

import com.commercetools.models.order.StagedOrderUpdateAction;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderChangeCustomLineItemQuantityAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderChangeCustomLineItemQuantityActionBuilder {
   
   
   private java.lang.String customLineItemId;
   
   
   private java.lang.Integer quantity;
   
   public StagedOrderChangeCustomLineItemQuantityActionBuilder customLineItemId( final java.lang.String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public StagedOrderChangeCustomLineItemQuantityActionBuilder quantity( final java.lang.Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public java.lang.Integer getQuantity(){
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