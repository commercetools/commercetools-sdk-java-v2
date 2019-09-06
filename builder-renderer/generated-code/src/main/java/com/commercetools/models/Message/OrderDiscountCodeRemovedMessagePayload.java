package com.commercetools.models.Message;

import com.commercetools.models.DiscountCode.DiscountCodeReference;
import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.OrderDiscountCodeRemovedMessagePayloadImpl;

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
@JsonDeserialize(as = OrderDiscountCodeRemovedMessagePayloadImpl.class)
public interface OrderDiscountCodeRemovedMessagePayload extends MessagePayload {

   
   @NotNull
   @Valid
   @JsonProperty("discountCode")
   public DiscountCodeReference getDiscountCode();

   public void setDiscountCode(final DiscountCodeReference discountCode);
   
   public static OrderDiscountCodeRemovedMessagePayloadImpl of(){
      return new OrderDiscountCodeRemovedMessagePayloadImpl();
   }
   

   public static OrderDiscountCodeRemovedMessagePayloadImpl of(final OrderDiscountCodeRemovedMessagePayload template) {
      OrderDiscountCodeRemovedMessagePayloadImpl instance = new OrderDiscountCodeRemovedMessagePayloadImpl();
      instance.setDiscountCode(template.getDiscountCode());
      return instance;
   }

}