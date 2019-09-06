package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Cart.ExternalLineItemTotalPrice;
import com.commercetools.models.Cart.ItemShippingDetailsDraft;
import com.commercetools.models.Common.Money;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartRemoveLineItemActionImpl implements CartRemoveLineItemAction {

   private java.lang.String action;
   
   private java.lang.Integer quantity;
   
   private com.commercetools.models.Cart.ExternalLineItemTotalPrice externalTotalPrice;
   
   private java.lang.String lineItemId;
   
   private com.commercetools.models.Cart.ItemShippingDetailsDraft shippingDetailsToRemove;
   
   private com.commercetools.models.Common.Money externalPrice;

   @JsonCreator
   CartRemoveLineItemActionImpl(@JsonProperty("quantity") final java.lang.Integer quantity, @JsonProperty("externalTotalPrice") final com.commercetools.models.Cart.ExternalLineItemTotalPrice externalTotalPrice, @JsonProperty("lineItemId") final java.lang.String lineItemId, @JsonProperty("shippingDetailsToRemove") final com.commercetools.models.Cart.ItemShippingDetailsDraft shippingDetailsToRemove, @JsonProperty("externalPrice") final com.commercetools.models.Common.Money externalPrice) {
      this.quantity = quantity;
      this.externalTotalPrice = externalTotalPrice;
      this.lineItemId = lineItemId;
      this.shippingDetailsToRemove = shippingDetailsToRemove;
      this.externalPrice = externalPrice;
      this.action = "removeLineItem";
   }
   public CartRemoveLineItemActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.Integer getQuantity(){
      return this.quantity;
   }
   
   
   public com.commercetools.models.Cart.ExternalLineItemTotalPrice getExternalTotalPrice(){
      return this.externalTotalPrice;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public com.commercetools.models.Cart.ItemShippingDetailsDraft getShippingDetailsToRemove(){
      return this.shippingDetailsToRemove;
   }
   
   
   public com.commercetools.models.Common.Money getExternalPrice(){
      return this.externalPrice;
   }

   public void setQuantity(final java.lang.Integer quantity){
      this.quantity = quantity;
   }
   
   public void setExternalTotalPrice(final com.commercetools.models.Cart.ExternalLineItemTotalPrice externalTotalPrice){
      this.externalTotalPrice = externalTotalPrice;
   }
   
   public void setLineItemId(final java.lang.String lineItemId){
      this.lineItemId = lineItemId;
   }
   
   public void setShippingDetailsToRemove(final com.commercetools.models.Cart.ItemShippingDetailsDraft shippingDetailsToRemove){
      this.shippingDetailsToRemove = shippingDetailsToRemove;
   }
   
   public void setExternalPrice(final com.commercetools.models.Common.Money externalPrice){
      this.externalPrice = externalPrice;
   }

}