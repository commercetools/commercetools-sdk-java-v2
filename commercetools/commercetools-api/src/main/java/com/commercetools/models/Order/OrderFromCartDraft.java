package com.commercetools.models.order;

import com.commercetools.models.order.OrderState;
import com.commercetools.models.order.PaymentState;
import com.commercetools.models.order.ShipmentState;
import com.commercetools.models.state.StateResourceIdentifier;
import com.commercetools.models.order.OrderFromCartDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderFromCartDraftImpl.class)
public interface OrderFromCartDraft  {

   
   @NotNull
   @JsonProperty("id")
   public String getId();
   
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   
   @JsonProperty("orderNumber")
   public String getOrderNumber();
   
   
   @JsonProperty("paymentState")
   public PaymentState getPaymentState();
   
   
   @JsonProperty("shipmentState")
   public ShipmentState getShipmentState();
   
   
   @JsonProperty("orderState")
   public OrderState getOrderState();
   
   @Valid
   @JsonProperty("state")
   public StateResourceIdentifier getState();

   public void setId(final String id);
   
   public void setVersion(final Long version);
   
   public void setOrderNumber(final String orderNumber);
   
   public void setPaymentState(final PaymentState paymentState);
   
   public void setShipmentState(final ShipmentState shipmentState);
   
   public void setOrderState(final OrderState orderState);
   
   public void setState(final StateResourceIdentifier state);
   
   public static OrderFromCartDraftImpl of(){
      return new OrderFromCartDraftImpl();
   }
   

   public static OrderFromCartDraftImpl of(final OrderFromCartDraft template) {
      OrderFromCartDraftImpl instance = new OrderFromCartDraftImpl();
      instance.setShipmentState(template.getShipmentState());
      instance.setOrderNumber(template.getOrderNumber());
      instance.setState(template.getState());
      instance.setId(template.getId());
      instance.setPaymentState(template.getPaymentState());
      instance.setVersion(template.getVersion());
      instance.setOrderState(template.getOrderState());
      return instance;
   }

}