package com.commercetools.models.order;

import com.commercetools.models.order.ItemState;
import com.commercetools.models.order.OrderUpdateAction;
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

   private String action;
   
   private String lineItemId;
   
   private java.util.List<com.commercetools.models.order.ItemState> state;

   @JsonCreator
   OrderImportLineItemStateActionImpl(@JsonProperty("lineItemId") final String lineItemId, @JsonProperty("state") final java.util.List<com.commercetools.models.order.ItemState> state) {
      this.lineItemId = lineItemId;
      this.state = state;
      this.action = "importLineItemState";
   }
   public OrderImportLineItemStateActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public java.util.List<com.commercetools.models.order.ItemState> getState(){
      return this.state;
   }

   public void setLineItemId(final String lineItemId){
      this.lineItemId = lineItemId;
   }
   
   public void setState(final java.util.List<com.commercetools.models.order.ItemState> state){
      this.state = state;
   }

}