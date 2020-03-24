package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.CustomerCompanyNameSetMessagePayloadImpl;

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
@JsonDeserialize(as = CustomerCompanyNameSetMessagePayloadImpl.class)
public interface CustomerCompanyNameSetMessagePayload extends MessagePayload {

   
   @NotNull
   @JsonProperty("companyName")
   public String getCompanyName();

   public void setCompanyName(final String companyName);
   
   public static CustomerCompanyNameSetMessagePayloadImpl of(){
      return new CustomerCompanyNameSetMessagePayloadImpl();
   }
   

   public static CustomerCompanyNameSetMessagePayloadImpl of(final CustomerCompanyNameSetMessagePayload template) {
      CustomerCompanyNameSetMessagePayloadImpl instance = new CustomerCompanyNameSetMessagePayloadImpl();
      instance.setCompanyName(template.getCompanyName());
      return instance;
   }

}