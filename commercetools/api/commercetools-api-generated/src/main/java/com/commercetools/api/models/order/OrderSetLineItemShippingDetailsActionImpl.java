package com.commercetools.api.models.order;

import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.order.OrderUpdateAction;
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
public final class OrderSetLineItemShippingDetailsActionImpl implements OrderSetLineItemShippingDetailsAction {

   private String action;
   
   private String lineItemId;
   
   private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

   @JsonCreator
   OrderSetLineItemShippingDetailsActionImpl(@JsonProperty("lineItemId") final String lineItemId, @JsonProperty("shippingDetails") final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
      this.lineItemId = lineItemId;
      this.shippingDetails = shippingDetails;
      this.action = "setLineItemShippingDetails";
   }
   public OrderSetLineItemShippingDetailsActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }

   public void setLineItemId(final String lineItemId){
      this.lineItemId = lineItemId;
   }
   
   public void setShippingDetails(final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails){
      this.shippingDetails = shippingDetails;
   }

}
