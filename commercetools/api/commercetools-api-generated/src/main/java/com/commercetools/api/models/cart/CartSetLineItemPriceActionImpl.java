package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.common.Money;
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
public final class CartSetLineItemPriceActionImpl implements CartSetLineItemPriceAction {

   private String action;
   
   private String lineItemId;
   
   private com.commercetools.api.models.common.Money externalPrice;

   @JsonCreator
   CartSetLineItemPriceActionImpl(@JsonProperty("lineItemId") final String lineItemId, @JsonProperty("externalPrice") final com.commercetools.api.models.common.Money externalPrice) {
      this.lineItemId = lineItemId;
      this.externalPrice = externalPrice;
      this.action = "setLineItemPrice";
   }
   public CartSetLineItemPriceActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public com.commercetools.api.models.common.Money getExternalPrice(){
      return this.externalPrice;
   }

   public void setLineItemId(final String lineItemId){
      this.lineItemId = lineItemId;
   }
   
   public void setExternalPrice(final com.commercetools.api.models.common.Money externalPrice){
      this.externalPrice = externalPrice;
   }

}
