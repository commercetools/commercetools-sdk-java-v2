package com.commercetools.api.models.me;

import com.commercetools.api.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.me.MyCartUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCartRemoveLineItemActionImpl implements MyCartRemoveLineItemAction {

   private String action;

   private Integer quantity;

   private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;

   private String lineItemId;

   private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetailsToRemove;

   private com.commercetools.api.models.common.Money externalPrice;

   @JsonCreator
   MyCartRemoveLineItemActionImpl(@JsonProperty("quantity") final Integer quantity, @JsonProperty("externalTotalPrice") final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice, @JsonProperty("lineItemId") final String lineItemId, @JsonProperty("shippingDetailsToRemove") final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetailsToRemove, @JsonProperty("externalPrice") final com.commercetools.api.models.common.Money externalPrice) {
      this.quantity = quantity;
      this.externalTotalPrice = externalTotalPrice;
      this.lineItemId = lineItemId;
      this.shippingDetailsToRemove = shippingDetailsToRemove;
      this.externalPrice = externalPrice;
      this.action = "removeLineItem";
   }
   public MyCartRemoveLineItemActionImpl() {

   }


   public String getAction(){
      return this.action;
   }


   public Integer getQuantity(){
      return this.quantity;
   }


   public com.commercetools.api.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice(){
      return this.externalTotalPrice;
   }


   public String getLineItemId(){
      return this.lineItemId;
   }


   public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetailsToRemove(){
      return this.shippingDetailsToRemove;
   }


   public com.commercetools.api.models.common.Money getExternalPrice(){
      return this.externalPrice;
   }

   public void setQuantity(final Integer quantity){
      this.quantity = quantity;
   }

   public void setExternalTotalPrice(final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice){
      this.externalTotalPrice = externalTotalPrice;
   }

   public void setLineItemId(final String lineItemId){
      this.lineItemId = lineItemId;
   }

   public void setShippingDetailsToRemove(final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetailsToRemove){
      this.shippingDetailsToRemove = shippingDetailsToRemove;
   }

   public void setExternalPrice(final com.commercetools.api.models.common.Money externalPrice){
      this.externalPrice = externalPrice;
   }

}
