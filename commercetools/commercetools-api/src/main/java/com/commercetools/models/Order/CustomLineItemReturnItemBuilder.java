package com.commercetools.models.order;

import com.commercetools.models.order.ReturnItem;
import java.lang.String;
import com.commercetools.models.order.CustomLineItemReturnItem;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomLineItemReturnItemBuilder {
   
   
   private com.commercetools.models.order.ReturnShipmentState shipmentState;
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.Long quantity;
   
   @Nullable
   private java.lang.String comment;
   
   
   private java.lang.String id;
   
   
   private com.commercetools.models.order.ReturnPaymentState paymentState;
   
   
   private java.lang.String customLineItemId;
   
   public CustomLineItemReturnItemBuilder shipmentState( final com.commercetools.models.order.ReturnShipmentState shipmentState) {
      this.shipmentState = shipmentState;
      return this;
   }
   
   public CustomLineItemReturnItemBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public CustomLineItemReturnItemBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public CustomLineItemReturnItemBuilder quantity( final java.lang.Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public CustomLineItemReturnItemBuilder comment(@Nullable final java.lang.String comment) {
      this.comment = comment;
      return this;
   }
   
   public CustomLineItemReturnItemBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public CustomLineItemReturnItemBuilder paymentState( final com.commercetools.models.order.ReturnPaymentState paymentState) {
      this.paymentState = paymentState;
      return this;
   }
   
   public CustomLineItemReturnItemBuilder customLineItemId( final java.lang.String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   
   public com.commercetools.models.order.ReturnShipmentState getShipmentState(){
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
   
   
   public com.commercetools.models.order.ReturnPaymentState getPaymentState(){
      return this.paymentState;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }

   public CustomLineItemReturnItem build() {
       return new CustomLineItemReturnItemImpl(shipmentState, createdAt, lastModifiedAt, quantity, comment, id, paymentState, customLineItemId);
   }
   
   public static CustomLineItemReturnItemBuilder of() {
      return new CustomLineItemReturnItemBuilder();
   }
   
   public static CustomLineItemReturnItemBuilder of(final CustomLineItemReturnItem template) {
      CustomLineItemReturnItemBuilder builder = new CustomLineItemReturnItemBuilder();
      builder.shipmentState = template.getShipmentState();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.quantity = template.getQuantity();
      builder.comment = template.getComment();
      builder.id = template.getId();
      builder.paymentState = template.getPaymentState();
      builder.customLineItemId = template.getCustomLineItemId();
      return builder;
   }
   
}