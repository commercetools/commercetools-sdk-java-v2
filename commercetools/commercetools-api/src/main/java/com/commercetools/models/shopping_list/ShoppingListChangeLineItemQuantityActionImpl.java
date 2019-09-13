package com.commercetools.models.shopping_list;

import com.commercetools.models.shopping_list.ShoppingListUpdateAction;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListChangeLineItemQuantityActionImpl implements ShoppingListChangeLineItemQuantityAction {

   private java.lang.String action;
   
   private java.lang.Long quantity;
   
   private java.lang.String lineItemId;

   @JsonCreator
   ShoppingListChangeLineItemQuantityActionImpl(@JsonProperty("quantity") final java.lang.Long quantity, @JsonProperty("lineItemId") final java.lang.String lineItemId) {
      this.quantity = quantity;
      this.lineItemId = lineItemId;
      this.action = "changeLineItemQuantity";
   }
   public ShoppingListChangeLineItemQuantityActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.Long getQuantity(){
      return this.quantity;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }

   public void setQuantity(final java.lang.Long quantity){
      this.quantity = quantity;
   }
   
   public void setLineItemId(final java.lang.String lineItemId){
      this.lineItemId = lineItemId;
   }

}