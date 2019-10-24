package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
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
public final class StagedOrderSetLineItemTotalPriceActionImpl implements StagedOrderSetLineItemTotalPriceAction {

   private String action;
   
   private com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice externalTotalPrice;
   
   private String lineItemId;

   @JsonCreator
   StagedOrderSetLineItemTotalPriceActionImpl(@JsonProperty("externalTotalPrice") final com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice externalTotalPrice, @JsonProperty("lineItemId") final String lineItemId) {
      this.externalTotalPrice = externalTotalPrice;
      this.lineItemId = lineItemId;
      this.action = "setLineItemTotalPrice";
   }
   public StagedOrderSetLineItemTotalPriceActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice(){
      return this.externalTotalPrice;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }

   public void setExternalTotalPrice(final com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice externalTotalPrice){
      this.externalTotalPrice = externalTotalPrice;
   }
   
   public void setLineItemId(final String lineItemId){
      this.lineItemId = lineItemId;
   }

}