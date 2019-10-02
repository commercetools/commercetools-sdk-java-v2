package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.message.CustomerEmailVerifiedMessagePayloadImpl;

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
@JsonDeserialize(as = CustomerEmailVerifiedMessagePayloadImpl.class)
public interface CustomerEmailVerifiedMessagePayload extends MessagePayload {


   
   public static CustomerEmailVerifiedMessagePayloadImpl of(){
      return new CustomerEmailVerifiedMessagePayloadImpl();
   }
   

   public static CustomerEmailVerifiedMessagePayloadImpl of(final CustomerEmailVerifiedMessagePayload template) {
      CustomerEmailVerifiedMessagePayloadImpl instance = new CustomerEmailVerifiedMessagePayloadImpl();
      return instance;
   }

}