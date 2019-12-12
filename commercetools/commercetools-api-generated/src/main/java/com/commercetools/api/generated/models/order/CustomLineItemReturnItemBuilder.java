package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.ReturnItem;
import com.commercetools.api.generated.models.order.CustomLineItemReturnItem;
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
public final class CustomLineItemReturnItemBuilder {
   
   
   private com.commercetools.api.generated.models.order.ReturnShipmentState shipmentState;
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private Long quantity;
   
   @Nullable
   private String comment;
   
   
   private String id;
   
   
   private com.commercetools.api.generated.models.order.ReturnPaymentState paymentState;
   
   
   private String customLineItemId;
   
   public CustomLineItemReturnItemBuilder shipmentState( final com.commercetools.api.generated.models.order.ReturnShipmentState shipmentState) {
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
   
   public CustomLineItemReturnItemBuilder quantity( final Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public CustomLineItemReturnItemBuilder comment(@Nullable final String comment) {
      this.comment = comment;
      return this;
   }
   
   public CustomLineItemReturnItemBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public CustomLineItemReturnItemBuilder paymentState( final com.commercetools.api.generated.models.order.ReturnPaymentState paymentState) {
      this.paymentState = paymentState;
      return this;
   }
   
   public CustomLineItemReturnItemBuilder customLineItemId( final String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.order.ReturnShipmentState getShipmentState(){
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
   
   
   public com.commercetools.api.generated.models.order.ReturnPaymentState getPaymentState(){
      return this.paymentState;
   }
   
   
   public String getCustomLineItemId(){
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