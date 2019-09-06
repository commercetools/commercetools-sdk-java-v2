package com.commercetools.models.Order;

import com.commercetools.models.Order.PaymentState;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Order.OrderFromCartDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
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

   public void setId(final String id);
   
   public void setVersion(final Long version);
   
   public void setOrderNumber(final String orderNumber);
   
   public void setPaymentState(final PaymentState paymentState);
   
   public static OrderFromCartDraftImpl of(){
      return new OrderFromCartDraftImpl();
   }
   

   public static OrderFromCartDraftImpl of(final OrderFromCartDraft template) {
      OrderFromCartDraftImpl instance = new OrderFromCartDraftImpl();
      instance.setOrderNumber(template.getOrderNumber());
      instance.setId(template.getId());
      instance.setPaymentState(template.getPaymentState());
      instance.setVersion(template.getVersion());
      return instance;
   }

}