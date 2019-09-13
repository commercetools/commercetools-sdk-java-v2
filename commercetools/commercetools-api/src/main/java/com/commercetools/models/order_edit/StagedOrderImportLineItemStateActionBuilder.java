package com.commercetools.models.order_edit;

import com.commercetools.models.order.ItemState;
import com.commercetools.models.order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderImportLineItemStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderImportLineItemStateActionBuilder {
   
   
   private java.lang.String lineItemId;
   
   
   private java.util.List<com.commercetools.models.order.ItemState> state;
   
   public StagedOrderImportLineItemStateActionBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public StagedOrderImportLineItemStateActionBuilder state( final java.util.List<com.commercetools.models.order.ItemState> state) {
      this.state = state;
      return this;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public java.util.List<com.commercetools.models.order.ItemState> getState(){
      return this.state;
   }

   public StagedOrderImportLineItemStateAction build() {
       return new StagedOrderImportLineItemStateActionImpl(lineItemId, state);
   }
   
   public static StagedOrderImportLineItemStateActionBuilder of() {
      return new StagedOrderImportLineItemStateActionBuilder();
   }
   
   public static StagedOrderImportLineItemStateActionBuilder of(final StagedOrderImportLineItemStateAction template) {
      StagedOrderImportLineItemStateActionBuilder builder = new StagedOrderImportLineItemStateActionBuilder();
      builder.lineItemId = template.getLineItemId();
      builder.state = template.getState();
      return builder;
   }
   
}