package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.cart.DiscountCodeState;
import com.commercetools.api.generated.models.discount_code.DiscountCodeReference;
import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.OrderDiscountCodeStateSetMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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