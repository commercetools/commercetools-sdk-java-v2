package com.commercetools.api.models.order;

import com.commercetools.api.models.order.ReturnItem;
import com.commercetools.api.models.order.LineItemReturnItem;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class LineItemReturnItemBuilder {


   private com.commercetools.api.models.order.ReturnShipmentState shipmentState;


   private java.time.ZonedDateTime createdAt;


   private java.time.ZonedDateTime lastModifiedAt;


   private Long quantity;

   @Nullable
   private String comment;


   private String id;


   private com.commercetools.api.models.order.ReturnPaymentState paymentState;


   private String lineItemId;

   public LineItemReturnItemBuilder shipmentState( final com.commercetools.api.models.order.ReturnShipmentState shipmentState) {
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

   public LineItemReturnItemBuilder quantity( final Long quantity) {
      this.quantity = quantity;
      return this;
   }

   public LineItemReturnItemBuilder comment(@Nullable final String comment) {
      this.comment = comment;
      return this;
   }

   public LineItemReturnItemBuilder id( final String id) {
      this.id = id;
      return this;
   }

   public LineItemReturnItemBuilder paymentState( final com.commercetools.api.models.order.ReturnPaymentState paymentState) {
      this.paymentState = paymentState;
      return this;
   }

   public LineItemReturnItemBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }


   public com.commercetools.api.models.order.ReturnShipmentState getShipmentState(){
      return this.shipmentState;
   }


   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }


   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }


   public Long getQuantity(){
      return this.quantity;
   }

   @Nullable
   public String getComment(){
      return this.comment;
   }


   public String getId(){
      return this.id;
   }


   public com.commercetools.api.models.order.ReturnPaymentState getPaymentState(){
      return this.paymentState;
   }


   public String getLineItemId(){
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
