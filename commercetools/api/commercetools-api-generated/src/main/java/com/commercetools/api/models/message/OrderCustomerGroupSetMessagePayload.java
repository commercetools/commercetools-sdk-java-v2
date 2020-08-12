package com.commercetools.api.models.message;

import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.OrderCustomerGroupSetMessagePayloadImpl;

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
@JsonDeserialize(as = OrderCustomerGroupSetMessagePayloadImpl.class)
public interface OrderCustomerGroupSetMessagePayload extends MessagePayload {

   
   @Valid
   @JsonProperty("customerGroup")
   public CustomerGroupReference getCustomerGroup();
   
   @Valid
   @JsonProperty("oldCustomerGroup")
   public CustomerGroupReference getOldCustomerGroup();

   public void setCustomerGroup(final CustomerGroupReference customerGroup);
   
   public void setOldCustomerGroup(final CustomerGroupReference oldCustomerGroup);
   
   public static OrderCustomerGroupSetMessagePayloadImpl of(){
      return new OrderCustomerGroupSetMessagePayloadImpl();
   }
   

   public static OrderCustomerGroupSetMessagePayloadImpl of(final OrderCustomerGroupSetMessagePayload template) {
      OrderCustomerGroupSetMessagePayloadImpl instance = new OrderCustomerGroupSetMessagePayloadImpl();
      instance.setCustomerGroup(template.getCustomerGroup());
      instance.setOldCustomerGroup(template.getOldCustomerGroup());
      return instance;
   }

}
