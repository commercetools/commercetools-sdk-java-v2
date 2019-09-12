package com.commercetools.models.Message;

import com.commercetools.models.Message.Message;
import java.lang.String;
import com.commercetools.models.Message.CustomerCompanyNameSetMessageImpl;

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
@JsonDeserialize(as = CustomerCompanyNameSetMessageImpl.class)
public interface CustomerCompanyNameSetMessage extends Message {

   
   @NotNull
   @JsonProperty("companyName")
   public String getCompanyName();

   public void setCompanyName(final String companyName);
   
   public static CustomerCompanyNameSetMessageImpl of(){
      return new CustomerCompanyNameSetMessageImpl();
   }
   

   public static CustomerCompanyNameSetMessageImpl of(final CustomerCompanyNameSetMessage template) {
      CustomerCompanyNameSetMessageImpl instance = new CustomerCompanyNameSetMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setType(template.getType());
      instance.setCompanyName(template.getCompanyName());
      return instance;
   }

}