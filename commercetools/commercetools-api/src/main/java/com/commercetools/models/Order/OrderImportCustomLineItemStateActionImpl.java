package com.commercetools.models.order;

import com.commercetools.models.order.ItemState;
import com.commercetools.models.order.OrderUpdateAction;
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
public final class OrderImportCustomLineItemStateActionImpl implements OrderImportCustomLineItemStateAction {

   private java.lang.String action;
   
   private java.lang.String customLineItemId;
   
   private java.util.List<com.commercetools.models.order.ItemState> state;

   @JsonCreator
   OrderImportCustomLineItemStateActionImpl(@JsonProperty("customLineItemId") final java.lang.String customLineItemId, @JsonProperty("state") final java.util.List<com.commercetools.models.order.ItemState> state) {
      this.customLineItemId = customLineItemId;
      this.state = state;
      this.action = "importCustomLineItemState";
   }
   public OrderImportCustomLineItemStateActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public java.util.List<com.commercetools.models.order.ItemState> getState(){
      return this.state;
   }

   public void setCustomLineItemId(final java.lang.String customLineItemId){
      this.customLineItemId = customLineItemId;
   }
   
   public void setState(final java.util.List<com.commercetools.models.order.ItemState> state){
      this.state = state;
   }

}