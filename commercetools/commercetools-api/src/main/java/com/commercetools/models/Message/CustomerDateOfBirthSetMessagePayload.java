package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import java.time.LocalDate;
import com.commercetools.models.message.CustomerDateOfBirthSetMessagePayloadImpl;

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
@JsonDeserialize(as = CustomerDateOfBirthSetMessagePayloadImpl.class)
public interface CustomerDateOfBirthSetMessagePayload extends MessagePayload {

   
   @NotNull
   @JsonProperty("dateOfBirth")
   public LocalDate getDateOfBirth();

   public void setDateOfBirth(final LocalDate dateOfBirth);
   
   public static CustomerDateOfBirthSetMessagePayloadImpl of(){
      return new CustomerDateOfBirthSetMessagePayloadImpl();
   }
   

   public static CustomerDateOfBirthSetMessagePayloadImpl of(final CustomerDateOfBirthSetMessagePayload template) {
      CustomerDateOfBirthSetMessagePayloadImpl instance = new CustomerDateOfBirthSetMessagePayloadImpl();
      instance.setDateOfBirth(template.getDateOfBirth());
      return instance;
   }

}