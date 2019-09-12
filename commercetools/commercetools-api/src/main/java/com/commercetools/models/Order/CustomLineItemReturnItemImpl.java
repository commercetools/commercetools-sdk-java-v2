package com.commercetools.models.Order;

import com.commercetools.models.Order.ReturnItem;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomLineItemReturnItemImpl implements CustomLineItemReturnItem {

   private com.commercetools.models.Order.ReturnShipmentState shipmentState;
   
   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private java.lang.Long quantity;
   
   private java.lang.String comment;
   
   private java.lang.String id;
   
   private com.commercetools.models.Order.ReturnPaymentState paymentState;
   
   private java.lang.String type;
   
   private java.lang.String customLineItemId;

   @JsonCreator
   CustomLineItemReturnItemImpl(@JsonProperty("shipmentState") final com.commercetools.models.Order.ReturnShipmentState shipmentState, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("quantity") final java.lang.Long quantity, @JsonProperty("comment") final java.lang.String comment, @JsonProperty("id") final java.lang.String id, @JsonProperty("paymentState") final com.commercetools.models.Order.ReturnPaymentState paymentState, @JsonProperty("customLineItemId") final java.lang.String customLineItemId) {
      this.shipmentState = shipmentState;
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.quantity = quantity;
      this.comment = comment;
      this.id = id;
      this.paymentState = paymentState;
      this.customLineItemId = customLineItemId;
      this.type = "CustomLineItemReturnItem";
   }
   public CustomLineItemReturnItemImpl() {
      
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
   
   
   public java.lang.String getComment(){
      return this.comment;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public com.commercetools.models.Order.ReturnPaymentState getPaymentState(){
      return this.paymentState;
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }

   public void setShipmentState(final com.commercetools.models.Order.ReturnShipmentState shipmentState){
      this.shipmentState = shipmentState;
   }
   
   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setQuantity(final java.lang.Long quantity){
      this.quantity = quantity;
   }
   
   public void setComment(final java.lang.String comment){
      this.comment = comment;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setPaymentState(final com.commercetools.models.Order.ReturnPaymentState paymentState){
      this.paymentState = paymentState;
   }
   
   public void setCustomLineItemId(final java.lang.String customLineItemId){
      this.customLineItemId = customLineItemId;
   }

}