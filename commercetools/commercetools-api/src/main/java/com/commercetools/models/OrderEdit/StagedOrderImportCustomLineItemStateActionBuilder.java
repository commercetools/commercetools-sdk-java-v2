package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.ItemState;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderImportCustomLineItemStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderImportCustomLineItemStateActionBuilder {
   
   
   private java.lang.String customLineItemId;
   
   
   private java.util.List<com.commercetools.models.Order.ItemState> state;
   
   public StagedOrderImportCustomLineItemStateActionBuilder customLineItemId( final java.lang.String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public StagedOrderImportCustomLineItemStateActionBuilder state( final java.util.List<com.commercetools.models.Order.ItemState> state) {
      this.state = state;
      return this;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public java.util.List<com.commercetools.models.Order.ItemState> getState(){
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