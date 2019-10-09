package com.commercetools.models.order_edit;

import com.commercetools.models.order.ItemState;
import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.order_edit.StagedOrderImportCustomLineItemStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderImportCustomLineItemStateActionBuilder {
   
   
   private String customLineItemId;
   
   
   private java.util.List<com.commercetools.models.order.ItemState> state;
   
   public StagedOrderImportCustomLineItemStateActionBuilder customLineItemId( final String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public StagedOrderImportCustomLineItemStateActionBuilder state( final java.util.List<com.commercetools.models.order.ItemState> state) {
      this.state = state;
      return this;
   }
   
   
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public java.util.List<com.commercetools.models.order.ItemState> getState(){
      return this.state;
   }

   public StagedOrderImportCustomLineItemStateAction build() {
       return new StagedOrderImportCustomLineItemStateActionImpl(customLineItemId, state);
   }
   
   public static StagedOrderImportCustomLineItemStateActionBuilder of() {
      return new StagedOrderImportCustomLineItemStateActionBuilder();
   }
   
   public static StagedOrderImportCustomLineItemStateActionBuilder of(final StagedOrderImportCustomLineItemStateAction template) {
      StagedOrderImportCustomLineItemStateActionBuilder builder = new StagedOrderImportCustomLineItemStateActionBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.state = template.getState();
      return builder;
   }
   
}