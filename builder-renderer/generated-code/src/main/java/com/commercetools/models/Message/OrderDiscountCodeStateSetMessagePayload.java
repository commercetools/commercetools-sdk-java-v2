package com.commercetools.models.Message;

import com.commercetools.models.Cart.DiscountCodeState;
import com.commercetools.models.DiscountCode.DiscountCodeReference;
import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.OrderDiscountCodeStateSetMessagePayloadImpl;

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
@JsonDeserialize(as = OrderDiscountCodeStateSetMessagePayloadImpl.class)
public interface OrderDiscountCodeStateSetMessagePayload extends MessagePayload {

   
   @NotNull
   @Valid
   @JsonProperty("discountCode")
   public DiscountCodeReference getDiscountCode();
   
   @NotNull
   @JsonProperty("state")
   public DiscountCodeState getState();
   
   
   @JsonProperty("oldState")
   public DiscountCodeState getOldState();

   public void setDiscountCode(final DiscountCodeReference discountCode);
   
   public void setState(final DiscountCodeState state);
   
   public void setOldState(final DiscountCodeState oldState);
   
   public static OrderDiscountCodeStateSetMessagePayloadImpl of(){
      return new OrderDiscountCodeStateSetMessagePayloadImpl();
   }
   

   public static OrderDiscountCodeStateSetMessagePayloadImpl of(final OrderDiscountCodeStateSetMessagePayload template) {
      OrderDiscountCodeStateSetMessagePayloadImpl instance = new OrderDiscountCodeStateSetMessagePayloadImpl();
      instance.setDiscountCode(template.getDiscountCode());
      instance.setOldState(template.getOldState());
      instance.setState(template.getState());
      return instance;
   }

}