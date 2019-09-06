package com.commercetools.models.Message;

import com.commercetools.models.DiscountCode.DiscountCodeReference;
import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.OrderDiscountCodeAddedMessagePayloadImpl;

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
@JsonDeserialize(as = OrderDiscountCodeAddedMessagePayloadImpl.class)
public interface OrderDiscountCodeAddedMessagePayload extends MessagePayload {

   
   @NotNull
   @Valid
   @JsonProperty("discountCode")
   public DiscountCodeReference getDiscountCode();

   public void setDiscountCode(final DiscountCodeReference discountCode);
   
   public static OrderDiscountCodeAddedMessagePayloadImpl of(){
      return new OrderDiscountCodeAddedMessagePayloadImpl();
   }
   

   public static OrderDiscountCodeAddedMessagePayloadImpl of(final OrderDiscountCodeAddedMessagePayload template) {
      OrderDiscountCodeAddedMessagePayloadImpl instance = new OrderDiscountCodeAddedMessagePayloadImpl();
      instance.setDiscountCode(template.getDiscountCode());
      return instance;
   }

}