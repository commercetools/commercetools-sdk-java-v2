package com.commercetools.models.Order;

import com.commercetools.models.Order.ReturnShipmentState;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Order.ReturnItemDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReturnItemDraftBuilder {
   
   
   private com.commercetools.models.Order.ReturnShipmentState shipmentState;
   
   @Nullable
   private java.lang.String customLineItemId;
   
   
   private java.lang.Long quantity;
   
   @Nullable
   private java.lang.String lineItemId;
   
   @Nullable
   private java.lang.String comment;
   
   public ReturnItemDraftBuilder shipmentState( final com.commercetools.models.Order.ReturnShipmentState shipmentState) {
      this.shipmentState = shipmentState;
      return this;
   }
   
   public ReturnItemDraftBuilder customLineItemId(@Nullable final java.lang.String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public ReturnItemDraftBuilder quantity( final java.lang.Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public ReturnItemDraftBuilder lineItemId(@Nullable final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public ReturnItemDraftBuilder comment(@Nullable final java.lang.String comment) {
      this.comment = comment;
      return this;
   }
   
   
   public com.commercetools.models.Order.ReturnShipmentState getShipmentState(){
      return this.shipmentState;
   }
   
   @Nullable
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public java.lang.Long getQuantity(){
      return this.quantity;
   }
   
   @Nullable
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }
   
   @Nullable
   public java.lang.String getComment(){
      return this.comment;
   }

   public ReturnItemDraft build() {
       return new ReturnItemDraftImpl(shipmentState, customLineItemId, quantity, lineItemId, comment);
   }
   
   public static ReturnItemDraftBuilder of() {
      return new ReturnItemDraftBuilder();
   }
   
   public static ReturnItemDraftBuilder of(final ReturnItemDraft template) {
      ReturnItemDraftBuilder builder = new ReturnItemDraftBuilder();
      builder.shipmentState = template.getShipmentState();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.quantity = template.getQuantity();
      builder.lineItemId = template.getLineItemId();
      builder.comment = template.getComment();
      return builder;
   }
   
}