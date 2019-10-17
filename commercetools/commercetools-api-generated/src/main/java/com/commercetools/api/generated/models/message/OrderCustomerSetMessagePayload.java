package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.customer.CustomerReference;
import com.commercetools.api.generated.models.customer_group.CustomerGroupReference;
import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.OrderCustomerSetMessagePayloadImpl;

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
@JsonDeserialize(as = OrderCustomerSetMessagePayloadImpl.class)
public interface OrderCustomerSetMessagePayload extends MessagePayload {

   
   @Valid
   @JsonProperty("customer")
   public CustomerReference getCustomer();
   
   @Valid
   @JsonProperty("customerGroup")
   public CustomerGroupReference getCustomerGroup();
   
   @Valid
   @JsonProperty("oldCustomer")
   public CustomerReference getOldCustomer();
   
   @Valid
   @JsonProperty("oldCustomerGroup")
   public CustomerGroupReference getOldCustomerGroup();

   public void setCustomer(final CustomerReference customer);
   
   public void setCustomerGroup(final CustomerGroupReference customerGroup);
   
   public void setOldCustomer(final CustomerReference oldCustomer);
   
   public void setOldCustomerGroup(final CustomerGroupReference oldCustomerGroup);
   
   public static OrderCustomerSetMessagePayloadImpl of(){
      return new OrderCustomerSetMessagePayloadImpl();
   }
   

   public static OrderCustomerSetMessagePayloadImpl of(final OrderCustomerSetMessagePayload template) {
      OrderCustomerSetMessagePayloadImpl instance = new OrderCustomerSetMessagePayloadImpl();
      instance.setOldCustomerGroup(template.getOldCustomerGroup());
      instance.setCustomerGroup(template.getCustomerGroup());
      instance.setOldCustomer(template.getOldCustomer());
      instance.setCustomer(template.getCustomer());
      return instance;
   }

}