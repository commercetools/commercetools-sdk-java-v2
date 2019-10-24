package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.generated.models.common.Money;
import io.vrap.rmf.base.client.utils.Generated;
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

   private String action;
   
   private Integer quantity;
   
   private com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice externalTotalPrice;
   
   private String lineItemId;
   
   private com.commercetools.api.generated.models.common.Money externalPrice;

   @JsonCreator
   CartChangeLineItemQuantityActionImpl(@JsonProperty("quantity") final Integer quantity, @JsonProperty("externalTotalPrice") final com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice externalTotalPrice, @JsonProperty("lineItemId") final String lineItemId, @JsonProperty("externalPrice") final com.commercetools.api.generated.models.common.Money externalPrice) {
      this.quantity = quantity;
      this.externalTotalPrice = externalTotalPrice;
      this.lineItemId = lineItemId;
      this.externalPrice = externalPrice;
      this.action = "changeLineItemQuantity";
   }
   public CartChangeLineItemQuantityActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public Integer getQuantity(){
      return this.quantity;
   }
   
   
   public com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice(){
      return this.externalTotalPrice;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public com.commercetools.api.generated.models.common.Money getExternalPrice(){
      return this.externalPrice;
   }

   public void setQuantity(final Integer quantity){
      this.quantity = quantity;
   }
   
   public void setExternalTotalPrice(final com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice externalTotalPrice){
      this.externalTotalPrice = externalTotalPrice;
   }
   
   public void setLineItemId(final String lineItemId){
      this.lineItemId = lineItemId;
   }
   
   public void setExternalPrice(final com.commercetools.api.generated.models.common.Money externalPrice){
      this.externalPrice = externalPrice;
   }

}