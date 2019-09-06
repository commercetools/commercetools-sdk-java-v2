package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Common.Money;
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
public final class CartChangeCustomLineItemMoneyActionImpl implements CartChangeCustomLineItemMoneyAction {

   private java.lang.String action;
   
   private java.lang.String customLineItemId;
   
   private com.commercetools.models.Common.Money money;

   @JsonCreator
   CartChangeCustomLineItemMoneyActionImpl(@JsonProperty("customLineItemId") final java.lang.String customLineItemId, @JsonProperty("money") final com.commercetools.models.Common.Money money) {
      this.customLineItemId = customLineItemId;
      this.money = money;
      this.action = "changeCustomLineItemMoney";
   }
   public CartChangeCustomLineItemMoneyActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public com.commercetools.models.Common.Money getMoney(){
      return this.money;
   }

   public void setCustomLineItemId(final java.lang.String customLineItemId){
      this.customLineItemId = customLineItemId;
   }
   
   public void setMoney(final com.commercetools.models.Common.Money money){
      this.money = money;
   }

}