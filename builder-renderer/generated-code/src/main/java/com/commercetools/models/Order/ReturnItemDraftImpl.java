package com.commercetools.models.Order;

import com.commercetools.models.Order.ReturnShipmentState;
import java.lang.Long;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReturnItemDraftImpl implements ReturnItemDraft {

   private com.commercetools.models.Order.ReturnShipmentState shipmentState;
   
   private java.lang.String customLineItemId;
   
   private java.lang.Long quantity;
   
   private java.lang.String lineItemId;
   
   private java.lang.String comment;

   @JsonCreator
   ReturnItemDraftImpl(@JsonProperty("shipmentState") final com.commercetools.models.Order.ReturnShipmentState shipmentState, @JsonProperty("customLineItemId") final java.lang.String customLineItemId, @JsonProperty("quantity") final java.lang.Long quantity, @JsonProperty("lineItemId") final java.lang.String lineItemId, @JsonProperty("comment") final java.lang.String comment) {
      this.shipmentState = shipmentState;
      this.customLineItemId = customLineItemId;
      this.quantity = quantity;
      this.lineItemId = lineItemId;
      this.comment = comment;
   }
   public ReturnItemDraftImpl() {
      
   }
   
   
   public com.commercetools.models.Order.ReturnShipmentState getShipmentState(){
      return this.shipmentState;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public java.lang.Long getQuantity(){
      return this.quantity;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public java.lang.String getComment(){
      return this.comment;
   }

   public void setShipmentState(final com.commercetools.models.Order.ReturnShipmentState shipmentState){
      this.shipmentState = shipmentState;
   }
   
   public void setCustomLineItemId(final java.lang.String customLineItemId){
      this.customLineItemId = customLineItemId;
   }
   
   public void setQuantity(final java.lang.Long quantity){
      this.quantity = quantity;
   }
   
   public void setLineItemId(final java.lang.String lineItemId){
      this.lineItemId = lineItemId;
   }
   
   public void setComment(final java.lang.String comment){
      this.comment = comment;
   }

}