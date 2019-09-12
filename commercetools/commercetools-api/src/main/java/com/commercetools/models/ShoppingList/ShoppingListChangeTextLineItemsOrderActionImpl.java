package com.commercetools.models.ShoppingList;

import com.commercetools.models.ShoppingList.ShoppingListUpdateAction;
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
public final class ShoppingListChangeTextLineItemsOrderActionImpl implements ShoppingListChangeTextLineItemsOrderAction {

   private java.lang.String action;
   
   private java.util.List<java.lang.String> textLineItemOrder;

   @JsonCreator
   ShoppingListChangeTextLineItemsOrderActionImpl(@JsonProperty("textLineItemOrder") final java.util.List<java.lang.String> textLineItemOrder) {
      this.textLineItemOrder = textLineItemOrder;
      this.action = "changeTextLineItemsOrder";
   }
   public ShoppingListChangeTextLineItemsOrderActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.util.List<java.lang.String> getTextLineItemOrder(){
      return this.textLineItemOrder;
   }

   public void setTextLineItemOrder(final java.util.List<java.lang.String> textLineItemOrder){
      this.textLineItemOrder = textLineItemOrder;
   }

}