package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.Message;
import java.time.LocalDate;
import com.commercetools.api.generated.models.message.CustomerDateOfBirthSetMessageImpl;

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
@JsonDeserialize(as = CustomerDateOfBirthSetMessageImpl.class)
public interface CustomerDateOfBirthSetMessage extends Message {

   
   @NotNull
   @JsonProperty("dateOfBirth")
   public LocalDate getDateOfBirth();

   public void setDateOfBirth(final LocalDate dateOfBirth);
   
   public static CustomerDateOfBirthSetMessageImpl of(){
      return new CustomerDateOfBirthSetMessageImpl();
   }
   

   public static CustomerDateOfBirthSetMessageImpl of(final CustomerDateOfBirthSetMessage template) {
      CustomerDateOfBirthSetMessageImpl instance = new CustomerDateOfBirthSetMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setDateOfBirth(template.getDateOfBirth());
      return instance;
   }

}