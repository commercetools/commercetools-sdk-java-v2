package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.OrderState;
import com.commercetools.api.generated.models.order.PaymentState;
import com.commercetools.api.generated.models.order.ShipmentState;
import com.commercetools.api.generated.models.state.StateResourceIdentifier;
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
public final class OrderFromCartDraftImpl implements OrderFromCartDraft {

   private com.commercetools.api.generated.models.order.ShipmentState shipmentState;
   
   private String orderNumber;
   
   private com.commercetools.api.generated.models.state.StateResourceIdentifier state;
   
   private String id;
   
   private com.commercetools.api.generated.models.order.PaymentState paymentState;
   
   private Long version;
   
   private com.commercetools.api.generated.models.order.OrderState orderState;

   @JsonCreator
   OrderFromCartDraftImpl(@JsonProperty("shipmentState") final com.commercetools.api.generated.models.order.ShipmentState shipmentState, @JsonProperty("orderNumber") final String orderNumber, @JsonProperty("state") final com.commercetools.api.generated.models.state.StateResourceIdentifier state, @JsonProperty("id") final String id, @JsonProperty("paymentState") final com.commercetools.api.generated.models.order.PaymentState paymentState, @JsonProperty("version") final Long version, @JsonProperty("orderState") final com.commercetools.api.generated.models.order.OrderState orderState) {
      this.shipmentState = shipmentState;
      this.orderNumber = orderNumber;
      this.state = state;
      this.id = id;
      this.paymentState = paymentState;
      this.version = version;
      this.orderState = orderState;
   }
   public OrderFromCartDraftImpl() {
      
   }
   
   
   public com.commercetools.api.generated.models.order.ShipmentState getShipmentState(){
      return this.shipmentState;
   }
   
   
   public String getOrderNumber(){
      return this.orderNumber;
   }
   
   
   public com.commercetools.api.generated.models.state.StateResourceIdentifier getState(){
      return this.state;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public com.commercetools.api.generated.models.order.PaymentState getPaymentState(){
      return this.paymentState;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   
   public com.commercetools.api.generated.models.order.OrderState getOrderState(){
      return this.orderState;
   }

   public void setShipmentState(final com.commercetools.api.generated.models.order.ShipmentState shipmentState){
      this.shipmentState = shipmentState;
   }
   
   public void setOrderNumber(final String orderNumber){
      this.orderNumber = orderNumber;
   }
   
   public void setState(final com.commercetools.api.generated.models.state.StateResourceIdentifier state){
      this.state = state;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setPaymentState(final com.commercetools.api.generated.models.order.PaymentState paymentState){
      this.paymentState = paymentState;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setOrderState(final com.commercetools.api.generated.models.order.OrderState orderState){
      this.orderState = orderState;
   }

}