package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.OrderCustomerEmailSetMessagePayloadImpl;

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
@JsonDeserialize(as = OrderCustomerEmailSetMessagePayloadImpl.class)
public interface OrderCustomerEmailSetMessagePayload extends MessagePayload {

   
   
   @JsonProperty("email")
   public String getEmail();
   
   
   @JsonProperty("oldEmail")
   public String getOldEmail();

   public void setEmail(final String email);
   
   public void setOldEmail(final String oldEmail);
   
   public static OrderCustomerEmailSetMessagePayloadImpl of(){
      return new OrderCustomerEmailSetMessagePayloadImpl();
   }
   

   public static OrderCustomerEmailSetMessagePayloadImpl of(final OrderCustomerEmailSetMessagePayload template) {
      OrderCustomerEmailSetMessagePayloadImpl instance = new OrderCustomerEmailSetMessagePayloadImpl();
      instance.setOldEmail(template.getOldEmail());
      instance.setEmail(template.getEmail());
      return instance;
   }

}