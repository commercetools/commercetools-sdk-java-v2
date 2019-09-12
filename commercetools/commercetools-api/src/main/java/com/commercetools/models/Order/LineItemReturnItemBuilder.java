package com.commercetools.models.Order;

import com.commercetools.models.Order.ReturnItem;
import java.lang.String;
import com.commercetools.models.Order.LineItemReturnItem;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class LineItemReturnItemBuilder {
   
   
   private com.commercetools.models.Order.ReturnShipmentState shipmentState;
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.Long quantity;
   
   @Nullable
   private java.lang.String comment;
   
   
   private java.lang.String id;
   
   
   private com.commercetools.models.Order.ReturnPaymentState paymentState;
   
   
   private java.lang.String lineItemId;
   
   public LineItemReturnItemBuilder shipmentState( final com.commercetools.models.Order.ReturnShipmentState shipmentState) {
      this.shipmentState = shipmentState;
      return this;
   }
   
   public LineItemReturnItemBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public LineItemReturnItemBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public LineItemReturnItemBuilder quantity( final java.lang.Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public LineItemReturnItemBuilder comment(@Nullable final java.lang.String comment) {
      this.comment = comment;
      return this;
   }
   
   public LineItemReturnItemBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public LineItemReturnItemBuilder paymentState( final com.commercetools.models.Order.ReturnPaymentState paymentState) {
      this.paymentState = paymentState;
      return this;
   }
   
   public LineItemReturnItemBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   
   public com.commercetools.models.Order.ReturnShipmentState getShipmentState(){
      return this.shipmentState;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public java.lang.Long getQuantity(){
      return this.quantity;
   }
   
   @Nullable
   public java.lang.String getComment(){
      return this.comment;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public com.commercetools.models.Order.ReturnPaymentState getPaymentState(){
      return this.paymentState;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }

   public LineItemReturnItem build() {
       return new LineItemReturnItemImpl(shipmentState, createdAt, lastModifiedAt, quantity, comment, id, paymentState, lineItemId);
   }
   
   public static LineItemReturnItemBuilder of() {
      return new LineItemReturnItemBuilder();
   }
   
   public static LineItemReturnItemBuilder of(final LineItemReturnItem template) {
      LineItemReturnItemBuilder builder = new LineItemReturnItemBuilder();
      builder.shipmentState = template.getShipmentState();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.quantity = template.getQuantity();
      builder.comment = template.getComment();
      builder.id = template.getId();
      builder.paymentState = template.getPaymentState();
      builder.lineItemId = template.getLineItemId();
      return builder;
   }
   
}