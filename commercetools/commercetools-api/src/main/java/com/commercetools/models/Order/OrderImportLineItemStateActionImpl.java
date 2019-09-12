package com.commercetools.models.Order;

import com.commercetools.models.Order.ItemState;
import com.commercetools.models.Order.OrderUpdateAction;
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
public final class OrderImportLineItemStateActionImpl implements OrderImportLineItemStateAction {

   private java.lang.String action;
   
   private java.lang.String lineItemId;
   
   private java.util.List<com.commercetools.models.Order.ItemState> state;

   @JsonCreator
   OrderImportLineItemStateActionImpl(@JsonProperty("lineItemId") final java.lang.String lineItemId, @JsonProperty("state") final java.util.List<com.commercetools.models.Order.ItemState> state) {
      this.lineItemId = lineItemId;
      this.state = state;
      this.action = "importLineItemState";
   }
   public OrderImportLineItemStateActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public java.util.List<com.commercetools.models.Order.ItemState> getState(){
      return this.state;
   }

   public void setLineItemId(final java.lang.String lineItemId){
      this.lineItemId = lineItemId;
   }
   
   public void setState(final java.util.List<com.commercetools.models.Order.ItemState> state){
      this.state = state;
   }

}