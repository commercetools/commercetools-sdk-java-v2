package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.ReturnItem;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class LineItemReturnItemImpl implements LineItemReturnItem {

   private com.commercetools.api.generated.models.order.ReturnShipmentState shipmentState;
   
   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private Long quantity;
   
   private String comment;
   
   private String id;
   
   private com.commercetools.api.generated.models.order.ReturnPaymentState paymentState;
   
   private String type;
   
   private String lineItemId;

   @JsonCreator
   LineItemReturnItemImpl(@JsonProperty("shipmentState") final com.commercetools.api.generated.models.order.ReturnShipmentState shipmentState, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("quantity") final Long quantity, @JsonProperty("comment") final String comment, @JsonProperty("id") final String id, @JsonProperty("paymentState") final com.commercetools.api.generated.models.order.ReturnPaymentState paymentState, @JsonProperty("lineItemId") final String lineItemId) {
      this.shipmentState = shipmentState;
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.quantity = quantity;
      this.comment = comment;
      this.id = id;
      this.paymentState = paymentState;
      this.lineItemId = lineItemId;
      this.type = "LineItemReturnItem";
   }
   public LineItemReturnItemImpl() {
      
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
   
   
   public String getComment(){
      return this.comment;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public com.commercetools.api.generated.models.order.ReturnPaymentState getPaymentState(){
      return this.paymentState;
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }

   public void setShipmentState(final com.commercetools.api.generated.models.order.ReturnShipmentState shipmentState){
      this.shipmentState = shipmentState;
   }
   
   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setQuantity(final Long quantity){
      this.quantity = quantity;
   }
   
   public void setComment(final String comment){
      this.comment = comment;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setPaymentState(final com.commercetools.api.generated.models.order.ReturnPaymentState paymentState){
      this.paymentState = paymentState;
   }
   
   public void setLineItemId(final String lineItemId){
      this.lineItemId = lineItemId;
   }

}