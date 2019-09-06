package com.commercetools.models.Order;

import com.commercetools.models.Order.PaymentState;
import java.lang.Long;
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
public final class OrderFromCartDraftImpl implements OrderFromCartDraft {

   private java.lang.String orderNumber;
   
   private java.lang.String id;
   
   private com.commercetools.models.Order.PaymentState paymentState;
   
   private java.lang.Long version;

   @JsonCreator
   OrderFromCartDraftImpl(@JsonProperty("orderNumber") final java.lang.String orderNumber, @JsonProperty("id") final java.lang.String id, @JsonProperty("paymentState") final com.commercetools.models.Order.PaymentState paymentState, @JsonProperty("version") final java.lang.Long version) {
      this.orderNumber = orderNumber;
      this.id = id;
      this.paymentState = paymentState;
      this.version = version;
   }
   public OrderFromCartDraftImpl() {
      
   }
   
   
   public java.lang.String getOrderNumber(){
      return this.orderNumber;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public com.commercetools.models.Order.PaymentState getPaymentState(){
      return this.paymentState;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }

   public void setOrderNumber(final java.lang.String orderNumber){
      this.orderNumber = orderNumber;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setPaymentState(final com.commercetools.models.Order.PaymentState paymentState){
      this.paymentState = paymentState;
   }
   
   public void setVersion(final java.lang.Long version){
      this.version = version;
   }

}