package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.ItemState;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderImportLineItemStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderImportLineItemStateActionBuilder {
   
   
   private java.lang.String lineItemId;
   
   
   private java.util.List<com.commercetools.models.Order.ItemState> state;
   
   public StagedOrderImportLineItemStateActionBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public StagedOrderImportLineItemStateActionBuilder state( final java.util.List<com.commercetools.models.Order.ItemState> state) {
      this.state = state;
      return this;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public java.util.List<com.commercetools.models.Order.ItemState> getState(){
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