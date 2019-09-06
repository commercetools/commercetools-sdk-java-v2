package com.commercetools.models.ShoppingList;

import com.commercetools.models.ShoppingList.ShoppingListUpdateAction;
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
public final class ShoppingListChangeTextLineItemQuantityActionImpl implements ShoppingListChangeTextLineItemQuantityAction {

   private java.lang.String action;
   
   private java.lang.Long quantity;
   
   private java.lang.String textLineItemId;

   @JsonCreator
   ShoppingListChangeTextLineItemQuantityActionImpl(@JsonProperty("quantity") final java.lang.Long quantity, @JsonProperty("textLineItemId") final java.lang.String textLineItemId) {
      this.quantity = quantity;
      this.textLineItemId = textLineItemId;
      this.action = "changeTextLineItemQuantity";
   }
   public ShoppingListChangeTextLineItemQuantityActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.Long getQuantity(){
      return this.quantity;
   }
   
   
   public java.lang.String getTextLineItemId(){
      return this.textLineItemId;
   }

   public void setQuantity(final java.lang.Long quantity){
      this.quantity = quantity;
   }
   
   public void setTextLineItemId(final java.lang.String textLineItemId){
      this.textLineItemId = textLineItemId;
   }

}