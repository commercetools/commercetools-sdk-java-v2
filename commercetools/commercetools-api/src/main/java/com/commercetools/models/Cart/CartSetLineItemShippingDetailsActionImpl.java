package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.ItemShippingDetailsDraft;
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
public final class CartSetLineItemShippingDetailsActionImpl implements CartSetLineItemShippingDetailsAction {

   private java.lang.String action;
   
   private com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails;
   
   private java.lang.String lineItemId;

   @JsonCreator
   CartSetLineItemShippingDetailsActionImpl(@JsonProperty("shippingDetails") final com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails, @JsonProperty("lineItemId") final java.lang.String lineItemId) {
      this.shippingDetails = shippingDetails;
      this.lineItemId = lineItemId;
      this.action = "setLineItemShippingDetails";
   }
   public CartSetLineItemShippingDetailsActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }

   public void setShippingDetails(final com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails){
      this.shippingDetails = shippingDetails;
   }
   
   public void setLineItemId(final java.lang.String lineItemId){
      this.lineItemId = lineItemId;
   }

}