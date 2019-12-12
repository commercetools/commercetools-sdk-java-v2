package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.ReturnShipmentState;
import com.commercetools.api.generated.models.order.ReturnItemDraft;
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
public final class ReturnItemDraftBuilder {
   
   
   private com.commercetools.api.generated.models.order.ReturnShipmentState shipmentState;
   
   @Nullable
   private String customLineItemId;
   
   
   private Long quantity;
   
   @Nullable
   private String lineItemId;
   
   @Nullable
   private String comment;
   
   public ReturnItemDraftBuilder shipmentState( final com.commercetools.api.generated.models.order.ReturnShipmentState shipmentState) {
      this.shipmentState = shipmentState;
      return this;
   }
   
   public ReturnItemDraftBuilder customLineItemId(@Nullable final String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public ReturnItemDraftBuilder quantity( final Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public ReturnItemDraftBuilder lineItemId(@Nullable final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public ReturnItemDraftBuilder comment(@Nullable final String comment) {
      this.comment = comment;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.order.ReturnShipmentState getShipmentState(){
      return this.shipmentState;
   }
   
   @Nullable
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public Long getQuantity(){
      return this.quantity;
   }
   
   @Nullable
   public String getLineItemId(){
      return this.lineItemId;
   }
   
   @Nullable
   public String getComment(){
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