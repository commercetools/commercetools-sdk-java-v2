package com.commercetools.models.Message;

import com.commercetools.models.CustomerGroup.CustomerGroupReference;
import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.CustomerGroupSetMessagePayloadImpl;

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
@JsonDeserialize(as = CustomerGroupSetMessagePayloadImpl.class)
public interface CustomerGroupSetMessagePayload extends MessagePayload {

   
   @NotNull
   @Valid
   @JsonProperty("customerGroup")
   public CustomerGroupReference getCustomerGroup();

   public void setCustomerGroup(final CustomerGroupReference customerGroup);
   
   public static CustomerGroupSetMessagePayloadImpl of(){
      return new CustomerGroupSetMessagePayloadImpl();
   }
   

   public static CustomerGroupSetMessagePayloadImpl of(final CustomerGroupSetMessagePayload template) {
      CustomerGroupSetMessagePayloadImpl instance = new CustomerGroupSetMessagePayloadImpl();
      instance.setCustomerGroup(template.getCustomerGroup());
      return instance;
   }

}