package com.commercetools.models.OrderEdit;

import com.commercetools.models.Common.Money;
import com.commercetools.models.Order.StagedOrderUpdateAction;
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
public final class StagedOrderSetLineItemPriceActionImpl implements StagedOrderSetLineItemPriceAction {

   private java.lang.String action;
   
   private java.lang.String lineItemId;
   
   private com.commercetools.models.Common.Money externalPrice;

   @JsonCreator
   StagedOrderSetLineItemPriceActionImpl(@JsonProperty("lineItemId") final java.lang.String lineItemId, @JsonProperty("externalPrice") final com.commercetools.models.Common.Money externalPrice) {
      this.lineItemId = lineItemId;
      this.externalPrice = externalPrice;
      this.action = "setLineItemPrice";
   }
   public StagedOrderSetLineItemPriceActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public com.commercetools.models.Common.Money getExternalPrice(){
      return this.externalPrice;
   }

   public void setLineItemId(final java.lang.String lineItemId){
      this.lineItemId = lineItemId;
   }
   
   public void setExternalPrice(final com.commercetools.models.Common.Money externalPrice){
      this.externalPrice = externalPrice;
   }

}