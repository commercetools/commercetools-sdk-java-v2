package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.models.common.Money;
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
public final class CartChangeLineItemQuantityActionImpl implements CartChangeLineItemQuantityAction {

   private java.lang.String action;
   
   private java.lang.Integer quantity;
   
   private com.commercetools.models.cart.ExternalLineItemTotalPrice externalTotalPrice;
   
   private java.lang.String lineItemId;
   
   private com.commercetools.models.common.Money externalPrice;

   @JsonCreator
   CartChangeLineItemQuantityActionImpl(@JsonProperty("quantity") final java.lang.Integer quantity, @JsonProperty("externalTotalPrice") final com.commercetools.models.cart.ExternalLineItemTotalPrice externalTotalPrice, @JsonProperty("lineItemId") final java.lang.String lineItemId, @JsonProperty("externalPrice") final com.commercetools.models.common.Money externalPrice) {
      this.quantity = quantity;
      this.externalTotalPrice = externalTotalPrice;
      this.lineItemId = lineItemId;
      this.externalPrice = externalPrice;
      this.action = "changeLineItemQuantity";
   }
   public CartChangeLineItemQuantityActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.Integer getQuantity(){
      return this.quantity;
   }
   
   
   public com.commercetools.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice(){
      return this.externalTotalPrice;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public com.commercetools.models.common.Money getExternalPrice(){
      return this.externalPrice;
   }

   public void setQuantity(final java.lang.Integer quantity){
      this.quantity = quantity;
   }
   
   public void setExternalTotalPrice(final com.commercetools.models.cart.ExternalLineItemTotalPrice externalTotalPrice){
      this.externalTotalPrice = externalTotalPrice;
   }
   
   public void setLineItemId(final java.lang.String lineItemId){
      this.lineItemId = lineItemId;
   }
   
   public void setExternalPrice(final com.commercetools.models.common.Money externalPrice){
      this.externalPrice = externalPrice;
   }

}