package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import java.lang.Integer;
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
public final class CartChangeCustomLineItemQuantityActionImpl implements CartChangeCustomLineItemQuantityAction {

   private java.lang.String action;
   
   private java.lang.String customLineItemId;
   
   private java.lang.Integer quantity;

   @JsonCreator
   CartChangeCustomLineItemQuantityActionImpl(@JsonProperty("customLineItemId") final java.lang.String customLineItemId, @JsonProperty("quantity") final java.lang.Integer quantity) {
      this.customLineItemId = customLineItemId;
      this.quantity = quantity;
      this.action = "changeCustomLineItemQuantity";
   }
   public CartChangeCustomLineItemQuantityActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public java.lang.Integer getQuantity(){
      return this.quantity;
   }

   public void setCustomLineItemId(final java.lang.String customLineItemId){
      this.customLineItemId = customLineItemId;
   }
   
   public void setQuantity(final java.lang.Integer quantity){
      this.quantity = quantity;
   }

}